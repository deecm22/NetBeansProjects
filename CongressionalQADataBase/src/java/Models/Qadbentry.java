/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@Table(name = "QADBENTRY", catalog = "", schema = "APP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Qadbentry.findAll", query = "SELECT q FROM Qadbentry q"),
    @NamedQuery(name = "Qadbentry.findByEntryid", query = "SELECT q FROM Qadbentry q WHERE q.entryid = :entryid"),
    @NamedQuery(name = "Qadbentry.findByTitle", query = "SELECT q FROM Qadbentry q WHERE q.title = :title"),
    @NamedQuery(name = "Qadbentry.findByHearingdate", query = "SELECT q FROM Qadbentry q WHERE q.hearingdate = :hearingdate"),
    @NamedQuery(name = "Qadbentry.findByCommitee", query = "SELECT q FROM Qadbentry q WHERE q.commitee = :commitee"),
    @NamedQuery(name = "Qadbentry.findByQuestion", query = "SELECT q FROM Qadbentry q WHERE q.question = :question"),
    @NamedQuery(name = "Qadbentry.findByAnswer", query = "SELECT q FROM Qadbentry q WHERE q.answer = :answer"),
    @NamedQuery(name = "Qadbentry.findByAssignedorg", query = "SELECT q FROM Qadbentry q WHERE q.assignedorg = :assignedorg"),
    @NamedQuery(name = "Qadbentry.findByActionstatus", query = "SELECT q FROM Qadbentry q WHERE q.actionstatus = :actionstatus"),
    @NamedQuery(name = "Qadbentry.findByNeedsaction", query = "SELECT q FROM Qadbentry q WHERE q.needsaction = :needsaction"),
    @NamedQuery(name = "Qadbentry.findByDuedate", query = "SELECT q FROM Qadbentry q WHERE q.duedate = :duedate")})
public class Qadbentry implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ENTRYID")
    private Integer entryid;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "TITLE")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HEARINGDATE")
    @Temporal(TemporalType.DATE)
    private Date hearingdate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 250)
    @Column(name = "COMMITEE")
    private String commitee;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2000)
    @Column(name = "QUESTION")
    private String question;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2000)
    @Column(name = "ANSWER")
    private String answer;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ASSIGNEDORG")
    private String assignedorg;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ACTIONSTATUS")
    private String actionstatus;
    @Size(max = 5)
    @Column(name = "NEEDSACTION")
    private String needsaction;
    @Column(name = "DUEDATE")
    @Temporal(TemporalType.DATE)
    private Date duedate;

    public Qadbentry() {
    }

    public Qadbentry(Integer entryid) {
        this.entryid = entryid;
    }

    public Qadbentry(Integer entryid, String title, Date hearingdate, String commitee, String question, String answer, String assignedorg, String actionstatus) {
        this.entryid = entryid;
        this.title = title;
        this.hearingdate = hearingdate;
        this.commitee = commitee;
        this.question = question;
        this.answer = answer;
        this.assignedorg = assignedorg;
        this.actionstatus = actionstatus;
    }

    public Integer getEntryid() {
        return entryid;
    }

    public void setEntryid(Integer entryid) {
        this.entryid = entryid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getHearingdate() {
        return hearingdate;
    }

    public void setHearingdate(Date hearingdate) {
        this.hearingdate = hearingdate;
    }

    public String getCommitee() {
        return commitee;
    }

    public void setCommitee(String commitee) {
        this.commitee = commitee;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAssignedorg() {
        return assignedorg;
    }

    public void setAssignedorg(String assignedorg) {
        this.assignedorg = assignedorg;
    }

    public String getActionstatus() {
        return actionstatus;
    }

    public void setActionstatus(String actionstatus) {
        this.actionstatus = actionstatus;
    }

    public String getNeedsaction() {
        return needsaction;
    }

    public void setNeedsaction(String needsaction) {
        this.needsaction = needsaction;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    //fix this copy method.  It does not properly copy and assign a new unique ID. Auto increment on the DB will fix this.
    public Qadbentry copy(){
        Qadbentry entry = new Qadbentry();
        try {
            entry = (Qadbentry)this.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Qadbentry.class.getName()).log(Level.SEVERE, null, ex);
        }
        entry.entryid = this.entryid+17;
    return entry;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entryid != null ? entryid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Qadbentry)) {
            return false;
        }
        Qadbentry other = (Qadbentry) object;
        if ((this.entryid == null && other.entryid != null) || (this.entryid != null && !this.entryid.equals(other.entryid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Models.QAEntry.Qadbentry[ entryid=" + entryid + " ]";
    }
    
}
