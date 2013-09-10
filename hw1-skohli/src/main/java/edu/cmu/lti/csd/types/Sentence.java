

/* First created by JCasGen Tue Sep 10 17:10:41 EDT 2013 */
package edu.cmu.lti.csd.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 10 17:14:28 EDT 2013
 * XML source: /home/richie/git/hw1-skohli/hw1-skohli/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class Sentence extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Sentence.class);
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
  protected Sentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Sentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Sentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Sentence(JCas jcas, int begin, int end) {
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
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_start == null)
      jcasType.jcas.throwFeatMissing("start", "edu.cmu.lti.csd.types.Sentence");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Sentence_Type)jcasType).casFeatCode_start);}
    
  /** setter for start - sets  
   * @generated */
  public void setStart(int v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_start == null)
      jcasType.jcas.throwFeatMissing("start", "edu.cmu.lti.csd.types.Sentence");
    jcasType.ll_cas.ll_setIntValue(addr, ((Sentence_Type)jcasType).casFeatCode_start, v);}    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets 
   * @generated */
  public int getEnd() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "edu.cmu.lti.csd.types.Sentence");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Sentence_Type)jcasType).casFeatCode_end);}
    
  /** setter for end - sets  
   * @generated */
  public void setEnd(int v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "edu.cmu.lti.csd.types.Sentence");
    jcasType.ll_cas.ll_setIntValue(addr, ((Sentence_Type)jcasType).casFeatCode_end, v);}    
   
    
  //*--------------*
  //* Feature: tokens

  /** getter for tokens - gets 
   * @generated */
  public TokenList getTokens() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.lti.csd.types.Sentence");
    return (TokenList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokens)));}
    
  /** setter for tokens - sets  
   * @generated */
  public void setTokens(TokenList v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.lti.csd.types.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_tokens, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    