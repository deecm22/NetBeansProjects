/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import models.WrisSR;
import service.WrisSRFacadeREST;

/**
 *
 * @author deecm22
 */
@Named(value = "newRequestController")
@RequestScoped
public class newRequestController {

    @Inject
    private WrisSRFacadeREST wrFacade;
    
    private WrisSR wr;
    
    /**
     * Creates a new instance of newRequestController
     */
    public newRequestController() {
        wr = new WrisSR();
    }

    public WrisSR getWr() {
        return wr;
    }

    public void setWr(WrisSR wr) {
        this.wr = wr;
    }
    
    
    
    public String submitNewRequest(){
        if(isValidWR(wr)){
        wrFacade.create(wr);
        }
        return "viewrequest.xhtml";
    }
    
    
    
    //ToDo: implement this to ensure a valid representation invarient.
    private boolean isValidWR(WrisSR req){
        return true;
    }
}
