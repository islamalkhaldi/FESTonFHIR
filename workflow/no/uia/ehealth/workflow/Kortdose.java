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
 *         &lt;element name="Kortdose" type="{http://www.kith.no/xmlstds}CV"/&gt;
 *         &lt;element name="BeskrivelseTerm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/m30/2014-12-01}Legemiddelforbruk" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "kortdose",
    "beskrivelseTerm",
    "legemiddelforbruk"
})
@XmlRootElement(name = "Kortdose", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
public class Kortdose
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Kortdose", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01", required = true)
    protected CV kortdose;
    @XmlElement(name = "BeskrivelseTerm", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01", required = true)
    protected String beskrivelseTerm;
    @XmlElement(name = "Legemiddelforbruk", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected List<Legemiddelforbruk> legemiddelforbruk;

    /**
     * Gets the value of the kortdose property.
     * 
     * @return
     *     possible object is
     *     {@link CV }
     *     
     */
    public CV getKortdose() {
        return kortdose;
    }

    /**
     * Sets the value of the kortdose property.
     * 
     * @param value
     *     allowed object is
     *     {@link CV }
     *     
     */
    public void setKortdose(CV value) {
        this.kortdose = value;
    }

    /**
     * Gets the value of the beskrivelseTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeskrivelseTerm() {
        return beskrivelseTerm;
    }

    /**
     * Sets the value of the beskrivelseTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeskrivelseTerm(String value) {
        this.beskrivelseTerm = value;
    }

    /**
     * Gets the value of the legemiddelforbruk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legemiddelforbruk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegemiddelforbruk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Legemiddelforbruk }
     * 
     * 
     */
    public List<Legemiddelforbruk> getLegemiddelforbruk() {
        if (legemiddelforbruk == null) {
            legemiddelforbruk = new ArrayList<Legemiddelforbruk>();
        }
        return this.legemiddelforbruk;
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
            CV theKortdose;
            theKortdose = this.getKortdose();
            strategy.appendField(locator, this, "kortdose", buffer, theKortdose);
        }
        {
            String theBeskrivelseTerm;
            theBeskrivelseTerm = this.getBeskrivelseTerm();
            strategy.appendField(locator, this, "beskrivelseTerm", buffer, theBeskrivelseTerm);
        }
        {
            List<Legemiddelforbruk> theLegemiddelforbruk;
            theLegemiddelforbruk = (((this.legemiddelforbruk!= null)&&(!this.legemiddelforbruk.isEmpty()))?this.getLegemiddelforbruk():null);
            strategy.appendField(locator, this, "legemiddelforbruk", buffer, theLegemiddelforbruk);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Kortdose)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Kortdose that = ((Kortdose) object);
        {
            CV lhsKortdose;
            lhsKortdose = this.getKortdose();
            CV rhsKortdose;
            rhsKortdose = that.getKortdose();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kortdose", lhsKortdose), LocatorUtils.property(thatLocator, "kortdose", rhsKortdose), lhsKortdose, rhsKortdose)) {
                return false;
            }
        }
        {
            String lhsBeskrivelseTerm;
            lhsBeskrivelseTerm = this.getBeskrivelseTerm();
            String rhsBeskrivelseTerm;
            rhsBeskrivelseTerm = that.getBeskrivelseTerm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beskrivelseTerm", lhsBeskrivelseTerm), LocatorUtils.property(thatLocator, "beskrivelseTerm", rhsBeskrivelseTerm), lhsBeskrivelseTerm, rhsBeskrivelseTerm)) {
                return false;
            }
        }
        {
            List<Legemiddelforbruk> lhsLegemiddelforbruk;
            lhsLegemiddelforbruk = (((this.legemiddelforbruk!= null)&&(!this.legemiddelforbruk.isEmpty()))?this.getLegemiddelforbruk():null);
            List<Legemiddelforbruk> rhsLegemiddelforbruk;
            rhsLegemiddelforbruk = (((that.legemiddelforbruk!= null)&&(!that.legemiddelforbruk.isEmpty()))?that.getLegemiddelforbruk():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "legemiddelforbruk", lhsLegemiddelforbruk), LocatorUtils.property(thatLocator, "legemiddelforbruk", rhsLegemiddelforbruk), lhsLegemiddelforbruk, rhsLegemiddelforbruk)) {
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
            CV theKortdose;
            theKortdose = this.getKortdose();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kortdose", theKortdose), currentHashCode, theKortdose);
        }
        {
            String theBeskrivelseTerm;
            theBeskrivelseTerm = this.getBeskrivelseTerm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beskrivelseTerm", theBeskrivelseTerm), currentHashCode, theBeskrivelseTerm);
        }
        {
            List<Legemiddelforbruk> theLegemiddelforbruk;
            theLegemiddelforbruk = (((this.legemiddelforbruk!= null)&&(!this.legemiddelforbruk.isEmpty()))?this.getLegemiddelforbruk():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "legemiddelforbruk", theLegemiddelforbruk), currentHashCode, theLegemiddelforbruk);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
