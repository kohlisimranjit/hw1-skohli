

/* First created by JCasGen Wed Sep 11 21:14:49 EDT 2013 */
package edu.cmu.lti.csd.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** the NGramTokenAnnotation extends the functionality from BasicToken and leverages it providing additional data required to be associated with a token.
 * Updated by JCasGen Wed Sep 11 21:15:32 EDT 2013
 * XML source: /home/richie/git/hw1-skohli/hw1-skohli/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class NGramTokenAnnotation extends BasicTokenAnnotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(NGramTokenAnnotation.class);
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
  protected NGramTokenAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public NGramTokenAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public NGramTokenAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: partOfSpeech

  /** getter for partOfSpeech - gets the part of speech which the token belongs to eg. noun, adjective,noun phrase.
   * @generated */
  public String getPartOfSpeech() {
    if (NGramTokenAnnotation_Type.featOkTst && ((NGramTokenAnnotation_Type)jcasType).casFeat_partOfSpeech == null)
      jcasType.jcas.throwFeatMissing("partOfSpeech", "edu.cmu.lti.csd.types.NGramTokenAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((NGramTokenAnnotation_Type)jcasType).casFeatCode_partOfSpeech);}
    
  /** setter for partOfSpeech - sets the part of speech which the token belongs to eg. noun, adjective,noun phrase. 
   * @generated */
  public void setPartOfSpeech(String v) {
    if (NGramTokenAnnotation_Type.featOkTst && ((NGramTokenAnnotation_Type)jcasType).casFeat_partOfSpeech == null)
      jcasType.jcas.throwFeatMissing("partOfSpeech", "edu.cmu.lti.csd.types.NGramTokenAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((NGramTokenAnnotation_Type)jcasType).casFeatCode_partOfSpeech, v);}    
   
    
  //*--------------*
  //* Feature: confidenceScore

  /** getter for confidenceScore - gets the confidenece score associated with the token
   * @generated */
  public double getConfidenceScore() {
    if (NGramTokenAnnotation_Type.featOkTst && ((NGramTokenAnnotation_Type)jcasType).casFeat_confidenceScore == null)
      jcasType.jcas.throwFeatMissing("confidenceScore", "edu.cmu.lti.csd.types.NGramTokenAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((NGramTokenAnnotation_Type)jcasType).casFeatCode_confidenceScore);}
    
  /** setter for confidenceScore - sets the confidenece score associated with the token 
   * @generated */
  public void setConfidenceScore(double v) {
    if (NGramTokenAnnotation_Type.featOkTst && ((NGramTokenAnnotation_Type)jcasType).casFeat_confidenceScore == null)
      jcasType.jcas.throwFeatMissing("confidenceScore", "edu.cmu.lti.csd.types.NGramTokenAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((NGramTokenAnnotation_Type)jcasType).casFeatCode_confidenceScore, v);}    
  }

    