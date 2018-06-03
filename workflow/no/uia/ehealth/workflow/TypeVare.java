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
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * <p>Java class for typeVare complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeVare"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Nr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Navn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/forskrivning/2014-12-01}ProduktInfoVare" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/forskrivning/2014-12-01}Leverandor" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/forskrivning/2014-12-01}PrisVare" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/forskrivning/2014-12-01}Refusjon" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeVare", propOrder = {
    "nr",
    "navn",
    "produktInfoVare",
    "leverandor",
    "prisVare",
    "refusjon"
})
@XmlSeeAlso({
    Naringsmiddel.class,
    MedForbMatr.class
})
public class TypeVare
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Nr", required = true)
    protected String nr;
    @XmlElement(name = "Navn", required = true)
    protected String navn;
    @XmlElement(name = "ProduktInfoVare")
    protected ProduktInfoVare produktInfoVare;
    @XmlElement(name = "Leverandor")
    protected Leverandor leverandor;
    @XmlElement(name = "PrisVare")
    protected List<PrisVare> prisVare;
    @XmlElement(name = "Refusjon")
    protected Refusjon refusjon;

    /**
     * Gets the value of the nr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNr() {
        return nr;
    }

    /**
     * Sets the value of the nr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNr(String value) {
        this.nr = value;
    }

    /**
     * Gets the value of the navn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavn() {
        return navn;
    }

    /**
     * Sets the value of the navn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavn(String value) {
        this.navn = value;
    }

    /**
     * Gets the value of the produktInfoVare property.
     * 
     * @return
     *     possible object is
     *     {@link ProduktInfoVare }
     *     
     */
    public ProduktInfoVare getProduktInfoVare() {
        return produktInfoVare;
    }

    /**
     * Sets the value of the produktInfoVare property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProduktInfoVare }
     *     
     */
    public void setProduktInfoVare(ProduktInfoVare value) {
        this.produktInfoVare = value;
    }

    /**
     * Gets the value of the leverandor property.
     * 
     * @return
     *     possible object is
     *     {@link Leverandor }
     *     
     */
    public Leverandor getLeverandor() {
        return leverandor;
    }

    /**
     * Sets the value of the leverandor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Leverandor }
     *     
     */
    public void setLeverandor(Leverandor value) {
        this.leverandor = value;
    }

    /**
     * Gets the value of the prisVare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prisVare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrisVare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrisVare }
     * 
     * 
     */
    public List<PrisVare> getPrisVare() {
        if (prisVare == null) {
            prisVare = new ArrayList<PrisVare>();
        }
        return this.prisVare;
    }

    /**
     * Gets the value of the refusjon property.
     * 
     * @return
     *     possible object is
     *     {@link Refusjon }
     *     
     */
    public Refusjon getRefusjon() {
        return refusjon;
    }

    /**
     * Sets the value of the refusjon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Refusjon }
     *     
     */
    public void setRefusjon(Refusjon value) {
        this.refusjon = value;
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
            String theNr;
            theNr = this.getNr();
            strategy.appendField(locator, this, "nr", buffer, theNr);
        }
        {
            String theNavn;
            theNavn = this.getNavn();
            strategy.appendField(locator, this, "navn", buffer, theNavn);
        }
        {
            ProduktInfoVare theProduktInfoVare;
            theProduktInfoVare = this.getProduktInfoVare();
            strategy.appendField(locator, this, "produktInfoVare", buffer, theProduktInfoVare);
        }
        {
            Leverandor theLeverandor;
            theLeverandor = this.getLeverandor();
            strategy.appendField(locator, this, "leverandor", buffer, theLeverandor);
        }
        {
            List<PrisVare> thePrisVare;
            thePrisVare = (((this.prisVare!= null)&&(!this.prisVare.isEmpty()))?this.getPrisVare():null);
            strategy.appendField(locator, this, "prisVare", buffer, thePrisVare);
        }
        {
            Refusjon theRefusjon;
            theRefusjon = this.getRefusjon();
            strategy.appendField(locator, this, "refusjon", buffer, theRefusjon);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TypeVare)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TypeVare that = ((TypeVare) object);
        {
            String lhsNr;
            lhsNr = this.getNr();
            String rhsNr;
            rhsNr = that.getNr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nr", lhsNr), LocatorUtils.property(thatLocator, "nr", rhsNr), lhsNr, rhsNr)) {
                return false;
            }
        }
        {
            String lhsNavn;
            lhsNavn = this.getNavn();
            String rhsNavn;
            rhsNavn = that.getNavn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "navn", lhsNavn), LocatorUtils.property(thatLocator, "navn", rhsNavn), lhsNavn, rhsNavn)) {
                return false;
            }
        }
        {
            ProduktInfoVare lhsProduktInfoVare;
            lhsProduktInfoVare = this.getProduktInfoVare();
            ProduktInfoVare rhsProduktInfoVare;
            rhsProduktInfoVare = that.getProduktInfoVare();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "produktInfoVare", lhsProduktInfoVare), LocatorUtils.property(thatLocator, "produktInfoVare", rhsProduktInfoVare), lhsProduktInfoVare, rhsProduktInfoVare)) {
                return false;
            }
        }
        {
            Leverandor lhsLeverandor;
            lhsLeverandor = this.getLeverandor();
            Leverandor rhsLeverandor;
            rhsLeverandor = that.getLeverandor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "leverandor", lhsLeverandor), LocatorUtils.property(thatLocator, "leverandor", rhsLeverandor), lhsLeverandor, rhsLeverandor)) {
                return false;
            }
        }
        {
            List<PrisVare> lhsPrisVare;
            lhsPrisVare = (((this.prisVare!= null)&&(!this.prisVare.isEmpty()))?this.getPrisVare():null);
            List<PrisVare> rhsPrisVare;
            rhsPrisVare = (((that.prisVare!= null)&&(!that.prisVare.isEmpty()))?that.getPrisVare():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "prisVare", lhsPrisVare), LocatorUtils.property(thatLocator, "prisVare", rhsPrisVare), lhsPrisVare, rhsPrisVare)) {
                return false;
            }
        }
        {
            Refusjon lhsRefusjon;
            lhsRefusjon = this.getRefusjon();
            Refusjon rhsRefusjon;
            rhsRefusjon = that.getRefusjon();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refusjon", lhsRefusjon), LocatorUtils.property(thatLocator, "refusjon", rhsRefusjon), lhsRefusjon, rhsRefusjon)) {
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
            String theNr;
            theNr = this.getNr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nr", theNr), currentHashCode, theNr);
        }
        {
            String theNavn;
            theNavn = this.getNavn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "navn", theNavn), currentHashCode, theNavn);
        }
        {
            ProduktInfoVare theProduktInfoVare;
            theProduktInfoVare = this.getProduktInfoVare();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "produktInfoVare", theProduktInfoVare), currentHashCode, theProduktInfoVare);
        }
        {
            Leverandor theLeverandor;
            theLeverandor = this.getLeverandor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "leverandor", theLeverandor), currentHashCode, theLeverandor);
        }
        {
            List<PrisVare> thePrisVare;
            thePrisVare = (((this.prisVare!= null)&&(!this.prisVare.isEmpty()))?this.getPrisVare():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "prisVare", thePrisVare), currentHashCode, thePrisVare);
        }
        {
            Refusjon theRefusjon;
            theRefusjon = this.getRefusjon();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refusjon", theRefusjon), currentHashCode, theRefusjon);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
