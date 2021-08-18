package com.dbtech.C11.service;


import com.dbtech.C11.dao.Customer;
import com.dbtech.C11.dao.Order;
import com.dbtech.C11.dao.OrderDAO;
import com.dbtech.C11.dao.OrderRowMapper;
import com.dbtech.C11.dao.impl.OrderDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    // CustomerDAO customerDAO = new CustomerDAOImpl();

    public List<Order> getAllOrders() {

        List<Order> orderList = orderRepository.findAll();
        return orderList;
    }

    public Order getOrderById(int id) {

        Order o = orderRepository.findById(id).get();
        return o;

    }

    public Boolean insertOrders(Order o)
    {
        Boolean exists = orderRepository.existsById(o.id);
        if (exists == false)
            orderRepository.save(o);
        return exists;
    }

    public Boolean updateOrderById(int id, Order order) {
        Boolean exists = orderRepository.existsById(id);
        if (exists == true)
            orderRepository.save(order);
        return exists;
    }

    public Boolean deleteOrderById(int id) {
        Boolean exists = orderRepository.existsById(id);
        if (exists == true)
            orderRepository.deleteById(id);
        return exists;
    }
}