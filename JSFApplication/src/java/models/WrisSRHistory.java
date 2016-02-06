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
@Table(name = "wris_SRHistory", catalog = "mysqlDev", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WrisSRHistory.findAll", query = "SELECT w FROM WrisSRHistory w"),
    @NamedQuery(name = "WrisSRHistory.findByUserName", query = "SELECT w FROM WrisSRHistory w WHERE w.userName = :userName"),
    @NamedQuery(name = "WrisSRHistory.findByCreateDate", query = "SELECT w FROM WrisSRHistory w WHERE w.createDate = :createDate"),
    @NamedQuery(name = "WrisSRHistory.findByModifiedDate", query = "SELECT w FROM WrisSRHistory w WHERE w.modifiedDate = :modifiedDate"),
    @NamedQuery(name = "WrisSRHistory.findByReqId", query = "SELECT w FROM WrisSRHistory w WHERE w.reqId = :reqId"),
    @NamedQuery(name = "WrisSRHistory.findByFirstName", query = "SELECT w FROM WrisSRHistory w WHERE w.firstName = :firstName"),
    @NamedQuery(name = "WrisSRHistory.findByLastName", query = "SELECT w FROM WrisSRHistory w WHERE w.lastName = :lastName"),
    @NamedQuery(name = "WrisSRHistory.findByFullName", query = "SELECT w FROM WrisSRHistory w WHERE w.fullName = :fullName"),
    @NamedQuery(name = "WrisSRHistory.findByAction", query = "SELECT w FROM WrisSRHistory w WHERE w.action = :action"),
    @NamedQuery(name = "WrisSRHistory.findByWrisSRHistoryId", query = "SELECT w FROM WrisSRHistory w WHERE w.wrisSRHistoryId = :wrisSRHistoryId")})
public class WrisSRHistory implements Serializable {

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
    private String firstName;
    @Size(max = 75)
    @Column(length = 75)
    private String lastName;
    @Size(max = 75)
    @Column(length = 75)
    private String fullName;
    @Size(max = 800)
    @Column(length = 800)
    private String action;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "wris_SRHistoryId", nullable = false)
    private Integer wrisSRHistoryId;

    public WrisSRHistory() {
    }

    public WrisSRHistory(Integer wrisSRHistoryId) {
        this.wrisSRHistoryId = wrisSRHistoryId;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Integer getWrisSRHistoryId() {
        return wrisSRHistoryId;
    }

    public void setWrisSRHistoryId(Integer wrisSRHistoryId) {
        this.wrisSRHistoryId = wrisSRHistoryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (wrisSRHistoryId != null ? wrisSRHistoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WrisSRHistory)) {
            return false;
        }
        WrisSRHistory other = (WrisSRHistory) object;
        if ((this.wrisSRHistoryId == null && other.wrisSRHistoryId != null) || (this.wrisSRHistoryId != null && !this.wrisSRHistoryId.equals(other.wrisSRHistoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.WrisSRHistory[ wrisSRHistoryId=" + wrisSRHistoryId + " ]";
    }
    
}
