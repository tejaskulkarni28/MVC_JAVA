package com.company;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    List<Product> product = new ArrayList<>();
    public void addProduct(Product p){
        product.add(p);
    }
    public List getAllProduct(){
        return product;
    }
    public Product getSpecifiedProduct(String name){
        for(Product p: product){
            if(p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }
}
