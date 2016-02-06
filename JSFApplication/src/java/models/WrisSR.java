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
@Table(name = "wris_SR", catalog = "mysqlDev", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WrisSR.findAll", query = "SELECT w FROM WrisSR w"),
    @NamedQuery(name = "WrisSR.findByUserName", query = "SELECT w FROM WrisSR w WHERE w.userName = :userName"),
    @NamedQuery(name = "WrisSR.findByCreateDate", query = "SELECT w FROM WrisSR w WHERE w.createDate = :createDate"),
    @NamedQuery(name = "WrisSR.findByModifiedDate", query = "SELECT w FROM WrisSR w WHERE w.modifiedDate = :modifiedDate"),
    @NamedQuery(name = "WrisSR.findByReqId", query = "SELECT w FROM WrisSR w WHERE w.reqId = :reqId"),
    @NamedQuery(name = "WrisSR.findByTaskOrder", query = "SELECT w FROM WrisSR w WHERE w.taskOrder = :taskOrder"),
    @NamedQuery(name = "WrisSR.findBySubFName", query = "SELECT w FROM WrisSR w WHERE w.subFName = :subFName"),
    @NamedQuery(name = "WrisSR.findBySubLName", query = "SELECT w FROM WrisSR w WHERE w.subLName = :subLName"),
    @NamedQuery(name = "WrisSR.findBySubEmail", query = "SELECT w FROM WrisSR w WHERE w.subEmail = :subEmail"),
    @NamedQuery(name = "WrisSR.findBySubmitter", query = "SELECT w FROM WrisSR w WHERE w.submitter = :submitter"),
    @NamedQuery(name = "WrisSR.findBySubPhone", query = "SELECT w FROM WrisSR w WHERE w.subPhone = :subPhone"),
    @NamedQuery(name = "WrisSR.findBySubOrg", query = "SELECT w FROM WrisSR w WHERE w.subOrg = :subOrg"),
    @NamedQuery(name = "WrisSR.findByReqFName", query = "SELECT w FROM WrisSR w WHERE w.reqFName = :reqFName"),
    @NamedQuery(name = "WrisSR.findByReqLName", query = "SELECT w FROM WrisSR w WHERE w.reqLName = :reqLName"),
    @NamedQuery(name = "WrisSR.findByRequester", query = "SELECT w FROM WrisSR w WHERE w.requester = :requester"),
    @NamedQuery(name = "WrisSR.findByReqPhone", query = "SELECT w FROM WrisSR w WHERE w.reqPhone = :reqPhone"),
    @NamedQuery(name = "WrisSR.findByReqOrg", query = "SELECT w FROM WrisSR w WHERE w.reqOrg = :reqOrg"),
    @NamedQuery(name = "WrisSR.findByReqCompany", query = "SELECT w FROM WrisSR w WHERE w.reqCompany = :reqCompany"),
    @NamedQuery(name = "WrisSR.findByReqRoom", query = "SELECT w FROM WrisSR w WHERE w.reqRoom = :reqRoom"),
    @NamedQuery(name = "WrisSR.findByReqEmail", query = "SELECT w FROM WrisSR w WHERE w.reqEmail = :reqEmail"),
    @NamedQuery(name = "WrisSR.findByReqTitle", query = "SELECT w FROM WrisSR w WHERE w.reqTitle = :reqTitle"),
    @NamedQuery(name = "WrisSR.findBySubDate", query = "SELECT w FROM WrisSR w WHERE w.subDate = :subDate"),
    @NamedQuery(name = "WrisSR.findByReqAssignDate", query = "SELECT w FROM WrisSR w WHERE w.reqAssignDate = :reqAssignDate"),
    @NamedQuery(name = "WrisSR.findByReqEstComplDate", query = "SELECT w FROM WrisSR w WHERE w.reqEstComplDate = :reqEstComplDate"),
    @NamedQuery(name = "WrisSR.findByReqCompletedDate", query = "SELECT w FROM WrisSR w WHERE w.reqCompletedDate = :reqCompletedDate"),
    @NamedQuery(name = "WrisSR.findByReqPriority", query = "SELECT w FROM WrisSR w WHERE w.reqPriority = :reqPriority"),
    @NamedQuery(name = "WrisSR.findByReqStatus", query = "SELECT w FROM WrisSR w WHERE w.reqStatus = :reqStatus"),
    @NamedQuery(name = "WrisSR.findByReqDescription", query = "SELECT w FROM WrisSR w WHERE w.reqDescription = :reqDescription"),
    @NamedQuery(name = "WrisSR.findByPoc", query = "SELECT w FROM WrisSR w WHERE w.poc = :poc"),
    @NamedQuery(name = "WrisSR.findByTechMonitor", query = "SELECT w FROM WrisSR w WHERE w.techMonitor = :techMonitor"),
    @NamedQuery(name = "WrisSR.findByProjManager", query = "SELECT w FROM WrisSR w WHERE w.projManager = :projManager"),
    @NamedQuery(name = "WrisSR.findByHasClassfied", query = "SELECT w FROM WrisSR w WHERE w.hasClassfied = :hasClassfied"),
    @NamedQuery(name = "WrisSR.findByReqJustification", query = "SELECT w FROM WrisSR w WHERE w.reqJustification = :reqJustification"),
    @NamedQuery(name = "WrisSR.findByReqComments", query = "SELECT w FROM WrisSR w WHERE w.reqComments = :reqComments"),
    @NamedQuery(name = "WrisSR.findByDoc1FileName", query = "SELECT w FROM WrisSR w WHERE w.doc1FileName = :doc1FileName"),
    @NamedQuery(name = "WrisSR.findByDoc2FileName", query = "SELECT w FROM WrisSR w WHERE w.doc2FileName = :doc2FileName"),
    @NamedQuery(name = "WrisSR.findByDoc3FileName", query = "SELECT w FROM WrisSR w WHERE w.doc3FileName = :doc3FileName"),
    @NamedQuery(name = "WrisSR.findByDoc4FileName", query = "SELECT w FROM WrisSR w WHERE w.doc4FileName = :doc4FileName"),
    @NamedQuery(name = "WrisSR.findByDoc5FileName", query = "SELECT w FROM WrisSR w WHERE w.doc5FileName = :doc5FileName"),
    @NamedQuery(name = "WrisSR.findBySrID", query = "SELECT w FROM WrisSR w WHERE w.srID = :srID")})
