package com.dbtech.C11.dao;

import java.util.List;

public interface ProductDAO {
    public List<Product> getAllProducts();
    public Product getProductById(String cod);
    public Boolean insertProduct(Product product);
    public Boolean updateProduct(String cod,Product product);
    public Boolean deleteProductByCode(String cod);
}
