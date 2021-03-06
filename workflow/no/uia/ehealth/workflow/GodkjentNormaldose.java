//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.19 at 09:29:28 PM CEST 
//


package no.uia.ehealth.workflow;

import java.math.BigDecimal;
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
 *         &lt;element name="OvreNormaldose" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="NedreNormaldose" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Enhet" type="{http://www.kith.no/xmlstds}CV"/&gt;
 *         &lt;element name="MinAntDoser" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="MaksAntDoser" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Periode" type="{http://www.kith.no/xmlstds}CV"/&gt;
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
    "ovreNormaldose",
    "nedreNormaldose",
    "enhet",
    "minAntDoser",
    "maksAntDoser",
    "periode"
})
@XmlRootElement(name = "GodkjentNormaldose", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
public class GodkjentNormaldose
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "OvreNormaldose", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01", required = true)
    protected BigDecimal ovreNormaldose;
    @XmlElement(name = "NedreNormaldose", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01", required = true)
    protected BigDecimal nedreNormaldose;
    @XmlElement(name = "Enhet", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01", required = true)
    protected CV enhet;
    @XmlElement(name = "MinAntDoser", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected Integer minAntDoser;
    @XmlElement(name = "MaksAntDoser", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected Integer maksAntDoser;
    @XmlElement(name = "Periode", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01", required = true)
    protected CV periode;

    /**
     * Gets the value of the ovreNormaldose property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOvreNormaldose() {
        return ovreNormaldose;
    }

    /**
     * Sets the value of the ovreNormaldose property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOvreNormaldose(BigDecimal value) {
        this.ovreNormaldose = value;
    }

    /**
     * Gets the value of the nedreNormaldose property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNedreNormaldose() {
        return nedreNormaldose;
    }

    /**
     * Sets the value of the nedreNormaldose property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNedreNormaldose(BigDecimal value) {
        this.nedreNormaldose = value;
    }

    /**
     * Gets the value of the enhet property.
     * 
     * @return
     *     possible object is
     *     {@link CV }
     *     
     */
    public CV getEnhet() {
        return enhet;
    }

    /**
     * Sets the value of the enhet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CV }
     *     
     */
    public void setEnhet(CV value) {
        this.enhet = value;
    }

    /**
     * Gets the value of the minAntDoser property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinAntDoser() {
        return minAntDoser;
    }

    /**
     * Sets the value of the minAntDoser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinAntDoser(Integer value) {
        this.minAntDoser = value;
    }

    /**
     * Gets the value of the maksAntDoser property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaksAntDoser() {
        return maksAntDoser;
    }

    /**
     * Sets the value of the maksAntDoser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaksAntDoser(Integer value) {
        this.maksAntDoser = value;
    }

    /**
     * Gets the value of the periode property.
     * 
     * @return
     *     possible object is
     *     {@link CV }
     *     
     */
    public CV getPeriode() {
        return periode;
    }

    /**
     * Sets the value of the periode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CV }
     *     
     */
    public void setPeriode(CV value) {
        this.periode = value;
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
            BigDecimal theOvreNormaldose;
            theOvreNormaldose = this.getOvreNormaldose();
            strategy.appendField(locator, this, "ovreNormaldose", buffer, theOvreNormaldose);
        }
        {
            BigDecimal theNedreNormaldose;
            theNedreNormaldose = this.getNedreNormaldose();
            strategy.appendField(locator, this, "nedreNormaldose", buffer, theNedreNormaldose);
        }
        {
            CV theEnhet;
            theEnhet = this.getEnhet();
            strategy.appendField(locator, this, "enhet", buffer, theEnhet);
        }
        {
            Integer theMinAntDoser;
            theMinAntDoser = this.getMinAntDoser();
            strategy.appendField(locator, this, "minAntDoser", buffer, theMinAntDoser);
        }
        {
            Integer theMaksAntDoser;
            theMaksAntDoser = this.getMaksAntDoser();
            strategy.appendField(locator, this, "maksAntDoser", buffer, theMaksAntDoser);
        }
        {
            CV thePeriode;
            thePeriode = this.getPeriode();
            strategy.appendField(locator, this, "periode", buffer, thePeriode);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GodkjentNormaldose)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GodkjentNormaldose that = ((GodkjentNormaldose) object);
        {
            BigDecimal lhsOvreNormaldose;
            lhsOvreNormaldose = this.getOvreNormaldose();
            BigDecimal rhsOvreNormaldose;
            rhsOvreNormaldose = that.getOvreNormaldose();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ovreNormaldose", lhsOvreNormaldose), LocatorUtils.property(thatLocator, "ovreNormaldose", rhsOvreNormaldose), lhsOvreNormaldose, rhsOvreNormaldose)) {
                return false;
            }
        }
        {
            BigDecimal lhsNedreNormaldose;
            lhsNedreNormaldose = this.getNedreNormaldose();
            BigDecimal rhsNedreNormaldose;
            rhsNedreNormaldose = that.getNedreNormaldose();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nedreNormaldose", lhsNedreNormaldose), LocatorUtils.property(thatLocator, "nedreNormaldose", rhsNedreNormaldose), lhsNedreNormaldose, rhsNedreNormaldose)) {
                return false;
            }
        }
        {
            CV lhsEnhet;
            lhsEnhet = this.getEnhet();
            CV rhsEnhet;
            rhsEnhet = that.getEnhet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enhet", lhsEnhet), LocatorUtils.property(thatLocator, "enhet", rhsEnhet), lhsEnhet, rhsEnhet)) {
                return false;
            }
        }
        {
            Integer lhsMinAntDoser;
            lhsMinAntDoser = this.getMinAntDoser();
            Integer rhsMinAntDoser;
            rhsMinAntDoser = that.getMinAntDoser();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "minAntDoser", lhsMinAntDoser), LocatorUtils.property(thatLocator, "minAntDoser", rhsMinAntDoser), lhsMinAntDoser, rhsMinAntDoser)) {
                return false;
            }
        }
        {
            Integer lhsMaksAntDoser;
            lhsMaksAntDoser = this.getMaksAntDoser();
            Integer rhsMaksAntDoser;
            rhsMaksAntDoser = that.getMaksAntDoser();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maksAntDoser", lhsMaksAntDoser), LocatorUtils.property(thatLocator, "maksAntDoser", rhsMaksAntDoser), lhsMaksAntDoser, rhsMaksAntDoser)) {
                return false;
            }
        }
        {
            CV lhsPeriode;
            lhsPeriode = this.getPeriode();
            CV rhsPeriode;
            rhsPeriode = that.getPeriode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "periode", lhsPeriode), LocatorUtils.property(thatLocator, "periode", rhsPeriode), lhsPeriode, rhsPeriode)) {
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
            BigDecimal theOvreNormaldose;
            theOvreNormaldose = this.getOvreNormaldose();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ovreNormaldose", theOvreNormaldose), currentHashCode, theOvreNormaldose);
        }
        {
            BigDecimal theNedreNormaldose;
            theNedreNormaldose = this.getNedreNormaldose();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nedreNormaldose", theNedreNormaldose), currentHashCode, theNedreNormaldose);
        }
        {
            CV theEnhet;
            theEnhet = this.getEnhet();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enhet", theEnhet), currentHashCode, theEnhet);
        }
        {
            Integer theMinAntDoser;
            theMinAntDoser = this.getMinAntDoser();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minAntDoser", theMinAntDoser), currentHashCode, theMinAntDoser);
        }
        {
            Integer theMaksAntDoser;
            theMaksAntDoser = this.getMaksAntDoser();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maksAntDoser", theMaksAntDoser), currentHashCode, theMaksAntDoser);
        }
        {
            CV thePeriode;
            thePeriode = this.getPeriode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "periode", thePeriode), currentHashCode, thePeriode);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
