

/* First created by JCasGen Tue Sep 10 17:05:53 EDT 2013 */
package edu.cmu.lti.csd.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 10 17:48:33 EDT 2013
 * XML source: /home/richie/git/hw1-skohli/hw1-skohli/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class Token extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Token.class);
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
  protected Token() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Token(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Token(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Token(JCas jcas, int begin, int end) {
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
  //* Feature: word

  /** getter for word - gets 
   * @generated */
  public String getWord() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_word == null)
      jcasType.jcas.throwFeatMissing("word", "edu.cmu.lti.csd.types.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_word);}
    
  /** setter for word - sets  
   * @generated */
  public void setWord(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_word == null)
      jcasType.jcas.throwFeatMissing("word", "edu.cmu.lti.csd.types.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_word, v);}    
   
    
  //*--------------*
  //* Feature: partOfSpeech

  /** getter for partOfSpeech - gets 
   * @generated */
  public String getPartOfSpeech() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_partOfSpeech == null)
      jcasType.jcas.throwFeatMissing("partOfSpeech", "edu.cmu.lti.csd.types.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_partOfSpeech);}
    
  /** setter for partOfSpeech - sets  
   * @generated */
  public void setPartOfSpeech(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_partOfSpeech == null)
      jcasType.jcas.throwFeatMissing("partOfSpeech", "edu.cmu.lti.csd.types.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_partOfSpeech, v);}    
   
    
  //*--------------*
  //* Feature: confidenceScore

  /** getter for confidenceScore - gets 
   * @generated */
  public int getConfidenceScore() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_confidenceScore == null)
      jcasType.jcas.throwFeatMissing("confidenceScore", "edu.cmu.lti.csd.types.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_confidenceScore);}
    
  /** setter for confidenceScore - sets  
   * @generated */
  public void setConfidenceScore(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_confidenceScore == null)
      jcasType.jcas.throwFeatMissing("confidenceScore", "edu.cmu.lti.csd.types.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_confidenceScore, v);}    
   
    
  //*--------------*
  //* Feature: producer

  /** getter for producer - gets 
   * @generated */
  public String getProducer() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_producer == null)
      jcasType.jcas.throwFeatMissing("producer", "edu.cmu.lti.csd.types.Token");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Token_Type)jcasType).casFeatCode_producer);}
    
  /** setter for producer - sets  
   * @generated */
  public void setProducer(String v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_producer == null)
      jcasType.jcas.throwFeatMissing("producer", "edu.cmu.lti.csd.types.Token");
    jcasType.ll_cas.ll_setStringValue(addr, ((Token_Type)jcasType).casFeatCode_producer, v);}    
   
    
  //*--------------*
  //* Feature: range

  /** getter for range - gets 
   * @generated */
  public Range getRange() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_range == null)
      jcasType.jcas.throwFeatMissing("range", "edu.cmu.lti.csd.types.Token");
    return (Range)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Token_Type)jcasType).casFeatCode_range)));}
    
  /** setter for range - sets  
   * @generated */
  public void setRange(Range v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_range == null)
      jcasType.jcas.throwFeatMissing("range", "edu.cmu.lti.csd.types.Token");
    jcasType.ll_cas.ll_setRefValue(addr, ((Token_Type)jcasType).casFeatCode_range, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    