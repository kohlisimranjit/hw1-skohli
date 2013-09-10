
/* First created by JCasGen Tue Sep 10 01:54:42 EDT 2013 */
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
 * Updated by JCasGen Tue Sep 10 01:55:38 EDT 2013
 * @generated */
public class EvaluationReport_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (EvaluationReport_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = EvaluationReport_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new EvaluationReport(addr, EvaluationReport_Type.this);
  			   EvaluationReport_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new EvaluationReport(addr, EvaluationReport_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = EvaluationReport.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.csd.types.EvaluationReport");
 
  /** @generated */
  final Feature casFeat_sortedAnswerSpans;
  /** @generated */
  final int     casFeatCode_sortedAnswerSpans;
  /** @generated */ 
  public int getSortedAnswerSpans(int addr) {
        if (featOkTst && casFeat_sortedAnswerSpans == null)
      jcas.throwFeatMissing("sortedAnswerSpans", "edu.cmu.lti.csd.types.EvaluationReport");
    return ll_cas.ll_getRefValue(addr, casFeatCode_sortedAnswerSpans);
  }
  /** @generated */    
  public void setSortedAnswerSpans(int addr, int v) {
        if (featOkTst && casFeat_sortedAnswerSpans == null)
      jcas.throwFeatMissing("sortedAnswerSpans", "edu.cmu.lti.csd.types.EvaluationReport");
    ll_cas.ll_setRefValue(addr, casFeatCode_sortedAnswerSpans, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public EvaluationReport_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_sortedAnswerSpans = jcas.getRequiredFeatureDE(casType, "sortedAnswerSpans", "edu.cmu.lti.csd.types.AnswerSpanList", featOkTst);
    casFeatCode_sortedAnswerSpans  = (null == casFeat_sortedAnswerSpans) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_sortedAnswerSpans).getCode();

  }
}



    