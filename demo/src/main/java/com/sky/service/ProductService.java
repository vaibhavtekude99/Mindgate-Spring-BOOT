package com.sky.service;

import java.util.List;

import com.sky.domain.Product;
public interface ProductService {
	
	
	
    public void addProduct(Product product);
    public List<Product> getProducts();
    public  Product getProductByid(String id);
    public  Product deleteByID( String id);
    public Product updateById(Product product);
}
