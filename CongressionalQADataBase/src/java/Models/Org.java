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
@Table(name = "ORG", catalog = "", schema = "APP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Org.findAll", query = "SELECT o FROM Org o"),
    @NamedQuery(name = "Org.findByOrgid", query = "SELECT o FROM Org o WHERE o.orgid = :orgid"),
    @NamedQuery(name = "Org.findByOrgname", query = "SELECT o FROM Org o WHERE o.orgname = :orgname"),
    @NamedQuery(name = "Org.findByOrgsymbol", query = "SELECT o FROM Org o WHERE o.orgsymbol = :orgsymbol")})
public class Org implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ORGID")
    private Integer orgid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ORGNAME")
    private String orgname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ORGSYMBOL")
    private String orgsymbol;

    public Org() {
    }

    public Org(Integer orgid) {
        this.orgid = orgid;
    }

    public Org(Integer orgid, String orgname, String orgsymbol) {
        this.orgid = orgid;
        this.orgname = orgname;
        this.orgsymbol = orgsymbol;
    }

    public Integer getOrgid() {
        return orgid;
    }

    public void setOrgid(Integer orgid) {
        this.orgid = orgid;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    public String getOrgsymbol() {
        return orgsymbol;
    }

    public void setOrgsymbol(String orgsymbol) {
        this.orgsymbol = orgsymbol;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orgid != null ? orgid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Org)) {
            return false;
        }
        Org other = (Org) object;
        if ((this.orgid == null && other.orgid != null) || (this.orgid != null && !this.orgid.equals(other.orgid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.Org.Org[ orgid=" + orgid + " ]";
    }
    
}
