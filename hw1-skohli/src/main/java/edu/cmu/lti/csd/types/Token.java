

/* First created by JCasGen Tue Sep 10 17:05:53 EDT 2013 */
package edu.cmu.lti.csd.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 10 17:14:28 EDT 2013
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
  //* Feature: start

  /** getter for start - gets 
   * @generated */
  public int getStart() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_start == null)
      jcasType.jcas.throwFeatMissing("start", "edu.cmu.lti.csd.types.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_start);}
    
  /** setter for start - sets  
   * @generated */
  public void setStart(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_start == null)
      jcasType.jcas.throwFeatMissing("start", "edu.cmu.lti.csd.types.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_start, v);}    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets 
   * @generated */
  public int getEnd() {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "edu.cmu.lti.csd.types.Token");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Token_Type)jcasType).casFeatCode_end);}
    
  /** setter for end - sets  
   * @generated */
  public void setEnd(int v) {
    if (Token_Type.featOkTst && ((Token_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "edu.cmu.lti.csd.types.Token");
    jcasType.ll_cas.ll_setIntValue(addr, ((Token_Type)jcasType).casFeatCode_end, v);}    
   
    
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
  }

    