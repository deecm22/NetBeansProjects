/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModels;


import DAO_Restful.QadbentryFacadeREST;
import Models.Qadbentry;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author deecm22
 */
@ManagedBean
@RequestScoped
public class CreateEntryManagedBean implements Serializable{
    
    
   
    
    @EJB
    private QadbentryFacadeREST entryFacade;
   
    
     private Qadbentry entry;
    /**
     * Creates a new instance of CreateEntryManagedBean
     */
    public CreateEntryManagedBean() {
    }

    public Qadbentry getEntry() {
        if(entry==null){
            entry=new Qadbentry();
        }
        return entry;
    }

    public void setEntry(Qadbentry entry) {
        this.entry = entry;
    }

    public QadbentryFacadeREST getEntryFacade() {
        return entryFacade;
    }

    public void setEntryFacade(QadbentryFacadeREST entryFacade) {
        this.entryFacade = entryFacade;
    }
    
    
    
    
    
    public String storeEntry(){
        entryFacade.create(entry);
        return "search.html";
    }
}
