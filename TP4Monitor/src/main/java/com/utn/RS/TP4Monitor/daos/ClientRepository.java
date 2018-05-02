/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utn.RS.TP4Monitor.daos;

import com.utn.RS.TP4Monitor.DTO.CountableClient;
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
    
    @Query(" SELECT new com.utn.RS.TP4Monitor.DTO.SimpleCountableValue"
            + "     (count(c.browserName), c.browserName)"
            + " FROM clients c"
            + " GROUP BY c.browserName"
            + " ORDER BY count(c.browserName) DESC")
    public List<SimpleCountableValue> usedBrowsers();
    
    @Query(" SELECT new com.utn.RS.TP4Monitor.DTO.SimpleCountableValue"
            + "     (count(c.opSystemName), c.opSystemName)"
            + " FROM clients c"
            + " GROUP BY c.opSystemName"
            + " ORDER BY count(c.opSystemName) DESC")
    public List<SimpleCountableValue> usedOPSystems();
    
    @Query("SELECT new com.utn.RS.TP4Monitor.DTO.CountableClient"
            + "     (COUNT(*), c.browserName, c.opSystemName)"
            + " FROM clients c"
            + " GROUP BY c.browserName, c.opSystemName"
            + " ORDER BY COUNT(*) DESC")
    public List<CountableClient> getMostPopularClient();
    
}
