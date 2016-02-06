/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewModels;


import DAO_SessionBeans.QadbuserFacade;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

/**
 *
 * @author deecm22
 */
@ManagedBean
@SessionScoped
public class UserInfoManagedBean {

    @Inject
    private QadbuserFacade user;
    /**
     * Creates a new instance of UserInfoManagedBean
     */
    public UserInfoManagedBean() {
    }

    public QadbuserFacade getUser() {
        return user;
    }

    public void setUser(QadbuserFacade user) {
        this.user = user;
    }
    
    
    
    
    public String getUserInfo(){
        return user.toString();
    }
}
