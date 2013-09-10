

/* First created by JCasGen Tue Sep 10 23:29:00 EDT 2013 */
package edu.cmu.lti.csd.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringList;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 10 23:29:00 EDT 2013
 * XML source: /home/richie/git/hw1-skohli/hw1-skohli/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class InputDocument extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(InputDocument.class);
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
  protected InputDocument() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public InputDocument(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public InputDocument(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public InputDocument(JCas jcas, int begin, int end) {
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
  //* Feature: lines

  /** getter for lines - gets 
   * @generated */
  public StringList getLines() {
    if (InputDocument_Type.featOkTst && ((InputDocument_Type)jcasType).casFeat_lines == null)
      jcasType.jcas.throwFeatMissing("lines", "edu.cmu.lti.csd.types.InputDocument");
    return (StringList)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((InputDocument_Type)jcasType).casFeatCode_lines)));}
    
  /** setter for lines - sets  
   * @generated */
  public void setLines(StringList v) {
    if (InputDocument_Type.featOkTst && ((InputDocument_Type)jcasType).casFeat_lines == null)
      jcasType.jcas.throwFeatMissing("lines", "edu.cmu.lti.csd.types.InputDocument");
    jcasType.ll_cas.ll_setRefValue(addr, ((InputDocument_Type)jcasType).casFeatCode_lines, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    