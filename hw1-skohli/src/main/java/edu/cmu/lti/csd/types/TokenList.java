

/* First created by JCasGen Tue Sep 10 17:10:41 EDT 2013 */
package edu.cmu.lti.csd.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSList;
import org.apache.uima.jcas.tcas.Annotation;


//import uima.cas.ListBase;


/** 
 * Updated by JCasGen Tue Sep 10 22:24:31 EDT 2013
 * XML source: /home/richie/git/hw1-skohli/hw1-skohli/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class TokenList extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TokenList.class);
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
  protected TokenList() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TokenList(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TokenList(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TokenList(JCas jcas, int begin, int end) {
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
  //* Feature: tokens

  /** getter for tokens - gets 
   * @generated */
  public FSList getTokens() {
    if (TokenList_Type.featOkTst && ((TokenList_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.lti.csd.types.TokenList");
    return (FSList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TokenList_Type)jcasType).casFeatCode_tokens)));}
    
  /** setter for tokens - sets  
   * @generated */
  public void setTokens(FSList v) {
    if (TokenList_Type.featOkTst && ((TokenList_Type)jcasType).casFeat_tokens == null)
      jcasType.jcas.throwFeatMissing("tokens", "edu.cmu.lti.csd.types.TokenList");
    jcasType.ll_cas.ll_setRefValue(addr, ((TokenList_Type)jcasType).casFeatCode_tokens, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    