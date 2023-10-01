package com.company;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    // below here in angle brackets it is called the generic type
    // generic types means the user-defined class or methods
    // it means list of values are stored in the product named and the Product which is already pre-defined by the user is used
    // as generic type so that we can further access the methods inside the Product class

    // below in the for loop I have used the Product p so we have the access to the getName() method
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
