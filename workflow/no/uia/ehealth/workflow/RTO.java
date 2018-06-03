//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.19 at 09:29:28 PM CEST 
//


package no.uia.ehealth.workflow;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for RTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NUM" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="DENOM" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RTO", namespace = "http://www.kith.no/xmlstds", propOrder = {
    "num",
    "denom"
})
public class RTO
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "NUM", namespace = "")
    protected BigInteger num;
    @XmlElement(name = "DENOM", namespace = "")
    protected BigInteger denom;

    /**
     * Gets the value of the num property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNUM() {
        return num;
    }

    /**
     * Sets the value of the num property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNUM(BigInteger value) {
        this.num = value;
    }

    /**
     * Gets the value of the denom property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDENOM() {
        return denom;
    }

    /**
     * Sets the value of the denom property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDENOM(BigInteger value) {
        this.denom = value;
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
            BigInteger theNUM;
            theNUM = this.getNUM();
            strategy.appendField(locator, this, "num", buffer, theNUM);
        }
        {
            BigInteger theDENOM;
            theDENOM = this.getDENOM();
            strategy.appendField(locator, this, "denom", buffer, theDENOM);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RTO)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RTO that = ((RTO) object);
        {
            BigInteger lhsNUM;
            lhsNUM = this.getNUM();
            BigInteger rhsNUM;
            rhsNUM = that.getNUM();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "num", lhsNUM), LocatorUtils.property(thatLocator, "num", rhsNUM), lhsNUM, rhsNUM)) {
                return false;
            }
        }
        {
            BigInteger lhsDENOM;
            lhsDENOM = this.getDENOM();
            BigInteger rhsDENOM;
            rhsDENOM = that.getDENOM();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "denom", lhsDENOM), LocatorUtils.property(thatLocator, "denom", rhsDENOM), lhsDENOM, rhsDENOM)) {
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
            BigInteger theNUM;
            theNUM = this.getNUM();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "num", theNUM), currentHashCode, theNUM);
        }
        {
            BigInteger theDENOM;
            theDENOM = this.getDENOM();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "denom", theDENOM), currentHashCode, theDENOM);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
