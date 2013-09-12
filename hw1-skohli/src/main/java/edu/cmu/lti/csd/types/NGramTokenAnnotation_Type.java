
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

/** the NGramTokenAnnotation extends the functionality from BasicToken and leverages it providing additional data required to be associated with a token.
 * Updated by JCasGen Wed Sep 11 21:15:32 EDT 2013
 * @generated */
public class NGramTokenAnnotation_Type extends BasicTokenAnnotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NGramTokenAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NGramTokenAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NGramTokenAnnotation(addr, NGramTokenAnnotation_Type.this);
  			   NGramTokenAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NGramTokenAnnotation(addr, NGramTokenAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NGramTokenAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.csd.types.NGramTokenAnnotation");
 
  /** @generated */
  final Feature casFeat_partOfSpeech;
  /** @generated */
  final int     casFeatCode_partOfSpeech;
  /** @generated */ 
  public String getPartOfSpeech(int addr) {
        if (featOkTst && casFeat_partOfSpeech == null)
      jcas.throwFeatMissing("partOfSpeech", "edu.cmu.lti.csd.types.NGramTokenAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_partOfSpeech);
  }
  /** @generated */    
  public void setPartOfSpeech(int addr, String v) {
        if (featOkTst && casFeat_partOfSpeech == null)
      jcas.throwFeatMissing("partOfSpeech", "edu.cmu.lti.csd.types.NGramTokenAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_partOfSpeech, v);}
    
  
 
  /** @generated */
  final Feature casFeat_confidenceScore;
  /** @generated */
  final int     casFeatCode_confidenceScore;
  /** @generated */ 
  public double getConfidenceScore(int addr) {
        if (featOkTst && casFeat_confidenceScore == null)
      jcas.throwFeatMissing("confidenceScore", "edu.cmu.lti.csd.types.NGramTokenAnnotation");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_confidenceScore);
  }
  /** @generated */    
  public void setConfidenceScore(int addr, double v) {
        if (featOkTst && casFeat_confidenceScore == null)
      jcas.throwFeatMissing("confidenceScore", "edu.cmu.lti.csd.types.NGramTokenAnnotation");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_confidenceScore, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public NGramTokenAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_partOfSpeech = jcas.getRequiredFeatureDE(casType, "partOfSpeech", "uima.cas.String", featOkTst);
    casFeatCode_partOfSpeech  = (null == casFeat_partOfSpeech) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_partOfSpeech).getCode();

 
    casFeat_confidenceScore = jcas.getRequiredFeatureDE(casType, "confidenceScore", "uima.cas.Double", featOkTst);
    casFeatCode_confidenceScore  = (null == casFeat_confidenceScore) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidenceScore).getCode();

  }
}



    