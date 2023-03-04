/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordersystem;

import java.util.Date;
import java.util.List;

/**
 *
 * @author granger
 */
public class Order {
    public Date date;
    public String status;
    
    public Customer customer;
    
    protected float subTotal;
    protected float tax;
    protected float weight;
    
    List<OrderDetail> orderDetailList;
    
    public void setCustomer(Customer customer){
        this.customer = customer;
    }
    
    public Customer getCustomer(){
        return this.customer;
    }
    
    public float calcSubTotal(){
        float subTotal = 0;
        for(int i=0; i<orderDetailList.size() ; i++){
            subTotal += orderDetailList.get(i).subTotal;
        }
        this.subTotal = subTotal;
        return subTotal;
    }
    
    public float calcTax(){
        float tax = 0;
        for(int i=0; i<orderDetailList.size() ; i++){
            tax += orderDetailList.get(i).tax;
        }
        this.tax = tax;
        return tax;
    }
    
    public float calcTotal(){
        return subTotal+tax;
    }
    
    public float calcTotalWeight(){
        float weight = 0;
        for(int i=0; i<orderDetailList.size() ; i++){
            weight += orderDetailList.get(i).weight;
        }
        this.weight = weight;
        return weight;
    }
}
