package com.andersen.service;

import com.andersen.bean.Message;
import com.andersen.dao.MessDao;

import java.util.List;

public class QueryService {
    public List<Message> getList(String command, String description){
        MessDao messDao = new MessDao();
        return messDao.getList(command,description);

    }
}
