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
 *         &lt;element name="VirkestoffnavnForm" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RefLegemiddelVirkestoff" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RefLegemiddelMerkevare" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Oppmerksomhet" type="{http://www.kith.no/xmlstds}CV" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/m30/2014-12-01}Doseringsforslag" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "virkestoffnavnForm",
    "refLegemiddelVirkestoff",
    "refLegemiddelMerkevare",
    "oppmerksomhet",
    "doseringsforslag"
})
@XmlRootElement(name = "Legemiddelforslag", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
public class Legemiddelforslag
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "VirkestoffnavnForm", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01", required = true)
    protected String virkestoffnavnForm;
    @XmlElementRef(name = "RefLegemiddelVirkestoff", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> refLegemiddelVirkestoff;
    @XmlElementRef(name = "RefLegemiddelMerkevare", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> refLegemiddelMerkevare;
    @XmlElement(name = "Oppmerksomhet", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected List<CV> oppmerksomhet;
    @XmlElement(name = "Doseringsforslag", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected List<Doseringsforslag> doseringsforslag;

    /**
     * Gets the value of the virkestoffnavnForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirkestoffnavnForm() {
        return virkestoffnavnForm;
    }

    /**
     * Sets the value of the virkestoffnavnForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirkestoffnavnForm(String value) {
        this.virkestoffnavnForm = value;
    }

    /**
     * Gets the value of the refLegemiddelVirkestoff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refLegemiddelVirkestoff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefLegemiddelVirkestoff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getRefLegemiddelVirkestoff() {
        if (refLegemiddelVirkestoff == null) {
            refLegemiddelVirkestoff = new ArrayList<JAXBElement<Object>>();
        }
        return this.refLegemiddelVirkestoff;
    }

    /**
     * Gets the value of the refLegemiddelMerkevare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refLegemiddelMerkevare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefLegemiddelMerkevare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<Object>> getRefLegemiddelMerkevare() {
        if (refLegemiddelMerkevare == null) {
            refLegemiddelMerkevare = new ArrayList<JAXBElement<Object>>();
        }
        return this.refLegemiddelMerkevare;
    }

    /**
     * Gets the value of the oppmerksomhet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oppmerksomhet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOppmerksomhet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CV }
     * 
     * 
     */
    public List<CV> getOppmerksomhet() {
        if (oppmerksomhet == null) {
            oppmerksomhet = new ArrayList<CV>();
        }
        return this.oppmerksomhet;
    }

    /**
     * Gets the value of the doseringsforslag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doseringsforslag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoseringsforslag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Doseringsforslag }
     * 
     * 
     */
    public List<Doseringsforslag> getDoseringsforslag() {
        if (doseringsforslag == null) {
            doseringsforslag = new ArrayList<Doseringsforslag>();
        }
        return this.doseringsforslag;
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
            String theVirkestoffnavnForm;
            theVirkestoffnavnForm = this.getVirkestoffnavnForm();
            strategy.appendField(locator, this, "virkestoffnavnForm", buffer, theVirkestoffnavnForm);
        }
        {
            List<JAXBElement<Object>> theRefLegemiddelVirkestoff;
            theRefLegemiddelVirkestoff = (((this.refLegemiddelVirkestoff!= null)&&(!this.refLegemiddelVirkestoff.isEmpty()))?this.getRefLegemiddelVirkestoff():null);
            strategy.appendField(locator, this, "refLegemiddelVirkestoff", buffer, theRefLegemiddelVirkestoff);
        }
        {
            List<JAXBElement<Object>> theRefLegemiddelMerkevare;
            theRefLegemiddelMerkevare = (((this.refLegemiddelMerkevare!= null)&&(!this.refLegemiddelMerkevare.isEmpty()))?this.getRefLegemiddelMerkevare():null);
            strategy.appendField(locator, this, "refLegemiddelMerkevare", buffer, theRefLegemiddelMerkevare);
        }
        {
            List<CV> theOppmerksomhet;
            theOppmerksomhet = (((this.oppmerksomhet!= null)&&(!this.oppmerksomhet.isEmpty()))?this.getOppmerksomhet():null);
            strategy.appendField(locator, this, "oppmerksomhet", buffer, theOppmerksomhet);
        }
        {
            List<Doseringsforslag> theDoseringsforslag;
            theDoseringsforslag = (((this.doseringsforslag!= null)&&(!this.doseringsforslag.isEmpty()))?this.getDoseringsforslag():null);
            strategy.appendField(locator, this, "doseringsforslag", buffer, theDoseringsforslag);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Legemiddelforslag)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Legemiddelforslag that = ((Legemiddelforslag) object);
        {
            String lhsVirkestoffnavnForm;
            lhsVirkestoffnavnForm = this.getVirkestoffnavnForm();
            String rhsVirkestoffnavnForm;
            rhsVirkestoffnavnForm = that.getVirkestoffnavnForm();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "virkestoffnavnForm", lhsVirkestoffnavnForm), LocatorUtils.property(thatLocator, "virkestoffnavnForm", rhsVirkestoffnavnForm), lhsVirkestoffnavnForm, rhsVirkestoffnavnForm)) {
                return false;
            }
        }
        {
            List<JAXBElement<Object>> lhsRefLegemiddelVirkestoff;
            lhsRefLegemiddelVirkestoff = (((this.refLegemiddelVirkestoff!= null)&&(!this.refLegemiddelVirkestoff.isEmpty()))?this.getRefLegemiddelVirkestoff():null);
            List<JAXBElement<Object>> rhsRefLegemiddelVirkestoff;
            rhsRefLegemiddelVirkestoff = (((that.refLegemiddelVirkestoff!= null)&&(!that.refLegemiddelVirkestoff.isEmpty()))?that.getRefLegemiddelVirkestoff():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refLegemiddelVirkestoff", lhsRefLegemiddelVirkestoff), LocatorUtils.property(thatLocator, "refLegemiddelVirkestoff", rhsRefLegemiddelVirkestoff), lhsRefLegemiddelVirkestoff, rhsRefLegemiddelVirkestoff)) {
                return false;
            }
        }
        {
            List<JAXBElement<Object>> lhsRefLegemiddelMerkevare;
            lhsRefLegemiddelMerkevare = (((this.refLegemiddelMerkevare!= null)&&(!this.refLegemiddelMerkevare.isEmpty()))?this.getRefLegemiddelMerkevare():null);
            List<JAXBElement<Object>> rhsRefLegemiddelMerkevare;
            rhsRefLegemiddelMerkevare = (((that.refLegemiddelMerkevare!= null)&&(!that.refLegemiddelMerkevare.isEmpty()))?that.getRefLegemiddelMerkevare():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "refLegemiddelMerkevare", lhsRefLegemiddelMerkevare), LocatorUtils.property(thatLocator, "refLegemiddelMerkevare", rhsRefLegemiddelMerkevare), lhsRefLegemiddelMerkevare, rhsRefLegemiddelMerkevare)) {
                return false;
            }
        }
        {
            List<CV> lhsOppmerksomhet;
            lhsOppmerksomhet = (((this.oppmerksomhet!= null)&&(!this.oppmerksomhet.isEmpty()))?this.getOppmerksomhet():null);
            List<CV> rhsOppmerksomhet;
            rhsOppmerksomhet = (((that.oppmerksomhet!= null)&&(!that.oppmerksomhet.isEmpty()))?that.getOppmerksomhet():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oppmerksomhet", lhsOppmerksomhet), LocatorUtils.property(thatLocator, "oppmerksomhet", rhsOppmerksomhet), lhsOppmerksomhet, rhsOppmerksomhet)) {
                return false;
            }
        }
        {
            List<Doseringsforslag> lhsDoseringsforslag;
            lhsDoseringsforslag = (((this.doseringsforslag!= null)&&(!this.doseringsforslag.isEmpty()))?this.getDoseringsforslag():null);
            List<Doseringsforslag> rhsDoseringsforslag;
            rhsDoseringsforslag = (((that.doseringsforslag!= null)&&(!that.doseringsforslag.isEmpty()))?that.getDoseringsforslag():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "doseringsforslag", lhsDoseringsforslag), LocatorUtils.property(thatLocator, "doseringsforslag", rhsDoseringsforslag), lhsDoseringsforslag, rhsDoseringsforslag)) {
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
            String theVirkestoffnavnForm;
            theVirkestoffnavnForm = this.getVirkestoffnavnForm();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "virkestoffnavnForm", theVirkestoffnavnForm), currentHashCode, theVirkestoffnavnForm);
        }
        {
            List<JAXBElement<Object>> theRefLegemiddelVirkestoff;
            theRefLegemiddelVirkestoff = (((this.refLegemiddelVirkestoff!= null)&&(!this.refLegemiddelVirkestoff.isEmpty()))?this.getRefLegemiddelVirkestoff():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refLegemiddelVirkestoff", theRefLegemiddelVirkestoff), currentHashCode, theRefLegemiddelVirkestoff);
        }
        {
            List<JAXBElement<Object>> theRefLegemiddelMerkevare;
            theRefLegemiddelMerkevare = (((this.refLegemiddelMerkevare!= null)&&(!this.refLegemiddelMerkevare.isEmpty()))?this.getRefLegemiddelMerkevare():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "refLegemiddelMerkevare", theRefLegemiddelMerkevare), currentHashCode, theRefLegemiddelMerkevare);
        }
        {
            List<CV> theOppmerksomhet;
            theOppmerksomhet = (((this.oppmerksomhet!= null)&&(!this.oppmerksomhet.isEmpty()))?this.getOppmerksomhet():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oppmerksomhet", theOppmerksomhet), currentHashCode, theOppmerksomhet);
        }
        {
            List<Doseringsforslag> theDoseringsforslag;
            theDoseringsforslag = (((this.doseringsforslag!= null)&&(!this.doseringsforslag.isEmpty()))?this.getDoseringsforslag():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "doseringsforslag", theDoseringsforslag), currentHashCode, theDoseringsforslag);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
