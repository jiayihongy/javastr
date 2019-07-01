package com.andersen.dao;

import com.andersen.bean.Message;
import com.andersen.db.DBAccess;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MessDao {
    /*
    * 获取参数，查表，返回列表数据
    * */
    public List<Message> getList(String command,String description){
        List<Message> messageList = new ArrayList<Message>();

        return messageList;
    }


    public void delOne(int id){
        DBAccess dbAccess = new DBAccess();
        SqlSession sqlSession = null;
        try {
            sqlSession = dbAccess.getSqlSession();
            sqlSession.delete("Message.delOne", id);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(sqlSession != null){
                sqlSession.close();
            }
        }

    }

}
