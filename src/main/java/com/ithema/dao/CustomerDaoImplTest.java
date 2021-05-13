package com.ithema.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class CustomerDaoImplTest {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("CustomerDao.xml");
        CustomerDao customerDao = ac.getBean("CustomerDao",CustomerDaoImpl.class);
        System.out.println( customerDao.selectOneCustomerByID(1));
    }
}