package com.ithema.service.impl;

import com.ithema.dao.CustomerDao;
import com.ithema.dao.CustomerDaoImpl;
import com.ithema.po.Customer;
import com.ithema.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.applet.AppletContext;


@Service("CustomerService")
public class CustomerServiceImp implements CustomerService {

    @Resource(name = "CustomerDao")
    CustomerDao customerDao;
    @Override
    public Customer selectOneByID(Integer id) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("CustomerDao.xml");
        customerDao = ac.getBean("CustomerDao",CustomerDaoImpl.class);
        return customerDao.selectOneCustomerByID(id);
    }
}
