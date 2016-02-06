/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mccoy.customerapp.services;

import com.mccoy.customerapp.business.productManagementModule;
import com.mccoy.customerapp.models.Product;
import java.math.BigDecimal;
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
@WebService(serviceName = "productManagementService")
@Stateless()
public class productManagementService {

    @EJB
    private productManagementModule ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createNewProduct")
    @Oneway
    public void createNewProduct(@WebParam(name = "p") Product p) {
        ejbRef.createNewProduct(p);
    }

    @WebMethod(operationName = "increaseProductPrice")
    @Oneway
    public void increaseProductPrice(@WebParam(name = "productID") String productID, @WebParam(name = "markUpAmount") BigDecimal markUpAmount) {
        ejbRef.increaseProductPrice(productID, markUpAmount);
    }

    @WebMethod(operationName = "decreaseProductPrice")
    @Oneway
    public void decreaseProductPrice(@WebParam(name = "productID") String productID, @WebParam(name = "markDownAmount") BigDecimal markDownAmount) {
        ejbRef.decreaseProductPrice(productID, markDownAmount);
    }
    
}
