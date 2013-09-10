
/* First created by JCasGen Tue Sep 10 23:35:41 EDT 2013 */
package edu.cmu.lti.csd.types;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Sep 10 23:37:10 EDT 2013
 * @generated */
public class UIMACASFile_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (UIMACASFile_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = UIMACASFile_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new UIMACASFile(addr, UIMACASFile_Type.this);
  			   UIMACASFile_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new UIMACASFile(addr, UIMACASFile_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = UIMACASFile.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.csd.types.UIMACASFile");



  /** @generated */
  final Feature casFeat_questionSpan;
  /** @generated */
  final int     casFeatCode_questionSpan;
  /** @generated */ 
  public int getQuestionSpan(int addr) {
        if (featOkTst && casFeat_questionSpan == null)
      jcas.throwFeatMissing("questionSpan", "edu.cmu.lti.csd.types.UIMACASFile");
    return ll_cas.ll_getRefValue(addr, casFeatCode_questionSpan);
  }
  /** @generated */    
  public void setQuestionSpan(int addr, int v) {
        if (featOkTst && casFeat_questionSpan == null)
      jcas.throwFeatMissing("questionSpan", "edu.cmu.lti.csd.types.UIMACASFile");
    ll_cas.ll_setRefValue(addr, casFeatCode_questionSpan, v);}
    
  
 
  /** @generated */
  final Feature casFeat_answerSpanList;
  /** @generated */
  final int     casFeatCode_answerSpanList;
  /** @generated */ 
  public int getAnswerSpanList(int addr) {
        if (featOkTst && casFeat_answerSpanList == null)
      jcas.throwFeatMissing("answerSpanList", "edu.cmu.lti.csd.types.UIMACASFile");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answerSpanList);
  }
  /** @generated */    
  public void setAnswerSpanList(int addr, int v) {
        if (featOkTst && casFeat_answerSpanList == null)
      jcas.throwFeatMissing("answerSpanList", "edu.cmu.lti.csd.types.UIMACASFile");
    ll_cas.ll_setRefValue(addr, casFeatCode_answerSpanList, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public UIMACASFile_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_questionSpan = jcas.getRequiredFeatureDE(casType, "questionSpan", "uima.tcas.Annotation", featOkTst);
    casFeatCode_questionSpan  = (null == casFeat_questionSpan) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_questionSpan).getCode();

 
    casFeat_answerSpanList = jcas.getRequiredFeatureDE(casType, "answerSpanList", "uima.cas.ListBase", featOkTst);
    casFeatCode_answerSpanList  = (null == casFeat_answerSpanList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerSpanList).getCode();

  }
}



    