package com.dbtech.C11.dao;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CustomerDAO {
    public List<Customer> getAllCustomers();
    public Customer getCustomer(int id);
    public Boolean insertCustomer(Customer c);
    public Boolean updateCustomer(int id, Customer c);
    public Boolean deleteCustomer(int id);
    //public List<Customer> filteredCustomers(String username, String city, String country);
}
