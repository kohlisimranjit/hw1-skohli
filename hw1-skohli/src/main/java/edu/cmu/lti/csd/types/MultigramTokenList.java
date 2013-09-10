

/* First created by JCasGen Tue Sep 10 23:03:46 EDT 2013 */
package edu.cmu.lti.csd.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 10 23:40:33 EDT 2013
 * XML source: /home/richie/git/hw1-skohli/hw1-skohli/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class MultigramTokenList extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(MultigramTokenList.class);
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
  protected MultigramTokenList() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public MultigramTokenList(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public MultigramTokenList(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public MultigramTokenList(JCas jcas, int begin, int end) {
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
  //* Feature: multigramTokens

  /** getter for multigramTokens - gets 
   * @generated */
  public FSArray getMultigramTokens() {
    if (MultigramTokenList_Type.featOkTst && ((MultigramTokenList_Type)jcasType).casFeat_multigramTokens == null)
      jcasType.jcas.throwFeatMissing("multigramTokens", "edu.cmu.lti.csd.types.MultigramTokenList");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((MultigramTokenList_Type)jcasType).casFeatCode_multigramTokens)));}
    
  /** setter for multigramTokens - sets  
   * @generated */
  public void setMultigramTokens(FSArray v) {
    if (MultigramTokenList_Type.featOkTst && ((MultigramTokenList_Type)jcasType).casFeat_multigramTokens == null)
      jcasType.jcas.throwFeatMissing("multigramTokens", "edu.cmu.lti.csd.types.MultigramTokenList");
    jcasType.ll_cas.ll_setRefValue(addr, ((MultigramTokenList_Type)jcasType).casFeatCode_multigramTokens, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for multigramTokens - gets an indexed value - 
   * @generated */
  public MultigramToken getMultigramTokens(int i) {
    if (MultigramTokenList_Type.featOkTst && ((MultigramTokenList_Type)jcasType).casFeat_multigramTokens == null)
      jcasType.jcas.throwFeatMissing("multigramTokens", "edu.cmu.lti.csd.types.MultigramTokenList");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((MultigramTokenList_Type)jcasType).casFeatCode_multigramTokens), i);
    return (MultigramToken)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((MultigramTokenList_Type)jcasType).casFeatCode_multigramTokens), i)));}

  /** indexed setter for multigramTokens - sets an indexed value - 
   * @generated */
  public void setMultigramTokens(int i, MultigramToken v) { 
    if (MultigramTokenList_Type.featOkTst && ((MultigramTokenList_Type)jcasType).casFeat_multigramTokens == null)
      jcasType.jcas.throwFeatMissing("multigramTokens", "edu.cmu.lti.csd.types.MultigramTokenList");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((MultigramTokenList_Type)jcasType).casFeatCode_multigramTokens), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((MultigramTokenList_Type)jcasType).casFeatCode_multigramTokens), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: nGram

  /** getter for nGram - gets 
   * @generated */
  public int getNGram() {
    if (MultigramTokenList_Type.featOkTst && ((MultigramTokenList_Type)jcasType).casFeat_nGram == null)
      jcasType.jcas.throwFeatMissing("nGram", "edu.cmu.lti.csd.types.MultigramTokenList");
    return jcasType.ll_cas.ll_getIntValue(addr, ((MultigramTokenList_Type)jcasType).casFeatCode_nGram);}
    
  /** setter for nGram - sets  
   * @generated */
  public void setNGram(int v) {
    if (MultigramTokenList_Type.featOkTst && ((MultigramTokenList_Type)jcasType).casFeat_nGram == null)
      jcasType.jcas.throwFeatMissing("nGram", "edu.cmu.lti.csd.types.MultigramTokenList");
    jcasType.ll_cas.ll_setIntValue(addr, ((MultigramTokenList_Type)jcasType).casFeatCode_nGram, v);}    
  }

    