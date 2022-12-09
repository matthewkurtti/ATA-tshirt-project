package com.ata;

import java.util.ArrayList;
//import java.util.Array;

public class Shop{
    
    //private String name;
    private ArrayList<Product> products;
    
    public Shop(){
    
    }
    
    public Shop(String[] names, double[] prices){
        products = new ArrayList<>();
        for(int i=0; i < names.length; i++){
            Product product = new Product(i, names[i], prices[i]);
            products.add(product);
        }
        
        /**products = new Product[names.length];
        for(int i=0; i < names.length; i++){
            products[i] = new Product(names[i], prices[i]);
        }*/
    }
    
    
    /**
    * Prints products
    */
    public void printProducts(){
        System.out.println("--Products--");
        for(Product product : products){
            System.out.println("ID " + product.getID() + ": " + product.getName() + " - $" + product.getPrice());
        }
    }
    
    /**
    * searches for a product in the products array
    */
    public int findProduct(String searchText){
        for(Product product : products){
            if(product.getName().equals(searchText)){
                return product.getID();
            }
        }
        return -1;
    }
    
    public Product findProductWithID(int searchId){
        for(Product product : products){
            if(product.getID() == searchId){
                return product;
            }
        }
        return null;
    }
    
    
    
}

