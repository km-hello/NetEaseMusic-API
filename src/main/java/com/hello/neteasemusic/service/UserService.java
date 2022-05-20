package com.hello.neteasemusic.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hello.neteasemusic.entity.User;
import com.hello.neteasemusic.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User login(String phone, String password){
        return userMapper.login(phone,password);
    }

    public PageInfo<User> getUserPage(String name , int pageNum , int pageSize){
        return PageHelper.startPage(pageNum,pageSize).doSelectPageInfo(()->{
            userMapper.search(name);
        });
    }

    public User getUserDetailByPhone(String phone){
        return userMapper.getUserDetailByPhone(phone);
    }

    public boolean insertUser(User user){
        return userMapper.insertUser(user);
    }

    public boolean updateUser(User user){
        return userMapper.updateUser(user);
    }

    public boolean deleteUser(String phone){
        return userMapper.deleteUser(phone);
    }
}
