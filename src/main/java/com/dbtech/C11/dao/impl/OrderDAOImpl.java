package com.dbtech.C11.dao.impl;

import com.dbtech.C11.dao.Customer;
import com.dbtech.C11.dao.Order;
import com.dbtech.C11.dao.OrderDAO;
import com.dbtech.C11.dao.OrderRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class OrderDAOImpl implements OrderDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Order> getAllOrders(){
        List<Order> result = entityManager.createQuery("select o from Order o",Order.class).getResultList();
        return result;
    }

    @Override
    @Transactional
    public Order getOrderById(int id){
        Order o = entityManager.find(Order.class , id);
        return o;
    }

    @Override
    @Transactional
    public Boolean insertOrder(Order order){
        entityManager.persist(order);
        return true;
    }

    @Override
    @Transactional
    public Boolean updateOrder(int id,Order order) {
        Order thisOrder = entityManager.find(Order.class, id);
        thisOrder.order_date = order.order_date;
        thisOrder.shipped_date = order.shipped_date;
        thisOrder.status = order.status;
        entityManager.persist(thisOrder);
        return true;
    }

    @Override
    @Transactional
    public Boolean deleteOrderById(int id){
        Order db = entityManager.find(Order.class,id);
        entityManager.remove(db);
        return true;
    }
}
