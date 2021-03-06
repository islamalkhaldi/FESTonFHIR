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
 *         &lt;element name="HentetDato" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GyldigFradatoHelfo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/m30/2014-12-01}KatLegemiddelMerkevare" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/m30/2014-12-01}KatLegemiddelpakning" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/m30/2014-12-01}KatVirkestoff" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/m30/2014-12-01}KatOrdineringVirkestoff" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/m30/2014-12-01}KatLegemiddelVirkestoff" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/m30/2014-12-01}KatHandelsvare" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/m30/2014-12-01}KatDiagnose" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/m30/2014-12-01}KatRefusjon" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/m30/2014-12-01}KatVilkar" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/m30/2014-12-01}KatVarselSlv" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/m30/2014-12-01}KatKodeverk" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/m30/2014-12-01}KatByttegruppe" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/m30/2014-12-01}KatLegemiddeldose" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/m30/2014-12-01}KatInteraksjon" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/m30/2014-12-01}KatStrDosering" minOccurs="0"/&gt;
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
    "hentetDato",
    "gyldigFradatoHelfo",
    "katLegemiddelMerkevare",
    "katLegemiddelpakning",
    "katVirkestoff",
    "katOrdineringVirkestoff",
    "katLegemiddelVirkestoff",
    "katHandelsvare",
    "katDiagnose",
    "katRefusjon",
    "katVilkar",
    "katVarselSlv",
    "katKodeverk",
    "katByttegruppe",
    "katLegemiddeldose",
    "katInteraksjon",
    "katStrDosering"
})
@XmlRootElement(name = "FEST", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
public class FEST
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "HentetDato", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar hentetDato;
    @XmlElement(name = "GyldigFradatoHelfo", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar gyldigFradatoHelfo;
    @XmlElement(name = "KatLegemiddelMerkevare", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected KatLegemiddelMerkevare katLegemiddelMerkevare;
    @XmlElement(name = "KatLegemiddelpakning", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected KatLegemiddelpakning katLegemiddelpakning;
    @XmlElement(name = "KatVirkestoff", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected KatVirkestoff katVirkestoff;
    @XmlElement(name = "KatOrdineringVirkestoff", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected KatOrdineringVirkestoff katOrdineringVirkestoff;
    @XmlElement(name = "KatLegemiddelVirkestoff", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected KatLegemiddelVirkestoff katLegemiddelVirkestoff;
    @XmlElement(name = "KatHandelsvare", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected KatHandelsvare katHandelsvare;
    @XmlElement(name = "KatDiagnose", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected KatDiagnose katDiagnose;
    @XmlElement(name = "KatRefusjon", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected KatRefusjon katRefusjon;
    @XmlElement(name = "KatVilkar", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected KatVilkar katVilkar;
    @XmlElement(name = "KatVarselSlv", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected KatVarselSlv katVarselSlv;
    @XmlElement(name = "KatKodeverk", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected KatKodeverk katKodeverk;
    @XmlElement(name = "KatByttegruppe", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected KatByttegruppe katByttegruppe;
    @XmlElement(name = "KatLegemiddeldose", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected KatLegemiddeldose katLegemiddeldose;
    @XmlElement(name = "KatInteraksjon", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected KatInteraksjon katInteraksjon;
    @XmlElement(name = "KatStrDosering", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected KatStrDosering katStrDosering;

    /**
     * Gets the value of the hentetDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHentetDato() {
        return hentetDato;
    }

    /**
     * Sets the value of the hentetDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHentetDato(XMLGregorianCalendar value) {
        this.hentetDato = value;
    }

    /**
     * Gets the value of the gyldigFradatoHelfo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGyldigFradatoHelfo() {
        return gyldigFradatoHelfo;
    }

    /**
     * Sets the value of the gyldigFradatoHelfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGyldigFradatoHelfo(XMLGregorianCalendar value) {
        this.gyldigFradatoHelfo = value;
    }

    /**
     * Gets the value of the katLegemiddelMerkevare property.
     * 
     * @return
     *     possible object is
     *     {@link KatLegemiddelMerkevare }
     *     
     */
    public KatLegemiddelMerkevare getKatLegemiddelMerkevare() {
        return katLegemiddelMerkevare;
    }

    /**
     * Sets the value of the katLegemiddelMerkevare property.
     * 
     * @param value
     *     allowed object is
     *     {@link KatLegemiddelMerkevare }
     *     
     */
    public void setKatLegemiddelMerkevare(KatLegemiddelMerkevare value) {
        this.katLegemiddelMerkevare = value;
    }

    /**
     * Gets the value of the katLegemiddelpakning property.
     * 
     * @return
     *     possible object is
     *     {@link KatLegemiddelpakning }
     *     
     */
    public KatLegemiddelpakning getKatLegemiddelpakning() {
        return katLegemiddelpakning;
    }

    /**
     * Sets the value of the katLegemiddelpakning property.
     * 
     * @param value
     *     allowed object is
     *     {@link KatLegemiddelpakning }
     *     
     */
    public void setKatLegemiddelpakning(KatLegemiddelpakning value) {
        this.katLegemiddelpakning = value;
    }

    /**
     * Gets the value of the katVirkestoff property.
     * 
     * @return
     *     possible object is
     *     {@link KatVirkestoff }
     *     
     */
    public KatVirkestoff getKatVirkestoff() {
        return katVirkestoff;
    }

    /**
     * Sets the value of the katVirkestoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link KatVirkestoff }
     *     
     */
    public void setKatVirkestoff(KatVirkestoff value) {
        this.katVirkestoff = value;
    }

    /**
     * Gets the value of the katOrdineringVirkestoff property.
     * 
     * @return
     *     possible object is
     *     {@link KatOrdineringVirkestoff }
     *     
     */
    public KatOrdineringVirkestoff getKatOrdineringVirkestoff() {
        return katOrdineringVirkestoff;
    }

    /**
     * Sets the value of the katOrdineringVirkestoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link KatOrdineringVirkestoff }
     *     
     */
    public void setKatOrdineringVirkestoff(KatOrdineringVirkestoff value) {
        this.katOrdineringVirkestoff = value;
    }

    /**
     * Gets the value of the katLegemiddelVirkestoff property.
     * 
     * @return
     *     possible object is
     *     {@link KatLegemiddelVirkestoff }
     *     
     */
    public KatLegemiddelVirkestoff getKatLegemiddelVirkestoff() {
        return katLegemiddelVirkestoff;
    }

    /**
     * Sets the value of the katLegemiddelVirkestoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link KatLegemiddelVirkestoff }
     *     
     */
    public void setKatLegemiddelVirkestoff(KatLegemiddelVirkestoff value) {
        this.katLegemiddelVirkestoff = value;
    }

    /**
     * Gets the value of the katHandelsvare property.
     * 
     * @return
     *     possible object is
     *     {@link KatHandelsvare }
     *     
     */
    public KatHandelsvare getKatHandelsvare() {
        return katHandelsvare;
    }

    /**
     * Sets the value of the katHandelsvare property.
     * 
     * @param value
     *     allowed object is
     *     {@link KatHandelsvare }
     *     
     */
    public void setKatHandelsvare(KatHandelsvare value) {
        this.katHandelsvare = value;
    }

    /**
     * Gets the value of the katDiagnose property.
     * 
     * @return
     *     possible object is
     *     {@link KatDiagnose }
     *     
     */
    public KatDiagnose getKatDiagnose() {
        return katDiagnose;
    }

    /**
     * Sets the value of the katDiagnose property.
     * 
     * @param value
     *     allowed object is
     *     {@link KatDiagnose }
     *     
     */
    public void setKatDiagnose(KatDiagnose value) {
        this.katDiagnose = value;
    }

    /**
     * Gets the value of the katRefusjon property.
     * 
     * @return
     *     possible object is
     *     {@link KatRefusjon }
     *     
     */
    public KatRefusjon getKatRefusjon() {
        return katRefusjon;
    }

    /**
     * Sets the value of the katRefusjon property.
     * 
     * @param value
     *     allowed object is
     *     {@link KatRefusjon }
     *     
     */
    public void setKatRefusjon(KatRefusjon value) {
        this.katRefusjon = value;
    }

    /**
     * Gets the value of the katVilkar property.
     * 
     * @return
     *     possible object is
     *     {@link KatVilkar }
     *     
     */
    public KatVilkar getKatVilkar() {
        return katVilkar;
    }

    /**
     * Sets the value of the katVilkar property.
     * 
     * @param value
     *     allowed object is
     *     {@link KatVilkar }
     *     
     */
    public void setKatVilkar(KatVilkar value) {
        this.katVilkar = value;
    }

    /**
     * Gets the value of the katVarselSlv property.
     * 
     * @return
     *     possible object is
     *     {@link KatVarselSlv }
     *     
     */
    public KatVarselSlv getKatVarselSlv() {
        return katVarselSlv;
    }

    /**
     * Sets the value of the katVarselSlv property.
     * 
     * @param value
     *     allowed object is
     *     {@link KatVarselSlv }
     *     
     */
    public void setKatVarselSlv(KatVarselSlv value) {
        this.katVarselSlv = value;
    }

    /**
     * Gets the value of the katKodeverk property.
     * 
     * @return
     *     possible object is
     *     {@link KatKodeverk }
     *     
     */
    public KatKodeverk getKatKodeverk() {
        return katKodeverk;
    }

    /**
     * Sets the value of the katKodeverk property.
     * 
     * @param value
     *     allowed object is
     *     {@link KatKodeverk }
     *     
     */
    public void setKatKodeverk(KatKodeverk value) {
        this.katKodeverk = value;
    }

    /**
     * Gets the value of the katByttegruppe property.
     * 
     * @return
     *     possible object is
     *     {@link KatByttegruppe }
     *     
     */
    public KatByttegruppe getKatByttegruppe() {
        return katByttegruppe;
    }

    /**
     * Sets the value of the katByttegruppe property.
     * 
     * @param value
     *     allowed object is
     *     {@link KatByttegruppe }
     *     
     */
    public void setKatByttegruppe(KatByttegruppe value) {
        this.katByttegruppe = value;
    }

    /**
     * Gets the value of the katLegemiddeldose property.
     * 
     * @return
     *     possible object is
     *     {@link KatLegemiddeldose }
     *     
     */
    public KatLegemiddeldose getKatLegemiddeldose() {
        return katLegemiddeldose;
    }

    /**
     * Sets the value of the katLegemiddeldose property.
     * 
     * @param value
     *     allowed object is
     *     {@link KatLegemiddeldose }
     *     
     */
    public void setKatLegemiddeldose(KatLegemiddeldose value) {
        this.katLegemiddeldose = value;
    }

    /**
     * Gets the value of the katInteraksjon property.
     * 
     * @return
     *     possible object is
     *     {@link KatInteraksjon }
     *     
     */
    public KatInteraksjon getKatInteraksjon() {
        return katInteraksjon;
    }

    /**
     * Sets the value of the katInteraksjon property.
     * 
     * @param value
     *     allowed object is
     *     {@link KatInteraksjon }
     *     
     */
    public void setKatInteraksjon(KatInteraksjon value) {
        this.katInteraksjon = value;
    }

    /**
     * Gets the value of the katStrDosering property.
     * 
     * @return
     *     possible object is
     *     {@link KatStrDosering }
     *     
     */
    public KatStrDosering getKatStrDosering() {
        return katStrDosering;
    }

    /**
     * Sets the value of the katStrDosering property.
     * 
     * @param value
     *     allowed object is
     *     {@link KatStrDosering }
     *     
     */
    public void setKatStrDosering(KatStrDosering value) {
        this.katStrDosering = value;
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
            XMLGregorianCalendar theHentetDato;
            theHentetDato = this.getHentetDato();
            strategy.appendField(locator, this, "hentetDato", buffer, theHentetDato);
        }
        {
            XMLGregorianCalendar theGyldigFradatoHelfo;
            theGyldigFradatoHelfo = this.getGyldigFradatoHelfo();
            strategy.appendField(locator, this, "gyldigFradatoHelfo", buffer, theGyldigFradatoHelfo);
        }
        {
            KatLegemiddelMerkevare theKatLegemiddelMerkevare;
            theKatLegemiddelMerkevare = this.getKatLegemiddelMerkevare();
            strategy.appendField(locator, this, "katLegemiddelMerkevare", buffer, theKatLegemiddelMerkevare);
        }
        {
            KatLegemiddelpakning theKatLegemiddelpakning;
            theKatLegemiddelpakning = this.getKatLegemiddelpakning();
            strategy.appendField(locator, this, "katLegemiddelpakning", buffer, theKatLegemiddelpakning);
        }
        {
            KatVirkestoff theKatVirkestoff;
            theKatVirkestoff = this.getKatVirkestoff();
            strategy.appendField(locator, this, "katVirkestoff", buffer, theKatVirkestoff);
        }
        {
            KatOrdineringVirkestoff theKatOrdineringVirkestoff;
            theKatOrdineringVirkestoff = this.getKatOrdineringVirkestoff();
            strategy.appendField(locator, this, "katOrdineringVirkestoff", buffer, theKatOrdineringVirkestoff);
        }
        {
            KatLegemiddelVirkestoff theKatLegemiddelVirkestoff;
            theKatLegemiddelVirkestoff = this.getKatLegemiddelVirkestoff();
            strategy.appendField(locator, this, "katLegemiddelVirkestoff", buffer, theKatLegemiddelVirkestoff);
        }
        {
            KatHandelsvare theKatHandelsvare;
            theKatHandelsvare = this.getKatHandelsvare();
            strategy.appendField(locator, this, "katHandelsvare", buffer, theKatHandelsvare);
        }
        {
            KatDiagnose theKatDiagnose;
            theKatDiagnose = this.getKatDiagnose();
            strategy.appendField(locator, this, "katDiagnose", buffer, theKatDiagnose);
        }
        {
            KatRefusjon theKatRefusjon;
            theKatRefusjon = this.getKatRefusjon();
            strategy.appendField(locator, this, "katRefusjon", buffer, theKatRefusjon);
        }
        {
            KatVilkar theKatVilkar;
            theKatVilkar = this.getKatVilkar();
            strategy.appendField(locator, this, "katVilkar", buffer, theKatVilkar);
        }
        {
            KatVarselSlv theKatVarselSlv;
            theKatVarselSlv = this.getKatVarselSlv();
            strategy.appendField(locator, this, "katVarselSlv", buffer, theKatVarselSlv);
        }
        {
            KatKodeverk theKatKodeverk;
            theKatKodeverk = this.getKatKodeverk();
            strategy.appendField(locator, this, "katKodeverk", buffer, theKatKodeverk);
        }
        {
            KatByttegruppe theKatByttegruppe;
            theKatByttegruppe = this.getKatByttegruppe();
            strategy.appendField(locator, this, "katByttegruppe", buffer, theKatByttegruppe);
        }
        {
            KatLegemiddeldose theKatLegemiddeldose;
            theKatLegemiddeldose = this.getKatLegemiddeldose();
            strategy.appendField(locator, this, "katLegemiddeldose", buffer, theKatLegemiddeldose);
        }
        {
            KatInteraksjon theKatInteraksjon;
            theKatInteraksjon = this.getKatInteraksjon();
            strategy.appendField(locator, this, "katInteraksjon", buffer, theKatInteraksjon);
        }
        {
            KatStrDosering theKatStrDosering;
            theKatStrDosering = this.getKatStrDosering();
            strategy.appendField(locator, this, "katStrDosering", buffer, theKatStrDosering);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FEST)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FEST that = ((FEST) object);
        {
            XMLGregorianCalendar lhsHentetDato;
            lhsHentetDato = this.getHentetDato();
            XMLGregorianCalendar rhsHentetDato;
            rhsHentetDato = that.getHentetDato();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hentetDato", lhsHentetDato), LocatorUtils.property(thatLocator, "hentetDato", rhsHentetDato), lhsHentetDato, rhsHentetDato)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsGyldigFradatoHelfo;
            lhsGyldigFradatoHelfo = this.getGyldigFradatoHelfo();
            XMLGregorianCalendar rhsGyldigFradatoHelfo;
            rhsGyldigFradatoHelfo = that.getGyldigFradatoHelfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gyldigFradatoHelfo", lhsGyldigFradatoHelfo), LocatorUtils.property(thatLocator, "gyldigFradatoHelfo", rhsGyldigFradatoHelfo), lhsGyldigFradatoHelfo, rhsGyldigFradatoHelfo)) {
                return false;
            }
        }
        {
            KatLegemiddelMerkevare lhsKatLegemiddelMerkevare;
            lhsKatLegemiddelMerkevare = this.getKatLegemiddelMerkevare();
            KatLegemiddelMerkevare rhsKatLegemiddelMerkevare;
            rhsKatLegemiddelMerkevare = that.getKatLegemiddelMerkevare();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "katLegemiddelMerkevare", lhsKatLegemiddelMerkevare), LocatorUtils.property(thatLocator, "katLegemiddelMerkevare", rhsKatLegemiddelMerkevare), lhsKatLegemiddelMerkevare, rhsKatLegemiddelMerkevare)) {
                return false;
            }
        }
        {
            KatLegemiddelpakning lhsKatLegemiddelpakning;
            lhsKatLegemiddelpakning = this.getKatLegemiddelpakning();
            KatLegemiddelpakning rhsKatLegemiddelpakning;
            rhsKatLegemiddelpakning = that.getKatLegemiddelpakning();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "katLegemiddelpakning", lhsKatLegemiddelpakning), LocatorUtils.property(thatLocator, "katLegemiddelpakning", rhsKatLegemiddelpakning), lhsKatLegemiddelpakning, rhsKatLegemiddelpakning)) {
                return false;
            }
        }
        {
            KatVirkestoff lhsKatVirkestoff;
            lhsKatVirkestoff = this.getKatVirkestoff();
            KatVirkestoff rhsKatVirkestoff;
            rhsKatVirkestoff = that.getKatVirkestoff();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "katVirkestoff", lhsKatVirkestoff), LocatorUtils.property(thatLocator, "katVirkestoff", rhsKatVirkestoff), lhsKatVirkestoff, rhsKatVirkestoff)) {
                return false;
            }
        }
        {
            KatOrdineringVirkestoff lhsKatOrdineringVirkestoff;
            lhsKatOrdineringVirkestoff = this.getKatOrdineringVirkestoff();
            KatOrdineringVirkestoff rhsKatOrdineringVirkestoff;
            rhsKatOrdineringVirkestoff = that.getKatOrdineringVirkestoff();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "katOrdineringVirkestoff", lhsKatOrdineringVirkestoff), LocatorUtils.property(thatLocator, "katOrdineringVirkestoff", rhsKatOrdineringVirkestoff), lhsKatOrdineringVirkestoff, rhsKatOrdineringVirkestoff)) {
                return false;
            }
        }
        {
            KatLegemiddelVirkestoff lhsKatLegemiddelVirkestoff;
            lhsKatLegemiddelVirkestoff = this.getKatLegemiddelVirkestoff();
            KatLegemiddelVirkestoff rhsKatLegemiddelVirkestoff;
            rhsKatLegemiddelVirkestoff = that.getKatLegemiddelVirkestoff();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "katLegemiddelVirkestoff", lhsKatLegemiddelVirkestoff), LocatorUtils.property(thatLocator, "katLegemiddelVirkestoff", rhsKatLegemiddelVirkestoff), lhsKatLegemiddelVirkestoff, rhsKatLegemiddelVirkestoff)) {
                return false;
            }
        }
        {
            KatHandelsvare lhsKatHandelsvare;
            lhsKatHandelsvare = this.getKatHandelsvare();
            KatHandelsvare rhsKatHandelsvare;
            rhsKatHandelsvare = that.getKatHandelsvare();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "katHandelsvare", lhsKatHandelsvare), LocatorUtils.property(thatLocator, "katHandelsvare", rhsKatHandelsvare), lhsKatHandelsvare, rhsKatHandelsvare)) {
                return false;
            }
        }
        {
            KatDiagnose lhsKatDiagnose;
            lhsKatDiagnose = this.getKatDiagnose();
            KatDiagnose rhsKatDiagnose;
            rhsKatDiagnose = that.getKatDiagnose();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "katDiagnose", lhsKatDiagnose), LocatorUtils.property(thatLocator, "katDiagnose", rhsKatDiagnose), lhsKatDiagnose, rhsKatDiagnose)) {
                return false;
            }
        }
        {
            KatRefusjon lhsKatRefusjon;
            lhsKatRefusjon = this.getKatRefusjon();
            KatRefusjon rhsKatRefusjon;
            rhsKatRefusjon = that.getKatRefusjon();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "katRefusjon", lhsKatRefusjon), LocatorUtils.property(thatLocator, "katRefusjon", rhsKatRefusjon), lhsKatRefusjon, rhsKatRefusjon)) {
                return false;
            }
        }
        {
            KatVilkar lhsKatVilkar;
            lhsKatVilkar = this.getKatVilkar();
            KatVilkar rhsKatVilkar;
            rhsKatVilkar = that.getKatVilkar();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "katVilkar", lhsKatVilkar), LocatorUtils.property(thatLocator, "katVilkar", rhsKatVilkar), lhsKatVilkar, rhsKatVilkar)) {
                return false;
            }
        }
        {
            KatVarselSlv lhsKatVarselSlv;
            lhsKatVarselSlv = this.getKatVarselSlv();
            KatVarselSlv rhsKatVarselSlv;
            rhsKatVarselSlv = that.getKatVarselSlv();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "katVarselSlv", lhsKatVarselSlv), LocatorUtils.property(thatLocator, "katVarselSlv", rhsKatVarselSlv), lhsKatVarselSlv, rhsKatVarselSlv)) {
                return false;
            }
        }
        {
            KatKodeverk lhsKatKodeverk;
            lhsKatKodeverk = this.getKatKodeverk();
            KatKodeverk rhsKatKodeverk;
            rhsKatKodeverk = that.getKatKodeverk();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "katKodeverk", lhsKatKodeverk), LocatorUtils.property(thatLocator, "katKodeverk", rhsKatKodeverk), lhsKatKodeverk, rhsKatKodeverk)) {
                return false;
            }
        }
        {
            KatByttegruppe lhsKatByttegruppe;
            lhsKatByttegruppe = this.getKatByttegruppe();
            KatByttegruppe rhsKatByttegruppe;
            rhsKatByttegruppe = that.getKatByttegruppe();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "katByttegruppe", lhsKatByttegruppe), LocatorUtils.property(thatLocator, "katByttegruppe", rhsKatByttegruppe), lhsKatByttegruppe, rhsKatByttegruppe)) {
                return false;
            }
        }
        {
            KatLegemiddeldose lhsKatLegemiddeldose;
            lhsKatLegemiddeldose = this.getKatLegemiddeldose();
            KatLegemiddeldose rhsKatLegemiddeldose;
            rhsKatLegemiddeldose = that.getKatLegemiddeldose();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "katLegemiddeldose", lhsKatLegemiddeldose), LocatorUtils.property(thatLocator, "katLegemiddeldose", rhsKatLegemiddeldose), lhsKatLegemiddeldose, rhsKatLegemiddeldose)) {
                return false;
            }
        }
        {
            KatInteraksjon lhsKatInteraksjon;
            lhsKatInteraksjon = this.getKatInteraksjon();
            KatInteraksjon rhsKatInteraksjon;
            rhsKatInteraksjon = that.getKatInteraksjon();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "katInteraksjon", lhsKatInteraksjon), LocatorUtils.property(thatLocator, "katInteraksjon", rhsKatInteraksjon), lhsKatInteraksjon, rhsKatInteraksjon)) {
                return false;
            }
        }
        {
            KatStrDosering lhsKatStrDosering;
            lhsKatStrDosering = this.getKatStrDosering();
            KatStrDosering rhsKatStrDosering;
            rhsKatStrDosering = that.getKatStrDosering();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "katStrDosering", lhsKatStrDosering), LocatorUtils.property(thatLocator, "katStrDosering", rhsKatStrDosering), lhsKatStrDosering, rhsKatStrDosering)) {
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
            XMLGregorianCalendar theHentetDato;
            theHentetDato = this.getHentetDato();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hentetDato", theHentetDato), currentHashCode, theHentetDato);
        }
        {
            XMLGregorianCalendar theGyldigFradatoHelfo;
            theGyldigFradatoHelfo = this.getGyldigFradatoHelfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gyldigFradatoHelfo", theGyldigFradatoHelfo), currentHashCode, theGyldigFradatoHelfo);
        }
        {
            KatLegemiddelMerkevare theKatLegemiddelMerkevare;
            theKatLegemiddelMerkevare = this.getKatLegemiddelMerkevare();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "katLegemiddelMerkevare", theKatLegemiddelMerkevare), currentHashCode, theKatLegemiddelMerkevare);
        }
        {
            KatLegemiddelpakning theKatLegemiddelpakning;
            theKatLegemiddelpakning = this.getKatLegemiddelpakning();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "katLegemiddelpakning", theKatLegemiddelpakning), currentHashCode, theKatLegemiddelpakning);
        }
        {
            KatVirkestoff theKatVirkestoff;
            theKatVirkestoff = this.getKatVirkestoff();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "katVirkestoff", theKatVirkestoff), currentHashCode, theKatVirkestoff);
        }
        {
            KatOrdineringVirkestoff theKatOrdineringVirkestoff;
            theKatOrdineringVirkestoff = this.getKatOrdineringVirkestoff();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "katOrdineringVirkestoff", theKatOrdineringVirkestoff), currentHashCode, theKatOrdineringVirkestoff);
        }
        {
            KatLegemiddelVirkestoff theKatLegemiddelVirkestoff;
            theKatLegemiddelVirkestoff = this.getKatLegemiddelVirkestoff();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "katLegemiddelVirkestoff", theKatLegemiddelVirkestoff), currentHashCode, theKatLegemiddelVirkestoff);
        }
        {
            KatHandelsvare theKatHandelsvare;
            theKatHandelsvare = this.getKatHandelsvare();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "katHandelsvare", theKatHandelsvare), currentHashCode, theKatHandelsvare);
        }
        {
            KatDiagnose theKatDiagnose;
            theKatDiagnose = this.getKatDiagnose();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "katDiagnose", theKatDiagnose), currentHashCode, theKatDiagnose);
        }
        {
            KatRefusjon theKatRefusjon;
            theKatRefusjon = this.getKatRefusjon();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "katRefusjon", theKatRefusjon), currentHashCode, theKatRefusjon);
        }
        {
            KatVilkar theKatVilkar;
            theKatVilkar = this.getKatVilkar();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "katVilkar", theKatVilkar), currentHashCode, theKatVilkar);
        }
        {
            KatVarselSlv theKatVarselSlv;
            theKatVarselSlv = this.getKatVarselSlv();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "katVarselSlv", theKatVarselSlv), currentHashCode, theKatVarselSlv);
        }
        {
            KatKodeverk theKatKodeverk;
            theKatKodeverk = this.getKatKodeverk();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "katKodeverk", theKatKodeverk), currentHashCode, theKatKodeverk);
        }
        {
            KatByttegruppe theKatByttegruppe;
            theKatByttegruppe = this.getKatByttegruppe();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "katByttegruppe", theKatByttegruppe), currentHashCode, theKatByttegruppe);
        }
        {
            KatLegemiddeldose theKatLegemiddeldose;
            theKatLegemiddeldose = this.getKatLegemiddeldose();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "katLegemiddeldose", theKatLegemiddeldose), currentHashCode, theKatLegemiddeldose);
        }
        {
            KatInteraksjon theKatInteraksjon;
            theKatInteraksjon = this.getKatInteraksjon();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "katInteraksjon", theKatInteraksjon), currentHashCode, theKatInteraksjon);
        }
        {
            KatStrDosering theKatStrDosering;
            theKatStrDosering = this.getKatStrDosering();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "katStrDosering", theKatStrDosering), currentHashCode, theKatStrDosering);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
