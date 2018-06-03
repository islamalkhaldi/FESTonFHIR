package no.uia.ehealth.FESTonHapiFHIRResources;

import org.hl7.fhir.dstu3.model.*;
import java.util.ArrayList;
import java.util.List;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Extension;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.util.ElementUtil;
import japa.parser.ast.type.ReferenceType;

/**
 * Definition class for adding extensions to the built-in
 * Medication resource type.
 */
@ResourceDef(name="Medication", profile="http://ehealth.uia.no/StructureDefinition/FESTMedication")
public class FESTMedicationResource extends Medication {
 
   private static final long serialVersionUID = 1L;
 
  
// set code.coding.system coding system version code display values.
// code.coding : http://www.whocc.no/atc
// code.coding.system: http://www.whocc.no/atc
// code.coding.version: 7180
// code.coding.code: ATC 
// display: get the ATC V attribute

  
 //Medication.manfacturer.display ( store value of produsent)
 //Medication.ingredient.isActive (true)   


//Slicing start
   // code.text.ATC-navn: get the ATC DN attribute
   @Child(name="atcNavn") 
   @Extension(url="http://ehealth.uia.no/StructureDefinition/atcNavn", definedLocally=true, isModifier=false)
   @Description(shortDefinition="The name associated with the medicine ATC code, DN attribute of element ATC in FEST")
   private StringType atcNavn;
   
// Medication.isOverTheCounter:legemiddelVarselTrekant
   @Child(name="legemiddelVarselTrekant") 
   @Extension(url="http://ehealth.uia.no/StructureDefinition/legemiddelVarselTrekant", definedLocally=true, isModifier=false)
   @Description(shortDefinition="Indicates a red triangle")
   private BooleanType legemiddelVarselTrekant;
   
   


//Medication.ingredient.itemReference:itemReference.reference ( store a reference to FESTSubstance)
  /* @Child(name="itemReference") 
   @Extension(url="http://ehealth.uia.no/StructureDefinition/itemReference", definedLocally=true, isModifier=false)
   @Description(shortDefinition="a reference to FESTSubstance")
   private FESTSubstanceResource itemReference; 
   */
 //Slicing end
   
//Extesnions start
   // Extension: leggemiddelFESTID
     
    @Child(name="leggemiddelFESTID") 
    @Extension(url="http://ehealth.uia.no/StructureDefinition/LegemiddelFESTID", definedLocally=true, isModifier=false)
    @Description(shortDefinition="legemiddel ID in FEST M30 2.5.1")
    private StringType legemiddelFESTID;
 
 // Extension: legemiddelVarenavn
    
    @Child(name="legemiddelVarenavn") 
    @Extension(url="http://ehealth.uia.no/StructureDefinition/legemiddelVarenavn", definedLocally=true, isModifier=false)
    @Description(shortDefinition="legemiddel varenavn in FEST M30 2.5.1")
    private StringType legemiddelVarenavn;
    
// Extension: legemiddelNavnFormStyrke
    
    @Child(name="legemiddelNavnFormStyrke") 
    @Extension(url="http://ehealth.uia.no/StructureDefinition/legemiddelNavnFormStyrke", definedLocally=true, isModifier=false)
    @Description(shortDefinition="legemiddel navn form styrke in FEST M30 2.5.1")
    private StringType legemiddelNavnFormStyrke;
    
// Extension: legemiddelAdministrasjonsvei   lemiddelEnhetsdosering
    
    @Child(name="legemiddelAdministrasjonsvei") 
    @Extension(url="http://ehealth.uia.no/StructureDefinition/legemiddelAdministrasjonsvei", definedLocally=true, isModifier=false)
    @Description(shortDefinition="legemiddel administration guidance in FEST M30 2.5.1")
    private StringType legemiddelAdministrasjonsvei;
    
// Extension: lemiddelEnhetsdosering legemiddelKortDose
    
    @Child(name="legemiddelEnhetsdosering") 
    @Extension(url="http://ehealth.uia.no/StructureDefinition/legemiddelEnhetsdosering", definedLocally=true, isModifier=false)
    @Description(shortDefinition="legemiddel unit dosage in FEST M30 2.5.1")
    private StringType legemiddelEnhetsdosering;  
    
// Extension: legemiddelKortDose
    
