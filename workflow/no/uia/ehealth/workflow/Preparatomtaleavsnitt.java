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
 *         &lt;element name="Avsnittoverskrift" type="{http://www.kith.no/xmlstds}CS"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/forskrivning/2014-12-01}Lenke"/&gt;
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
    "avsnittoverskrift",
    "lenke"
})
@XmlRootElement(name = "Preparatomtaleavsnitt")
public class Preparatomtaleavsnitt
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Avsnittoverskrift", required = true)
    protected CS avsnittoverskrift;
    @XmlElement(name = "Lenke", required = true)
    protected Lenke lenke;

    /**
     * Gets the value of the avsnittoverskrift property.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getAvsnittoverskrift() {
        return avsnittoverskrift;
    }

    /**
     * Sets the value of the avsnittoverskrift property.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setAvsnittoverskrift(CS value) {
        this.avsnittoverskrift = value;
    }

    /**
     * Gets the value of the lenke property.
     * 
     * @return
     *     possible object is
     *     {@link Lenke }
     *     
     */
    public Lenke getLenke() {
        return lenke;
    }

    /**
     * Sets the value of the lenke property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lenke }
     *     
     */
    public void setLenke(Lenke value) {
        this.lenke = value;
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
            CS theAvsnittoverskrift;
            theAvsnittoverskrift = this.getAvsnittoverskrift();
            strategy.appendField(locator, this, "avsnittoverskrift", buffer, theAvsnittoverskrift);
        }
        {
            Lenke theLenke;
            theLenke = this.getLenke();
            strategy.appendField(locator, this, "lenke", buffer, theLenke);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Preparatomtaleavsnitt)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Preparatomtaleavsnitt that = ((Preparatomtaleavsnitt) object);
        {
            CS lhsAvsnittoverskrift;
            lhsAvsnittoverskrift = this.getAvsnittoverskrift();
            CS rhsAvsnittoverskrift;
            rhsAvsnittoverskrift = that.getAvsnittoverskrift();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "avsnittoverskrift", lhsAvsnittoverskrift), LocatorUtils.property(thatLocator, "avsnittoverskrift", rhsAvsnittoverskrift), lhsAvsnittoverskrift, rhsAvsnittoverskrift)) {
                return false;
            }
        }
        {
            Lenke lhsLenke;
            lhsLenke = this.getLenke();
            Lenke rhsLenke;
            rhsLenke = that.getLenke();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lenke", lhsLenke), LocatorUtils.property(thatLocator, "lenke", rhsLenke), lhsLenke, rhsLenke)) {
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
            CS theAvsnittoverskrift;
            theAvsnittoverskrift = this.getAvsnittoverskrift();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "avsnittoverskrift", theAvsnittoverskrift), currentHashCode, theAvsnittoverskrift);
        }
        {
            Lenke theLenke;
            theLenke = this.getLenke();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lenke", theLenke), currentHashCode, theLenke);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}