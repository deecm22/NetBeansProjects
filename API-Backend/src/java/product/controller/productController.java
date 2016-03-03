/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product.controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.inject.Inject;
import product.boundary.ProductBoundary;
import product.entity.Product;

/**
 *
 * @author deecm22
 */
@Named(value = "productController")
@SessionScoped
public class productController implements Serializable {

    
    @Inject 
    private ProductBoundary productBoundary;
    
    private Product product;
    
    /**
     * Creates a new instance of productController
     */
    public productController() {
        productBoundary = new ProductBoundary();
        
    }
    
    public String submitNewProduct(){
        
        return "list-products.xhtml";
    }
}
