package com.ata;

import java.util.ArrayList;

public class Cart{

    private ArrayList<Product> items;
    private double total;
    private double taxRate = 0.1;
    
    public Cart(){
        items = new ArrayList<>();
        total = 0.0;
    }
    
    public void addItem(Product p){
        items.add(p);
        total += p.getPrice();
    }
    
    public void showDetails(){
        if(items.size() > 0){
            System.out.println("--Cart--");
            System.out.println("Item Count: " + items.size());
            System.out.println("Items:");
            for(Product item : items){
                String string = item.getName() + ": $" + String.format("%.2f", item.getPrice());
                System.out.println(string);
            }
            System.out.println();
            System.out.println("Pre-Tax Total: $" + String.format("%.2f", total));
            double postTaxTotal = total + (total*taxRate);
            System.out.println("Post-Tax Total (10.00% Tax): $" + String.format("%.2f", postTaxTotal));
            
        }else{
            System.out.println("The cart is empty. Please add at least one product to see it in the cart.");
        }
    }
    
    public void checkout(){
        if(items.size() > 0){
            double postTaxTotal = total + (total*taxRate);
            System.out.println("Your total is $" + String.format("%.2f", postTaxTotal)); 
            System.out.println("Thank you for shopping at T-Shirt Mart.");
            empty();
        }else{
            System.out.println("Your cart is currently empty. Please add at least one product to check out.");
        }
        
    }
    
    private void empty(){
        items.clear();
    }

}