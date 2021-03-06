/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utn.RS.TP4Monitor.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author alumno
 */
@Entity(name = "clients")
@Table(name = "clients")
public class Client implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id_client")
    private Long id;
    
    @Column(name = "browserName")
    private String browserName;
    
    @Column(name = "opSystemName")
    private String opSystemName;
    
    public Client(){}
    
    public Client(String browserName, String operativeSystemName) {
        this.browserName = browserName;
        this.opSystemName = operativeSystemName;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    public String getOpSystemName() {
        return opSystemName;
    }

    public void setOpSystemName(String opSystemName) {
        this.opSystemName = opSystemName;
    }
}
