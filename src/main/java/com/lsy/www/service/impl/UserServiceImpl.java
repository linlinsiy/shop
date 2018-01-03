package com.lsy.www.service.impl;

import com.lsy.www.mapper.UserEntityMapper;
import com.lsy.www.po.UserEntity;
import com.lsy.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Desc:用户表相关的servie接口实现类
 *
 * Created by hafiz.zhang on 2016/8/27.
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserEntityMapper mapper;


    public int insertUser(UserEntity userEntity) {
        return mapper.insertUser(userEntity);
    }

    public int deleteUserById(int id) {
        return mapper.deleteUserById(id);
    }

    public int updateUserById(UserEntity userEntity) {
        return mapper.updateUserById(userEntity);
    }

    public UserEntity getUserById(int id) {
        return mapper.getUserById(id);
    }

    public List<UserEntity> getUsersByConditions(UserEntity userEntity) {
        return mapper.getUsersByConditions(userEntity);
    }

    public List<UserEntity> getAllUsers() {
        return mapper.getAllUsers();
    }
}
