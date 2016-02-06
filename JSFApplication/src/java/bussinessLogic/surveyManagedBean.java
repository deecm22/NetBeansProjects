/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussinessLogic;

import java.util.List;
import javax.inject.Named;
//import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import models.WrisUser;
import models.WrisWRSurvey;
import service.WrisUserFacadeREST;
import service.WrisWRSurveyFacadeREST;

/**
 *
 * @author deecm22
 */
@Named(value = "surveyManagedBean")
@RequestScoped
public class surveyManagedBean {

    @Inject
    private WrisWRSurveyFacadeREST wrSurveyFacade;
    @Inject
    private WrisUserFacadeREST wrUserFacade;
    
    private List<WrisUser> requesters;
    private WrisWRSurvey surveyModel;
    
    private List<WrisWRSurvey> surveyResults;
    /**
     * Creates a new instance of surveyManagedBean
     */
    public surveyManagedBean() {
        surveyModel = new WrisWRSurvey();
            
    }

    public List<WrisWRSurvey> getSurveyResults() {
        surveyResults = wrSurveyFacade.findAll();
        return surveyResults;
    }

    
    
    public void setSurveyResults(List<WrisWRSurvey> surveyResults) {
        this.surveyResults = surveyResults;
    }

    public WrisWRSurvey getSurveyModel() {
        return surveyModel;
    }

    public void setSurveyModel(WrisWRSurvey surveyModel) {
        this.surveyModel = surveyModel;
    }

    public List<WrisUser> getRequester() {
        requesters = wrUserFacade.findAll();
        return requesters;
    }

 
    
    
    
    public String addNewSurvey(){
        wrSurveyFacade.create(surveyModel);
        return "faces/surveyList.xhtml";
    }
    
}