public class WrisSR implements Serializable {

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
    private String taskOrder;
    @Size(max = 75)
    @Column(length = 75)
    private String subFName;
    @Size(max = 75)
    @Column(length = 75)
    private String subLName;
    @Size(max = 75)
    @Column(length = 75)
    private String subEmail;
    @Size(max = 75)
    @Column(length = 75)
    private String submitter;
    @Size(max = 75)
    @Column(length = 75)
    private String subPhone;
    @Size(max = 75)
    @Column(length = 75)
    private String subOrg;
    @Size(max = 75)
    @Column(length = 75)
    private String reqFName;
    @Size(max = 75)
    @Column(length = 75)
    private String reqLName;
    @Size(max = 75)
    @Column(length = 75)
    private String requester;
    @Size(max = 75)
    @Column(length = 75)
    private String reqPhone;
    @Size(max = 75)
    @Column(length = 75)
    private String reqOrg;
    @Size(max = 75)
    @Column(length = 75)
    private String reqCompany;
    @Size(max = 75)
    @Column(length = 75)
    private String reqRoom;
    @Size(max = 75)
    @Column(length = 75)
    private String reqEmail;
    @Size(max = 255)
    @Column(length = 255)
    private String reqTitle;
    @Temporal(TemporalType.DATE)
    private Date subDate;
    @Temporal(TemporalType.DATE)
    private Date reqAssignDate;
    @Temporal(TemporalType.DATE)
    private Date reqEstComplDate;
    @Temporal(TemporalType.DATE)
    private Date reqCompletedDate;
    @Size(max = 75)
    @Column(length = 75)
    private String reqPriority;
    @Size(max = 75)
    @Column(length = 75)
    private String reqStatus;
    @Size(max = 2000)
    @Column(length = 2000)
    private String reqDescription;
    @Size(max = 75)
    @Column(length = 75)
    private String poc;
    @Size(max = 75)
    @Column(length = 75)
    private String techMonitor;
    @Size(max = 75)
    @Column(length = 75)
    private String projManager;
    @Size(max = 75)
    @Column(length = 75)
    private String hasClassfied;
    @Size(max = 2000)
    @Column(length = 2000)
    private String reqJustification;
    @Size(max = 2000)
    @Column(length = 2000)
    private String reqComments;
    @Size(max = 75)
    @Column(length = 75)
    private String doc1FileName;
    @Lob
    private byte[] doc1;
    @Size(max = 75)
    @Column(length = 75)
    private String doc2FileName;
    @Lob
    private byte[] doc2;
    @Size(max = 75)
    @Column(length = 75)
    private String doc3FileName;
    @Lob
    private byte[] doc3;
    @Size(max = 75)
    @Column(length = 75)
    private String doc4FileName;
    @Lob
    private byte[] doc4;
    @Size(max = 75)
    @Column(length = 75)
    private String doc5FileName;
    @Lob
    private byte[] doc5;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer srID;

    public WrisSR() {
    }

