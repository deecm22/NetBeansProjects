/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussinessLogic;

import java.util.List;
import javax.ejb.Stateless;
import service.WrisSRFacadeREST;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import javax.ejb.EJB;
import models.WrisSR;
import org.joda.time.DateTime;
import org.joda.time.Days;

/**
 *
 * @author deecm22
 */
@Stateless
public class manageSR {

    @EJB
    private WrisSRFacadeREST wrisSRFacade;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    //returns a list of SRs that need review or that have a status of new and have been submitted more than 3 days prior.
    public List<WrisSR> getSRsNeedingReview(){
        List<WrisSR> srList;
        ArrayList<WrisSR> srReviewList = new ArrayList();
        srList = wrisSRFacade.findAll();
        for(int i = 0; i<srList.size();i++){
            if(srList.get(i).getReqStatus().equalsIgnoreCase("new") 
                    && Days.daysBetween(new DateTime(), 
                            new DateTime(srList.get(i).getCreateDate())).getDays()>=3){
                srReviewList.add(srList.get(i)); 
            }
        }
        return srReviewList;
    }
    
    
    
    
    
}
