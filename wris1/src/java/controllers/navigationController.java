/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;


import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


/**
 *
 * @author deecm22
 */
@Named(value = "navigationController")
@RequestScoped
public class navigationController {
        
    /**
     * Creates a new instance of srManagedBeanController
     */
    public navigationController() {
    }

public String navigateNewRequest(){
    return "newrequest.xhtml";
}
     
public String navigateSearch(){
    return "search.xhtml";
}

public String navigateReports(){
    return "reports.xhtml";
}

public String navigateConfiguration(){
    return "configuration.xhtml";
}

public String navigateSurveys(){
    return "surveys.xhtml";
}

}
