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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author deecm22
 */
@Entity
@Table(name = "task_orders", catalog = "mysqlDev", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TaskOrders.findAll", query = "SELECT t FROM TaskOrders t"),
    @NamedQuery(name = "TaskOrders.findByIdtaskOrders", query = "SELECT t FROM TaskOrders t WHERE t.idtaskOrders = :idtaskOrders"),
    @NamedQuery(name = "TaskOrders.findByTaskorderName", query = "SELECT t FROM TaskOrders t WHERE t.taskorderName = :taskorderName")})
public class TaskOrders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtask_orders", nullable = false)
    private Integer idtaskOrders;
    @Size(max = 45)
    @Column(length = 45)
    private String taskorderName;
    @OneToOne(mappedBy = "taskorderIds")
    private WrisUser wrisUser;

    public TaskOrders() {
    }

    public TaskOrders(Integer idtaskOrders) {
        this.idtaskOrders = idtaskOrders;
    }

    public Integer getIdtaskOrders() {
        return idtaskOrders;
    }

    public void setIdtaskOrders(Integer idtaskOrders) {
        this.idtaskOrders = idtaskOrders;
    }

    public String getTaskorderName() {
        return taskorderName;
    }

    public void setTaskorderName(String taskorderName) {
        this.taskorderName = taskorderName;
    }

    public WrisUser getWrisUser() {
        return wrisUser;
    }

    public void setWrisUser(WrisUser wrisUser) {
        this.wrisUser = wrisUser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtaskOrders != null ? idtaskOrders.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaskOrders)) {
            return false;
        }
        TaskOrders other = (TaskOrders) object;
        if ((this.idtaskOrders == null && other.idtaskOrders != null) || (this.idtaskOrders != null && !this.idtaskOrders.equals(other.idtaskOrders))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.TaskOrders[ idtaskOrders=" + idtaskOrders + " ]";
    }
    
}
