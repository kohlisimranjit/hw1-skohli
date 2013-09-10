

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
public class Range extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Range.class);
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
  protected Range() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Range(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Range(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Range(JCas jcas, int begin, int end) {
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
    if (Range_Type.featOkTst && ((Range_Type)jcasType).casFeat_start == null)
      jcasType.jcas.throwFeatMissing("start", "edu.cmu.lti.csd.types.Range");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Range_Type)jcasType).casFeatCode_start);}
    
  /** setter for start - sets  
   * @generated */
  public void setStart(int v) {
    if (Range_Type.featOkTst && ((Range_Type)jcasType).casFeat_start == null)
      jcasType.jcas.throwFeatMissing("start", "edu.cmu.lti.csd.types.Range");
    jcasType.ll_cas.ll_setIntValue(addr, ((Range_Type)jcasType).casFeatCode_start, v);}    
   
    
  //*--------------*
  //* Feature: end

  /** getter for end - gets 
   * @generated */
  public int getEnd() {
    if (Range_Type.featOkTst && ((Range_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "edu.cmu.lti.csd.types.Range");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Range_Type)jcasType).casFeatCode_end);}
    
  /** setter for end - sets  
   * @generated */
  public void setEnd(int v) {
    if (Range_Type.featOkTst && ((Range_Type)jcasType).casFeat_end == null)
      jcasType.jcas.throwFeatMissing("end", "edu.cmu.lti.csd.types.Range");
    jcasType.ll_cas.ll_setIntValue(addr, ((Range_Type)jcasType).casFeatCode_end, v);}    
  }

    