/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mccoy.customerapp.business;

import com.mccoy.customerapp.dao.*;
import com.mccoy.customerapp.models.*;
import com.mccoy.customerapp.models.PurchaseOrder;
import com.mccoy.customerapp.utils.transactionLogger;
import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author deecm22
 */
@Stateless
@LocalBean
public class salesModule {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    private ProductFacade prodFacade;
    private PurchaseOrderFacade poFacade;
    private CustomerFacade custFacade;
    private Customer customer;
    private DiscountCodeFacade disFacade;
    private DiscountCode discount;
    private PurchaseOrder purchaseOrder;
    private Product product;
    
    public salesModule(){
        
    }
    //Processes a customer order by 
    public void processCustomerOrder(Product product,Customer customer, String discountCodeID){
       transactionLogger.logTransaction("about to place a sales order");
        
       
           //apply a discount.
           if(!discountCodeID.isEmpty()){
               discount = disFacade.find(discountCodeID.trim());
               if(discount==null){
               transactionLogger.logTransaction("Invalid Discount Code Entered");
                }
               if(discount!=null){//what if the code is not found?
               customer.setDiscountCode(disFacade.find(discountCodeID.trim()));
               }
           }
               //add the customer and product info purchase order for the customer.   
               purchaseOrder.setCustomerId(customer);
               purchaseOrder.setProductId(product);
               
               //save the new purchaseOrder
               poFacade.create(purchaseOrder);
               
               //decrease the product inventory
               product.setQuantityOnHand(product.getQuantityOnHand()-1); 
               prodFacade.edit(product);
                           
           } 

    
        
        
    
    
    
}
