/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utn.RS.TP4Monitor.daos;

import com.utn.RS.TP4Monitor.DTO.SimpleCountableValue;
import com.utn.RS.TP4Monitor.models.Client;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author rodrigo
 */

public interface ClientRepository extends JpaRepository<Client, Long>{
    
    @Query(" SELECT count(c.browserName) as cant, c.browserName as browser"
            + " FROM clients c"
            + " GROUP BY c.browserName"
            + " ORDER BY count(c.browserName) DESC")
    public List<SimpleCountableValue> usedBrowsers();
    
    @Query(" SELECT count(c.opSystemName) as cant, c.opSystemName as opSystem"
            + " FROM clients c"
            + " GROUP BY c.opSystemName"
            + " ORDER BY count(c.opSystemName) DESC")
    public List<SimpleCountableValue> usedOPSystems();
 
    
}
