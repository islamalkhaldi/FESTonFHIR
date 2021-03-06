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
 *         &lt;element name="OppfKodeverk" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.kith.no/xmlstds/eresept/m30/2014-12-01}typeEnkeltoppforingFest"&gt;
 *                 &lt;sequence minOccurs="0"&gt;
 *                   &lt;element ref="{http://www.kith.no/xmlstds/eresept/m30/2014-12-01}Info"/&gt;
 *                   &lt;element ref="{http://www.kith.no/xmlstds/eresept/m30/2014-12-01}Element" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "oppfKodeverk"
})
@XmlRootElement(name = "KatKodeverk", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
public class KatKodeverk
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "OppfKodeverk", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
    protected List<KatKodeverk.OppfKodeverk> oppfKodeverk;

    /**
     * Gets the value of the oppfKodeverk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oppfKodeverk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOppfKodeverk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KatKodeverk.OppfKodeverk }
     * 
     * 
     */
    public List<KatKodeverk.OppfKodeverk> getOppfKodeverk() {
        if (oppfKodeverk == null) {
            oppfKodeverk = new ArrayList<KatKodeverk.OppfKodeverk>();
        }
        return this.oppfKodeverk;
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
            List<KatKodeverk.OppfKodeverk> theOppfKodeverk;
            theOppfKodeverk = (((this.oppfKodeverk!= null)&&(!this.oppfKodeverk.isEmpty()))?this.getOppfKodeverk():null);
            strategy.appendField(locator, this, "oppfKodeverk", buffer, theOppfKodeverk);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof KatKodeverk)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final KatKodeverk that = ((KatKodeverk) object);
        {
            List<KatKodeverk.OppfKodeverk> lhsOppfKodeverk;
            lhsOppfKodeverk = (((this.oppfKodeverk!= null)&&(!this.oppfKodeverk.isEmpty()))?this.getOppfKodeverk():null);
            List<KatKodeverk.OppfKodeverk> rhsOppfKodeverk;
            rhsOppfKodeverk = (((that.oppfKodeverk!= null)&&(!that.oppfKodeverk.isEmpty()))?that.getOppfKodeverk():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "oppfKodeverk", lhsOppfKodeverk), LocatorUtils.property(thatLocator, "oppfKodeverk", rhsOppfKodeverk), lhsOppfKodeverk, rhsOppfKodeverk)) {
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
            List<KatKodeverk.OppfKodeverk> theOppfKodeverk;
            theOppfKodeverk = (((this.oppfKodeverk!= null)&&(!this.oppfKodeverk.isEmpty()))?this.getOppfKodeverk():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oppfKodeverk", theOppfKodeverk), currentHashCode, theOppfKodeverk);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.kith.no/xmlstds/eresept/m30/2014-12-01}typeEnkeltoppforingFest"&gt;
     *       &lt;sequence minOccurs="0"&gt;
     *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/m30/2014-12-01}Info"/&gt;
     *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/m30/2014-12-01}Element" maxOccurs="unbounded"/&gt;
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
        "info",
        "element"
    })
    public static class OppfKodeverk
        extends TypeEnkeltoppforingFest
        implements Equals, HashCode, ToString
    {

        @XmlElement(name = "Info", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
        protected Info info;
        @XmlElement(name = "Element", namespace = "http://www.kith.no/xmlstds/eresept/m30/2014-12-01")
        protected List<Element> element;

        /**
         * Gets the value of the info property.
         * 
         * @return
         *     possible object is
         *     {@link Info }
         *     
         */
        public Info getInfo() {
            return info;
        }

        /**
         * Sets the value of the info property.
         * 
         * @param value
         *     allowed object is
         *     {@link Info }
         *     
         */
        public void setInfo(Info value) {
            this.info = value;
        }

        /**
         * Gets the value of the element property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the element property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getElement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * 
         * 
         */
        public List<Element> getElement() {
            if (element == null) {
                element = new ArrayList<Element>();
            }
            return this.element;
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
                Info theInfo;
                theInfo = this.getInfo();
                strategy.appendField(locator, this, "info", buffer, theInfo);
            }
            {
                List<Element> theElement;
                theElement = (((this.element!= null)&&(!this.element.isEmpty()))?this.getElement():null);
                strategy.appendField(locator, this, "element", buffer, theElement);
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
            if (!(object instanceof KatKodeverk.OppfKodeverk)) {
                return false;
            }
            if (this == object) {
                return true;
            }
            if (!super.equals(thisLocator, thatLocator, object, strategy)) {
                return false;
            }
            final KatKodeverk.OppfKodeverk that = ((KatKodeverk.OppfKodeverk) object);
            {
                Info lhsInfo;
                lhsInfo = this.getInfo();
                Info rhsInfo;
                rhsInfo = that.getInfo();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "info", lhsInfo), LocatorUtils.property(thatLocator, "info", rhsInfo), lhsInfo, rhsInfo)) {
                    return false;
                }
            }
            {
                List<Element> lhsElement;
                lhsElement = (((this.element!= null)&&(!this.element.isEmpty()))?this.getElement():null);
                List<Element> rhsElement;
                rhsElement = (((that.element!= null)&&(!that.element.isEmpty()))?that.getElement():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "element", lhsElement), LocatorUtils.property(thatLocator, "element", rhsElement), lhsElement, rhsElement)) {
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
                Info theInfo;
                theInfo = this.getInfo();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "info", theInfo), currentHashCode, theInfo);
            }
            {
                List<Element> theElement;
                theElement = (((this.element!= null)&&(!this.element.isEmpty()))?this.getElement():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "element", theElement), currentHashCode, theElement);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

    }

}
