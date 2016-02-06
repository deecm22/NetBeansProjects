/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import models.WrisSR;
import service.WrisSRFacadeREST;

/**
 *
 * @author deecm22
 */
@Named(value = "searchController")
@SessionScoped
public class searchController implements Serializable {

    @Inject
    WrisSRFacadeREST wrFacade;
    
    WrisSR selectedWR;
    List<WrisSR> workRequests;
    /**
     * Creates a new instance of searchController
     */
    public searchController() {
    }

    public List<WrisSR> getWorkRequests() {
        workRequests = wrFacade.findAll();
        return workRequests;
    }

    public void setWorkRequests(List<WrisSR> workRequests) {
        this.workRequests = workRequests;
    }

    public WrisSR getSelectedWR() {
        return selectedWR;
    }

    public void setSelectedWR(WrisSR selectedWR) {
        this.selectedWR = selectedWR;
    }
    
   public String viewSelectedWR(){
       return "viewrequest.xhtml";
   }
   
   public String updateSelectedWR(String ID){
       return "updaterequest.xhtml";
   }
    
}
