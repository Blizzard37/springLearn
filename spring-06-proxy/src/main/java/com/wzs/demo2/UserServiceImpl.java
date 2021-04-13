package com.wzs.demo2;

public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.printf("增加一个用户");
    }

    @Override
    public void delete() {
        System.out.printf("删除一个用户");
    }

    @Override
    public void update() {
        System.out.printf("更新一个角色");
    }

    @Override
    public void select() {
        System.out.printf("查询一个角色");
    }
}
