

/* First created by JCasGen Tue Sep 10 01:54:42 EDT 2013 */
package edu.cmu.lti.csd.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 10 01:55:38 EDT 2013
 * XML source: /home/richie/git/hw1-skohli/hw1-skohli/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class EvaluationReport extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(EvaluationReport.class);
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
  protected EvaluationReport() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public EvaluationReport(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public EvaluationReport(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public EvaluationReport(JCas jcas, int begin, int end) {
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
  //* Feature: sortedAnswerSpans

  /** getter for sortedAnswerSpans - gets 
   * @generated */
  public AnswerSpanList getSortedAnswerSpans() {
    if (EvaluationReport_Type.featOkTst && ((EvaluationReport_Type)jcasType).casFeat_sortedAnswerSpans == null)
      jcasType.jcas.throwFeatMissing("sortedAnswerSpans", "edu.cmu.lti.csd.types.EvaluationReport");
    return (AnswerSpanList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((EvaluationReport_Type)jcasType).casFeatCode_sortedAnswerSpans)));}
    
  /** setter for sortedAnswerSpans - sets  
   * @generated */
  public void setSortedAnswerSpans(AnswerSpanList v) {
    if (EvaluationReport_Type.featOkTst && ((EvaluationReport_Type)jcasType).casFeat_sortedAnswerSpans == null)
      jcasType.jcas.throwFeatMissing("sortedAnswerSpans", "edu.cmu.lti.csd.types.EvaluationReport");
    jcasType.ll_cas.ll_setRefValue(addr, ((EvaluationReport_Type)jcasType).casFeatCode_sortedAnswerSpans, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    