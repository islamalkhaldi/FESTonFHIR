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
import javax.xml.bind.annotation.XmlIDREF;
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
 *         &lt;element name="RefVilkar" type="{http://www.w3.org/2001/XMLSchema}IDREF"/&gt;
 *         &lt;element name="FraDato" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="TilDato" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
    "refVilkar",
    "fraDato",
    "tilDato"
})
@XmlRootElement(name = "Refusjonsvilkar", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
public class Refusjonsvilkar
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "RefVilkar", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object refVilkar;
    @XmlElement(name = "FraDato", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fraDato;
    @XmlElement(name = "TilDato", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tilDato;

    /**
     * Gets the value of the refVilkar property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRefVilkar() {
        return refVilkar;
    }

    /**
     * Sets the value of the refVilkar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRefVilkar(Object value) {
        this.refVilkar = value;
    }

    /**
     * Gets the value of the fraDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFraDato() {
        return fraDato;
    }

    /**
     * Sets the value of the fraDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFraDato(XMLGregorianCalendar value) {
        this.fraDato = value;
    }

    /**
     * Gets the value of the tilDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTilDato() {
        return tilDato;
    }

    /**
     * Sets the value of the tilDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTilDato(XMLGregorianCalendar value) {
        this.tilDato = value;
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
            Object theRefVilkar;
            theRefVilkar = this.getRefVilkar();
            strategy.appendField(locator, this, "refVilkar", buffer, theRefVilkar);
        }
        {
            XMLGregorianCalendar theFraDato;
            theFraDato = this.getFraDato();
            strategy.appendField(locator, this, "fraDato", buffer, theFraDato);
        }
        {
            XMLGregorianCalendar theTilDato;
            theTilDato = this.getTilDato();
            strategy.appendField(locator, this, "tilDato", buffer, theTilDato);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Refusjonsvilkar)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Refusjonsvilkar that = ((Refusjonsvilkar) object);
        {
            Object lhsRefVilkar;
            lhsRefVilkar = this.getRefVilkar();
            Object rhsRefVilkar;
            rhsRefVilkar = that.getRefVilkar();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refVilkar", lhsRefVilkar), LocatorUtils.property(thatLocator, "refVilkar", rhsRefVilkar), lhsRefVilkar, rhsRefVilkar)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsFraDato;
            lhsFraDato = this.getFraDato();
            XMLGregorianCalendar rhsFraDato;
            rhsFraDato = that.getFraDato();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fraDato", lhsFraDato), LocatorUtils.property(thatLocator, "fraDato", rhsFraDato), lhsFraDato, rhsFraDato)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsTilDato;
            lhsTilDato = this.getTilDato();
            XMLGregorianCalendar rhsTilDato;
            rhsTilDato = that.getTilDato();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tilDato", lhsTilDato), LocatorUtils.property(thatLocator, "tilDato", rhsTilDato), lhsTilDato, rhsTilDato)) {
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
            Object theRefVilkar;
            theRefVilkar = this.getRefVilkar();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refVilkar", theRefVilkar), currentHashCode, theRefVilkar);
        }
        {
            XMLGregorianCalendar theFraDato;
            theFraDato = this.getFraDato();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fraDato", theFraDato), currentHashCode, theFraDato);
        }
        {
            XMLGregorianCalendar theTilDato;
            theTilDato = this.getTilDato();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tilDato", theTilDato), currentHashCode, theTilDato);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}