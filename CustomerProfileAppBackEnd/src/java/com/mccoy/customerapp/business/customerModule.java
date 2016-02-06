/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mccoy.customerapp.business;

import com.mccoy.customerapp.dao.CustomerFacade;
import com.mccoy.customerapp.models.Customer;
import com.mccoy.customerapp.models.PurchaseOrder;
import com.mccoy.customerapp.utils.transactionLogger;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author deecm22
 */
@Stateless
@LocalBean
public class customerModule {
    
    private CustomerFacade custFacade;
   

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    //ToDo: needs error handeling in case the product doesn't exist.
    
    public List<PurchaseOrder> getCustomerOrders(String customerID){
    Customer customer = custFacade.find(customerID.trim());
    if(customer==null){
      transactionLogger.logTransaction("Customer Not found");
    }
    List purchaseOrders = customer.getPurchaseOrderList();
    ArrayList<PurchaseOrder> empty = new ArrayList();
    if(purchaseOrders!=null){
       return purchaseOrders;
    }
    transactionLogger.logTransaction("Customer has no purchase Orders");
    return empty;
    }
}