    @Child(name="legemiddelKortDose") 
    @Extension(url="http://ehealth.uia.no/StructureDefinition/legemiddelKortDose", definedLocally=true, isModifier=false)
    @Description(shortDefinition="legemiddel short dose in FEST M30 2.5.1")
    private StringType legemiddelKortDose;  
   
    
    
// Extensions End

    
    /**
     * adding isEmpty() check for  newly added extensions.
     */
    @Override
    public boolean isEmpty() {
        //return super.isEmpty() && ElementUtil.isEmpty(atcNavn,legemiddelVarselTrekant, legemiddelFESTID,itemReference,legemiddelVarenavn,legemiddelNavnFormStyrke,legemiddelAdministrasjonsvei,legemiddelEnhetsdosering,legemiddelKortDose);
    	return super.isEmpty() && ElementUtil.isEmpty(atcNavn,legemiddelVarselTrekant, legemiddelFESTID,legemiddelVarenavn,legemiddelNavnFormStyrke,legemiddelAdministrasjonsvei,legemiddelEnhetsdosering,legemiddelKortDose);
    }
     
   
    public StringType getAtcNavn() {
        if (atcNavn == null) {
        	atcNavn = new StringType();
        }
        return atcNavn;
    } 
    

    public void setAtcNavn(StringType value) {
    	this.atcNavn = value;
    }

  
 
    public BooleanType getLegemiddelVarselTrekant() {
    	if(legemiddelVarselTrekant == null)
    	{
    		legemiddelVarselTrekant = new BooleanType();
    	}
    	return legemiddelVarselTrekant;
    }

    public void setLegemiddelVarselTrekant(BooleanType legemiddelVarselTrekant) {
    	this.legemiddelVarselTrekant = legemiddelVarselTrekant;
    }

   /* public FESTSubstanceResource getItemReference() {
    	if(itemReference == null)
    	{
    		itemReference = new FESTSubstanceResource();
    	}
    	return itemReference;
    }

    public void setItemReference(FESTSubstanceResource itemReference) {
    	this.itemReference = itemReference;
    }
*/
    public StringType getLegemiddelFESTID() {
    	if(legemiddelFESTID == null)
    	{
    		legemiddelFESTID = new StringType();
    	}
    	return legemiddelFESTID;
    }

    public void setLegemiddelFESTID(StringType legemiddelFESTID) {
    	this.legemiddelFESTID = legemiddelFESTID;
    }

    public StringType getLegemiddelVarenavn() {
    	if(legemiddelVarenavn == null)
    	{
    		legemiddelVarenavn = new StringType();
    	}
    	return legemiddelVarenavn;
    }

    public void setLegemiddelVarenavn(StringType legemiddelVarenavn) {
    	this.legemiddelVarenavn = legemiddelVarenavn;
    }

    public StringType getLegemiddelNavnFormStyrke() {
    	if(legemiddelNavnFormStyrke == null)
    	{
    		legemiddelNavnFormStyrke = new StringType();
    	}
    	return legemiddelNavnFormStyrke;
    }

    public void setLegemiddelNavnFormStyrke(StringType legemiddelNavnFormStyrke) {
    	this.legemiddelNavnFormStyrke = legemiddelNavnFormStyrke;
    }

    public StringType getLegemiddelAdministrasjonsvei() {
    	if(legemiddelAdministrasjonsvei == null)
    	{
    		legemiddelAdministrasjonsvei = new StringType();
    	}
    	return legemiddelAdministrasjonsvei;
    }

    public void setLegemiddelAdministrasjonsvei(StringType legemiddelAdministrasjonsvei) {
    	this.legemiddelAdministrasjonsvei = legemiddelAdministrasjonsvei;
    }

    public StringType getLegemiddelEnhetsdosering() {
    	if(legemiddelEnhetsdosering == null)
    	{
    		legemiddelEnhetsdosering = new StringType();
    	}
    	return legemiddelEnhetsdosering;
    }

    public void setLegemiddelEnhetsdosering(StringType legemiddelEnhetsdosering) {
    	this.legemiddelEnhetsdosering = legemiddelEnhetsdosering;
    }

    public StringType getLegemiddelKortDose() {
    	if(legemiddelKortDose == null)
    	{
    		legemiddelKortDose = new StringType();
    	}
    	return legemiddelKortDose;
    }

    public void setLegemiddelKortDose(StringType legemiddelKortDose) {
    	this.legemiddelKortDose = legemiddelKortDose;
    }
 
 
}
