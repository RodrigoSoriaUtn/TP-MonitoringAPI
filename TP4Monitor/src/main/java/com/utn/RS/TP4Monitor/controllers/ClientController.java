/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utn.RS.TP4Monitor.controllers;

import com.utn.RS.TP4Monitor.DTO.CountableClient;
import com.utn.RS.TP4Monitor.DTO.SimpleCountableValue;
import com.utn.RS.TP4Monitor.daos.ClientRepository;
import com.utn.RS.TP4Monitor.models.Client;
import java.util.List;
import net.sf.uadetector.ReadableUserAgent;
import net.sf.uadetector.UserAgentStringParser;
import net.sf.uadetector.service.UADetectorServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rodrigo
 */
@RestController
@RequestMapping(value = "/apiService", produces = MediaType.APPLICATION_JSON_VALUE)
public class ClientController {
    
    //The resource module parser will not update automatically.
    private static final UserAgentStringParser UAPARSER = UADetectorServiceFactory.getResourceModuleParser();
    
    @Autowired
    private ClientRepository clientService;
    
    @RequestMapping(value = "/upload")
    @ResponseBody
    public HttpStatus saveClientInfo(@RequestHeader(value = "User-Agent") String clientInfo){
        
        ReadableUserAgent clientData = UAPARSER.parse(clientInfo);
        
        String browser = clientData.getFamily().getName();
        String operativeSystem = clientData.getOperatingSystem().getName();
        
        clientService.save(new Client(browser,operativeSystem));
        //Returns a CREATED http status because this methods uploads something to the database :O
        return new ResponseEntity(HttpStatus.CREATED).getStatusCode();
    }
    
    @RequestMapping("/clients")
    public @ResponseBody List<Client> getClients(){
        return clientService.findAll();
    }
    
    @RequestMapping("/popularBrowser")
    public @ResponseBody SimpleCountableValue getMostUsedBrowser(){
        SimpleCountableValue OS;
        if(!clientService.usedBrowsers().isEmpty())
            OS = clientService.usedBrowsers().get(0);
        else
            OS = new SimpleCountableValue(0L,"none");
        return OS;
    }
    
    @RequestMapping("/popularOPSystem")
    public @ResponseBody SimpleCountableValue getMostUsedOPSystem(){
        SimpleCountableValue OS;
        if(!clientService.usedOPSystems().isEmpty())
            OS = clientService.usedOPSystems().get(0);
        else
            OS = new SimpleCountableValue(0L,"none");
        return OS;
    }
    
    @RequestMapping("/popularClient")
    public @ResponseBody CountableClient getMostPopularClient(){
        CountableClient client;
        if(!clientService.getMostPopularClient().isEmpty())
            client = clientService.getMostPopularClient().get(0);
        else
            client = new CountableClient(0L,"none","none");
        return client;
    }
}
