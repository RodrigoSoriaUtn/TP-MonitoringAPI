/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utn.RS.TP4Monitor.controllers;

import com.utn.RS.TP4Monitor.daos.ClientRepository;
import com.utn.RS.TP4Monitor.models.Client;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rodrigo
 */
@RestController
@RequestMapping(value = "/apiService", produces = MediaType.APPLICATION_JSON_VALUE)
public class InformationController {
    
    @Autowired
    private ClientRepository clientService;
    
    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public void saveClientInfo(@RequestHeader(value = "User-Agent") String clientInfo){
        System.out.println(clientInfo);
    }
    
    @RequestMapping("/browsers")
    public @ResponseBody List<Client> getBrowsers(){
        return clientService.findAll();
    }
    
    /*
    public getOperativeSystems(){
        
    }
    
    public getCombination(){
    
    }
    */
    
    
    
}
