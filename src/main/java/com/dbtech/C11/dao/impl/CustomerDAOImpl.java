package com.dbtech.C11.dao.impl;

import com.dbtech.C11.dao.Customer;
import com.dbtech.C11.dao.CustomerDAO;
import com.dbtech.C11.dao.CustomerRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> result = entityManager.createQuery("select c from Customer c",Customer.class).getResultList();
        return result;
    }

    @Override
    public Customer getCustomer(int id) {
        Customer c = entityManager.find(Customer.class , id);
        return c;
    }

    @Override
    @Transactional
    public Boolean insertCustomer(Customer customer) {
        entityManager.persist(customer);
        return true;
    }

    @Override
    @Transactional
    public Boolean updateCustomer(int id, Customer customer) {
        Customer dbCustomer = entityManager.find(Customer.class, id);
        dbCustomer.firstName = customer.firstName;
        dbCustomer.lastName = customer.lastName;
        dbCustomer.username = customer.username;
        entityManager.persist(dbCustomer);
        return true;
    }

    @Override
    @Transactional
    public Boolean deleteCustomer(int id) {
        Customer db = entityManager.find(Customer.class,id);
        entityManager.remove(db);
        return true;
    }

//    @Override
//    public List<Customer> filteredCustomers(String username, String city, String country)
//    {
//        String sql = "SELECT * FROM customers";
//        if(!username.isEmpty()){
//            sql += " where username = \"" + username + "\"";
//        }
//
//        if(!city.isEmpty()){
//            if(!username.isEmpty()){
//                sql += " and city = \"" + city + "\"";
//            }else {
//                sql += " where city = \"" + city + "\"";
//            }
//
//        }
//
//        if(!country.isEmpty()){
//            if((!username.isEmpty()) && (!city.isEmpty())){
//                sql += "  and country = \"" + country + "\"";
//            } else if( (!username.isEmpty()) || (!city.isEmpty())){
//                sql += "  and country = \"" + country + "\"";
//            } else{
//                sql += " where country = \"" + country + "\"";
//            }
//        }
//
//       // sql += ";";
//        System.out.println(sql);
//
//        List<Customer> customers = this.jdbcTemplate.query(sql, new CustomerRowMapper());
//        return customers;
//
//
//    }

}
