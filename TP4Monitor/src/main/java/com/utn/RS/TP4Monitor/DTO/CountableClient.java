/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utn.RS.TP4Monitor.DTO;

/**
 *
 * @author Alumno
 */
public class CountableClient {
    private Long quantity;
    private String browser;
    private String opSystem;

    public CountableClient(Long quantity, String browser, String opSystem) {
        this.quantity = quantity;
        this.browser = browser;
        this.opSystem = opSystem;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getOpSystem() {
        return opSystem;
    }

    public void setOpSystem(String opSystem) {
        this.opSystem = opSystem;
    }
    
}
