//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.26 at 08:11:22 PM BST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FlexOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlexOfferType">
 *   &lt;complexContent>
 *     &lt;extension base="{}FlexMessageType">
 *       &lt;sequence>
 *         &lt;element name="OfferOption" type="{}FlexOfferOptionType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ExpirationDateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="FlexRequestMessageID" type="{}UUIDType" />
 *       &lt;attribute name="ContractID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="D-PrognosisMessageID" type="{}UUIDType" />
 *       &lt;attribute name="BaselineReference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Currency" use="required" type="{}ISO4217CurrencyType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexOfferType", propOrder = {
    "offerOption"
})
public class FlexOfferType
    extends FlexMessageType
{

    @XmlElement(name = "OfferOption", required = true)
    protected List<FlexOfferOptionType> offerOption;
    @XmlAttribute(name = "ExpirationDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDateTime;
    @XmlAttribute(name = "FlexRequestMessageID")
    protected String flexRequestMessageID;
    @XmlAttribute(name = "ContractID")
    protected String contractID;
    @XmlAttribute(name = "D-PrognosisMessageID")
    protected String dPrognosisMessageID;
    @XmlAttribute(name = "BaselineReference")
    protected String baselineReference;
    @XmlAttribute(name = "Currency", required = true)
    protected String currency;

    /**
     * Gets the value of the offerOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlexOfferOptionType }
     * 
     * 
     */
    public List<FlexOfferOptionType> getOfferOption() {
        if (offerOption == null) {
            offerOption = new ArrayList<FlexOfferOptionType>();
        }
        return this.offerOption;
    }

    /**
     * Gets the value of the expirationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDateTime() {
        return expirationDateTime;
    }

    /**
     * Sets the value of the expirationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDateTime(XMLGregorianCalendar value) {
        this.expirationDateTime = value;
    }

    /**
     * Gets the value of the flexRequestMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexRequestMessageID() {
        return flexRequestMessageID;
    }

    /**
     * Sets the value of the flexRequestMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexRequestMessageID(String value) {
        this.flexRequestMessageID = value;
    }

    /**
     * Gets the value of the contractID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractID() {
        return contractID;
    }

    /**
     * Sets the value of the contractID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractID(String value) {
        this.contractID = value;
    }

    /**
     * Gets the value of the dPrognosisMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPrognosisMessageID() {
        return dPrognosisMessageID;
    }

    /**
     * Sets the value of the dPrognosisMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPrognosisMessageID(String value) {
        this.dPrognosisMessageID = value;
    }

    /**
     * Gets the value of the baselineReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaselineReference() {
        return baselineReference;
    }

    /**
     * Sets the value of the baselineReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaselineReference(String value) {
        this.baselineReference = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

}
