package com.wzs.mapper;

import com.wzs.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> selectUser() {
        User user = new User(10, "初震宇", "123456");
        insertUser(user);
        deleteUser(1);
        return getSqlSession().getMapper(UserMapper.class).selectUser();
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(1);
    }

    @Override
    public int insertUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).insertUser(user);
    }
}

