package com.ourselves.forum.dao;

import com.ourselves.forum.entity.UserInfo;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Ron
 * Date: 14-6-15
 * Time: 下午5:12
 */
public interface BaseDao<T> {
    /**
     * 查询所有用户
     */
    public List<T> queryAll(RowBounds rowBounds);

    /**
     * 增加用户
     * @param t
     * @return
     */
    public int addUser(T t);

    /**
     * 根据昵称删除用户
     * @param nickname
     */
    public int deleteUser(String nickname);

    /**
     * 修改用户
     * @param userInfo
     * @return
     */
    public int update(UserInfo userInfo);

    /**
     * 获取总条数
     * @return
     */
    public int getCount();

    public int countUser(String nickname);

    public int queryByNickname(String nickname);
    public int queryByUsername(String username);

    public UserInfo queryAllUser(int id);
    public int updatePwd(UserInfo userInfo);

    public UserInfo queryAlluser(String username);
}
