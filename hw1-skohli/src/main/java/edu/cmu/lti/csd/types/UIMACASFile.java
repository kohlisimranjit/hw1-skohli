

/* First created by JCasGen Tue Sep 10 23:35:41 EDT 2013 */
package edu.cmu.lti.csd.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


import uima.cas.ListBase;


/** 
 * Updated by JCasGen Tue Sep 10 23:37:10 EDT 2013
 * XML source: /home/richie/git/hw1-skohli/hw1-skohli/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class UIMACASFile extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(UIMACASFile.class);
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
  protected UIMACASFile() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public UIMACASFile(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public UIMACASFile(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public UIMACASFile(JCas jcas, int begin, int end) {
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
    if (UIMACASFile_Type.featOkTst && ((UIMACASFile_Type)jcasType).casFeat_questionSpan == null)
      jcasType.jcas.throwFeatMissing("questionSpan", "edu.cmu.lti.csd.types.UIMACASFile");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((UIMACASFile_Type)jcasType).casFeatCode_questionSpan)));}
    
  /** setter for questionSpan - sets  
   * @generated */
  public void setQuestionSpan(Annotation v) {
    if (UIMACASFile_Type.featOkTst && ((UIMACASFile_Type)jcasType).casFeat_questionSpan == null)
      jcasType.jcas.throwFeatMissing("questionSpan", "edu.cmu.lti.csd.types.UIMACASFile");
    jcasType.ll_cas.ll_setRefValue(addr, ((UIMACASFile_Type)jcasType).casFeatCode_questionSpan, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  //*--------------*
  //* Feature: answerSpanList

  /** getter for answerSpanList - gets 
   * @generated */
  public ListBase getAnswerSpanList() {
    if (UIMACASFile_Type.featOkTst && ((UIMACASFile_Type)jcasType).casFeat_answerSpanList == null)
      jcasType.jcas.throwFeatMissing("answerSpanList", "edu.cmu.lti.csd.types.UIMACASFile");
    return (ListBase)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((UIMACASFile_Type)jcasType).casFeatCode_answerSpanList)));}
    
  /** setter for answerSpanList - sets  
   * @generated */
  public void setAnswerSpanList(ListBase v) {
    if (UIMACASFile_Type.featOkTst && ((UIMACASFile_Type)jcasType).casFeat_answerSpanList == null)
      jcasType.jcas.throwFeatMissing("answerSpanList", "edu.cmu.lti.csd.types.UIMACASFile");
    jcasType.ll_cas.ll_setRefValue(addr, ((UIMACASFile_Type)jcasType).casFeatCode_answerSpanList, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    