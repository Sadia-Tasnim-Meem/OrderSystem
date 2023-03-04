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
public class Customer {
    public String name;
    public String address;
    
    public List<Order> orderlist;
    
    public void addOrder(Order order){
        orderlist.add(order);
    }
    
    public List getOrders(){
        return orderlist;
    }
}
