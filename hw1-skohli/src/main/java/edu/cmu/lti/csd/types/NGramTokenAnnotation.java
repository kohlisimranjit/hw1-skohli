

/* First created by JCasGen Tue Sep 10 02:07:48 EDT 2013 */
package edu.cmu.lti.csd.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Tue Sep 10 02:10:13 EDT 2013
 * XML source: /home/richie/git/hw1-skohli/hw1-skohli/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class NGramTokenAnnotation extends GenericTokenAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGramTokenAnnotation.class);
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
  protected NGramTokenAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGramTokenAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGramTokenAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NGramTokenAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: partOfSpeech

  /** getter for partOfSpeech - gets 
   * @generated */
  public String getPartOfSpeech() {
    if (NGramTokenAnnotation_Type.featOkTst && ((NGramTokenAnnotation_Type)jcasType).casFeat_partOfSpeech == null)
      jcasType.jcas.throwFeatMissing("partOfSpeech", "edu.cmu.lti.csd.types.NGramTokenAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NGramTokenAnnotation_Type)jcasType).casFeatCode_partOfSpeech);}
    
  /** setter for partOfSpeech - sets  
   * @generated */
  public void setPartOfSpeech(String v) {
    if (NGramTokenAnnotation_Type.featOkTst && ((NGramTokenAnnotation_Type)jcasType).casFeat_partOfSpeech == null)
      jcasType.jcas.throwFeatMissing("partOfSpeech", "edu.cmu.lti.csd.types.NGramTokenAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((NGramTokenAnnotation_Type)jcasType).casFeatCode_partOfSpeech, v);}    
   
    
  //*--------------*
  //* Feature: confidenceScore

  /** getter for confidenceScore - gets 
   * @generated */
  public double getConfidenceScore() {
    if (NGramTokenAnnotation_Type.featOkTst && ((NGramTokenAnnotation_Type)jcasType).casFeat_confidenceScore == null)
      jcasType.jcas.throwFeatMissing("confidenceScore", "edu.cmu.lti.csd.types.NGramTokenAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((NGramTokenAnnotation_Type)jcasType).casFeatCode_confidenceScore);}
    
  /** setter for confidenceScore - sets  
   * @generated */
  public void setConfidenceScore(double v) {
    if (NGramTokenAnnotation_Type.featOkTst && ((NGramTokenAnnotation_Type)jcasType).casFeat_confidenceScore == null)
      jcasType.jcas.throwFeatMissing("confidenceScore", "edu.cmu.lti.csd.types.NGramTokenAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((NGramTokenAnnotation_Type)jcasType).casFeatCode_confidenceScore, v);}    
   
    
  //*--------------*
  //* Feature: producer

  /** getter for producer - gets 
   * @generated */
  public String getProducer() {
    if (NGramTokenAnnotation_Type.featOkTst && ((NGramTokenAnnotation_Type)jcasType).casFeat_producer == null)
      jcasType.jcas.throwFeatMissing("producer", "edu.cmu.lti.csd.types.NGramTokenAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NGramTokenAnnotation_Type)jcasType).casFeatCode_producer);}
    
  /** setter for producer - sets  
   * @generated */
  public void setProducer(String v) {
    if (NGramTokenAnnotation_Type.featOkTst && ((NGramTokenAnnotation_Type)jcasType).casFeat_producer == null)
      jcasType.jcas.throwFeatMissing("producer", "edu.cmu.lti.csd.types.NGramTokenAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((NGramTokenAnnotation_Type)jcasType).casFeatCode_producer, v);}    
  }

    