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
 *         &lt;element name="Refusjonshjemmel" type="{http://www.kith.no/xmlstds}CV"/&gt;
 *         &lt;element name="KreverVarekobling" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="KreverVedtak" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/m30/2014-12-01}Refusjonsgruppe" maxOccurs="unbounded"/&gt;
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
    "refusjonshjemmel",
    "kreverVarekobling",
    "kreverVedtak",
    "refusjonsgruppe"
})
@XmlRootElement(name = "Refusjonshjemmel", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
public class Refusjonshjemmel
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Refusjonshjemmel", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01", required = true)
    protected CV refusjonshjemmel;
    @XmlElement(name = "KreverVarekobling", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected boolean kreverVarekobling;
    @XmlElement(name = "KreverVedtak", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected boolean kreverVedtak;
    @XmlElement(name = "Refusjonsgruppe", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01", required = true)
    protected List<Refusjonsgruppe> refusjonsgruppe;

    /**
     * Gets the value of the refusjonshjemmel property.
     * 
     * @return
     *     possible object is
     *     {@link CV }
     *     
     */
    public CV getRefusjonshjemmel() {
        return refusjonshjemmel;
    }

    /**
     * Sets the value of the refusjonshjemmel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CV }
     *     
     */
    public void setRefusjonshjemmel(CV value) {
        this.refusjonshjemmel = value;
    }

    /**
     * Gets the value of the kreverVarekobling property.
     * 
     */
    public boolean isKreverVarekobling() {
        return kreverVarekobling;
    }

    /**
     * Sets the value of the kreverVarekobling property.
     * 
     */
    public void setKreverVarekobling(boolean value) {
        this.kreverVarekobling = value;
    }

    /**
     * Gets the value of the kreverVedtak property.
     * 
     */
    public boolean isKreverVedtak() {
        return kreverVedtak;
    }

    /**
     * Sets the value of the kreverVedtak property.
     * 
     */
    public void setKreverVedtak(boolean value) {
        this.kreverVedtak = value;
    }

    /**
     * Gets the value of the refusjonsgruppe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refusjonsgruppe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefusjonsgruppe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Refusjonsgruppe }
     * 
     * 
     */
    public List<Refusjonsgruppe> getRefusjonsgruppe() {
        if (refusjonsgruppe == null) {
            refusjonsgruppe = new ArrayList<Refusjonsgruppe>();
        }
        return this.refusjonsgruppe;
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
            CV theRefusjonshjemmel;
            theRefusjonshjemmel = this.getRefusjonshjemmel();
            strategy.appendField(locator, this, "refusjonshjemmel", buffer, theRefusjonshjemmel);
        }
        {
            boolean theKreverVarekobling;
            theKreverVarekobling = this.isKreverVarekobling();
            strategy.appendField(locator, this, "kreverVarekobling", buffer, theKreverVarekobling);
        }
        {
            boolean theKreverVedtak;
            theKreverVedtak = this.isKreverVedtak();
            strategy.appendField(locator, this, "kreverVedtak", buffer, theKreverVedtak);
        }
        {
            List<Refusjonsgruppe> theRefusjonsgruppe;
            theRefusjonsgruppe = (((this.refusjonsgruppe!= null)&&(!this.refusjonsgruppe.isEmpty()))?this.getRefusjonsgruppe():null);
            strategy.appendField(locator, this, "refusjonsgruppe", buffer, theRefusjonsgruppe);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Refusjonshjemmel)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Refusjonshjemmel that = ((Refusjonshjemmel) object);
        {
            CV lhsRefusjonshjemmel;
            lhsRefusjonshjemmel = this.getRefusjonshjemmel();
            CV rhsRefusjonshjemmel;
            rhsRefusjonshjemmel = that.getRefusjonshjemmel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refusjonshjemmel", lhsRefusjonshjemmel), LocatorUtils.property(thatLocator, "refusjonshjemmel", rhsRefusjonshjemmel), lhsRefusjonshjemmel, rhsRefusjonshjemmel)) {
                return false;
            }
        }
        {
            boolean lhsKreverVarekobling;
            lhsKreverVarekobling = this.isKreverVarekobling();
            boolean rhsKreverVarekobling;
            rhsKreverVarekobling = that.isKreverVarekobling();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kreverVarekobling", lhsKreverVarekobling), LocatorUtils.property(thatLocator, "kreverVarekobling", rhsKreverVarekobling), lhsKreverVarekobling, rhsKreverVarekobling)) {
                return false;
            }
        }
        {
            boolean lhsKreverVedtak;
            lhsKreverVedtak = this.isKreverVedtak();
            boolean rhsKreverVedtak;
            rhsKreverVedtak = that.isKreverVedtak();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "kreverVedtak", lhsKreverVedtak), LocatorUtils.property(thatLocator, "kreverVedtak", rhsKreverVedtak), lhsKreverVedtak, rhsKreverVedtak)) {
                return false;
            }
        }
        {
            List<Refusjonsgruppe> lhsRefusjonsgruppe;
            lhsRefusjonsgruppe = (((this.refusjonsgruppe!= null)&&(!this.refusjonsgruppe.isEmpty()))?this.getRefusjonsgruppe():null);
            List<Refusjonsgruppe> rhsRefusjonsgruppe;
            rhsRefusjonsgruppe = (((that.refusjonsgruppe!= null)&&(!that.refusjonsgruppe.isEmpty()))?that.getRefusjonsgruppe():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refusjonsgruppe", lhsRefusjonsgruppe), LocatorUtils.property(thatLocator, "refusjonsgruppe", rhsRefusjonsgruppe), lhsRefusjonsgruppe, rhsRefusjonsgruppe)) {
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
            CV theRefusjonshjemmel;
            theRefusjonshjemmel = this.getRefusjonshjemmel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refusjonshjemmel", theRefusjonshjemmel), currentHashCode, theRefusjonshjemmel);
        }
        {
            boolean theKreverVarekobling;
            theKreverVarekobling = this.isKreverVarekobling();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kreverVarekobling", theKreverVarekobling), currentHashCode, theKreverVarekobling);
        }
        {
            boolean theKreverVedtak;
            theKreverVedtak = this.isKreverVedtak();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "kreverVedtak", theKreverVedtak), currentHashCode, theKreverVedtak);
        }
        {
            List<Refusjonsgruppe> theRefusjonsgruppe;
            theRefusjonsgruppe = (((this.refusjonsgruppe!= null)&&(!this.refusjonsgruppe.isEmpty()))?this.getRefusjonsgruppe():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refusjonsgruppe", theRefusjonsgruppe), currentHashCode, theRefusjonsgruppe);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
