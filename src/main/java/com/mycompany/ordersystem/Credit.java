/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordersystem;

/**
 *
 * @author granger
 */
public class Credit extends Payment{
    public String number;
    public String type;
    public String expDate;
    
    public boolean authorized(boolean authorisationStatus){
        return authorisationStatus;
    }
}
