package com.ourselves.forum.service.impl;

import com.ourselves.forum.dao.UserInfoDao;
import com.ourselves.forum.entity.UserInfo;
import com.ourselves.forum.service.UserInfoService;
import com.ourselves.forum.util.MD5;
import com.ourselves.forum.util.Page;
import com.ourselves.forum.util.PageUtil;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Ron
 * Date: 14-6-15
 * Time: 下午9:42
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    UserInfoDao userInfoDao;

    @Override
    public List<UserInfo> queryAll(Page page) {
        int begin = (page.getCurrentpage() - 1) * page.getEverypage(); // 分页的起始位置
        int size = page.getEverypage(); // 每页显示数量

        // 获取总数据条数
        int totalcount = userInfoDao.getCount();
        page.setTotalcount(totalcount);

        // 计算总页数
        int totalpage = PageUtil.getTotalPage(page.getEverypage(), totalcount);
        page.setTotalpage(totalpage);

        // 分页查询类使用这个类实现mybatis的分页查询
        RowBounds rowBounds = new RowBounds(begin, size);
        return this.userInfoDao.queryAll(rowBounds);
    }

    @Override
    public UserInfo queryAllUser(int id) {
        return this.userInfoDao.queryAllUser(id);
    }

    public UserInfo login(UserInfo userInfo) {
        String pwds = userInfo.getPassword();
        MD5 md5 = new MD5();
        userInfo.setPassword(md5.getMD5ofStr(pwds));
        if (this.userInfoDao.login(userInfo) != null) {
            return userInfo;
        }
        return null;
    }

    @Override
    public boolean addUser(UserInfo entity) {
        String pwd = entity.getPassword();
        MD5 md5 = new MD5();
        String md5pwd = md5.getMD5ofStr(pwd);
        entity.setPassword(md5pwd);
        if (this.userInfoDao.addUser(entity) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public void delete(String nickname) {
        this.userInfoDao.deleteUser(nickname);
    }

    @Override
    public boolean update(UserInfo userInfo) {
        if (this.userInfoDao.update(userInfo) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean queryByNickname(String nickname) {
        if (this.userInfoDao.queryByNickname(nickname) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean queryByUsername(String username) {
        if (this.userInfoDao.queryByUsername(username) == 0) {
            return true;
        }
        return false;
           }
    @Override
    public boolean updatePwd(UserInfo userInfo) {
        if (this.userInfoDao.updatePwd(userInfo) == 1) {
            return true;
        }
        return false;
    }

    @Override
    public UserInfo queryAlluser(String username) {
        return this.userInfoDao.queryAlluser(username);
    }

    public UserInfoDao getUserInfoDao() {
        return userInfoDao;
    }

    public void setUserInfoDao(UserInfoDao userInfoDao) {
        this.userInfoDao = userInfoDao;
    }
}
