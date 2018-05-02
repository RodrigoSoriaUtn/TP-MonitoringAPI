/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utn.RS.TP4Monitor.DTO;

/**
 *
 * @author rodrigo
 */
public class SimpleCountableValue {
    
    private Long quantity;
    private String value;
    
    public SimpleCountableValue() {}
    
    public SimpleCountableValue(Long quantity, String value) {
        this.quantity = quantity;
        this.value = value;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    
    
}
