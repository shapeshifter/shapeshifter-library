//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.05.26 at 08:11:22 PM BST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlexOfferRevocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlexOfferRevocationType">
 *   &lt;complexContent>
 *     &lt;extension base="{}PayloadMessageType">
 *       &lt;attribute name="FlexOfferMessageID" use="required" type="{}UUIDType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlexOfferRevocationType")
public class FlexOfferRevocationType
    extends PayloadMessageType
{

    @XmlAttribute(name = "FlexOfferMessageID", required = true)
    protected String flexOfferMessageID;

    /**
     * Gets the value of the flexOfferMessageID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexOfferMessageID() {
        return flexOfferMessageID;
    }

    /**
     * Sets the value of the flexOfferMessageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexOfferMessageID(String value) {
        this.flexOfferMessageID = value;
    }

}
