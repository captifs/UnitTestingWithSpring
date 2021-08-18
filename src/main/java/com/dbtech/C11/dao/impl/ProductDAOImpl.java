package com.dbtech.C11.dao.impl;

import com.dbtech.C11.dao.Order;
import com.dbtech.C11.dao.Product;
import com.dbtech.C11.dao.ProductDAO;
import com.dbtech.C11.dao.ProductRowMapper;
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
public class ProductDAOImpl implements ProductDAO {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Product> getAllProducts(){
        List<Product> result = entityManager.createQuery("select p from Product p",Product.class).getResultList();
        return result;
    }

    @Override
    @Transactional
    public Product getProductById(String cod){
        Product o = entityManager.find(Product.class , cod);
        return o;
    }

    @Override
    @Transactional
    public Boolean insertProduct(Product product){
        entityManager.persist(product);
        return true;
    }

    @Override
    @Transactional
    public Boolean updateProduct(String cod,Product product) {
        Product dbProduct = entityManager.find(Product.class, cod);
        dbProduct.name = product.name;
        dbProduct.description = product.description;
        dbProduct.stock = product.stock;
        dbProduct.price = product.price;
        entityManager.persist(dbProduct);
        return true;
    }

    @Override
    @Transactional
    public Boolean deleteProductByCode(String cod){
        Product db = entityManager.find(Product.class,cod);
        entityManager.remove(db);
        return true;
    }
}
