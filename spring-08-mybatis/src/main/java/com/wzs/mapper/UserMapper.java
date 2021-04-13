package com.wzs.mapper;

import com.wzs.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> selectUser();
    public int deleteUser(int id);
    public int insertUser(User user);
}
