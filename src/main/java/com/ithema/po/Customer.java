package com.ithema.po;

import org.springframework.stereotype.Component;

@Component()

public class Customer {
    private Integer id;
    private String username;
    private String jobs;
    private String phone;
    private Integer Card;
    public  Customer(){}
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", jobs='" + jobs + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Integer getCard() {
        return Card;
    }

    public void setCard(Integer card) {
        Card = card;
    }

    public Customer(Integer id, String username, String jobs, String phone, Integer card) {
        this.id = id;
        this.username = username;
        this.jobs = jobs;
        this.phone = phone;
        Card = card;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Customer(Integer id, String username, String jobs, String phone) {
        this.id = id;
        this.username = username;
        this.jobs = jobs;
        this.phone = phone;
    }
}
