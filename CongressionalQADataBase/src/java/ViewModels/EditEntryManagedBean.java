/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModels;

import DAO_SessionBeans.QadbentryFacade;
import Models.Qadbentry;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author deecm22
 */
@ManagedBean
@RequestScoped
public class EditEntryManagedBean {

    @Inject
    private Qadbentry entry;
    private QadbentryFacade entryFacade;
    
    /**
     * Creates a new instance of EditEntryManagedBean
     */
    public EditEntryManagedBean() {
    }

    public Qadbentry getEntry() {
        return entry;
    }

    public void setEntry(Qadbentry entry) {
        this.entry = entry;
    }

    public QadbentryFacade getEntryFacade() {
        return entryFacade;
    }

    public void setEntryFacade(QadbentryFacade entryFacade) {
        this.entryFacade = entryFacade;
    }
 
    
    
    
    public String updateEntry(){
        
        return "search.xhtml";
    }
    
}
