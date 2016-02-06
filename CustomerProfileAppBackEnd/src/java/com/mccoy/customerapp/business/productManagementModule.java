/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mccoy.customerapp.business;

import com.mccoy.customerapp.dao.ProductFacade;
import com.mccoy.customerapp.models.Product;
import java.math.BigDecimal;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import com.mccoy.customerapp.utils.transactionLogger;

/**
 *
 * @author deecm22
 */
@Stateless
@LocalBean
public class productManagementModule {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    private ProductFacade prodFacade;
    //private Product product;
    
    public void createNewProduct(Product p){
        prodFacade.create(p);
        
    }
    
    public void increaseProductPrice(String productID, BigDecimal markUpAmount){
            //ToDo: needs error handeling in case the product doesn't exist.
            Product product = prodFacade.find(productID.trim());
            product.setMarkup(markUpAmount);
            prodFacade.edit(product);
            transactionLogger.logTransaction("Product "+product.getProductCode().getProdCode()+" has been marked up by "+markUpAmount);
            //salesLogger.log(Level.INFO, "Product {0}has been marked up by {1}", new Object[]{product.getProductCode(), product.getMarkup()});
    }
    
    public void decreaseProductPrice(String productID, BigDecimal markDownAmount){
            //ToDo: needs error handeling in case the product doesn't exist.
            Product product = prodFacade.find(productID.trim());
            product.setPurchaseCost(product.getPurchaseCost().subtract(markDownAmount));
            prodFacade.edit(product);
            transactionLogger.logTransaction( "Product "+product.getProductCode().getProdCode()+" has been marked down by "+markDownAmount);
            //salesLogger.log(Level.INFO, "Product {0}has been marked down by {1}", new Object[]{product.getProductCode(), product.getMarkup()});
    }
}
