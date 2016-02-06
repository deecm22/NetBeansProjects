/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mccoy.customerapp.services;

import com.mccoy.customerapp.business.customerModule;
import com.mccoy.customerapp.models.PurchaseOrder;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author deecm22
 */
@WebService(serviceName = "customerModuleService")
@Stateless()
public class customerModuleService {

    @EJB
    private customerModule ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "getCustomerOrders")
    public List<PurchaseOrder> getCustomerOrders(@WebParam(name = "customerID") String customerID) {
        return ejbRef.getCustomerOrders(customerID);
    }
    
}
