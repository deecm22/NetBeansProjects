/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mccoy.customerapp.services;

import com.mccoy.customerapp.business.salesModule;
import com.mccoy.customerapp.models.Customer;
import com.mccoy.customerapp.models.Product;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author deecm22
 */
@WebService(serviceName = "salesService")
@Stateless()
public class salesService {

    @EJB
    private salesModule ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "processCustomerOrder")
    @Oneway
    public void processCustomerOrder(@WebParam(name = "product") Product product, @WebParam(name = "customer") Customer customer, @WebParam(name = "discountCodeID") String discountCodeID) {
        ejbRef.processCustomerOrder(product, customer, discountCodeID);
    }
    
}
