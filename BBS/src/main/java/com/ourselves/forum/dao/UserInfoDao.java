package com.ourselves.forum.dao;

import com.ourselves.forum.entity.UserInfo;

/**
 * Created with IntelliJ IDEA.
 * User: Ron
 * Date: 14-6-15
 * Time: 下午4:51
 * To change this template use File | Settings | File Templates.
 */
public interface UserInfoDao extends BaseDao<UserInfo> {
    UserInfo login(UserInfo userInfo);
}
