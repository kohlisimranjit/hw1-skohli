
/* First created by JCasGen Wed Sep 11 21:14:49 EDT 2013 */
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
 * Updated by JCasGen Wed Sep 11 21:15:32 EDT 2013
 * @generated */
public class UIMACASAnnotatedDocument_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (UIMACASAnnotatedDocument_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = UIMACASAnnotatedDocument_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new UIMACASAnnotatedDocument(addr, UIMACASAnnotatedDocument_Type.this);
  			   UIMACASAnnotatedDocument_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new UIMACASAnnotatedDocument(addr, UIMACASAnnotatedDocument_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = UIMACASAnnotatedDocument.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.csd.types.UIMACASAnnotatedDocument");
 
  /** @generated */
  final Feature casFeat_questionSpan;
  /** @generated */
  final int     casFeatCode_questionSpan;
  /** @generated */ 
  public int getQuestionSpan(int addr) {
        if (featOkTst && casFeat_questionSpan == null)
      jcas.throwFeatMissing("questionSpan", "edu.cmu.lti.csd.types.UIMACASAnnotatedDocument");
    return ll_cas.ll_getRefValue(addr, casFeatCode_questionSpan);
  }
  /** @generated */    
  public void setQuestionSpan(int addr, int v) {
        if (featOkTst && casFeat_questionSpan == null)
      jcas.throwFeatMissing("questionSpan", "edu.cmu.lti.csd.types.UIMACASAnnotatedDocument");
    ll_cas.ll_setRefValue(addr, casFeatCode_questionSpan, v);}
    
  
 
  /** @generated */
  final Feature casFeat_answerSpanList;
  /** @generated */
  final int     casFeatCode_answerSpanList;
  /** @generated */ 
  public int getAnswerSpanList(int addr) {
        if (featOkTst && casFeat_answerSpanList == null)
      jcas.throwFeatMissing("answerSpanList", "edu.cmu.lti.csd.types.UIMACASAnnotatedDocument");
    return ll_cas.ll_getRefValue(addr, casFeatCode_answerSpanList);
  }
  /** @generated */    
  public void setAnswerSpanList(int addr, int v) {
        if (featOkTst && casFeat_answerSpanList == null)
      jcas.throwFeatMissing("answerSpanList", "edu.cmu.lti.csd.types.UIMACASAnnotatedDocument");
    ll_cas.ll_setRefValue(addr, casFeatCode_answerSpanList, v);}
    
  
 
  /** @generated */
  final Feature casFeat_producer;
  /** @generated */
  final int     casFeatCode_producer;
  /** @generated */ 
  public String getProducer(int addr) {
        if (featOkTst && casFeat_producer == null)
      jcas.throwFeatMissing("producer", "edu.cmu.lti.csd.types.UIMACASAnnotatedDocument");
    return ll_cas.ll_getStringValue(addr, casFeatCode_producer);
  }
  /** @generated */    
  public void setProducer(int addr, String v) {
        if (featOkTst && casFeat_producer == null)
      jcas.throwFeatMissing("producer", "edu.cmu.lti.csd.types.UIMACASAnnotatedDocument");
    ll_cas.ll_setStringValue(addr, casFeatCode_producer, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public UIMACASAnnotatedDocument_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_questionSpan = jcas.getRequiredFeatureDE(casType, "questionSpan", "edu.cmu.lti.csd.types.Question", featOkTst);
    casFeatCode_questionSpan  = (null == casFeat_questionSpan) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_questionSpan).getCode();

 
    casFeat_answerSpanList = jcas.getRequiredFeatureDE(casType, "answerSpanList", "edu.cmu.lti.csd.types.AnswerList", featOkTst);
    casFeatCode_answerSpanList  = (null == casFeat_answerSpanList) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_answerSpanList).getCode();

 
    casFeat_producer = jcas.getRequiredFeatureDE(casType, "producer", "uima.cas.String", featOkTst);
    casFeatCode_producer  = (null == casFeat_producer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_producer).getCode();

  }
}



    