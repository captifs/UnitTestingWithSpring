package com.dbtech.C11.controller;

import com.dbtech.C11.dao.Product;
import com.dbtech.C11.dao.ProductRowMapper;
import com.dbtech.C11.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {
//
//    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    ProductService productService;
//
//    @ResponseBody
//    @GetMapping("/products")
//    public List<Product> getAllProducts(){
//        return productService.getAllProducts();
//    }
//
//    @ResponseBody
//    @GetMapping("/products/{code}")
//    public Product getProductById(@PathVariable(name ="code")String cod){
//        return productService.getProductById(cod);
//    }
//
//    @PutMapping("/products")
//    @ResponseBody
//    public Boolean insertProduct(@RequestBody Product product){
//        return productService.insertProducts(product);
//    }
//
//
//    @PutMapping("/products/{code}")
//    @ResponseBody
//    public Boolean updateProduct(@PathVariable(name="code")String cod, @RequestBody Product product) {
//        return productService.updateProduct(cod,product);
//    }
//
//    @DeleteMapping("/products/{code}")
//    @ResponseBody
//    public Boolean deleteProductByCode(@PathVariable(name="code")String cod){
//       return productService.deleteProductByCode(cod);
//    }
}
