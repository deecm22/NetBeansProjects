/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author deecm22
 */
@Entity
@Table(name = "wris_SR", catalog = "mysqlDev", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WrisSR.findAll", query = "SELECT w FROM WrisSR w"),
    @NamedQuery(name = "WrisSR.findByTaskOrder", query = "SELECT w FROM WrisSR w WHERE w.taskOrder = :taskOrder"),
    @NamedQuery(name = "WrisSR.findByReqFName", query = "SELECT w FROM WrisSR w WHERE w.reqFName = :reqFName"),
    @NamedQuery(name = "WrisSR.findByReqLName", query = "SELECT w FROM WrisSR w WHERE w.reqLName = :reqLName"),
    @NamedQuery(name = "WrisSR.findByReqOrg", query = "SELECT w FROM WrisSR w WHERE w.reqOrg = :reqOrg"),
    @NamedQuery(name = "WrisSR.findBySubDate", query = "SELECT w FROM WrisSR w WHERE w.subDate = :subDate"),
    @NamedQuery(name = "WrisSR.findByReqEstComplDate", query = "SELECT w FROM WrisSR w WHERE w.reqEstComplDate = :reqEstComplDate"),
    @NamedQuery(name = "WrisSR.findByReqCompletedDate", query = "SELECT w FROM WrisSR w WHERE w.reqCompletedDate = :reqCompletedDate"),
    @NamedQuery(name = "WrisSR.findByReqStatus", query = "SELECT w FROM WrisSR w WHERE w.reqStatus = :reqStatus"),
    @NamedQuery(name = "WrisSR.findByReqDescription", query = "SELECT w FROM WrisSR w WHERE w.reqDescription = :reqDescription"),
    @NamedQuery(name = "WrisSR.findBySrID", query = "SELECT w FROM WrisSR w WHERE w.srID = :srID")})
public class WrisSR implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 75)
    @Column(length = 75)
    private String taskOrder;
    @Size(max = 75)
    @Column(length = 75)
    private String reqFName;
    @Size(max = 75)
    @Column(length = 75)
    private String reqLName;
    @Size(max = 75)
    @Column(length = 75)
    private String reqOrg;
    @Temporal(TemporalType.DATE)
    private Date subDate;
    @Temporal(TemporalType.DATE)
    private Date reqEstComplDate;
    @Temporal(TemporalType.DATE)
    private Date reqCompletedDate;
    @Size(max = 75)
    @Column(length = 75)
    private String reqStatus;
    @Size(max = 2000)
    @Column(length = 2000)
    private String reqDescription;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(nullable = false, length = 45)
    private String srID;

    public WrisSR() {
    }

    public WrisSR(String srID) {
        this.srID = srID;
    }

    public String getTaskOrder() {
        return taskOrder;
    }

    public void setTaskOrder(String taskOrder) {
        this.taskOrder = taskOrder;
    }

    public String getReqFName() {
        return reqFName;
    }

    public void setReqFName(String reqFName) {
        this.reqFName = reqFName;
    }

    public String getReqLName() {
        return reqLName;
    }

    public void setReqLName(String reqLName) {
        this.reqLName = reqLName;
    }

    public String getReqOrg() {
        return reqOrg;
    }

    public void setReqOrg(String reqOrg) {
        this.reqOrg = reqOrg;
    }

    public Date getSubDate() {
        return subDate;
    }

    public void setSubDate(Date subDate) {
        this.subDate = subDate;
    }

    public Date getReqEstComplDate() {
        return reqEstComplDate;
    }

    public void setReqEstComplDate(Date reqEstComplDate) {
        this.reqEstComplDate = reqEstComplDate;
    }

    public Date getReqCompletedDate() {
        return reqCompletedDate;
    }

    public void setReqCompletedDate(Date reqCompletedDate) {
        this.reqCompletedDate = reqCompletedDate;
    }

    public String getReqStatus() {
        return reqStatus;
    }

    public void setReqStatus(String reqStatus) {
        this.reqStatus = reqStatus;
    }

    public String getReqDescription() {
        return reqDescription;
    }

    public void setReqDescription(String reqDescription) {
        this.reqDescription = reqDescription;
    }

    public String getSrID() {
        return srID;
    }

    public void setSrID(String srID) {
        this.srID = srID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (srID != null ? srID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WrisSR)) {
            return false;
        }
        WrisSR other = (WrisSR) object;
        if ((this.srID == null && other.srID != null) || (this.srID != null && !this.srID.equals(other.srID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.WrisSR[ srID=" + srID + " ]";
    }
    
}
