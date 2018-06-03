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
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element name="Atc" type="{http://www.kith.no/xmlstds}CV"/&gt;
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
    "atc"
})
@XmlRootElement(name = "InteraksjonIkkeVurdert", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
public class InteraksjonIkkeVurdert
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Atc", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01", required = true)
    protected CV atc;

    /**
     * Gets the value of the atc property.
     * 
     * @return
     *     possible object is
     *     {@link CV }
     *     
     */
    public CV getAtc() {
        return atc;
    }

    /**
     * Sets the value of the atc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CV }
     *     
     */
    public void setAtc(CV value) {
        this.atc = value;
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
            CV theAtc;
            theAtc = this.getAtc();
            strategy.appendField(locator, this, "atc", buffer, theAtc);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof InteraksjonIkkeVurdert)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final InteraksjonIkkeVurdert that = ((InteraksjonIkkeVurdert) object);
        {
            CV lhsAtc;
            lhsAtc = this.getAtc();
            CV rhsAtc;
            rhsAtc = that.getAtc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "atc", lhsAtc), LocatorUtils.property(thatLocator, "atc", rhsAtc), lhsAtc, rhsAtc)) {
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
            CV theAtc;
            theAtc = this.getAtc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "atc", theAtc), currentHashCode, theAtc);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}