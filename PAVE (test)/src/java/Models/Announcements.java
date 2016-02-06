/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "ANNOUNCEMENTS", catalog = "", schema = "APP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Announcements.findAll", query = "SELECT a FROM Announcements a"),
    @NamedQuery(name = "Announcements.findByAnouncementnumber", query = "SELECT a FROM Announcements a WHERE a.anouncementnumber = :anouncementnumber"),
    @NamedQuery(name = "Announcements.findByTitle", query = "SELECT a FROM Announcements a WHERE a.title = :title"),
    @NamedQuery(name = "Announcements.findByAnnoucmentpk", query = "SELECT a FROM Announcements a WHERE a.annoucmentpk = :annoucmentpk"),
    @NamedQuery(name = "Announcements.findByGraderequired", query = "SELECT a FROM Announcements a WHERE a.graderequired = :graderequired"),
    @NamedQuery(name = "Announcements.findByJobseries", query = "SELECT a FROM Announcements a WHERE a.jobseries = :jobseries"),
    @NamedQuery(name = "Announcements.findByJobseriestitle", query = "SELECT a FROM Announcements a WHERE a.jobseriestitle = :jobseriestitle"),
    @NamedQuery(name = "Announcements.findByAnnoucementstartdate", query = "SELECT a FROM Announcements a WHERE a.annoucementstartdate = :annoucementstartdate"),
    @NamedQuery(name = "Announcements.findByAnnoucmentenddate", query = "SELECT a FROM Announcements a WHERE a.annoucmentenddate = :annoucmentenddate")})
public class Announcements implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ANOUNCEMENTNUMBER")
    private String anouncementnumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "TITLE")
    private String title;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ANNOUCMENTPK")
    private Integer annoucmentpk;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 32700)
    @Column(name = "DESCRIPTION")
    private String description;
    @Size(max = 10)
    @Column(name = "GRADEREQUIRED")
    private String graderequired;
    @Size(max = 5)
    @Column(name = "JOBSERIES")
    private String jobseries;
    @Size(max = 100)
    @Column(name = "JOBSERIESTITLE")
    private String jobseriestitle;
    @Column(name = "ANNOUCEMENTSTARTDATE")
    @Temporal(TemporalType.DATE)
    private Date annoucementstartdate;
    @Column(name = "ANNOUCMENTENDDATE")
    @Temporal(TemporalType.DATE)
    private Date annoucmentenddate;

    public Announcements() {
    }

    public Announcements(Integer annoucmentpk) {
        this.annoucmentpk = annoucmentpk;
    }

    public Announcements(Integer annoucmentpk, String anouncementnumber, String title, String description) {
        this.annoucmentpk = annoucmentpk;
        this.anouncementnumber = anouncementnumber;
        this.title = title;
        this.description = description;
    }

    public String getAnouncementnumber() {
        return anouncementnumber;
    }

    public void setAnouncementnumber(String anouncementnumber) {
        this.anouncementnumber = anouncementnumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getAnnoucmentpk() {
        return annoucmentpk;
    }

    public void setAnnoucmentpk(Integer annoucmentpk) {
        this.annoucmentpk = annoucmentpk;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGraderequired() {
        return graderequired;
    }

    public void setGraderequired(String graderequired) {
        this.graderequired = graderequired;
    }

    public String getJobseries() {
        return jobseries;
    }

    public void setJobseries(String jobseries) {
        this.jobseries = jobseries;
    }

    public String getJobseriestitle() {
        return jobseriestitle;
    }

    public void setJobseriestitle(String jobseriestitle) {
        this.jobseriestitle = jobseriestitle;
    }

    public Date getAnnoucementstartdate() {
        return annoucementstartdate;
    }

    public void setAnnoucementstartdate(Date annoucementstartdate) {
        this.annoucementstartdate = annoucementstartdate;
    }

    public Date getAnnoucmentenddate() {
        return annoucmentenddate;
    }

    public void setAnnoucmentenddate(Date annoucmentenddate) {
        this.annoucmentenddate = annoucmentenddate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (annoucmentpk != null ? annoucmentpk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Announcements)) {
            return false;
        }
        Announcements other = (Announcements) object;
        if ((this.annoucmentpk == null && other.annoucmentpk != null) || (this.annoucmentpk != null && !this.annoucmentpk.equals(other.annoucmentpk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Announcements[ annoucmentpk=" + annoucmentpk + " ]";
    }
    
}
