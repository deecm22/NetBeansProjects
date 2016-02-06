/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModels;


import DAO_Restful.QadbentryFacadeREST;
import DAO_SessionBeans.QadbentryFacade;
import Models.Qadbentry;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author deecm22
 */
@ManagedBean
@SessionScoped
public class SearchEntriesManagedBean implements Serializable{
    
    @EJB
    private QadbentryFacadeREST entryFacade;
    /**
     * Creates a new instance of searchEntriesManagedBean
     */
    public SearchEntriesManagedBean() {
        
    }

    public List<Qadbentry> getEntries() {
        
        return entryFacade.findAll();
    }

 

    public QadbentryFacadeREST getEntryFacade() {
        return entryFacade;
    }

    public void setEntryFacade(QadbentryFacadeREST entryFacade) {
        this.entryFacade = entryFacade;
    }
    
    
}
