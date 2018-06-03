//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.19 at 09:29:28 PM CEST 
//


package no.uia.ehealth.workflow;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}ID"/&gt;
 *         &lt;element name="VilkarNr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Gruppe" type="{http://www.kith.no/xmlstds}CV"/&gt;
 *         &lt;element name="GjelderFor" type="{http://www.kith.no/xmlstds}CS"/&gt;
 *         &lt;element name="Tekst" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GyldigFraDato" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="GyldigTilDato" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/m30/2014-12-01}StrukturertVilkar" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "vilkarNr",
    "gruppe",
    "gjelderFor",
    "tekst",
    "gyldigFraDato",
    "gyldigTilDato",
    "strukturertVilkar"
})
@XmlRootElement(name = "Vilkar", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
public class Vilkar
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Id", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlElement(name = "VilkarNr", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected String vilkarNr;
    @XmlElement(name = "Gruppe", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01", required = true)
    protected CV gruppe;
    @XmlElement(name = "GjelderFor", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01", required = true)
    protected CS gjelderFor;
    @XmlElement(name = "Tekst", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01", required = true)
    protected String tekst;
    @XmlElement(name = "GyldigFraDato", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gyldigFraDato;
    @XmlElement(name = "GyldigTilDato", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gyldigTilDato;
    @XmlElement(name = "StrukturertVilkar", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected List<StrukturertVilkar> strukturertVilkar;

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
     * Gets the value of the vilkarNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVilkarNr() {
        return vilkarNr;
    }

    /**
     * Sets the value of the vilkarNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVilkarNr(String value) {
        this.vilkarNr = value;
    }

    /**
     * Gets the value of the gruppe property.
     * 
     * @return
     *     possible object is
     *     {@link CV }
     *     
     */
    public CV getGruppe() {
        return gruppe;
    }

    /**
     * Sets the value of the gruppe property.
     * 
     * @param value
     *     allowed object is
     *     {@link CV }
     *     
     */
    public void setGruppe(CV value) {
        this.gruppe = value;
    }

    /**
     * Gets the value of the gjelderFor property.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getGjelderFor() {
        return gjelderFor;
    }

    /**
     * Sets the value of the gjelderFor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setGjelderFor(CS value) {
        this.gjelderFor = value;
    }

    /**
     * Gets the value of the tekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTekst() {
        return tekst;
    }

    /**
     * Sets the value of the tekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTekst(String value) {
        this.tekst = value;
    }

    /**
     * Gets the value of the gyldigFraDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGyldigFraDato() {
        return gyldigFraDato;
    }

    /**
     * Sets the value of the gyldigFraDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGyldigFraDato(XMLGregorianCalendar value) {
        this.gyldigFraDato = value;
    }

    /**
     * Gets the value of the gyldigTilDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGyldigTilDato() {
        return gyldigTilDato;
    }

    /**
     * Sets the value of the gyldigTilDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGyldigTilDato(XMLGregorianCalendar value) {
        this.gyldigTilDato = value;
    }

    /**
     * Gets the value of the strukturertVilkar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the strukturertVilkar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrukturertVilkar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StrukturertVilkar }
     * 
     * 
     */
    public List<StrukturertVilkar> getStrukturertVilkar() {
        if (strukturertVilkar == null) {
            strukturertVilkar = new ArrayList<StrukturertVilkar>();
        }
        return this.strukturertVilkar;
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
            String theVilkarNr;
            theVilkarNr = this.getVilkarNr();
            strategy.appendField(locator, this, "vilkarNr", buffer, theVilkarNr);
        }
        {
            CV theGruppe;
            theGruppe = this.getGruppe();
            strategy.appendField(locator, this, "gruppe", buffer, theGruppe);
        }
        {
            CS theGjelderFor;
            theGjelderFor = this.getGjelderFor();
            strategy.appendField(locator, this, "gjelderFor", buffer, theGjelderFor);
        }
        {
            String theTekst;
            theTekst = this.getTekst();
            strategy.appendField(locator, this, "tekst", buffer, theTekst);
        }
        {
            XMLGregorianCalendar theGyldigFraDato;
            theGyldigFraDato = this.getGyldigFraDato();
            strategy.appendField(locator, this, "gyldigFraDato", buffer, theGyldigFraDato);
        }
        {
            XMLGregorianCalendar theGyldigTilDato;
            theGyldigTilDato = this.getGyldigTilDato();
            strategy.appendField(locator, this, "gyldigTilDato", buffer, theGyldigTilDato);
        }
        {
            List<StrukturertVilkar> theStrukturertVilkar;
            theStrukturertVilkar = (((this.strukturertVilkar!= null)&&(!this.strukturertVilkar.isEmpty()))?this.getStrukturertVilkar():null);
            strategy.appendField(locator, this, "strukturertVilkar", buffer, theStrukturertVilkar);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Vilkar)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Vilkar that = ((Vilkar) object);
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
            String lhsVilkarNr;
            lhsVilkarNr = this.getVilkarNr();
            String rhsVilkarNr;
            rhsVilkarNr = that.getVilkarNr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vilkarNr", lhsVilkarNr), LocatorUtils.property(thatLocator, "vilkarNr", rhsVilkarNr), lhsVilkarNr, rhsVilkarNr)) {
                return false;
            }
        }
        {
            CV lhsGruppe;
            lhsGruppe = this.getGruppe();
            CV rhsGruppe;
            rhsGruppe = that.getGruppe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gruppe", lhsGruppe), LocatorUtils.property(thatLocator, "gruppe", rhsGruppe), lhsGruppe, rhsGruppe)) {
                return false;
            }
        }
        {
            CS lhsGjelderFor;
            lhsGjelderFor = this.getGjelderFor();
            CS rhsGjelderFor;
            rhsGjelderFor = that.getGjelderFor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gjelderFor", lhsGjelderFor), LocatorUtils.property(thatLocator, "gjelderFor", rhsGjelderFor), lhsGjelderFor, rhsGjelderFor)) {
                return false;
            }
        }
        {
            String lhsTekst;
            lhsTekst = this.getTekst();
            String rhsTekst;
            rhsTekst = that.getTekst();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tekst", lhsTekst), LocatorUtils.property(thatLocator, "tekst", rhsTekst), lhsTekst, rhsTekst)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsGyldigFraDato;
            lhsGyldigFraDato = this.getGyldigFraDato();
            XMLGregorianCalendar rhsGyldigFraDato;
            rhsGyldigFraDato = that.getGyldigFraDato();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gyldigFraDato", lhsGyldigFraDato), LocatorUtils.property(thatLocator, "gyldigFraDato", rhsGyldigFraDato), lhsGyldigFraDato, rhsGyldigFraDato)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsGyldigTilDato;
            lhsGyldigTilDato = this.getGyldigTilDato();
            XMLGregorianCalendar rhsGyldigTilDato;
            rhsGyldigTilDato = that.getGyldigTilDato();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gyldigTilDato", lhsGyldigTilDato), LocatorUtils.property(thatLocator, "gyldigTilDato", rhsGyldigTilDato), lhsGyldigTilDato, rhsGyldigTilDato)) {
                return false;
            }
        }
        {
            List<StrukturertVilkar> lhsStrukturertVilkar;
            lhsStrukturertVilkar = (((this.strukturertVilkar!= null)&&(!this.strukturertVilkar.isEmpty()))?this.getStrukturertVilkar():null);
            List<StrukturertVilkar> rhsStrukturertVilkar;
            rhsStrukturertVilkar = (((that.strukturertVilkar!= null)&&(!that.strukturertVilkar.isEmpty()))?that.getStrukturertVilkar():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "strukturertVilkar", lhsStrukturertVilkar), LocatorUtils.property(thatLocator, "strukturertVilkar", rhsStrukturertVilkar), lhsStrukturertVilkar, rhsStrukturertVilkar)) {
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
            String theVilkarNr;
            theVilkarNr = this.getVilkarNr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vilkarNr", theVilkarNr), currentHashCode, theVilkarNr);
        }
        {
            CV theGruppe;
            theGruppe = this.getGruppe();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gruppe", theGruppe), currentHashCode, theGruppe);
        }
        {
            CS theGjelderFor;
            theGjelderFor = this.getGjelderFor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gjelderFor", theGjelderFor), currentHashCode, theGjelderFor);
        }
        {
            String theTekst;
            theTekst = this.getTekst();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tekst", theTekst), currentHashCode, theTekst);
        }
        {
            XMLGregorianCalendar theGyldigFraDato;
            theGyldigFraDato = this.getGyldigFraDato();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gyldigFraDato", theGyldigFraDato), currentHashCode, theGyldigFraDato);
        }
        {
            XMLGregorianCalendar theGyldigTilDato;
            theGyldigTilDato = this.getGyldigTilDato();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gyldigTilDato", theGyldigTilDato), currentHashCode, theGyldigTilDato);
        }
        {
            List<StrukturertVilkar> theStrukturertVilkar;
            theStrukturertVilkar = (((this.strukturertVilkar!= null)&&(!this.strukturertVilkar.isEmpty()))?this.getStrukturertVilkar():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "strukturertVilkar", theStrukturertVilkar), currentHashCode, theStrukturertVilkar);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