    public WrisSR(Integer srID) {
        this.srID = srID;
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

    public String getTaskOrder() {
        return taskOrder;
    }

    public void setTaskOrder(String taskOrder) {
        this.taskOrder = taskOrder;
    }

    public String getSubFName() {
        return subFName;
    }

    public void setSubFName(String subFName) {
        this.subFName = subFName;
    }

    public String getSubLName() {
        return subLName;
    }

    public void setSubLName(String subLName) {
        this.subLName = subLName;
    }

    public String getSubEmail() {
        return subEmail;
    }

    public void setSubEmail(String subEmail) {
        this.subEmail = subEmail;
    }

    public String getSubmitter() {
        return submitter;
    }

    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }

    public String getSubPhone() {
        return subPhone;
    }

    public void setSubPhone(String subPhone) {
        this.subPhone = subPhone;
    }

    public String getSubOrg() {
        return subOrg;
    }

    public void setSubOrg(String subOrg) {
        this.subOrg = subOrg;
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

    public String getRequester() {
        return requester;
    }

    public void setRequester(String requester) {
        this.requester = requester;
    }

    public String getReqPhone() {
        return reqPhone;
    }

    public void setReqPhone(String reqPhone) {
        this.reqPhone = reqPhone;
    }

    public String getReqOrg() {
        return reqOrg;
    }

    public void setReqOrg(String reqOrg) {
        this.reqOrg = reqOrg;
    }

    public String getReqCompany() {
        return reqCompany;
    }

    public void setReqCompany(String reqCompany) {
        this.reqCompany = reqCompany;
    }

    public String getReqRoom() {
        return reqRoom;
    }

    public void setReqRoom(String reqRoom) {
        this.reqRoom = reqRoom;
    }

    public String getReqEmail() {
        return reqEmail;
    }

    public void setReqEmail(String reqEmail) {
        this.reqEmail = reqEmail;
    }

    public String getReqTitle() {
        return reqTitle;
    }

    public void setReqTitle(String reqTitle) {
        this.reqTitle = reqTitle;
    }

    public Date getSubDate() {
        return subDate;
    }

    public void setSubDate(Date subDate) {
        this.subDate = subDate;
    }

    public Date getReqAssignDate() {
        return reqAssignDate;
    }

    public void setReqAssignDate(Date reqAssignDate) {
        this.reqAssignDate = reqAssignDate;
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

    public String getReqPriority() {
        return reqPriority;
    }

    public void setReqPriority(String reqPriority) {
        this.reqPriority = reqPriority;
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

    public String getPoc() {
        return poc;
    }

    public void setPoc(String poc) {
        this.poc = poc;
    }

    public String getTechMonitor() {
        return techMonitor;
    }

    public void setTechMonitor(String techMonitor) {
        this.techMonitor = techMonitor;
    }

    public String getProjManager() {
        return projManager;
    }

    public void setProjManager(String projManager) {
        this.projManager = projManager;
    }

    public String getHasClassfied() {
        return hasClassfied;
    }

    public void setHasClassfied(String hasClassfied) {
        this.hasClassfied = hasClassfied;
    }

    public String getReqJustification() {
        return reqJustification;
    }

    public void setReqJustification(String reqJustification) {
        this.reqJustification = reqJustification;
    }

    public String getReqComments() {
        return reqComments;
    }

    public void setReqComments(String reqComments) {
        this.reqComments = reqComments;
    }

    public String getDoc1FileName() {
        return doc1FileName;
    }

    public void setDoc1FileName(String doc1FileName) {
        this.doc1FileName = doc1FileName;
    }

    public byte[] getDoc1() {
        return doc1;
    }

    public void setDoc1(byte[] doc1) {
        this.doc1 = doc1;
    }

    public String getDoc2FileName() {
        return doc2FileName;
    }

    public void setDoc2FileName(String doc2FileName) {
        this.doc2FileName = doc2FileName;
    }

    public byte[] getDoc2() {
        return doc2;
    }

    public void setDoc2(byte[] doc2) {
        this.doc2 = doc2;
    }

    public String getDoc3FileName() {
        return doc3FileName;
    }

    public void setDoc3FileName(String doc3FileName) {
        this.doc3FileName = doc3FileName;
    }

    public byte[] getDoc3() {
        return doc3;
    }

    public void setDoc3(byte[] doc3) {
        this.doc3 = doc3;
    }

    public String getDoc4FileName() {
        return doc4FileName;
    }

    public void setDoc4FileName(String doc4FileName) {
        this.doc4FileName = doc4FileName;
    }

    public byte[] getDoc4() {
        return doc4;
    }

    public void setDoc4(byte[] doc4) {
        this.doc4 = doc4;
    }

    public String getDoc5FileName() {
        return doc5FileName;
    }

    public void setDoc5FileName(String doc5FileName) {
        this.doc5FileName = doc5FileName;
    }

    public byte[] getDoc5() {
        return doc5;
    }

    public void setDoc5(byte[] doc5) {
        this.doc5 = doc5;
    }

    public Integer getSrID() {
        return srID;
    }

    public void setSrID(Integer srID) {
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
