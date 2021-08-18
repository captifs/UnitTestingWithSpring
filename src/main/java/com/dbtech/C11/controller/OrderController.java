package com.dbtech.C11.controller;

import com.dbtech.C11.dao.Order;
import com.dbtech.C11.dao.OrderRowMapper;
import com.dbtech.C11.service.CustomerService;
import com.dbtech.C11.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class OrderController {
//
//    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    OrderService orderService;
//
//
//    @ResponseBody
//    @GetMapping("/orders")
//    public List<Order> getAllOrders(){
//        return orderService.getAllOrders();
//    }
//
//    @ResponseBody
//    @GetMapping("/orders/{id}")
//    public Order getOrderById(@PathVariable(name ="id")Integer cid){
//        return orderService.getOrderById(cid);
//    }
//
//    @PutMapping("/orders")
//    @ResponseBody
//    public Boolean insertOrder(@RequestBody Order order){
//        return orderService.insertOrders(order);
//    }
//
//
//    @PutMapping("/orders/{id}")
//    @ResponseBody
//    public Boolean updateOrder(@PathVariable(name="id")Integer cid, @RequestBody Order order) {
//        return orderService.updateOrderById(cid,order);
//    }
//
//
//
//    @DeleteMapping("/orders/{id}")
//    @ResponseBody
//    public Boolean deleteOrderById(@PathVariable(name="id")Integer cid){
//        return orderService.deleteOrderById(cid);
//    }
}
