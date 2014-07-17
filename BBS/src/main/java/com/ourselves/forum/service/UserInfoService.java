package com.ourselves.forum.service;

import com.ourselves.forum.entity.UserInfo;

/**
 * Created with IntelliJ IDEA.
 * User: Ron
 * Date: 14-6-15
 * Time: 下午9:41
 */
public interface UserInfoService extends BaseService<UserInfo>{
    /**
     * 用户登录
     * @param userInfo
     * @return
     */
    UserInfo login(UserInfo userInfo);
}
