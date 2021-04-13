package com.wzs.demo2;

public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;

    public UserServiceImpl getUserService() {
        return userService;
    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        userService.add();
        log("add");
    }

    @Override
    public void delete() {
        userService.delete();
        log("delete");
    }

    @Override
    public void update() {
        userService.update();
        log("update");
    }

    @Override
    public void select() {
        userService.select();
        log("select");
    }

    public void log(String str){
        System.out.printf("[debug]进行了"+str+"操作");
    }
}
