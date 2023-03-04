/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordersystem;

import java.util.List;

/**
 *
 * @author granger
 */
public class OrderDetail {
    public int quantity;
    public String taxStatus;
    
    protected float subTotal;
    protected float tax;
    protected float weight;
    
    public float calcSubTotal(List<Item> itemlist){
        float value = 0;
        for(int i=0; i<itemlist.size() ; i++){
            value += itemlist.get(i).getPriceForQuantity();
        }
        this.subTotal = value;
        return value;
    }
    
    public float calcWeight(List<Item> itemlist){
        float weight = 0;
        for(int i=0; i<itemlist.size(); i++){
            weight += itemlist.get(i).shippingWeight;
        }
        return weight;
    }
    
    public float calcTax(List<Item> itemlist){
        float value = 0;
        for(int i=0; i<itemlist.size(); i++){
            value += itemlist.get(i).shippingWeight;
        }
        this.tax = value;
        return value;
    }
}
