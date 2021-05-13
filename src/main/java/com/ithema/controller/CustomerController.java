package com.ithema.controller;

import com.ithema.po.Customer;
import com.ithema.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller

public class CustomerController {
    @Resource(name = "CustomerService")
    CustomerService customerService;
@RequestMapping(value = "/findCustomerById",method = RequestMethod.GET)
public String Customer(@RequestParam("id") Integer id, ModelMap model){
    Customer customer = customerService.selectOneByID(id);
    model.addAttribute("customer",customer);
    return "Customer";
}
}
