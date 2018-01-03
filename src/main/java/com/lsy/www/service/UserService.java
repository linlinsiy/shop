package com.lsy.www.service;

import com.lsy.www.po.UserEntity;

import java.util.List;

/**
 * Desc:用户表相关的service接口
 * Created by hafiz.zhang on 2016/8/27.
 */
public interface UserService {
    /**
     * 新增一个用户
     * @param userEntity
     * @return 返回被影响的行数
     */
    int insertUser(UserEntity userEntity);

    /**
     * 删除一个用户
     * @param id
     * @return 返回被影响的行数
     */
    int deleteUserById(int id);

    /**
     * 更新一个用户
     * @param userEntity
     * @return 返回被影响的行数
     */
    int updateUserById(UserEntity userEntity);

    /**
     * 根据id查找用户
     * @param id
     * @return
     */
    UserEntity getUserById(int id);

    /**
     * 根据条件查找多个用户
     * @param userEntity
     * @return
     */
    List<UserEntity> getUsersByConditions(UserEntity userEntity);

    /**
     * 查找所有用户
     * @return
     */
    List<UserEntity> getAllUsers();
}
