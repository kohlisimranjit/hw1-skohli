

/* First created by JCasGen Wed Sep 11 21:14:49 EDT 2013 */
package edu.cmu.lti.csd.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 11 21:15:32 EDT 2013
 * XML source: /home/richie/git/hw1-skohli/hw1-skohli/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class UIMACASAnnotatedDocument extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(UIMACASAnnotatedDocument.class);
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
  protected UIMACASAnnotatedDocument() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public UIMACASAnnotatedDocument(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public UIMACASAnnotatedDocument(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public UIMACASAnnotatedDocument(JCas jcas, int begin, int end) {
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
  //* Feature: questionSpan

  /** getter for questionSpan - gets the question of the document
   * @generated */
  public Question getQuestionSpan() {
    if (UIMACASAnnotatedDocument_Type.featOkTst && ((UIMACASAnnotatedDocument_Type)jcasType).casFeat_questionSpan == null)
      jcasType.jcas.throwFeatMissing("questionSpan", "edu.cmu.lti.csd.types.UIMACASAnnotatedDocument");
    return (Question)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((UIMACASAnnotatedDocument_Type)jcasType).casFeatCode_questionSpan)));}
    
  /** setter for questionSpan - sets the question of the document 
   * @generated */
  public void setQuestionSpan(Question v) {
    if (UIMACASAnnotatedDocument_Type.featOkTst && ((UIMACASAnnotatedDocument_Type)jcasType).casFeat_questionSpan == null)
      jcasType.jcas.throwFeatMissing("questionSpan", "edu.cmu.lti.csd.types.UIMACASAnnotatedDocument");
    jcasType.ll_cas.ll_setRefValue(addr, ((UIMACASAnnotatedDocument_Type)jcasType).casFeatCode_questionSpan, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: answerSpanList

  /** getter for answerSpanList - gets A list of all the basic annotated answers
   * @generated */
  public AnswerList getAnswerSpanList() {
    if (UIMACASAnnotatedDocument_Type.featOkTst && ((UIMACASAnnotatedDocument_Type)jcasType).casFeat_answerSpanList == null)
      jcasType.jcas.throwFeatMissing("answerSpanList", "edu.cmu.lti.csd.types.UIMACASAnnotatedDocument");
    return (AnswerList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((UIMACASAnnotatedDocument_Type)jcasType).casFeatCode_answerSpanList)));}
    
  /** setter for answerSpanList - sets A list of all the basic annotated answers 
   * @generated */
  public void setAnswerSpanList(AnswerList v) {
    if (UIMACASAnnotatedDocument_Type.featOkTst && ((UIMACASAnnotatedDocument_Type)jcasType).casFeat_answerSpanList == null)
      jcasType.jcas.throwFeatMissing("answerSpanList", "edu.cmu.lti.csd.types.UIMACASAnnotatedDocument");
    jcasType.ll_cas.ll_setRefValue(addr, ((UIMACASAnnotatedDocument_Type)jcasType).casFeatCode_answerSpanList, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: producer

  /** getter for producer - gets the component which produced this type
   * @generated */
  public String getProducer() {
    if (UIMACASAnnotatedDocument_Type.featOkTst && ((UIMACASAnnotatedDocument_Type)jcasType).casFeat_producer == null)
      jcasType.jcas.throwFeatMissing("producer", "edu.cmu.lti.csd.types.UIMACASAnnotatedDocument");
    return jcasType.ll_cas.ll_getStringValue(addr, ((UIMACASAnnotatedDocument_Type)jcasType).casFeatCode_producer);}
    
  /** setter for producer - sets the component which produced this type 
   * @generated */
  public void setProducer(String v) {
    if (UIMACASAnnotatedDocument_Type.featOkTst && ((UIMACASAnnotatedDocument_Type)jcasType).casFeat_producer == null)
      jcasType.jcas.throwFeatMissing("producer", "edu.cmu.lti.csd.types.UIMACASAnnotatedDocument");
    jcasType.ll_cas.ll_setStringValue(addr, ((UIMACASAnnotatedDocument_Type)jcasType).casFeatCode_producer, v);}    
  }

    