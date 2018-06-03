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
 *         &lt;element name="Volum" type="{http://www.kith.no/xmlstds}PQ"/&gt;
 *         &lt;element name="Tidsenhet" type="{http://www.kith.no/xmlstds}CS"/&gt;
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
    "volum",
    "tidsenhet"
})
@XmlRootElement(name = "Infusjonshastighet")
public class Infusjonshastighet
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Volum", required = true)
    protected PQ volum;
    @XmlElement(name = "Tidsenhet", required = true)
    protected CS tidsenhet;

    /**
     * Gets the value of the volum property.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getVolum() {
        return volum;
    }

    /**
     * Sets the value of the volum property.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setVolum(PQ value) {
        this.volum = value;
    }

    /**
     * Gets the value of the tidsenhet property.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getTidsenhet() {
        return tidsenhet;
    }

    /**
     * Sets the value of the tidsenhet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setTidsenhet(CS value) {
        this.tidsenhet = value;
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
            PQ theVolum;
            theVolum = this.getVolum();
            strategy.appendField(locator, this, "volum", buffer, theVolum);
        }
        {
            CS theTidsenhet;
            theTidsenhet = this.getTidsenhet();
            strategy.appendField(locator, this, "tidsenhet", buffer, theTidsenhet);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Infusjonshastighet)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Infusjonshastighet that = ((Infusjonshastighet) object);
        {
            PQ lhsVolum;
            lhsVolum = this.getVolum();
            PQ rhsVolum;
            rhsVolum = that.getVolum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "volum", lhsVolum), LocatorUtils.property(thatLocator, "volum", rhsVolum), lhsVolum, rhsVolum)) {
                return false;
            }
        }
        {
            CS lhsTidsenhet;
            lhsTidsenhet = this.getTidsenhet();
            CS rhsTidsenhet;
            rhsTidsenhet = that.getTidsenhet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tidsenhet", lhsTidsenhet), LocatorUtils.property(thatLocator, "tidsenhet", rhsTidsenhet), lhsTidsenhet, rhsTidsenhet)) {
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
            PQ theVolum;
            theVolum = this.getVolum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "volum", theVolum), currentHashCode, theVolum);
        }
        {
            CS theTidsenhet;
            theTidsenhet = this.getTidsenhet();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tidsenhet", theTidsenhet), currentHashCode, theTidsenhet);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
