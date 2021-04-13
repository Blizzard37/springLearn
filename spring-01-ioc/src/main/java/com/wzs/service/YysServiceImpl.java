package com.wzs.service;

import com.wzs.dao.YysDao;
import lombok.Data;

@Data
public class YysServiceImpl implements YysService {
    private YysDao yysDao;

    @Override
    public void logIn() {
        yysDao.logIn();
    }
}
