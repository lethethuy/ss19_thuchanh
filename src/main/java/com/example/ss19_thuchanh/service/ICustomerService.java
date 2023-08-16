package com.example.ss19_thuchanh.service;

import com.example.ss19_thuchanh.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    void save (Customer customer);
    Customer findById(int id);

    Customer finfById(int id);

    void update(int id, Customer customer);
    void remove(int id);
}
