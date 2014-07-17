package com.ourselves.forum.dao.impl;

import com.ourselves.forum.dao.UserInfoDao;
import com.ourselves.forum.entity.UserInfo;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Ron
 * Date: 14-6-17
 * Time: 下午1:03
 */
@Repository
public class UserInfoDaoImpl implements UserInfoDao{
    @Autowired
    private SqlSessionFactory   sqlSessionFactory;

    @Override
    public UserInfo login(UserInfo userInfo) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        return  sqlSession.selectOne("UserInfoDao.loginUser",userInfo);
    }

    @Override
    public List<UserInfo> queryAll(RowBounds rowBounds) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        return sqlSession.selectList("UserInfoDao.queryAll",rowBounds);
    }

    @Override
    public int addUser(UserInfo userInfo) {
        SqlSession  sqlSession= sqlSessionFactory.openSession();
             return  sqlSession.insert("UserInfoDao.addUser",userInfo);

    }

    @Override
    public int deleteUser(String nickname) {
       SqlSession sqlSession=sqlSessionFactory.openSession();
        return (Integer)sqlSession.delete("UserInfoDao.deleteUser",nickname);
    }

    @Override
    public int update(UserInfo userInfo) {
        SqlSession sqlSession=sqlSessionFactory.openSession();
        return sqlSession.update("UserInfoDao.update", userInfo);
    }

    @Override
    public int getCount() {
        SqlSession  sqlSession= sqlSessionFactory.openSession();
        return (Integer)sqlSession.selectOne("UserInfoDao.getCount");
    }

    @Override
    public int countUser(String nickname) {
        return 0;
    }

    @Override
    public int queryByNickname(String nickname) {
        SqlSession  sqlSession= sqlSessionFactory.openSession();
        return  (Integer)sqlSession.selectOne("UserInfoDao.queryByNickname",nickname);
    }

    @Override
    public int queryByUsername(String username) {
        SqlSession  sqlSession= sqlSessionFactory.openSession();
        return (Integer)sqlSession.selectOne("UserInfoDao.queryByUsername",username);
    }

    @Override
    public UserInfo queryAllUser(int id) {
        SqlSession sqlSession=sqlSessionFactory.openSession();

        return sqlSession.selectOne("UserInfoDao.queryAllUser",id);  //To change body of implemented methods use File | Settings | File Templates.
    }
    @Override
    public int updatePwd(UserInfo userInfo) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession.update("UserInfoDao.updatePwd", userInfo);
    }

    @Override
    public UserInfo queryAlluser(String username) {
        SqlSession sqlSession=sqlSessionFactory.openSession();

        return sqlSession.selectOne("UserInfoDao.queryByUsername",username);
          }
}
