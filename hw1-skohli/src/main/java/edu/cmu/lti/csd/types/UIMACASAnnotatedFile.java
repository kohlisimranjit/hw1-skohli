

/* First created by JCasGen Tue Sep 10 02:07:48 EDT 2013 */
package edu.cmu.lti.csd.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 10 02:10:13 EDT 2013
 * XML source: /home/richie/git/hw1-skohli/hw1-skohli/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class UIMACASAnnotatedFile extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(UIMACASAnnotatedFile.class);
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
  protected UIMACASAnnotatedFile() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public UIMACASAnnotatedFile(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public UIMACASAnnotatedFile(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public UIMACASAnnotatedFile(JCas jcas, int begin, int end) {
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

  /** getter for questionSpan - gets 
   * @generated */
  public Annotation getQuestionSpan() {
    if (UIMACASAnnotatedFile_Type.featOkTst && ((UIMACASAnnotatedFile_Type)jcasType).casFeat_questionSpan == null)
      jcasType.jcas.throwFeatMissing("questionSpan", "edu.cmu.lti.csd.types.UIMACASAnnotatedFile");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((UIMACASAnnotatedFile_Type)jcasType).casFeatCode_questionSpan)));}
    
  /** setter for questionSpan - sets  
   * @generated */
  public void setQuestionSpan(Annotation v) {
    if (UIMACASAnnotatedFile_Type.featOkTst && ((UIMACASAnnotatedFile_Type)jcasType).casFeat_questionSpan == null)
      jcasType.jcas.throwFeatMissing("questionSpan", "edu.cmu.lti.csd.types.UIMACASAnnotatedFile");
    jcasType.ll_cas.ll_setRefValue(addr, ((UIMACASAnnotatedFile_Type)jcasType).casFeatCode_questionSpan, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: answerSpanList

  /** getter for answerSpanList - gets 
   * @generated */
  public AnswerList getAnswerSpanList() {
    if (UIMACASAnnotatedFile_Type.featOkTst && ((UIMACASAnnotatedFile_Type)jcasType).casFeat_answerSpanList == null)
      jcasType.jcas.throwFeatMissing("answerSpanList", "edu.cmu.lti.csd.types.UIMACASAnnotatedFile");
    return (AnswerList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((UIMACASAnnotatedFile_Type)jcasType).casFeatCode_answerSpanList)));}
    
  /** setter for answerSpanList - sets  
   * @generated */
  public void setAnswerSpanList(AnswerList v) {
    if (UIMACASAnnotatedFile_Type.featOkTst && ((UIMACASAnnotatedFile_Type)jcasType).casFeat_answerSpanList == null)
      jcasType.jcas.throwFeatMissing("answerSpanList", "edu.cmu.lti.csd.types.UIMACASAnnotatedFile");
    jcasType.ll_cas.ll_setRefValue(addr, ((UIMACASAnnotatedFile_Type)jcasType).casFeatCode_answerSpanList, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: producer

  /** getter for producer - gets 
   * @generated */
  public String getProducer() {
    if (UIMACASAnnotatedFile_Type.featOkTst && ((UIMACASAnnotatedFile_Type)jcasType).casFeat_producer == null)
      jcasType.jcas.throwFeatMissing("producer", "edu.cmu.lti.csd.types.UIMACASAnnotatedFile");
    return jcasType.ll_cas.ll_getStringValue(addr, ((UIMACASAnnotatedFile_Type)jcasType).casFeatCode_producer);}
    
  /** setter for producer - sets  
   * @generated */
  public void setProducer(String v) {
    if (UIMACASAnnotatedFile_Type.featOkTst && ((UIMACASAnnotatedFile_Type)jcasType).casFeat_producer == null)
      jcasType.jcas.throwFeatMissing("producer", "edu.cmu.lti.csd.types.UIMACASAnnotatedFile");
    jcasType.ll_cas.ll_setStringValue(addr, ((UIMACASAnnotatedFile_Type)jcasType).casFeatCode_producer, v);}    
  }

    