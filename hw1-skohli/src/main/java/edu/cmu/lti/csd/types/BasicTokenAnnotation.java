

/* First created by JCasGen Wed Sep 11 21:14:49 EDT 2013 */
package edu.cmu.lti.csd.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.AnnotationBase;


/** Bare minimum artifacts which have to be a part of annotation for token.
 * Updated by JCasGen Wed Sep 11 21:15:32 EDT 2013
 * XML source: /home/richie/git/hw1-skohli/hw1-skohli/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class BasicTokenAnnotation extends AnnotationBase {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(BasicTokenAnnotation.class);
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
  protected BasicTokenAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public BasicTokenAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public BasicTokenAnnotation(JCas jcas) {
    super(jcas);
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
    if (BasicTokenAnnotation_Type.featOkTst && ((BasicTokenAnnotation_Type)jcasType).casFeat_range == null)
      jcasType.jcas.throwFeatMissing("range", "edu.cmu.lti.csd.types.BasicTokenAnnotation");
    return (Range)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((BasicTokenAnnotation_Type)jcasType).casFeatCode_range)));}
    
  /** setter for range - sets range of the token in the document 
   * @generated */
  public void setRange(Range v) {
    if (BasicTokenAnnotation_Type.featOkTst && ((BasicTokenAnnotation_Type)jcasType).casFeat_range == null)
      jcasType.jcas.throwFeatMissing("range", "edu.cmu.lti.csd.types.BasicTokenAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((BasicTokenAnnotation_Type)jcasType).casFeatCode_range, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: tokenValue

  /** getter for tokenValue - gets can be actual token value of any granularity
   * @generated */
  public String getTokenValue() {
    if (BasicTokenAnnotation_Type.featOkTst && ((BasicTokenAnnotation_Type)jcasType).casFeat_tokenValue == null)
      jcasType.jcas.throwFeatMissing("tokenValue", "edu.cmu.lti.csd.types.BasicTokenAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((BasicTokenAnnotation_Type)jcasType).casFeatCode_tokenValue);}
    
  /** setter for tokenValue - sets can be actual token value of any granularity 
   * @generated */
  public void setTokenValue(String v) {
    if (BasicTokenAnnotation_Type.featOkTst && ((BasicTokenAnnotation_Type)jcasType).casFeat_tokenValue == null)
      jcasType.jcas.throwFeatMissing("tokenValue", "edu.cmu.lti.csd.types.BasicTokenAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((BasicTokenAnnotation_Type)jcasType).casFeatCode_tokenValue, v);}    
   
    
  //*--------------*
  //* Feature: producer

  /** getter for producer - gets The producer of this token
   * @generated */
  public String getProducer() {
    if (BasicTokenAnnotation_Type.featOkTst && ((BasicTokenAnnotation_Type)jcasType).casFeat_producer == null)
      jcasType.jcas.throwFeatMissing("producer", "edu.cmu.lti.csd.types.BasicTokenAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((BasicTokenAnnotation_Type)jcasType).casFeatCode_producer);}
    
  /** setter for producer - sets The producer of this token 
   * @generated */
  public void setProducer(String v) {
    if (BasicTokenAnnotation_Type.featOkTst && ((BasicTokenAnnotation_Type)jcasType).casFeat_producer == null)
      jcasType.jcas.throwFeatMissing("producer", "edu.cmu.lti.csd.types.BasicTokenAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((BasicTokenAnnotation_Type)jcasType).casFeatCode_producer, v);}    
  }

    