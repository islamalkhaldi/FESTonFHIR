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
 *     &lt;extension base="{http://www.kith.no/xmlstds/eresept/forskrivning/2014-12-01}typeDose"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DoseDognMaks" type="{http://www.kith.no/xmlstds}PQ"/&gt;
 *         &lt;element name="DoseTidsromMaks" type="{http://www.kith.no/xmlstds}PQ"/&gt;
 *         &lt;element name="Tidsrom" type="{http://www.kith.no/xmlstds}PQ"/&gt;
 *         &lt;element name="DoseIntervallMin" type="{http://www.kith.no/xmlstds}PQ"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "doseDognMaks",
    "doseTidsromMaks",
    "tidsrom",
    "doseIntervallMin"
})
@XmlRootElement(name = "DoseEtterBehov")
public class DoseEtterBehov
    extends TypeDose
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "DoseDognMaks", required = true)
    protected PQ doseDognMaks;
    @XmlElement(name = "DoseTidsromMaks", required = true)
    protected PQ doseTidsromMaks;
    @XmlElement(name = "Tidsrom", required = true)
    protected PQ tidsrom;
    @XmlElement(name = "DoseIntervallMin", required = true)
    protected PQ doseIntervallMin;

    /**
     * Gets the value of the doseDognMaks property.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getDoseDognMaks() {
        return doseDognMaks;
    }

    /**
     * Sets the value of the doseDognMaks property.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setDoseDognMaks(PQ value) {
        this.doseDognMaks = value;
    }

    /**
     * Gets the value of the doseTidsromMaks property.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getDoseTidsromMaks() {
        return doseTidsromMaks;
    }

    /**
     * Sets the value of the doseTidsromMaks property.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setDoseTidsromMaks(PQ value) {
        this.doseTidsromMaks = value;
    }

    /**
     * Gets the value of the tidsrom property.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getTidsrom() {
        return tidsrom;
    }

    /**
     * Sets the value of the tidsrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setTidsrom(PQ value) {
        this.tidsrom = value;
    }

    /**
     * Gets the value of the doseIntervallMin property.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getDoseIntervallMin() {
        return doseIntervallMin;
    }

    /**
     * Sets the value of the doseIntervallMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setDoseIntervallMin(PQ value) {
        this.doseIntervallMin = value;
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
        super.appendFields(locator, buffer, strategy);
        {
            PQ theDoseDognMaks;
            theDoseDognMaks = this.getDoseDognMaks();
            strategy.appendField(locator, this, "doseDognMaks", buffer, theDoseDognMaks);
        }
        {
            PQ theDoseTidsromMaks;
            theDoseTidsromMaks = this.getDoseTidsromMaks();
            strategy.appendField(locator, this, "doseTidsromMaks", buffer, theDoseTidsromMaks);
        }
        {
            PQ theTidsrom;
            theTidsrom = this.getTidsrom();
            strategy.appendField(locator, this, "tidsrom", buffer, theTidsrom);
        }
        {
            PQ theDoseIntervallMin;
            theDoseIntervallMin = this.getDoseIntervallMin();
            strategy.appendField(locator, this, "doseIntervallMin", buffer, theDoseIntervallMin);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DoseEtterBehov)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DoseEtterBehov that = ((DoseEtterBehov) object);
        {
            PQ lhsDoseDognMaks;
            lhsDoseDognMaks = this.getDoseDognMaks();
            PQ rhsDoseDognMaks;
            rhsDoseDognMaks = that.getDoseDognMaks();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "doseDognMaks", lhsDoseDognMaks), LocatorUtils.property(thatLocator, "doseDognMaks", rhsDoseDognMaks), lhsDoseDognMaks, rhsDoseDognMaks)) {
                return false;
            }
        }
        {
            PQ lhsDoseTidsromMaks;
            lhsDoseTidsromMaks = this.getDoseTidsromMaks();
            PQ rhsDoseTidsromMaks;
            rhsDoseTidsromMaks = that.getDoseTidsromMaks();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "doseTidsromMaks", lhsDoseTidsromMaks), LocatorUtils.property(thatLocator, "doseTidsromMaks", rhsDoseTidsromMaks), lhsDoseTidsromMaks, rhsDoseTidsromMaks)) {
                return false;
            }
        }
        {
            PQ lhsTidsrom;
            lhsTidsrom = this.getTidsrom();
            PQ rhsTidsrom;
            rhsTidsrom = that.getTidsrom();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tidsrom", lhsTidsrom), LocatorUtils.property(thatLocator, "tidsrom", rhsTidsrom), lhsTidsrom, rhsTidsrom)) {
                return false;
            }
        }
        {
            PQ lhsDoseIntervallMin;
            lhsDoseIntervallMin = this.getDoseIntervallMin();
            PQ rhsDoseIntervallMin;
            rhsDoseIntervallMin = that.getDoseIntervallMin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "doseIntervallMin", lhsDoseIntervallMin), LocatorUtils.property(thatLocator, "doseIntervallMin", rhsDoseIntervallMin), lhsDoseIntervallMin, rhsDoseIntervallMin)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            PQ theDoseDognMaks;
            theDoseDognMaks = this.getDoseDognMaks();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "doseDognMaks", theDoseDognMaks), currentHashCode, theDoseDognMaks);
        }
        {
            PQ theDoseTidsromMaks;
            theDoseTidsromMaks = this.getDoseTidsromMaks();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "doseTidsromMaks", theDoseTidsromMaks), currentHashCode, theDoseTidsromMaks);
        }
        {
            PQ theTidsrom;
            theTidsrom = this.getTidsrom();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tidsrom", theTidsrom), currentHashCode, theTidsrom);
        }
        {
            PQ theDoseIntervallMin;
            theDoseIntervallMin = this.getDoseIntervallMin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "doseIntervallMin", theDoseIntervallMin), currentHashCode, theDoseIntervallMin);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
