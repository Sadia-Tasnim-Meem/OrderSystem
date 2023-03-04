/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordersystem;

/**
 *
 * @author granger
 */
public class Item {
    public float shippingWeight;
    public String description;
    
    private int quantity;
    private float price;
    private float taxRate;
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    
    public void setPrice(float price){
        this.price = price;
    }
    
    public float getPrice(){
        return this.price;
    }
    
    public void setTaxRate(float taxRate){
        this.taxRate = taxRate;
    }
    
    public float getTaxRate(){
        return this.taxRate;
    }
    
    public float getPriceForQuantity(){
        return quantity*price;
    }
    
    public float getTax(){
        return quantity*taxRate;
    }
    
    public boolean inStock(boolean availabilityStatus){
        return availabilityStatus;
    }
}
