package com.wzs.demo03;

public class Client {
    public static void main(String[] args) {
        //真实对象
        Host host = new Host();
        //程序
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        //通过程序调用角色来生成
        proxyInvocationHandler.setRent(host);

        Rent proxy = (Rent) proxyInvocationHandler.getProxy();
        proxy.rent();

    }
}
