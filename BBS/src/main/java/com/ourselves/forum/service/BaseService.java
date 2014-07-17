package com.ourselves.forum.service;

import com.ourselves.forum.entity.UserInfo;
import com.ourselves.forum.util.Page;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Ron
 * Date: 14-6-15
 * Time: 下午5:21
 * To change this template use File | Settings | File Templates.
 */
public interface BaseService<T> {
    /**
     * 分页显示招聘信息
     *
     * @param page
     *            分页对象
     * @return 查询的结果
     */
    public List<T> queryAll(Page page);


    /**
     * 添加
     *
     * @param entity
     *            实体对象
     */
    public boolean addUser(T entity);

    /**
     * 删除
     *
     * @param nickname
     *            编号
     */
    public void delete(String  nickname);

    /**
     * 修改
     *
     * @param userInfo
     *            实体对象
     */
    public boolean update(UserInfo userInfo);

    /**
     * 根据昵称查询用户（昵称必须唯一）
     * @param nickname
     * @return
     */
    public boolean queryByNickname(String nickname);
    public boolean queryByUsername(String username);
    public UserInfo queryAllUser(int id);
    public boolean updatePwd(UserInfo userInfo);
    public UserInfo queryAlluser(String username);
}
