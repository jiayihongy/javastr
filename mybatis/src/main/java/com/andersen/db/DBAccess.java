package com.andersen.db;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.Reader;

public class DBAccess {
    public SqlSession getSqlSession() throws IOException {
        Reader resourceAsReader = Resources.getResourceAsReader("config/config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsReader);
        SqlSession sqlSession = build.openSession();

        return sqlSession;
    }
}
