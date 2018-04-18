/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utn.RS.TP4Monitor.daos;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author alumno
 * @param <T> The type of object that the dao will have.
 * @param <PK> The type of objetc that represents the ID of the object.
 */
public class GenericDao <T, PK> implements JpaRepository <T, PK>{
    
}
