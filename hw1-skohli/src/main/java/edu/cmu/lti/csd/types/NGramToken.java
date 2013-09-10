

/* First created by JCasGen Tue Sep 10 17:52:38 EDT 2013 */
package edu.cmu.lti.csd.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import com.cmu.lti.csd.types.GenericToken;


import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 10 01:45:00 EDT 2013
 * XML source: /home/richie/git/hw1-skohli/hw1-skohli/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class NGramToken extends GenericToken {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGramToken.class);
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
  protected NGramToken() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGramToken(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGramToken(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public NGramToken(JCas jcas, int begin, int end) {
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
    if (NGramToken_Type.featOkTst && ((NGramToken_Type)jcasType).casFeat_partOfSpeech == null)
      jcasType.jcas.throwFeatMissing("partOfSpeech", "edu.cmu.lti.csd.types.NGramToken");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NGramToken_Type)jcasType).casFeatCode_partOfSpeech);}
    
  /** setter for partOfSpeech - sets  
   * @generated */
  public void setPartOfSpeech(String v) {
    if (NGramToken_Type.featOkTst && ((NGramToken_Type)jcasType).casFeat_partOfSpeech == null)
      jcasType.jcas.throwFeatMissing("partOfSpeech", "edu.cmu.lti.csd.types.NGramToken");
    jcasType.ll_cas.ll_setStringValue(addr, ((NGramToken_Type)jcasType).casFeatCode_partOfSpeech, v);}    
   
    
  //*--------------*
  //* Feature: confidenceScore

  /** getter for confidenceScore - gets 
   * @generated */
  public int getConfidenceScore() {
    if (NGramToken_Type.featOkTst && ((NGramToken_Type)jcasType).casFeat_confidenceScore == null)
      jcasType.jcas.throwFeatMissing("confidenceScore", "edu.cmu.lti.csd.types.NGramToken");
    return jcasType.ll_cas.ll_getIntValue(addr, ((NGramToken_Type)jcasType).casFeatCode_confidenceScore);}
    
  /** setter for confidenceScore - sets  
   * @generated */
  public void setConfidenceScore(int v) {
    if (NGramToken_Type.featOkTst && ((NGramToken_Type)jcasType).casFeat_confidenceScore == null)
      jcasType.jcas.throwFeatMissing("confidenceScore", "edu.cmu.lti.csd.types.NGramToken");
    jcasType.ll_cas.ll_setIntValue(addr, ((NGramToken_Type)jcasType).casFeatCode_confidenceScore, v);}    
   
    
  //*--------------*
  //* Feature: producer

  /** getter for producer - gets 
   * @generated */
  public String getProducer() {
    if (NGramToken_Type.featOkTst && ((NGramToken_Type)jcasType).casFeat_producer == null)
      jcasType.jcas.throwFeatMissing("producer", "edu.cmu.lti.csd.types.NGramToken");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NGramToken_Type)jcasType).casFeatCode_producer);}
    
  /** setter for producer - sets  
   * @generated */
  public void setProducer(String v) {
    if (NGramToken_Type.featOkTst && ((NGramToken_Type)jcasType).casFeat_producer == null)
      jcasType.jcas.throwFeatMissing("producer", "edu.cmu.lti.csd.types.NGramToken");
    jcasType.ll_cas.ll_setStringValue(addr, ((NGramToken_Type)jcasType).casFeatCode_producer, v);}    
  }

    