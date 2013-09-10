

/* First created by JCasGen Tue Sep 10 01:54:42 EDT 2013 */
package edu.cmu.lti.csd.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 10 01:55:38 EDT 2013
 * XML source: /home/richie/git/hw1-skohli/hw1-skohli/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class GenericToken extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GenericToken.class);
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
  protected GenericToken() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public GenericToken(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public GenericToken(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public GenericToken(JCas jcas, int begin, int end) {
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

  /** getter for range - gets 
   * @generated */
  public Range getRange() {
    if (GenericToken_Type.featOkTst && ((GenericToken_Type)jcasType).casFeat_range == null)
      jcasType.jcas.throwFeatMissing("range", "edu.cmu.lti.csd.types.GenericToken");
    return (Range)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GenericToken_Type)jcasType).casFeatCode_range)));}
    
  /** setter for range - sets  
   * @generated */
  public void setRange(Range v) {
    if (GenericToken_Type.featOkTst && ((GenericToken_Type)jcasType).casFeat_range == null)
      jcasType.jcas.throwFeatMissing("range", "edu.cmu.lti.csd.types.GenericToken");
    jcasType.ll_cas.ll_setRefValue(addr, ((GenericToken_Type)jcasType).casFeatCode_range, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: stringSet

  /** getter for stringSet - gets 
   * @generated */
  public String getStringSet() {
    if (GenericToken_Type.featOkTst && ((GenericToken_Type)jcasType).casFeat_stringSet == null)
      jcasType.jcas.throwFeatMissing("stringSet", "edu.cmu.lti.csd.types.GenericToken");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GenericToken_Type)jcasType).casFeatCode_stringSet);}
    
  /** setter for stringSet - sets  
   * @generated */
  public void setStringSet(String v) {
    if (GenericToken_Type.featOkTst && ((GenericToken_Type)jcasType).casFeat_stringSet == null)
      jcasType.jcas.throwFeatMissing("stringSet", "edu.cmu.lti.csd.types.GenericToken");
    jcasType.ll_cas.ll_setStringValue(addr, ((GenericToken_Type)jcasType).casFeatCode_stringSet, v);}    
  }

    