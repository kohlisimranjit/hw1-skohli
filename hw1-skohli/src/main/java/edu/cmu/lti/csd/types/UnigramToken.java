

/* First created by JCasGen Tue Sep 10 17:52:38 EDT 2013 */
package edu.cmu.lti.csd.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Wed Sep 11 00:57:40 EDT 2013
 * XML source: /home/richie/git/hw1-skohli/hw1-skohli/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class UnigramToken extends NGramToken {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(UnigramToken.class);
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
  protected UnigramToken() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public UnigramToken(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public UnigramToken(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public UnigramToken(JCas jcas, int begin, int end) {
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
    if (UnigramToken_Type.featOkTst && ((UnigramToken_Type)jcasType).casFeat_word == null)
      jcasType.jcas.throwFeatMissing("word", "edu.cmu.lti.csd.types.UnigramToken");
    return jcasType.ll_cas.ll_getStringValue(addr, ((UnigramToken_Type)jcasType).casFeatCode_word);}
    
  /** setter for word - sets  
   * @generated */
  public void setWord(String v) {
    if (UnigramToken_Type.featOkTst && ((UnigramToken_Type)jcasType).casFeat_word == null)
      jcasType.jcas.throwFeatMissing("word", "edu.cmu.lti.csd.types.UnigramToken");
    jcasType.ll_cas.ll_setStringValue(addr, ((UnigramToken_Type)jcasType).casFeatCode_word, v);}    
   
    
  //*--------------*
  //* Feature: partOfSpeech

  /** getter for partOfSpeech - gets 
   * @generated */
  public String getPartOfSpeech() {
    if (UnigramToken_Type.featOkTst && ((UnigramToken_Type)jcasType).casFeat_partOfSpeech == null)
      jcasType.jcas.throwFeatMissing("partOfSpeech", "edu.cmu.lti.csd.types.UnigramToken");
    return jcasType.ll_cas.ll_getStringValue(addr, ((UnigramToken_Type)jcasType).casFeatCode_partOfSpeech);}
    
  /** setter for partOfSpeech - sets  
   * @generated */
  public void setPartOfSpeech(String v) {
    if (UnigramToken_Type.featOkTst && ((UnigramToken_Type)jcasType).casFeat_partOfSpeech == null)
      jcasType.jcas.throwFeatMissing("partOfSpeech", "edu.cmu.lti.csd.types.UnigramToken");
    jcasType.ll_cas.ll_setStringValue(addr, ((UnigramToken_Type)jcasType).casFeatCode_partOfSpeech, v);}    
  }

    