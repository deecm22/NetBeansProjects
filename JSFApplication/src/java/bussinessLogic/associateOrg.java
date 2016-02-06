/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussinessLogic;

import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author deecm22
 */
@Stateless
public class associateOrg {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public void associateOrg(toOwner towner, List<taskOrder> tasks){
    
    }

    private static class taskOrder {

        public taskOrder() {
        }
    }
    
}
