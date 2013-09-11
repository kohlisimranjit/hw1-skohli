

/* First created by JCasGen Tue Sep 10 02:07:48 EDT 2013 */
package edu.cmu.lti.csd.types;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.StringList;
import org.apache.uima.jcas.tcas.Annotation;


/** Encapsulation for a basic document Test Element documentation


 * Updated by JCasGen Wed Sep 11 14:10:23 EDT 2013
 * XML source: /home/richie/git/hw1-skohli/hw1-skohli/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class TestElement extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TestElement.class);
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
  protected TestElement() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TestElement(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TestElement(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TestElement(JCas jcas, int begin, int end) {
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

  /** getter for lines - gets a string containing all the lines in the document
   * @generated */
  public String getLines() {
    if (TestElement_Type.featOkTst && ((TestElement_Type)jcasType).casFeat_lines == null)
      jcasType.jcas.throwFeatMissing("lines", "edu.cmu.lti.csd.types.TestElement");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TestElement_Type)jcasType).casFeatCode_lines);}
    
  /** setter for lines - sets a string containing all the lines in the document 
   * @generated */
  public void setLines(String v) {
    if (TestElement_Type.featOkTst && ((TestElement_Type)jcasType).casFeat_lines == null)
      jcasType.jcas.throwFeatMissing("lines", "edu.cmu.lti.csd.types.TestElement");
    jcasType.ll_cas.ll_setStringValue(addr, ((TestElement_Type)jcasType).casFeatCode_lines, v);}    
  }

    