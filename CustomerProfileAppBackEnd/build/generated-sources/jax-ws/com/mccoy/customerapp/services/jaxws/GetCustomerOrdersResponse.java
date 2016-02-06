
package com.mccoy.customerapp.services.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getCustomerOrdersResponse", namespace = "http://services.customerapp.mccoy.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCustomerOrdersResponse", namespace = "http://services.customerapp.mccoy.com/")
public class GetCustomerOrdersResponse {

    @XmlElement(name = "return", namespace = "")
    private List<com.mccoy.customerapp.models.PurchaseOrder> _return;

    /**
     * 
     * @return
     *     returns List<PurchaseOrder>
     */
    public List<com.mccoy.customerapp.models.PurchaseOrder> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<com.mccoy.customerapp.models.PurchaseOrder> _return) {
        this._return = _return;
    }

}
