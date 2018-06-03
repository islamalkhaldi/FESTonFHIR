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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VarenrUtgaende" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Markedsforingsdato" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="AvregDato" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="MidlUtgattDato" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="OmpakkerAvEndose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "varenrUtgaende",
    "markedsforingsdato",
    "avregDato",
    "midlUtgattDato",
    "ompakkerAvEndose"
})
@XmlRootElement(name = "Markedsforingsinfo")
public class Markedsforingsinfo
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "VarenrUtgaende")
    protected String varenrUtgaende;
    @XmlElement(name = "Markedsforingsdato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar markedsforingsdato;
    @XmlElement(name = "AvregDato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar avregDato;
    @XmlElement(name = "MidlUtgattDato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar midlUtgattDato;
    @XmlElement(name = "OmpakkerAvEndose")
    protected String ompakkerAvEndose;

    /**
     * Gets the value of the varenrUtgaende property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVarenrUtgaende() {
        return varenrUtgaende;
    }

    /**
     * Sets the value of the varenrUtgaende property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVarenrUtgaende(String value) {
        this.varenrUtgaende = value;
    }

    /**
     * Gets the value of the markedsforingsdato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMarkedsforingsdato() {
        return markedsforingsdato;
    }

    /**
     * Sets the value of the markedsforingsdato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMarkedsforingsdato(XMLGregorianCalendar value) {
        this.markedsforingsdato = value;
    }

    /**
     * Gets the value of the avregDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAvregDato() {
        return avregDato;
    }

    /**
     * Sets the value of the avregDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAvregDato(XMLGregorianCalendar value) {
        this.avregDato = value;
    }

    /**
     * Gets the value of the midlUtgattDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMidlUtgattDato() {
        return midlUtgattDato;
    }

    /**
     * Sets the value of the midlUtgattDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMidlUtgattDato(XMLGregorianCalendar value) {
        this.midlUtgattDato = value;
    }

    /**
     * Gets the value of the ompakkerAvEndose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmpakkerAvEndose() {
        return ompakkerAvEndose;
    }

    /**
     * Sets the value of the ompakkerAvEndose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmpakkerAvEndose(String value) {
        this.ompakkerAvEndose = value;
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
            String theVarenrUtgaende;
            theVarenrUtgaende = this.getVarenrUtgaende();
            strategy.appendField(locator, this, "varenrUtgaende", buffer, theVarenrUtgaende);
        }
        {
            XMLGregorianCalendar theMarkedsforingsdato;
            theMarkedsforingsdato = this.getMarkedsforingsdato();
            strategy.appendField(locator, this, "markedsforingsdato", buffer, theMarkedsforingsdato);
        }
        {
            XMLGregorianCalendar theAvregDato;
            theAvregDato = this.getAvregDato();
            strategy.appendField(locator, this, "avregDato", buffer, theAvregDato);
        }
        {
            XMLGregorianCalendar theMidlUtgattDato;
            theMidlUtgattDato = this.getMidlUtgattDato();
            strategy.appendField(locator, this, "midlUtgattDato", buffer, theMidlUtgattDato);
        }
        {
            String theOmpakkerAvEndose;
            theOmpakkerAvEndose = this.getOmpakkerAvEndose();
            strategy.appendField(locator, this, "ompakkerAvEndose", buffer, theOmpakkerAvEndose);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Markedsforingsinfo)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Markedsforingsinfo that = ((Markedsforingsinfo) object);
        {
            String lhsVarenrUtgaende;
            lhsVarenrUtgaende = this.getVarenrUtgaende();
            String rhsVarenrUtgaende;
            rhsVarenrUtgaende = that.getVarenrUtgaende();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "varenrUtgaende", lhsVarenrUtgaende), LocatorUtils.property(thatLocator, "varenrUtgaende", rhsVarenrUtgaende), lhsVarenrUtgaende, rhsVarenrUtgaende)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsMarkedsforingsdato;
            lhsMarkedsforingsdato = this.getMarkedsforingsdato();
            XMLGregorianCalendar rhsMarkedsforingsdato;
            rhsMarkedsforingsdato = that.getMarkedsforingsdato();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "markedsforingsdato", lhsMarkedsforingsdato), LocatorUtils.property(thatLocator, "markedsforingsdato", rhsMarkedsforingsdato), lhsMarkedsforingsdato, rhsMarkedsforingsdato)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsAvregDato;
            lhsAvregDato = this.getAvregDato();
            XMLGregorianCalendar rhsAvregDato;
            rhsAvregDato = that.getAvregDato();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "avregDato", lhsAvregDato), LocatorUtils.property(thatLocator, "avregDato", rhsAvregDato), lhsAvregDato, rhsAvregDato)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsMidlUtgattDato;
            lhsMidlUtgattDato = this.getMidlUtgattDato();
            XMLGregorianCalendar rhsMidlUtgattDato;
            rhsMidlUtgattDato = that.getMidlUtgattDato();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "midlUtgattDato", lhsMidlUtgattDato), LocatorUtils.property(thatLocator, "midlUtgattDato", rhsMidlUtgattDato), lhsMidlUtgattDato, rhsMidlUtgattDato)) {
                return false;
            }
        }
        {
            String lhsOmpakkerAvEndose;
            lhsOmpakkerAvEndose = this.getOmpakkerAvEndose();
            String rhsOmpakkerAvEndose;
            rhsOmpakkerAvEndose = that.getOmpakkerAvEndose();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ompakkerAvEndose", lhsOmpakkerAvEndose), LocatorUtils.property(thatLocator, "ompakkerAvEndose", rhsOmpakkerAvEndose), lhsOmpakkerAvEndose, rhsOmpakkerAvEndose)) {
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
            String theVarenrUtgaende;
            theVarenrUtgaende = this.getVarenrUtgaende();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "varenrUtgaende", theVarenrUtgaende), currentHashCode, theVarenrUtgaende);
        }
        {
            XMLGregorianCalendar theMarkedsforingsdato;
            theMarkedsforingsdato = this.getMarkedsforingsdato();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "markedsforingsdato", theMarkedsforingsdato), currentHashCode, theMarkedsforingsdato);
        }
        {
            XMLGregorianCalendar theAvregDato;
            theAvregDato = this.getAvregDato();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "avregDato", theAvregDato), currentHashCode, theAvregDato);
        }
        {
            XMLGregorianCalendar theMidlUtgattDato;
            theMidlUtgattDato = this.getMidlUtgattDato();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "midlUtgattDato", theMidlUtgattDato), currentHashCode, theMidlUtgattDato);
        }
        {
            String theOmpakkerAvEndose;
            theOmpakkerAvEndose = this.getOmpakkerAvEndose();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ompakkerAvEndose", theOmpakkerAvEndose), currentHashCode, theOmpakkerAvEndose);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}