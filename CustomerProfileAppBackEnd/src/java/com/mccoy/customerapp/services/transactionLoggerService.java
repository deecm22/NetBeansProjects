/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mccoy.customerapp.services;

import com.mccoy.customerapp.utils.transactionLogger;
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
@WebService(serviceName = "transactionLoggerService")
@Stateless()
public class transactionLoggerService {

    @EJB
    private transactionLogger ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "logTransaction")
    @Oneway
    public void logTransaction(@WebParam(name = "transactionLogMessage") String transactionLogMessage) {
        ejbRef.logTransaction(transactionLogMessage);
    }
    
}
