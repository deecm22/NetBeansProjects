/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mccoy.customerapp.utils;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;

/**
 *
 * @author deecm22
 */
@Singleton
@LocalBean
public class transactionLogger{
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method") 
    private static final Logger TRANSACTIONLOGGER = Logger.getLogger("transactionLogger");
    /**
     *
     * @param transactionLogMessage
     */
    public static void logTransaction(String transactionLogMessage){
        TRANSACTIONLOGGER.log(Level.INFO, transactionLogMessage);
    }
}
