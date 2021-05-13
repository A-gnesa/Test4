package com.ithema.service;

import com.ithema.po.Customer;

public interface CustomerService {
    Customer selectOneByID(Integer id);
}
