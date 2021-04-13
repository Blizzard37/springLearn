package com.wzs.demo1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proxy {
    private Host host;
    public void rent(){
        show();
        host.rent();
        pact();
    }
    public void show(){
        System.out.println("展示房子");
    }
    public void pact(){
        System.out.println("签订租赁合同");
    }
}
