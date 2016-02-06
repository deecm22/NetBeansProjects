
package com.mccoy.customerapp.services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "logTransaction", namespace = "http://services.customerapp.mccoy.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "logTransaction", namespace = "http://services.customerapp.mccoy.com/")
public class LogTransaction {

    @XmlElement(name = "transactionLogMessage", namespace = "")
    private String transactionLogMessage;

    /**
     * 
     * @return
     *     returns String
     */
    public String getTransactionLogMessage() {
        return this.transactionLogMessage;
    }

    /**
     * 
     * @param transactionLogMessage
     *     the value for the transactionLogMessage property
     */
    public void setTransactionLogMessage(String transactionLogMessage) {
        this.transactionLogMessage = transactionLogMessage;
    }

}
