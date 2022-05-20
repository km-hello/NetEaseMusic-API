package com.hello.neteasemusic.mapper;

import com.hello.neteasemusic.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public User login(String phone, String password);

    public List<User> search(String name);

    public User getUserDetailByPhone(String phone);
    public boolean insertUser(User user);
    public boolean updateUser(User user);
    public boolean deleteUser(String phone);
}
