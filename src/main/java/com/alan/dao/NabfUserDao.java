package com.alan.dao;

import com.alan.bean.Nabfusers;

import java.util.List;

public interface NabfUserDao {

    /**
     * 根据userId查询用户信息
     *
     * @param userId
     * @return
     */
    List<Nabfusers> gitUser(String userId);

    /**
     * 新增用户
     *
     * @param user
     */
    boolean addUser(Nabfusers user);


    /**
     * 查询用户是否存在
     *
     * @param userId
     */
    int isUserExist(String userId);

    /**
     * 更新用户信息
     *
     * @param user
     */
    public void updateUser(Nabfusers user);

    /**
     * 根据userId删除用户信息
     *
     * @param userId
     */
    public void deleteUser(String userId);
}
