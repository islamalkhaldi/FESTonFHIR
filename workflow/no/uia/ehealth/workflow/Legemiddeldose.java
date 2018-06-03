//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.19 at 09:29:28 PM CEST 
//


package no.uia.ehealth.workflow;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
 *     &lt;extension base="{http://www.kith.no/xmlstds/eresept/forskrivning/2014-12-01}typeLegemiddel"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}ID"/&gt;
 *         &lt;element name="LmrLopenr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mengde" type="{http://www.kith.no/xmlstds}PQ"/&gt;
 *         &lt;element name="Pakningstype" type="{http://www.kith.no/xmlstds}CV" minOccurs="0"/&gt;
 *         &lt;element name="RefLegemiddelMerkevare" type="{http://www.w3.org/2001/XMLSchema}IDREF"/&gt;
 *         &lt;element name="RefPakning" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/forskrivning/2014-12-01}Pakningskomponent" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EnhetOrdinering" type="{http://www.kith.no/xmlstds}CV" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "id",
    "lmrLopenr",
    "mengde",
    "pakningstype",
    "refLegemiddelMerkevare",
    "refPakning",
    "pakningskomponent",
    "enhetOrdinering"
})
@XmlRootElement(name = "Legemiddeldose")
public class Legemiddeldose
    extends TypeLegemiddel
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlElement(name = "LmrLopenr")
    protected String lmrLopenr;
    @XmlElement(name = "Mengde", required = true)
    protected PQ mengde;
    @XmlElement(name = "Pakningstype")
    protected CV pakningstype;
    @XmlElement(name = "RefLegemiddelMerkevare", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object refLegemiddelMerkevare;
    @XmlElementRef(name = "RefPakning", namespace = "http://www.kith.no/xmlstds/eresept/forskrivning/2014-12-01", type = JAXBElement.class)
    protected List<JAXBElement<Object>> refPakning;
    @XmlElement(name = "Pakningskomponent")
    protected List<Pakningskomponent> pakningskomponent;
    @XmlElement(name = "EnhetOrdinering")
    protected List<CV> enhetOrdinering;

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
     * Gets the value of the lmrLopenr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLmrLopenr() {
        return lmrLopenr;
    }

    /**
     * Sets the value of the lmrLopenr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLmrLopenr(String value) {
        this.lmrLopenr = value;
    }

    /**
     * Gets the value of the mengde property.
     * 
     * @return
     *     possible object is
     *     {@link PQ }
     *     
     */
    public PQ getMengde() {
        return mengde;
    }

    /**
     * Sets the value of the mengde property.
     * 
     * @param value
     *     allowed object is
     *     {@link PQ }
     *     
     */
    public void setMengde(PQ value) {
        this.mengde = value;
    }

    /**
     * Gets the value of the pakningstype property.
     * 
     * @return
     *     possible object is
     *     {@link CV }
     *     
     */
    public CV getPakningstype() {
        return pakningstype;
    }

    /**
     * Sets the value of the pakningstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link CV }
     *     
     */
    public void setPakningstype(CV value) {
        this.pakningstype = value;
    }

    /**
     * Gets the value of the refLegemiddelMerkevare property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRefLegemiddelMerkevare() {
        return refLegemiddelMerkevare;
    }

    /**
     * Sets the value of the refLegemiddelMerkevare property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRefLegemiddelMerkevare(Object value) {
        this.refLegemiddelMerkevare = value;
    }

    /**
     * Gets the value of the refPakning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refPakning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefPakning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getRefPakning() {
        if (refPakning == null) {
            refPakning = new ArrayList<JAXBElement<Object>>();
        }
        return this.refPakning;
    }

    /**
     * Gets the value of the pakningskomponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pakningskomponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPakningskomponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pakningskomponent }
     * 
     * 
     */
    public List<Pakningskomponent> getPakningskomponent() {
        if (pakningskomponent == null) {
            pakningskomponent = new ArrayList<Pakningskomponent>();
        }
        return this.pakningskomponent;
    }

    /**
     * Gets the value of the enhetOrdinering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enhetOrdinering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnhetOrdinering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CV }
     * 
     * 
     */
    public List<CV> getEnhetOrdinering() {
        if (enhetOrdinering == null) {
            enhetOrdinering = new ArrayList<CV>();
        }
        return this.enhetOrdinering;
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
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            String theLmrLopenr;
            theLmrLopenr = this.getLmrLopenr();
            strategy.appendField(locator, this, "lmrLopenr", buffer, theLmrLopenr);
        }
        {
            PQ theMengde;
            theMengde = this.getMengde();
            strategy.appendField(locator, this, "mengde", buffer, theMengde);
        }
        {
            CV thePakningstype;
            thePakningstype = this.getPakningstype();
            strategy.appendField(locator, this, "pakningstype", buffer, thePakningstype);
        }
        {
            Object theRefLegemiddelMerkevare;
            theRefLegemiddelMerkevare = this.getRefLegemiddelMerkevare();
            strategy.appendField(locator, this, "refLegemiddelMerkevare", buffer, theRefLegemiddelMerkevare);
        }
        {
            List<JAXBElement<Object>> theRefPakning;
            theRefPakning = (((this.refPakning!= null)&&(!this.refPakning.isEmpty()))?this.getRefPakning():null);
            strategy.appendField(locator, this, "refPakning", buffer, theRefPakning);
        }
        {
            List<Pakningskomponent> thePakningskomponent;
            thePakningskomponent = (((this.pakningskomponent!= null)&&(!this.pakningskomponent.isEmpty()))?this.getPakningskomponent():null);
            strategy.appendField(locator, this, "pakningskomponent", buffer, thePakningskomponent);
        }
        {
            List<CV> theEnhetOrdinering;
            theEnhetOrdinering = (((this.enhetOrdinering!= null)&&(!this.enhetOrdinering.isEmpty()))?this.getEnhetOrdinering():null);
            strategy.appendField(locator, this, "enhetOrdinering", buffer, theEnhetOrdinering);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Legemiddeldose)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final Legemiddeldose that = ((Legemiddeldose) object);
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
            String lhsLmrLopenr;
            lhsLmrLopenr = this.getLmrLopenr();
            String rhsLmrLopenr;
            rhsLmrLopenr = that.getLmrLopenr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lmrLopenr", lhsLmrLopenr), LocatorUtils.property(thatLocator, "lmrLopenr", rhsLmrLopenr), lhsLmrLopenr, rhsLmrLopenr)) {
                return false;
            }
        }
        {
            PQ lhsMengde;
            lhsMengde = this.getMengde();
            PQ rhsMengde;
            rhsMengde = that.getMengde();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mengde", lhsMengde), LocatorUtils.property(thatLocator, "mengde", rhsMengde), lhsMengde, rhsMengde)) {
                return false;
            }
        }
        {
            CV lhsPakningstype;
            lhsPakningstype = this.getPakningstype();
            CV rhsPakningstype;
            rhsPakningstype = that.getPakningstype();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pakningstype", lhsPakningstype), LocatorUtils.property(thatLocator, "pakningstype", rhsPakningstype), lhsPakningstype, rhsPakningstype)) {
                return false;
            }
        }
        {
            Object lhsRefLegemiddelMerkevare;
            lhsRefLegemiddelMerkevare = this.getRefLegemiddelMerkevare();
            Object rhsRefLegemiddelMerkevare;
            rhsRefLegemiddelMerkevare = that.getRefLegemiddelMerkevare();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refLegemiddelMerkevare", lhsRefLegemiddelMerkevare), LocatorUtils.property(thatLocator, "refLegemiddelMerkevare", rhsRefLegemiddelMerkevare), lhsRefLegemiddelMerkevare, rhsRefLegemiddelMerkevare)) {
                return false;
            }
        }
        {
            List<JAXBElement<Object>> lhsRefPakning;
            lhsRefPakning = (((this.refPakning!= null)&&(!this.refPakning.isEmpty()))?this.getRefPakning():null);
            List<JAXBElement<Object>> rhsRefPakning;
            rhsRefPakning = (((that.refPakning!= null)&&(!that.refPakning.isEmpty()))?that.getRefPakning():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refPakning", lhsRefPakning), LocatorUtils.property(thatLocator, "refPakning", rhsRefPakning), lhsRefPakning, rhsRefPakning)) {
                return false;
            }
        }
        {
            List<Pakningskomponent> lhsPakningskomponent;
            lhsPakningskomponent = (((this.pakningskomponent!= null)&&(!this.pakningskomponent.isEmpty()))?this.getPakningskomponent():null);
            List<Pakningskomponent> rhsPakningskomponent;
            rhsPakningskomponent = (((that.pakningskomponent!= null)&&(!that.pakningskomponent.isEmpty()))?that.getPakningskomponent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pakningskomponent", lhsPakningskomponent), LocatorUtils.property(thatLocator, "pakningskomponent", rhsPakningskomponent), lhsPakningskomponent, rhsPakningskomponent)) {
                return false;
            }
        }
        {
            List<CV> lhsEnhetOrdinering;
            lhsEnhetOrdinering = (((this.enhetOrdinering!= null)&&(!this.enhetOrdinering.isEmpty()))?this.getEnhetOrdinering():null);
            List<CV> rhsEnhetOrdinering;
            rhsEnhetOrdinering = (((that.enhetOrdinering!= null)&&(!that.enhetOrdinering.isEmpty()))?that.getEnhetOrdinering():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enhetOrdinering", lhsEnhetOrdinering), LocatorUtils.property(thatLocator, "enhetOrdinering", rhsEnhetOrdinering), lhsEnhetOrdinering, rhsEnhetOrdinering)) {
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
            String theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            String theLmrLopenr;
            theLmrLopenr = this.getLmrLopenr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lmrLopenr", theLmrLopenr), currentHashCode, theLmrLopenr);
        }
        {
            PQ theMengde;
            theMengde = this.getMengde();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mengde", theMengde), currentHashCode, theMengde);
        }
        {
            CV thePakningstype;
            thePakningstype = this.getPakningstype();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pakningstype", thePakningstype), currentHashCode, thePakningstype);
        }
        {
            Object theRefLegemiddelMerkevare;
            theRefLegemiddelMerkevare = this.getRefLegemiddelMerkevare();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refLegemiddelMerkevare", theRefLegemiddelMerkevare), currentHashCode, theRefLegemiddelMerkevare);
        }
        {
            List<JAXBElement<Object>> theRefPakning;
            theRefPakning = (((this.refPakning!= null)&&(!this.refPakning.isEmpty()))?this.getRefPakning():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refPakning", theRefPakning), currentHashCode, theRefPakning);
        }
        {
            List<Pakningskomponent> thePakningskomponent;
            thePakningskomponent = (((this.pakningskomponent!= null)&&(!this.pakningskomponent.isEmpty()))?this.getPakningskomponent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pakningskomponent", thePakningskomponent), currentHashCode, thePakningskomponent);
        }
        {
            List<CV> theEnhetOrdinering;
            theEnhetOrdinering = (((this.enhetOrdinering!= null)&&(!this.enhetOrdinering.isEmpty()))?this.getEnhetOrdinering():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enhetOrdinering", theEnhetOrdinering), currentHashCode, theEnhetOrdinering);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}