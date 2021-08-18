package com.dbtech.C11;


import com.dbtech.C11.dao.Customer;
import com.dbtech.C11.service.CustomerRepository;
import com.dbtech.C11.service.CustomerService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceTest {

    @Autowired
    ObjectMapper objectMapper;

    @InjectMocks
    CustomerService customerService;

    @MockBean
    CustomerRepository customerRepository;

    @Test
    void getAllCustomer(){
        List<Customer> list = new ArrayList<>();
        Customer c1 = new Customer(1,"victel","Victor","Telescop","0737582121","Independentei", "Bucharest","060021","Romania");
        Customer c2 = new Customer(2,"vicmel","Victor","Melodie","073751221","Pragului", "Bucharest","060031","Romania");
        list.add(c1);
        list.add(c2);
        Mockito.when(customerRepository.findAll()).thenReturn(list);
		assertEquals(2,list.size());
		assertEquals(list.get(1).username,c2.getUsername());


    }

}
