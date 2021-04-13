package com.wzs.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成的到代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        show();
        Object invoke = method.invoke(rent, objects);
        pact();
        return invoke;
    }

    public void show(){
        System.out.println("展示房子");
    }
    public void pact(){
        System.out.println("签订租赁合同");
    }
}
