package com.ithema.dao.toolSQL;
import com.ithema.po.Customer;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;
import java.io.InputStream;

public class poSqlTools {
    static String resource = "mybatis-config.xml";
    static InputStream inputStream;
    static SqlSession sqlSession = null;

    public static Customer findGoodsByOrdersID(int id) {
        Customer customer = new Customer();
        try {
            inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sSF = sqlSessionFactory.getSqlSessionFactory();
            sqlSession = sSF.openSession();
            //selectList参数：命名空间.操作id
            customer = sqlSession.selectOne("com.ithema.po.Customer.findCustomerByID", id);
            System.out.println(customer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customer;
    }
}