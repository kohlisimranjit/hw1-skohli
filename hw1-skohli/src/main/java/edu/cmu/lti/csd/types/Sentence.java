

/* First created by JCasGen Tue Sep 10 17:10:41 EDT 2013 */
package edu.cmu.lti.csd.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 11 01:21:59 EDT 2013
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
  //* Feature: range

  /** getter for range - gets 
   * @generated */
  public Range getRange() {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_range == null)
      jcasType.jcas.throwFeatMissing("range", "edu.cmu.lti.csd.types.Sentence");
    return (Range)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_range)));}
    
  /** setter for range - sets  
   * @generated */
  public void setRange(Range v) {
    if (Sentence_Type.featOkTst && ((Sentence_Type)jcasType).casFeat_range == null)
      jcasType.jcas.throwFeatMissing("range", "edu.cmu.lti.csd.types.Sentence");
    jcasType.ll_cas.ll_setRefValue(addr, ((Sentence_Type)jcasType).casFeatCode_range, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    