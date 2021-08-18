package com.dbtech.C11.dao;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface OrderDAO {
    public List<Order> getAllOrders();
    public Order getOrderById(int id);
    public Boolean insertOrder(Order order);
    public Boolean updateOrder(int id,Order order);
    public Boolean deleteOrderById(int id);
}
