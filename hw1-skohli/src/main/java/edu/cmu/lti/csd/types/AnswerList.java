

/* First created by JCasGen Wed Sep 11 21:14:49 EDT 2013 */
package edu.cmu.lti.csd.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


/** An encapsulation for list of  answers

 * Updated by JCasGen Wed Sep 11 21:15:32 EDT 2013
 * XML source: /home/richie/git/hw1-skohli/hw1-skohli/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class AnswerList extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnswerList.class);
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
  protected AnswerList() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnswerList(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnswerList(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AnswerList(JCas jcas, int begin, int end) {
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

  /** getter for answers - gets A list of type Answers.
   * @generated */
  public FSList getAnswers() {
    if (AnswerList_Type.featOkTst && ((AnswerList_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "edu.cmu.lti.csd.types.AnswerList");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnswerList_Type)jcasType).casFeatCode_answers)));}
    
  /** setter for answers - sets A list of type Answers. 
   * @generated */
  public void setAnswers(FSList v) {
    if (AnswerList_Type.featOkTst && ((AnswerList_Type)jcasType).casFeat_answers == null)
      jcasType.jcas.throwFeatMissing("answers", "edu.cmu.lti.csd.types.AnswerList");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnswerList_Type)jcasType).casFeatCode_answers, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    