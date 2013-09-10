

/* First created by JCasGen Tue Sep 10 01:54:42 EDT 2013 */
package edu.cmu.lti.csd.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 10 01:55:38 EDT 2013
 * XML source: /home/richie/git/hw1-skohli/hw1-skohli/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class AnswerSpanList extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerSpanList.class);
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
  protected AnswerSpanList() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnswerSpanList(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnswerSpanList(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AnswerSpanList(JCas jcas, int begin, int end) {
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
  //* Feature: answers

  /** getter for answers - gets 
   * @generated */
  public FSList getAnswers() {
    if (AnswerSpanList_Type.featOkTst && ((AnswerSpanList_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "edu.cmu.lti.csd.types.AnswerSpanList");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerSpanList_Type)jcasType).casFeatCode_answers)));}
    
  /** setter for answers - sets  
   * @generated */
  public void setAnswers(FSList v) {
    if (AnswerSpanList_Type.featOkTst && ((AnswerSpanList_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "edu.cmu.lti.csd.types.AnswerSpanList");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerSpanList_Type)jcasType).casFeatCode_answers, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    