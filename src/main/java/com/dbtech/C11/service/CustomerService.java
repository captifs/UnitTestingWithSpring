package com.dbtech.C11.service;

import com.dbtech.C11.dao.Customer;
import com.dbtech.C11.dao.CustomerDAO;
import com.dbtech.C11.dao.CustomerRowMapper;
import com.dbtech.C11.dao.impl.CustomerDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {


    @Autowired
    private CustomerRepository repository;

    public List<Customer> getAllCustomers() {
        List<Customer> customerList = repository.findAll();
        return customerList;
    }

    public Customer getCustomerById(int id) {
        Customer c = repository.findById(id).get();
        return c;
    }

    public Boolean insertCustomers(Customer c) {

        Boolean exists = repository.existsById(c.id);
        if (exists == false)
            repository.save(c);
        return exists;
    }

    public Boolean updateCustomer(int id, Customer customer) {

        Boolean exists = repository.existsById(id);
        if (exists == true)
            repository.save(customer);
        return exists;
    }

    public Boolean deleteCutomerById(int id) {

        Boolean exists = repository.existsById(id);
        if (exists == true)
            repository.deleteById(id);
        return exists;
    }

    public Customer getByPhone(String phone) {
        Customer customer = repository.findByPhone(phone);
        return customer;
    }

    public List<Customer> streetType(String street) {
        List<Customer> customerList = repository.searchByStreetType(street);
        return customerList;
    }

    public List<Customer> searchByLastNameLength(int lengthLastName) {
        List<Customer> customerList = repository.searchByLastNameLength(lengthLastName);
        return customerList;

    }
}
