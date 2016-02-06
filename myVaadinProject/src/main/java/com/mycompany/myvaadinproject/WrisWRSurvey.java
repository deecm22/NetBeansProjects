/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myvaadinproject;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author deecm22
 */
@Entity
@Table(name = "wris_WRSurvey", catalog = "mysqlDev", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WrisWRSurvey.findAll", query = "SELECT w FROM WrisWRSurvey w"),
    @NamedQuery(name = "WrisWRSurvey.findByUserName", query = "SELECT w FROM WrisWRSurvey w WHERE w.userName = :userName"),
    @NamedQuery(name = "WrisWRSurvey.findByCreateDate", query = "SELECT w FROM WrisWRSurvey w WHERE w.createDate = :createDate"),
    @NamedQuery(name = "WrisWRSurvey.findByModifiedDate", query = "SELECT w FROM WrisWRSurvey w WHERE w.modifiedDate = :modifiedDate"),
    @NamedQuery(name = "WrisWRSurvey.findByReqId", query = "SELECT w FROM WrisWRSurvey w WHERE w.reqId = :reqId"),
    @NamedQuery(name = "WrisWRSurvey.findByAvgscore", query = "SELECT w FROM WrisWRSurvey w WHERE w.avgscore = :avgscore"),
    @NamedQuery(name = "WrisWRSurvey.findByOverallsatreq", query = "SELECT w FROM WrisWRSurvey w WHERE w.overallsatreq = :overallsatreq"),
    @NamedQuery(name = "WrisWRSurvey.findByCustrelations", query = "SELECT w FROM WrisWRSurvey w WHERE w.custrelations = :custrelations"),
    @NamedQuery(name = "WrisWRSurvey.findByCommstatus", query = "SELECT w FROM WrisWRSurvey w WHERE w.commstatus = :commstatus"),
    @NamedQuery(name = "WrisWRSurvey.findByQuality", query = "SELECT w FROM WrisWRSurvey w WHERE w.quality = :quality"),
    @NamedQuery(name = "WrisWRSurvey.findByTimeliness", query = "SELECT w FROM WrisWRSurvey w WHERE w.timeliness = :timeliness"),
    @NamedQuery(name = "WrisWRSurvey.findByOverallsatwris", query = "SELECT w FROM WrisWRSurvey w WHERE w.overallsatwris = :overallsatwris"),
    @NamedQuery(name = "WrisWRSurvey.findByFirstName", query = "SELECT w FROM WrisWRSurvey w WHERE w.firstName = :firstName"),
    @NamedQuery(name = "WrisWRSurvey.findByLastName", query = "SELECT w FROM WrisWRSurvey w WHERE w.lastName = :lastName"),
    @NamedQuery(name = "WrisWRSurvey.findByRequester", query = "SELECT w FROM WrisWRSurvey w WHERE w.requester = :requester"),
    @NamedQuery(name = "WrisWRSurvey.findByCompleteddate", query = "SELECT w FROM WrisWRSurvey w WHERE w.completeddate = :completeddate"),
    @NamedQuery(name = "WrisWRSurvey.findByComment", query = "SELECT w FROM WrisWRSurvey w WHERE w.comment = :comment"),
    @NamedQuery(name = "WrisWRSurvey.findByWrisWRSurveyId", query = "SELECT w FROM WrisWRSurvey w WHERE w.wrisWRSurveyId = :wrisWRSurveyId")})
public class WrisWRSurvey implements Serializable {

    private static final long serialVersionUID = 1L;
    @Lob
    @Size(max = 16777215)
    @Column(length = 16777215)
    private String groupId;
    @Lob
    @Size(max = 16777215)
    @Column(length = 16777215)
    private String companyId;
    @Lob
    @Size(max = 16777215)
    @Column(length = 16777215)
    private String userId;
    @Size(max = 75)
    @Column(length = 75)
    private String userName;
    @Temporal(TemporalType.DATE)
    private Date createDate;
    @Temporal(TemporalType.DATE)
    private Date modifiedDate;
    @Size(max = 75)
    @Column(length = 75)
    private String reqId;
    @Size(max = 75)
    @Column(length = 75)
    private String avgscore;
    @Size(max = 75)
    @Column(length = 75)
    private String overallsatreq;
    @Size(max = 75)
    @Column(length = 75)
    private String custrelations;
    @Size(max = 75)
    @Column(length = 75)
    private String commstatus;
    @Size(max = 75)
    @Column(length = 75)
    private String quality;
    @Size(max = 75)
    @Column(length = 75)
    private String timeliness;
    @Size(max = 75)
    @Column(length = 75)
    private String overallsatwris;
    @Size(max = 75)
    @Column(length = 75)
    private String firstName;
    @Size(max = 75)
    @Column(length = 75)
    private String lastName;
    @Size(max = 75)
    @Column(length = 75)
    private String requester;
    @Size(max = 75)
    @Column(length = 75)
    private String completeddate;
    @Size(max = 2000)
    @Column(name = "comment_", length = 2000)
    private String comment;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "wris_WRSurveyId", nullable = false)
    private Integer wrisWRSurveyId;

    public WrisWRSurvey() {
    }

    public WrisWRSurvey(Integer wrisWRSurveyId) {
        this.wrisWRSurveyId = wrisWRSurveyId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public String getAvgscore() {
        return avgscore;
    }

    public void setAvgscore(String avgscore) {
        this.avgscore = avgscore;
    }

    public String getOverallsatreq() {
        return overallsatreq;
    }

    public void setOverallsatreq(String overallsatreq) {
        this.overallsatreq = overallsatreq;
    }

    public String getCustrelations() {
        return custrelations;
    }

    public void setCustrelations(String custrelations) {
        this.custrelations = custrelations;
    }

    public String getCommstatus() {
        return commstatus;
    }

    public void setCommstatus(String commstatus) {
        this.commstatus = commstatus;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getTimeliness() {
        return timeliness;
    }

    public void setTimeliness(String timeliness) {
        this.timeliness = timeliness;
    }

    public String getOverallsatwris() {
        return overallsatwris;
    }

    public void setOverallsatwris(String overallsatwris) {
        this.overallsatwris = overallsatwris;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRequester() {
        return requester;
    }

    public void setRequester(String requester) {
        this.requester = requester;
    }

    public String getCompleteddate() {
        return completeddate;
    }

    public void setCompleteddate(String completeddate) {
        this.completeddate = completeddate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getWrisWRSurveyId() {
        return wrisWRSurveyId;
    }

    public void setWrisWRSurveyId(Integer wrisWRSurveyId) {
        this.wrisWRSurveyId = wrisWRSurveyId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wrisWRSurveyId != null ? wrisWRSurveyId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WrisWRSurvey)) {
            return false;
        }
        WrisWRSurvey other = (WrisWRSurvey) object;
        if ((this.wrisWRSurveyId == null && other.wrisWRSurveyId != null) || (this.wrisWRSurveyId != null && !this.wrisWRSurveyId.equals(other.wrisWRSurveyId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.myvaadinproject.WrisWRSurvey[ wrisWRSurveyId=" + wrisWRSurveyId + " ]";
    }
    
}
