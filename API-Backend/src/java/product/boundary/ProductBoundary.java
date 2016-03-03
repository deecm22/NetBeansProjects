/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product.boundary;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import product.entity.Manufacturer;
import product.entity.Product;
import product.entity.ProductCode;
import product.service.ManufacturerFacadeREST;
import product.service.ProductCodeFacadeREST;
import product.service.ProductFacadeREST;

/**
 *
 * @author deecm22
 */
@Stateless
public class ProductBoundary {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @Inject
    private ProductFacadeREST productFacade;
    private ProductCodeFacadeREST productCodeFacade;
    private ManufacturerFacadeREST manufacturerFacade;
    
    private Product product;
    private List<Product> productList;
    private ProductCode productCode;
    private Manufacturer manufacturer;
    
   public void createNewProduct(Product prod){
       productFacade.create(prod);
       
   }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

   
   
   
   
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductCode getProductCode() {
        return productCode;
    }

    public void setProductCode(ProductCode productCode) {
        this.productCode = productCode;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
    
   
   
   
}
