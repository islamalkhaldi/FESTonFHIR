//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.19 at 09:29:28 PM CEST 
//


package no.uia.ehealth.workflow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.kith.no/xmlstds}oid"/&gt;
 *         &lt;element name="Betegnelse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Kortnavn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AnsvarligUtgiver" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Merknad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "betegnelse",
    "kortnavn",
    "ansvarligUtgiver",
    "merknad"
})
@XmlRootElement(name = "Info", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
public class Info
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Id", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String id;
    @XmlElement(name = "Betegnelse", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01", required = true)
    protected String betegnelse;
    @XmlElement(name = "Kortnavn", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01", required = true)
    protected String kortnavn;
    @XmlElement(name = "AnsvarligUtgiver", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01", required = true)
    protected String ansvarligUtgiver;
    @XmlElement(name = "Merknad", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected String merknad;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the betegnelse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBetegnelse() {
        return betegnelse;
    }

    /**
     * Sets the value of the betegnelse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBetegnelse(String value) {
        this.betegnelse = value;
    }

    /**
     * Gets the value of the kortnavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKortnavn() {
        return kortnavn;
    }

    /**
     * Sets the value of the kortnavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKortnavn(String value) {
        this.kortnavn = value;
    }

    /**
     * Gets the value of the ansvarligUtgiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnsvarligUtgiver() {
        return ansvarligUtgiver;
    }

    /**
     * Sets the value of the ansvarligUtgiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnsvarligUtgiver(String value) {
        this.ansvarligUtgiver = value;
    }

    /**
     * Gets the value of the merknad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerknad() {
        return merknad;
    }

    /**
     * Sets the value of the merknad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerknad(String value) {
        this.merknad = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            String theBetegnelse;
            theBetegnelse = this.getBetegnelse();
            strategy.appendField(locator, this, "betegnelse", buffer, theBetegnelse);
        }
        {
            String theKortnavn;
            theKortnavn = this.getKortnavn();
            strategy.appendField(locator, this, "kortnavn", buffer, theKortnavn);
        }
        {
            String theAnsvarligUtgiver;
            theAnsvarligUtgiver = this.getAnsvarligUtgiver();
            strategy.appendField(locator, this, "ansvarligUtgiver", buffer, theAnsvarligUtgiver);
        }
        {
            String theMerknad;
            theMerknad = this.getMerknad();
            strategy.appendField(locator, this, "merknad", buffer, theMerknad);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Info)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Info that = ((Info) object);
        {
            String lhsId;
            lhsId = this.getId();
            String rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            String lhsBetegnelse;
            lhsBetegnelse = this.getBetegnelse();
            String rhsBetegnelse;
            rhsBetegnelse = that.getBetegnelse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "betegnelse", lhsBetegnelse), LocatorUtils.property(thatLocator, "betegnelse", rhsBetegnelse), lhsBetegnelse, rhsBetegnelse)) {
                return false;
            }
        }
        {
            String lhsKortnavn;
            lhsKortnavn = this.getKortnavn();
            String rhsKortnavn;
            rhsKortnavn = that.getKortnavn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kortnavn", lhsKortnavn), LocatorUtils.property(thatLocator, "kortnavn", rhsKortnavn), lhsKortnavn, rhsKortnavn)) {
                return false;
            }
        }
        {
            String lhsAnsvarligUtgiver;
            lhsAnsvarligUtgiver = this.getAnsvarligUtgiver();
            String rhsAnsvarligUtgiver;
            rhsAnsvarligUtgiver = that.getAnsvarligUtgiver();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ansvarligUtgiver", lhsAnsvarligUtgiver), LocatorUtils.property(thatLocator, "ansvarligUtgiver", rhsAnsvarligUtgiver), lhsAnsvarligUtgiver, rhsAnsvarligUtgiver)) {
                return false;
            }
        }
        {
            String lhsMerknad;
            lhsMerknad = this.getMerknad();
            String rhsMerknad;
            rhsMerknad = that.getMerknad();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "merknad", lhsMerknad), LocatorUtils.property(thatLocator, "merknad", rhsMerknad), lhsMerknad, rhsMerknad)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            String theBetegnelse;
            theBetegnelse = this.getBetegnelse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "betegnelse", theBetegnelse), currentHashCode, theBetegnelse);
        }
        {
            String theKortnavn;
            theKortnavn = this.getKortnavn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kortnavn", theKortnavn), currentHashCode, theKortnavn);
        }
        {
            String theAnsvarligUtgiver;
            theAnsvarligUtgiver = this.getAnsvarligUtgiver();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ansvarligUtgiver", theAnsvarligUtgiver), currentHashCode, theAnsvarligUtgiver);
        }
        {
            String theMerknad;
            theMerknad = this.getMerknad();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "merknad", theMerknad), currentHashCode, theMerknad);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}