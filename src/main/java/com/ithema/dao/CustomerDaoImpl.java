package com.ithema.dao;

import com.ithema.dao.toolSQL.sqlSessionFactory;
import com.ithema.po.Customer;
import jdk.nashorn.internal.scripts.JD;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
//将该CustomerDao属性类型的CustomerDaoImps类在容器中命名为CustomerDao
@Repository("CustomerDao")
public class CustomerDaoImpl  implements CustomerDao {

    private JdbcTemplate jdbcTemplate;
    static String resource = "mybatis-config.xml";
    static InputStream inputStream;
    static SqlSession sqlSession = null;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public  Customer   selectOneCustomerByID(Integer id) {
////        使用BeanPropertyRowMapper将数据库查询结果转换为Java类对象
//        List<Customer> customers = jdbcTemplate.query("select * from t_customer  where id = ?",
//                new Object[]{id},new BeanPropertyRowMapper<>(Customer.class));
//        if(customers.isEmpty()){
//            return null;
//        }
//        return customers.get(0);
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
