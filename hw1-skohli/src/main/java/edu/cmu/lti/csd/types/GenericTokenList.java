

/* First created by JCasGen Tue Sep 10 02:07:48 EDT 2013 */
package edu.cmu.lti.csd.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 10 02:10:13 EDT 2013
 * XML source: /home/richie/git/hw1-skohli/hw1-skohli/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class GenericTokenList extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GenericTokenList.class);
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
  protected GenericTokenList() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public GenericTokenList(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public GenericTokenList(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public GenericTokenList(JCas jcas, int begin, int end) {
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
  //* Feature: genericTokens

  /** getter for genericTokens - gets 
   * @generated */
  public FSList getGenericTokens() {
    if (GenericTokenList_Type.featOkTst && ((GenericTokenList_Type)jcasType).casFeat_genericTokens == null)
      jcasType.jcas.throwFeatMissing("genericTokens", "edu.cmu.lti.csd.types.GenericTokenList");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((GenericTokenList_Type)jcasType).casFeatCode_genericTokens)));}
    
  /** setter for genericTokens - sets  
   * @generated */
  public void setGenericTokens(FSList v) {
    if (GenericTokenList_Type.featOkTst && ((GenericTokenList_Type)jcasType).casFeat_genericTokens == null)
      jcasType.jcas.throwFeatMissing("genericTokens", "edu.cmu.lti.csd.types.GenericTokenList");
    jcasType.ll_cas.ll_setRefValue(addr, ((GenericTokenList_Type)jcasType).casFeatCode_genericTokens, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    