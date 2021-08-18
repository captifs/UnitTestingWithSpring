package com.dbtech.C11.controller;

import com.dbtech.C11.dao.Customer;
import com.dbtech.C11.dao.CustomerRowMapper;
import com.dbtech.C11.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;


//    @ResponseBody
//    @GetMapping("/filteredCustomers")
//    public ModelAndView filteredCustomers(@RequestParam(required = false) String username, @RequestParam(required = false) String city, @RequestParam(required = false) String country)
//    {
//        List<Customer> filteredCustomers = customerService.filteredCustomers(username,city,country);
//        ModelAndView view = new ModelAndView("filteredCustomers.html");
//        view.addObject("customersList",filteredCustomers);
//        return view;
//    }

    @ResponseBody
    @GetMapping("/customers-html")
    public ModelAndView getAllCustomers()
    {
        List<Customer> customerList = customerService.getAllCustomers();
        ModelAndView view = new ModelAndView("customers.html");
        view.addObject("customersList", customerList);
        return view;
    }

    @ResponseBody
    @GetMapping("/customers/{id}")
    public ModelAndView getCustomerById(@PathVariable (name = "id") Integer cid)
    {
        Customer c = customerService.getCustomerById(cid);
        ModelAndView view = new ModelAndView("customer.html");
        view.addObject("customer",c);
        return view;
    }


    @ResponseBody
    @GetMapping("/customers")
    public List<Customer> getAllCustomer()
    {
        return customerService.getAllCustomers();
    }



    @PutMapping("/customers")
    @ResponseBody
    public Boolean insertCustomer(@RequestBody Customer customer)
    {
        return customerService.insertCustomers(customer);
    }


    @ResponseBody
    @PutMapping("/customers/{id}")
    public Boolean updateCustomerById(@PathVariable(name = "id") Integer cid, @RequestBody Customer customer)
    {
        return customerService.updateCustomer(cid,customer);
    }

    @DeleteMapping("/customers/{id}")
    @ResponseBody
    public Boolean deleteCutomerById(@PathVariable(name = "id") Integer cid)
    {
        return customerService.deleteCutomerById(cid);
    }

    @ResponseBody
    @GetMapping("/phone/{phone}")
    public Customer getByPhone ( @PathVariable ( name = "phone") String phone){
        Customer customer = customerService.getByPhone(phone);
        return customer;
    }

    @ResponseBody
    @GetMapping ("/street_type")
    public List<Customer> streetType (@RequestParam ( required = false, name = "street" ) String strada){
        List<Customer> customerList = customerService.streetType(strada);
        return customerList;
    }

    @ResponseBody
    @GetMapping("/length_last_name")
    public List<Customer> lengthLastName(@RequestParam (required = false, name = "min_length") Integer min_length){
        List<Customer> customerList = customerService.searchByLastNameLength(min_length);
        return  customerList;
    }
}
