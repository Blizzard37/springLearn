package com.wzs.pojo;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Data
public class Student {
    private String name;
    private Address address;
    private String[] book;
    private List<String> course;
    private Map<String,String> grades;
    private String wife;
    private Set<String> games;
    private Properties info;

}
