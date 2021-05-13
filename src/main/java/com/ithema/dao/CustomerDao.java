package com.ithema.dao;

import com.ithema.po.Customer;
import org.springframework.stereotype.Repository;


public interface CustomerDao {
    Customer selectOneCustomerByID(Integer id);

}
