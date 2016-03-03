/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author deecm22
 */
public class EmailService {
    
    
    //to-do.  Implement methods for sending mail based on action.
    
    
    public void sendRegistrationEmail(){
        String message = "You have sucessfully registered to our site.  Please enjoy our products!";
    }
    
    public void sendNewProductEmail(){
        String message = "We wanted to inform you of our new products below:";
    }
    
    public void sendSaleAdvertisementEmail(){
        String message ="We will be having a sale!  The details are below:";
    }
}
