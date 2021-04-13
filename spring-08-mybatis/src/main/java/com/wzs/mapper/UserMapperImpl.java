package com.wzs.mapper;

import com.wzs.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        List<User> userList = mapper.selectUser();
        return userList;
    }

    @Override
    public int deleteUser(int id) {
        return 0;
    }

    @Override
    public int insertUser(User user) {
        return 0;
    }

}
