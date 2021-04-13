package com.wzs.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class  User {
    @Value("王之山")
    String name;
}
