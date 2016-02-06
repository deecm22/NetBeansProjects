/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import models.WrisSR;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;
import service.WrisSRFacadeREST;

/**
 *
 * @author deecm22
 */
@Named(value = "reportsController")
@RequestScoped
public class reportsController {

    @Inject
    WrisSRFacadeREST wrFacade;

    private List<WrisSR> srList;
    private BarChartModel barModel;
    private PieChartModel pieModel1;

    private int numNew = 0;
    private int numPending = 0;
    private int numDeferred = 0;
    private int numRejected = 0;
    private int numClosed = 0;
    private int numCompleted = 0;
    private int numCancelled = 0;

    /**
     * Creates a new instance of reportsController
     */
    public reportsController() {
    }

    private void numSRPerStatus() {
        srList = wrFacade.findAll();

        for (WrisSR srList1 : srList) {
            if (srList1.getReqStatus().equalsIgnoreCase("new")) {
                numNew++;
            } else {
                if (srList1.getReqStatus().equalsIgnoreCase("pending")) {
                    numPending++;
                }else
                if(srList1.getReqStatus().equalsIgnoreCase("cancelled"))
                {numCancelled++;
                
                }else
if(srList1.getReqStatus().equalsIgnoreCase("closed"))
                {numClosed++;}else
                if(srList1.getReqStatus().equalsIgnoreCase("rejected"))
                {numRejected++;}else
                if(srList1.getReqStatus().equalsIgnoreCase("deferred"))
                {numDeferred++;}else
                if(srList1.getReqStatus().equalsIgnoreCase("complet"))
                {numCompleted++;}
            }
        }
    }


}
