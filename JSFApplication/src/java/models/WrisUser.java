/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author deecm22
 */
@Entity
@Table(name = "wris_user", catalog = "mysqlDev", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"taskorder_ids"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WrisUser.findAll", query = "SELECT w FROM WrisUser w"),
    @NamedQuery(name = "WrisUser.findByIduser", query = "SELECT w FROM WrisUser w WHERE w.iduser = :iduser"),
    @NamedQuery(name = "WrisUser.findByAuid", query = "SELECT w FROM WrisUser w WHERE w.auid = :auid"),
    @NamedQuery(name = "WrisUser.findByFirstname", query = "SELECT w FROM WrisUser w WHERE w.firstname = :firstname"),
    @NamedQuery(name = "WrisUser.findByLastname", query = "SELECT w FROM WrisUser w WHERE w.lastname = :lastname")})
public class WrisUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Integer iduser;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(nullable = false, length = 45)
    private String auid;
    @Size(max = 45)
    @Column(length = 45)
    private String firstname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(nullable = false, length = 45)
    private String lastname;
    @JoinColumn(name = "taskorder_ids", referencedColumnName = "idtask_orders")
    @OneToOne
    private TaskOrders taskorderIds;

    public WrisUser() {
    }

    public WrisUser(Integer iduser) {
        this.iduser = iduser;
    }

    public WrisUser(Integer iduser, String auid, String lastname) {
        this.iduser = iduser;
        this.auid = auid;
        this.lastname = lastname;
    }

    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

    public String getAuid() {
        return auid;
    }

    public void setAuid(String auid) {
        this.auid = auid;
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

    public TaskOrders getTaskorderIds() {
        return taskorderIds;
    }

    public void setTaskorderIds(TaskOrders taskorderIds) {
        this.taskorderIds = taskorderIds;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iduser != null ? iduser.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WrisUser)) {
            return false;
        }
        WrisUser other = (WrisUser) object;
        if ((this.iduser == null && other.iduser != null) || (this.iduser != null && !this.iduser.equals(other.iduser))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.WrisUser[ iduser=" + iduser + " ]";
    }
    
}
