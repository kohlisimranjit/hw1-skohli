

/* First created by JCasGen Tue Sep 10 22:31:16 EDT 2013 */
package edu.cmu.lti.csd.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 10 23:40:33 EDT 2013
 * XML source: /home/richie/git/hw1-skohli/hw1-skohli/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class UnigramTokenList extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(UnigramTokenList.class);
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
  protected UnigramTokenList() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public UnigramTokenList(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public UnigramTokenList(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public UnigramTokenList(JCas jcas, int begin, int end) {
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
  //* Feature: unigramTokens

  /** getter for unigramTokens - gets 
   * @generated */
  public FSList getUnigramTokens() {
    if (UnigramTokenList_Type.featOkTst && ((UnigramTokenList_Type)jcasType).casFeat_unigramTokens == null)
      jcasType.jcas.throwFeatMissing("unigramTokens", "edu.cmu.lti.csd.types.UnigramTokenList");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((UnigramTokenList_Type)jcasType).casFeatCode_unigramTokens)));}
    
  /** setter for unigramTokens - sets  
   * @generated */
  public void setUnigramTokens(FSList v) {
    if (UnigramTokenList_Type.featOkTst && ((UnigramTokenList_Type)jcasType).casFeat_unigramTokens == null)
      jcasType.jcas.throwFeatMissing("unigramTokens", "edu.cmu.lti.csd.types.UnigramTokenList");
    jcasType.ll_cas.ll_setRefValue(addr, ((UnigramTokenList_Type)jcasType).casFeatCode_unigramTokens, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    