/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mangedBeans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author deecm22
 */
@Named(value = "customerJSFManagedBean")
@RequestScoped
public class CustomerJSFManagedBean {

    /**
     * Creates a new instance of CustomerJSFManagedBean
     */
    public CustomerJSFManagedBean() {
    }
    
}