package com.dbtech.C11.service;

import com.dbtech.C11.dao.*;
import com.dbtech.C11.dao.impl.ProductDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts() {

        List<Product> productList = productRepository.findAll();
        return productList;
    }

    public Product getProductById(String code) {

        Product p = productRepository.findById(code).get();
        return p;
    }

    public Boolean insertProducts(Product p)
    {
        Boolean exists = productRepository.existsById(p.code);
        if (exists == false)
            productRepository.save(p);
        return exists;
    }

    public Boolean updateProduct(String code, Product product) {
        Boolean exists = productRepository.existsById(code);
        if (exists == true)
            productRepository.save(product);
        return exists;
    }


    public Boolean deleteProductByCode(String code) {
        Boolean exists = productRepository.existsById(code);
        if (exists == true)
            productRepository.deleteById(code);
        return exists;
    }

}
