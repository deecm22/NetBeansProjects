/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mccoy.customerapp.models;

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
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author deecm22
 */
@Entity
@Table(catalog = "", schema = "APP", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"AUID"}),
    @UniqueConstraint(columnNames = {"UUPIC"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Qadbuser.findAll", query = "SELECT q FROM Qadbuser q"),
    @NamedQuery(name = "Qadbuser.findByAuid", query = "SELECT q FROM Qadbuser q WHERE q.auid = :auid"),
    @NamedQuery(name = "Qadbuser.findByUserid", query = "SELECT q FROM Qadbuser q WHERE q.userid = :userid"),
    @NamedQuery(name = "Qadbuser.findByUupic", query = "SELECT q FROM Qadbuser q WHERE q.uupic = :uupic"),
    @NamedQuery(name = "Qadbuser.findByLastlogin", query = "SELECT q FROM Qadbuser q WHERE q.lastlogin = :lastlogin"),
    @NamedQuery(name = "Qadbuser.findByRole", query = "SELECT q FROM Qadbuser q WHERE q.role = :role")})
public class Qadbuser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(nullable = false, length = 50)
    private String auid;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer userid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(nullable = false, length = 9)
    private String uupic;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastlogin;
    @Size(max = 50)
    @Column(length = 50)
    private String role;

    public Qadbuser() {
    }

    public Qadbuser(Integer userid) {
        this.userid = userid;
    }

    public Qadbuser(Integer userid, String auid, String uupic) {
        this.userid = userid;
        this.auid = auid;
        this.uupic = uupic;
    }

    public String getAuid() {
        return auid;
    }

    public void setAuid(String auid) {
        this.auid = auid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUupic() {
        return uupic;
    }

    public void setUupic(String uupic) {
        this.uupic = uupic;
    }

    public Date getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userid != null ? userid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Qadbuser)) {
            return false;
        }
        Qadbuser other = (Qadbuser) object;
        if ((this.userid == null && other.userid != null) || (this.userid != null && !this.userid.equals(other.userid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mccoy.customerapp.models.Qadbuser[ userid=" + userid + " ]";
    }
    
}
