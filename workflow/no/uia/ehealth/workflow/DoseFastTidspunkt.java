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
import javax.xml.datatype.XMLGregorianCalendar;
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
 *         &lt;element name="Klokkeslett" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="Tidsomrade" type="{http://www.kith.no/xmlstds}CS" minOccurs="0"/&gt;
 *         &lt;element name="GisEksakt" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/forskrivning/2014-12-01}FastDose" minOccurs="0"/&gt;
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
    "klokkeslett",
    "tidsomrade",
    "gisEksakt",
    "fastDose"
})
@XmlRootElement(name = "DoseFastTidspunkt")
public class DoseFastTidspunkt
    extends TypeDose
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Klokkeslett")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar klokkeslett;
    @XmlElement(name = "Tidsomrade")
    protected CS tidsomrade;
    @XmlElement(name = "GisEksakt")
    protected boolean gisEksakt;
    @XmlElement(name = "FastDose")
    protected FastDose fastDose;

    /**
     * Gets the value of the klokkeslett property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getKlokkeslett() {
        return klokkeslett;
    }

    /**
     * Sets the value of the klokkeslett property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setKlokkeslett(XMLGregorianCalendar value) {
        this.klokkeslett = value;
    }

    /**
     * Gets the value of the tidsomrade property.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getTidsomrade() {
        return tidsomrade;
    }

    /**
     * Sets the value of the tidsomrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setTidsomrade(CS value) {
        this.tidsomrade = value;
    }

    /**
     * Gets the value of the gisEksakt property.
     * 
     */
    public boolean isGisEksakt() {
        return gisEksakt;
    }

    /**
     * Sets the value of the gisEksakt property.
     * 
     */
    public void setGisEksakt(boolean value) {
        this.gisEksakt = value;
    }

    /**
     * Gets the value of the fastDose property.
     * 
     * @return
     *     possible object is
     *     {@link FastDose }
     *     
     */
    public FastDose getFastDose() {
        return fastDose;
    }

    /**
     * Sets the value of the fastDose property.
     * 
     * @param value
     *     allowed object is
     *     {@link FastDose }
     *     
     */
    public void setFastDose(FastDose value) {
        this.fastDose = value;
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
            XMLGregorianCalendar theKlokkeslett;
            theKlokkeslett = this.getKlokkeslett();
            strategy.appendField(locator, this, "klokkeslett", buffer, theKlokkeslett);
        }
        {
            CS theTidsomrade;
            theTidsomrade = this.getTidsomrade();
            strategy.appendField(locator, this, "tidsomrade", buffer, theTidsomrade);
        }
        {
            boolean theGisEksakt;
            theGisEksakt = this.isGisEksakt();
            strategy.appendField(locator, this, "gisEksakt", buffer, theGisEksakt);
        }
        {
            FastDose theFastDose;
            theFastDose = this.getFastDose();
            strategy.appendField(locator, this, "fastDose", buffer, theFastDose);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DoseFastTidspunkt)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DoseFastTidspunkt that = ((DoseFastTidspunkt) object);
        {
            XMLGregorianCalendar lhsKlokkeslett;
            lhsKlokkeslett = this.getKlokkeslett();
            XMLGregorianCalendar rhsKlokkeslett;
            rhsKlokkeslett = that.getKlokkeslett();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "klokkeslett", lhsKlokkeslett), LocatorUtils.property(thatLocator, "klokkeslett", rhsKlokkeslett), lhsKlokkeslett, rhsKlokkeslett)) {
                return false;
            }
        }
        {
            CS lhsTidsomrade;
            lhsTidsomrade = this.getTidsomrade();
            CS rhsTidsomrade;
            rhsTidsomrade = that.getTidsomrade();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tidsomrade", lhsTidsomrade), LocatorUtils.property(thatLocator, "tidsomrade", rhsTidsomrade), lhsTidsomrade, rhsTidsomrade)) {
                return false;
            }
        }
        {
            boolean lhsGisEksakt;
            lhsGisEksakt = this.isGisEksakt();
            boolean rhsGisEksakt;
            rhsGisEksakt = that.isGisEksakt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gisEksakt", lhsGisEksakt), LocatorUtils.property(thatLocator, "gisEksakt", rhsGisEksakt), lhsGisEksakt, rhsGisEksakt)) {
                return false;
            }
        }
        {
            FastDose lhsFastDose;
            lhsFastDose = this.getFastDose();
            FastDose rhsFastDose;
            rhsFastDose = that.getFastDose();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fastDose", lhsFastDose), LocatorUtils.property(thatLocator, "fastDose", rhsFastDose), lhsFastDose, rhsFastDose)) {
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
            XMLGregorianCalendar theKlokkeslett;
            theKlokkeslett = this.getKlokkeslett();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "klokkeslett", theKlokkeslett), currentHashCode, theKlokkeslett);
        }
        {
            CS theTidsomrade;
            theTidsomrade = this.getTidsomrade();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tidsomrade", theTidsomrade), currentHashCode, theTidsomrade);
        }
        {
            boolean theGisEksakt;
            theGisEksakt = this.isGisEksakt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gisEksakt", theGisEksakt), currentHashCode, theGisEksakt);
        }
        {
            FastDose theFastDose;
            theFastDose = this.getFastDose();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fastDose", theFastDose), currentHashCode, theFastDose);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}