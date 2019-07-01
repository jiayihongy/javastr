package com.andersen.service;

import com.andersen.dao.MessDao;

public class MainService {
    public void delOne(String id){
        if(id !=null &&!"".equals(id.trim())){
            MessDao messDao =new MessDao();
            messDao.delOne(Integer.parseInt(id));

        }

    }


}
