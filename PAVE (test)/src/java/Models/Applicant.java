/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author deecm22
 */
@Entity
@Table(name = "APPLICANT", catalog = "", schema = "APP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Applicant.findAll", query = "SELECT a FROM Applicant a"),
    @NamedQuery(name = "Applicant.findByApplicantid", query = "SELECT a FROM Applicant a WHERE a.applicantid = :applicantid"),
    @NamedQuery(name = "Applicant.findByFirstname", query = "SELECT a FROM Applicant a WHERE a.firstname = :firstname"),
    @NamedQuery(name = "Applicant.findByLastname", query = "SELECT a FROM Applicant a WHERE a.lastname = :lastname"),
    @NamedQuery(name = "Applicant.findByGrade", query = "SELECT a FROM Applicant a WHERE a.grade = :grade"),
    @NamedQuery(name = "Applicant.findByOrganization", query = "SELECT a FROM Applicant a WHERE a.organization = :organization")})
public class Applicant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "APPLICANTID")
    private Integer applicantid;
    @Size(max = 50)
    @Column(name = "FIRSTNAME")
    private String firstname;
    @Size(max = 50)
    @Column(name = "LASTNAME")
    private String lastname;
    @Size(max = 2)
    @Column(name = "GRADE")
    private String grade;
    @Size(max = 50)
    @Column(name = "ORGANIZATION")
    private String organization;

    public Applicant() {
    }

    public Applicant(Integer applicantid) {
        this.applicantid = applicantid;
    }

    public Integer getApplicantid() {
        return applicantid;
    }

    public void setApplicantid(Integer applicantid) {
        this.applicantid = applicantid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applicantid != null ? applicantid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Applicant)) {
            return false;
        }
        Applicant other = (Applicant) object;
        if ((this.applicantid == null && other.applicantid != null) || (this.applicantid != null && !this.applicantid.equals(other.applicantid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Applicant[ applicantid=" + applicantid + " ]";
    }
    
}
