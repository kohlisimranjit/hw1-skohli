

/* First created by JCasGen Wed Sep 11 21:14:49 EDT 2013 */
package edu.cmu.lti.csd.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


/** An encapsulation for a list of basicTokens.
 * Updated by JCasGen Wed Sep 11 21:15:32 EDT 2013
 * XML source: /home/richie/git/hw1-skohli/hw1-skohli/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class BasicTokenList extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(BasicTokenList.class);
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
  protected BasicTokenList() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public BasicTokenList(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public BasicTokenList(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public BasicTokenList(JCas jcas, int begin, int end) {
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
  //* Feature: basicTokens

  /** getter for basicTokens - gets A list of  basic tokens.
   * @generated */
  public FSList getBasicTokens() {
    if (BasicTokenList_Type.featOkTst && ((BasicTokenList_Type)jcasType).casFeat_basicTokens == null)
      jcasType.jcas.throwFeatMissing("basicTokens", "edu.cmu.lti.csd.types.BasicTokenList");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((BasicTokenList_Type)jcasType).casFeatCode_basicTokens)));}
    
  /** setter for basicTokens - sets A list of  basic tokens. 
   * @generated */
  public void setBasicTokens(FSList v) {
    if (BasicTokenList_Type.featOkTst && ((BasicTokenList_Type)jcasType).casFeat_basicTokens == null)
      jcasType.jcas.throwFeatMissing("basicTokens", "edu.cmu.lti.csd.types.BasicTokenList");
    jcasType.ll_cas.ll_setRefValue(addr, ((BasicTokenList_Type)jcasType).casFeatCode_basicTokens, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    