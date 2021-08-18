//package com.dbtech.C11;
//
//import com.dbtech.C11.controller.CustomerController;
//import com.dbtech.C11.controller.Utils;
//import com.dbtech.C11.dao.Customer;
//import com.dbtech.C11.service.CustomerRepository;
//import com.dbtech.C11.service.CustomerService;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.*;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import java.time.Duration;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.UUID;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.assertj.core.api.Assertions.not;
//import static org.hamcrest.Matchers.hasSize;
//import static org.hamcrest.Matchers.is;
//import static org.junit.jupiter.api.Assertions.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@WebMvcTest(CustomerController.class)
//class C11ApplicationTests {
//	@MockBean
//	CustomerRepository customerRepository;
//
//	@Autowired
//	MockMvc mockMvc;
//
//	@Autowired
//	ObjectMapper mapper;
//
//
//
////	// lets start our tests
////	@Test
////	void getAllCustomers() throws Exception {
////		List<Customer> list = new ArrayList<>();
////		Customer c1 = new Customer(1,"victel","Victor","Telescop","0737582121","Independentei", "Bucharest","060021","Romania");
////		Customer c2 = new Customer(2,"vicmel","Victor","Melodie","073751221","Pragului", "Bucharest","060031","Romania");
////
////		list.add(c1);
////		list.add(c2);
//////		Mockito.when(customerRepository.findAll()).thenReturn(list);
//////		assertEquals(2,list.size());
//////		assertEquals(list.get(1).username,c2.getUsername());
////
////
////		mockMvc.perform(MockMvcRequestBuilders.get("/customers").contentType(MediaType.APPLICATION_JSON))
////				.andExpect(status().isOk()).andExpect(jsonPath("$",hasSize(2)))
////				.andExpect(jsonPath("$[0].username",is ("victel")))
////				.andExpect(jsonPath("$[0].firstName",is ("Victor")))
////				.andExpect(jsonPath("$[1].username",is ("vicmel")))
////				.andExpect(jsonPath("$[1].firstName",is ("Victor")));
////	}
//
//
//@Test
//	void testsomething(){
//	Customer c = new Customer();
//
//	assertEquals(c,Customer.class);
//}
//
//
//
//}
