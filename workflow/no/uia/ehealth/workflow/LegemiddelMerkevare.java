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
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" minOccurs="0"/&gt;
 *         &lt;element name="Varenavn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LegemiddelformLang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/forskrivning/2014-12-01}SortertVirkestoffMedStyrke" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/forskrivning/2014-12-01}SortertVirkestoffUtenStyrke" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Smak" type="{http://www.kith.no/xmlstds}CS" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/forskrivning/2014-12-01}ProduktInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/forskrivning/2014-12-01}Reseptgyldighet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/forskrivning/2014-12-01}Hjelpestoff" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.kith.no/xmlstds/eresept/forskrivning/2014-12-01}Preparatomtaleavsnitt" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "varenavn",
    "legemiddelformLang",
    "sortertVirkestoffMedStyrke",
    "sortertVirkestoffUtenStyrke",
    "smak",
    "produktInfo",
    "reseptgyldighet",
    "hjelpestoff",
    "preparatomtaleavsnitt"
})
@XmlRootElement(name = "LegemiddelMerkevare")
public class LegemiddelMerkevare
    extends TypeLegemiddel
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlElement(name = "Varenavn", required = true)
    protected String varenavn;
    @XmlElement(name = "LegemiddelformLang")
    protected String legemiddelformLang;
    @XmlElement(name = "SortertVirkestoffMedStyrke")
    protected List<SortertVirkestoffMedStyrke> sortertVirkestoffMedStyrke;
    @XmlElement(name = "SortertVirkestoffUtenStyrke")
    protected List<SortertVirkestoffUtenStyrke> sortertVirkestoffUtenStyrke;
    @XmlElement(name = "Smak")
    protected CS smak;
    @XmlElement(name = "ProduktInfo")
    protected ProduktInfo produktInfo;
    @XmlElement(name = "Reseptgyldighet")
    protected List<Reseptgyldighet> reseptgyldighet;
    @XmlElement(name = "Hjelpestoff")
    protected List<Hjelpestoff> hjelpestoff;
    @XmlElement(name = "Preparatomtaleavsnitt")
    protected List<Preparatomtaleavsnitt> preparatomtaleavsnitt;

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
     * Gets the value of the varenavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVarenavn() {
        return varenavn;
    }

    /**
     * Sets the value of the varenavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVarenavn(String value) {
        this.varenavn = value;
    }

    /**
     * Gets the value of the legemiddelformLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegemiddelformLang() {
        return legemiddelformLang;
    }

    /**
     * Sets the value of the legemiddelformLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegemiddelformLang(String value) {
        this.legemiddelformLang = value;
    }

    /**
     * Gets the value of the sortertVirkestoffMedStyrke property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortertVirkestoffMedStyrke property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortertVirkestoffMedStyrke().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SortertVirkestoffMedStyrke }
     * 
     * 
     */
    public List<SortertVirkestoffMedStyrke> getSortertVirkestoffMedStyrke() {
        if (sortertVirkestoffMedStyrke == null) {
            sortertVirkestoffMedStyrke = new ArrayList<SortertVirkestoffMedStyrke>();
        }
        return this.sortertVirkestoffMedStyrke;
    }

    /**
     * Gets the value of the sortertVirkestoffUtenStyrke property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortertVirkestoffUtenStyrke property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortertVirkestoffUtenStyrke().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SortertVirkestoffUtenStyrke }
     * 
     * 
     */
    public List<SortertVirkestoffUtenStyrke> getSortertVirkestoffUtenStyrke() {
        if (sortertVirkestoffUtenStyrke == null) {
            sortertVirkestoffUtenStyrke = new ArrayList<SortertVirkestoffUtenStyrke>();
        }
        return this.sortertVirkestoffUtenStyrke;
    }

    /**
     * Gets the value of the smak property.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getSmak() {
        return smak;
    }

    /**
     * Sets the value of the smak property.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setSmak(CS value) {
        this.smak = value;
    }

    /**
     * Gets the value of the produktInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ProduktInfo }
     *     
     */
    public ProduktInfo getProduktInfo() {
        return produktInfo;
    }

    /**
     * Sets the value of the produktInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProduktInfo }
     *     
     */
    public void setProduktInfo(ProduktInfo value) {
        this.produktInfo = value;
    }

    /**
     * Gets the value of the reseptgyldighet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reseptgyldighet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReseptgyldighet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Reseptgyldighet }
     * 
     * 
     */
    public List<Reseptgyldighet> getReseptgyldighet() {
        if (reseptgyldighet == null) {
            reseptgyldighet = new ArrayList<Reseptgyldighet>();
        }
        return this.reseptgyldighet;
    }

    /**
     * Gets the value of the hjelpestoff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hjelpestoff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHjelpestoff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hjelpestoff }
     * 
     * 
     */
    public List<Hjelpestoff> getHjelpestoff() {
        if (hjelpestoff == null) {
            hjelpestoff = new ArrayList<Hjelpestoff>();
        }
        return this.hjelpestoff;
    }

    /**
     * Gets the value of the preparatomtaleavsnitt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preparatomtaleavsnitt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreparatomtaleavsnitt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Preparatomtaleavsnitt }
     * 
     * 
     */
    public List<Preparatomtaleavsnitt> getPreparatomtaleavsnitt() {
        if (preparatomtaleavsnitt == null) {
            preparatomtaleavsnitt = new ArrayList<Preparatomtaleavsnitt>();
        }
        return this.preparatomtaleavsnitt;
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
            String theVarenavn;
            theVarenavn = this.getVarenavn();
            strategy.appendField(locator, this, "varenavn", buffer, theVarenavn);
        }
        {
            String theLegemiddelformLang;
            theLegemiddelformLang = this.getLegemiddelformLang();
            strategy.appendField(locator, this, "legemiddelformLang", buffer, theLegemiddelformLang);
        }
        {
            List<SortertVirkestoffMedStyrke> theSortertVirkestoffMedStyrke;
            theSortertVirkestoffMedStyrke = (((this.sortertVirkestoffMedStyrke!= null)&&(!this.sortertVirkestoffMedStyrke.isEmpty()))?this.getSortertVirkestoffMedStyrke():null);
            strategy.appendField(locator, this, "sortertVirkestoffMedStyrke", buffer, theSortertVirkestoffMedStyrke);
        }
        {
            List<SortertVirkestoffUtenStyrke> theSortertVirkestoffUtenStyrke;
            theSortertVirkestoffUtenStyrke = (((this.sortertVirkestoffUtenStyrke!= null)&&(!this.sortertVirkestoffUtenStyrke.isEmpty()))?this.getSortertVirkestoffUtenStyrke():null);
            strategy.appendField(locator, this, "sortertVirkestoffUtenStyrke", buffer, theSortertVirkestoffUtenStyrke);
        }
        {
            CS theSmak;
            theSmak = this.getSmak();
            strategy.appendField(locator, this, "smak", buffer, theSmak);
        }
        {
            ProduktInfo theProduktInfo;
            theProduktInfo = this.getProduktInfo();
            strategy.appendField(locator, this, "produktInfo", buffer, theProduktInfo);
        }
        {
            List<Reseptgyldighet> theReseptgyldighet;
            theReseptgyldighet = (((this.reseptgyldighet!= null)&&(!this.reseptgyldighet.isEmpty()))?this.getReseptgyldighet():null);
            strategy.appendField(locator, this, "reseptgyldighet", buffer, theReseptgyldighet);
        }
        {
            List<Hjelpestoff> theHjelpestoff;
            theHjelpestoff = (((this.hjelpestoff!= null)&&(!this.hjelpestoff.isEmpty()))?this.getHjelpestoff():null);
            strategy.appendField(locator, this, "hjelpestoff", buffer, theHjelpestoff);
        }
        {
            List<Preparatomtaleavsnitt> thePreparatomtaleavsnitt;
            thePreparatomtaleavsnitt = (((this.preparatomtaleavsnitt!= null)&&(!this.preparatomtaleavsnitt.isEmpty()))?this.getPreparatomtaleavsnitt():null);
            strategy.appendField(locator, this, "preparatomtaleavsnitt", buffer, thePreparatomtaleavsnitt);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LegemiddelMerkevare)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final LegemiddelMerkevare that = ((LegemiddelMerkevare) object);
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
            String lhsVarenavn;
            lhsVarenavn = this.getVarenavn();
            String rhsVarenavn;
            rhsVarenavn = that.getVarenavn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "varenavn", lhsVarenavn), LocatorUtils.property(thatLocator, "varenavn", rhsVarenavn), lhsVarenavn, rhsVarenavn)) {
                return false;
            }
        }
        {
            String lhsLegemiddelformLang;
            lhsLegemiddelformLang = this.getLegemiddelformLang();
            String rhsLegemiddelformLang;
            rhsLegemiddelformLang = that.getLegemiddelformLang();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "legemiddelformLang", lhsLegemiddelformLang), LocatorUtils.property(thatLocator, "legemiddelformLang", rhsLegemiddelformLang), lhsLegemiddelformLang, rhsLegemiddelformLang)) {
                return false;
            }
        }
        {
            List<SortertVirkestoffMedStyrke> lhsSortertVirkestoffMedStyrke;
            lhsSortertVirkestoffMedStyrke = (((this.sortertVirkestoffMedStyrke!= null)&&(!this.sortertVirkestoffMedStyrke.isEmpty()))?this.getSortertVirkestoffMedStyrke():null);
            List<SortertVirkestoffMedStyrke> rhsSortertVirkestoffMedStyrke;
            rhsSortertVirkestoffMedStyrke = (((that.sortertVirkestoffMedStyrke!= null)&&(!that.sortertVirkestoffMedStyrke.isEmpty()))?that.getSortertVirkestoffMedStyrke():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sortertVirkestoffMedStyrke", lhsSortertVirkestoffMedStyrke), LocatorUtils.property(thatLocator, "sortertVirkestoffMedStyrke", rhsSortertVirkestoffMedStyrke), lhsSortertVirkestoffMedStyrke, rhsSortertVirkestoffMedStyrke)) {
                return false;
            }
        }
        {
            List<SortertVirkestoffUtenStyrke> lhsSortertVirkestoffUtenStyrke;
            lhsSortertVirkestoffUtenStyrke = (((this.sortertVirkestoffUtenStyrke!= null)&&(!this.sortertVirkestoffUtenStyrke.isEmpty()))?this.getSortertVirkestoffUtenStyrke():null);
            List<SortertVirkestoffUtenStyrke> rhsSortertVirkestoffUtenStyrke;
            rhsSortertVirkestoffUtenStyrke = (((that.sortertVirkestoffUtenStyrke!= null)&&(!that.sortertVirkestoffUtenStyrke.isEmpty()))?that.getSortertVirkestoffUtenStyrke():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sortertVirkestoffUtenStyrke", lhsSortertVirkestoffUtenStyrke), LocatorUtils.property(thatLocator, "sortertVirkestoffUtenStyrke", rhsSortertVirkestoffUtenStyrke), lhsSortertVirkestoffUtenStyrke, rhsSortertVirkestoffUtenStyrke)) {
                return false;
            }
        }
        {
            CS lhsSmak;
            lhsSmak = this.getSmak();
            CS rhsSmak;
            rhsSmak = that.getSmak();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "smak", lhsSmak), LocatorUtils.property(thatLocator, "smak", rhsSmak), lhsSmak, rhsSmak)) {
                return false;
            }
        }
        {
            ProduktInfo lhsProduktInfo;
            lhsProduktInfo = this.getProduktInfo();
            ProduktInfo rhsProduktInfo;
            rhsProduktInfo = that.getProduktInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "produktInfo", lhsProduktInfo), LocatorUtils.property(thatLocator, "produktInfo", rhsProduktInfo), lhsProduktInfo, rhsProduktInfo)) {
                return false;
            }
        }
        {
            List<Reseptgyldighet> lhsReseptgyldighet;
            lhsReseptgyldighet = (((this.reseptgyldighet!= null)&&(!this.reseptgyldighet.isEmpty()))?this.getReseptgyldighet():null);
            List<Reseptgyldighet> rhsReseptgyldighet;
            rhsReseptgyldighet = (((that.reseptgyldighet!= null)&&(!that.reseptgyldighet.isEmpty()))?that.getReseptgyldighet():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reseptgyldighet", lhsReseptgyldighet), LocatorUtils.property(thatLocator, "reseptgyldighet", rhsReseptgyldighet), lhsReseptgyldighet, rhsReseptgyldighet)) {
                return false;
            }
        }
        {
            List<Hjelpestoff> lhsHjelpestoff;
            lhsHjelpestoff = (((this.hjelpestoff!= null)&&(!this.hjelpestoff.isEmpty()))?this.getHjelpestoff():null);
            List<Hjelpestoff> rhsHjelpestoff;
            rhsHjelpestoff = (((that.hjelpestoff!= null)&&(!that.hjelpestoff.isEmpty()))?that.getHjelpestoff():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hjelpestoff", lhsHjelpestoff), LocatorUtils.property(thatLocator, "hjelpestoff", rhsHjelpestoff), lhsHjelpestoff, rhsHjelpestoff)) {
                return false;
            }
        }
        {
            List<Preparatomtaleavsnitt> lhsPreparatomtaleavsnitt;
            lhsPreparatomtaleavsnitt = (((this.preparatomtaleavsnitt!= null)&&(!this.preparatomtaleavsnitt.isEmpty()))?this.getPreparatomtaleavsnitt():null);
            List<Preparatomtaleavsnitt> rhsPreparatomtaleavsnitt;
            rhsPreparatomtaleavsnitt = (((that.preparatomtaleavsnitt!= null)&&(!that.preparatomtaleavsnitt.isEmpty()))?that.getPreparatomtaleavsnitt():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preparatomtaleavsnitt", lhsPreparatomtaleavsnitt), LocatorUtils.property(thatLocator, "preparatomtaleavsnitt", rhsPreparatomtaleavsnitt), lhsPreparatomtaleavsnitt, rhsPreparatomtaleavsnitt)) {
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
            String theVarenavn;
            theVarenavn = this.getVarenavn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "varenavn", theVarenavn), currentHashCode, theVarenavn);
        }
        {
            String theLegemiddelformLang;
            theLegemiddelformLang = this.getLegemiddelformLang();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "legemiddelformLang", theLegemiddelformLang), currentHashCode, theLegemiddelformLang);
        }
        {
            List<SortertVirkestoffMedStyrke> theSortertVirkestoffMedStyrke;
            theSortertVirkestoffMedStyrke = (((this.sortertVirkestoffMedStyrke!= null)&&(!this.sortertVirkestoffMedStyrke.isEmpty()))?this.getSortertVirkestoffMedStyrke():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sortertVirkestoffMedStyrke", theSortertVirkestoffMedStyrke), currentHashCode, theSortertVirkestoffMedStyrke);
        }
        {
            List<SortertVirkestoffUtenStyrke> theSortertVirkestoffUtenStyrke;
            theSortertVirkestoffUtenStyrke = (((this.sortertVirkestoffUtenStyrke!= null)&&(!this.sortertVirkestoffUtenStyrke.isEmpty()))?this.getSortertVirkestoffUtenStyrke():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sortertVirkestoffUtenStyrke", theSortertVirkestoffUtenStyrke), currentHashCode, theSortertVirkestoffUtenStyrke);
        }
        {
            CS theSmak;
            theSmak = this.getSmak();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "smak", theSmak), currentHashCode, theSmak);
        }
        {
            ProduktInfo theProduktInfo;
            theProduktInfo = this.getProduktInfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "produktInfo", theProduktInfo), currentHashCode, theProduktInfo);
        }
        {
            List<Reseptgyldighet> theReseptgyldighet;
            theReseptgyldighet = (((this.reseptgyldighet!= null)&&(!this.reseptgyldighet.isEmpty()))?this.getReseptgyldighet():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reseptgyldighet", theReseptgyldighet), currentHashCode, theReseptgyldighet);
        }
        {
            List<Hjelpestoff> theHjelpestoff;
            theHjelpestoff = (((this.hjelpestoff!= null)&&(!this.hjelpestoff.isEmpty()))?this.getHjelpestoff():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hjelpestoff", theHjelpestoff), currentHashCode, theHjelpestoff);
        }
        {
            List<Preparatomtaleavsnitt> thePreparatomtaleavsnitt;
            thePreparatomtaleavsnitt = (((this.preparatomtaleavsnitt!= null)&&(!this.preparatomtaleavsnitt.isEmpty()))?this.getPreparatomtaleavsnitt():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preparatomtaleavsnitt", thePreparatomtaleavsnitt), currentHashCode, thePreparatomtaleavsnitt);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}