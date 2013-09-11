

/* First created by JCasGen Tue Sep 10 02:07:48 EDT 2013 */
package edu.cmu.lti.csd.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** Bare minimum artifacts which have to be a part of annotation for token.
 * Updated by JCasGen Wed Sep 11 14:10:23 EDT 2013
 * XML source: /home/richie/git/hw1-skohli/hw1-skohli/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class GenericTokenAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GenericTokenAnnotation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected GenericTokenAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public GenericTokenAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public GenericTokenAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public GenericTokenAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: range

  /** getter for range - gets range of the token in the document

   * @generated */
  public Range getRange() {
    if (GenericTokenAnnotation_Type.featOkTst && ((GenericTokenAnnotation_Type)jcasType).casFeat_range == null)
      jcasType.jcas.throwFeatMissing("range", "edu.cmu.lti.csd.types.GenericTokenAnnotation");
    return (Range)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GenericTokenAnnotation_Type)jcasType).casFeatCode_range)));}
    
  /** setter for range - sets range of the token in the document
 
   * @generated */
  public void setRange(Range v) {
    if (GenericTokenAnnotation_Type.featOkTst && ((GenericTokenAnnotation_Type)jcasType).casFeat_range == null)
      jcasType.jcas.throwFeatMissing("range", "edu.cmu.lti.csd.types.GenericTokenAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((GenericTokenAnnotation_Type)jcasType).casFeatCode_range, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: stringSet

  /** getter for stringSet - gets can be actual token value of any granularity

   * @generated */
  public String getStringSet() {
    if (GenericTokenAnnotation_Type.featOkTst && ((GenericTokenAnnotation_Type)jcasType).casFeat_stringSet == null)
      jcasType.jcas.throwFeatMissing("stringSet", "edu.cmu.lti.csd.types.GenericTokenAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GenericTokenAnnotation_Type)jcasType).casFeatCode_stringSet);}
    
  /** setter for stringSet - sets can be actual token value of any granularity
 
   * @generated */
  public void setStringSet(String v) {
    if (GenericTokenAnnotation_Type.featOkTst && ((GenericTokenAnnotation_Type)jcasType).casFeat_stringSet == null)
      jcasType.jcas.throwFeatMissing("stringSet", "edu.cmu.lti.csd.types.GenericTokenAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((GenericTokenAnnotation_Type)jcasType).casFeatCode_stringSet, v);}    
  }

    