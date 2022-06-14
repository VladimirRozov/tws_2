
package ru.itmo.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateLoyalty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateLoyalty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rowId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="spbsoID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="event" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cash" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="brigade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateLoyalty", propOrder = {
    "rowId",
    "spbsoID",
    "fullName",
    "event",
    "cash",
    "brigade"
})
public class UpdateLoyalty {

    protected int rowId;
    protected int spbsoID;
    protected String fullName;
    protected String event;
    protected int cash;
    protected String brigade;

    /**
     * Gets the value of the rowId property.
     * 
     */
    public int getRowId() {
        return rowId;
    }

    /**
     * Sets the value of the rowId property.
     * 
     */
    public void setRowId(int value) {
        this.rowId = value;
    }

    /**
     * Gets the value of the spbsoID property.
     * 
     */
    public int getSpbsoID() {
        return spbsoID;
    }

    /**
     * Sets the value of the spbsoID property.
     * 
     */
    public void setSpbsoID(int value) {
        this.spbsoID = value;
    }

    /**
     * Gets the value of the fullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Sets the value of the fullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvent(String value) {
        this.event = value;
    }

    /**
     * Gets the value of the cash property.
     * 
     */
    public int getCash() {
        return cash;
    }

    /**
     * Sets the value of the cash property.
     * 
     */
    public void setCash(int value) {
        this.cash = value;
    }

    /**
     * Gets the value of the brigade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrigade() {
        return brigade;
    }

    /**
     * Sets the value of the brigade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrigade(String value) {
        this.brigade = value;
    }

}
