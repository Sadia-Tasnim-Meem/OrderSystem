/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordersystem;

/**
 *
 * @author granger
 */
public class Check extends Payment{
    public String name;
    public String bankID;
    
    public boolean authorized(boolean authorizationStatus){
        return authorizationStatus;
    }
}
