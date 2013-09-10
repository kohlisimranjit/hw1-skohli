
/* First created by JCasGen Tue Sep 10 17:52:38 EDT 2013 */
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
import com.cmu.lti.csd.types.GenericToken_Type;

import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Sep 10 01:45:00 EDT 2013
 * @generated */
public class NGramToken_Type extends GenericToken_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (NGramToken_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = NGramToken_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new NGramToken(addr, NGramToken_Type.this);
  			   NGramToken_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new NGramToken(addr, NGramToken_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = NGramToken.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.csd.types.NGramToken");
 
  /** @generated */
  final Feature casFeat_partOfSpeech;
  /** @generated */
  final int     casFeatCode_partOfSpeech;
  /** @generated */ 
  public String getPartOfSpeech(int addr) {
        if (featOkTst && casFeat_partOfSpeech == null)
      jcas.throwFeatMissing("partOfSpeech", "edu.cmu.lti.csd.types.NGramToken");
    return ll_cas.ll_getStringValue(addr, casFeatCode_partOfSpeech);
  }
  /** @generated */    
  public void setPartOfSpeech(int addr, String v) {
        if (featOkTst && casFeat_partOfSpeech == null)
      jcas.throwFeatMissing("partOfSpeech", "edu.cmu.lti.csd.types.NGramToken");
    ll_cas.ll_setStringValue(addr, casFeatCode_partOfSpeech, v);}
    
  
 
  /** @generated */
  final Feature casFeat_confidenceScore;
  /** @generated */
  final int     casFeatCode_confidenceScore;
  /** @generated */ 
  public int getConfidenceScore(int addr) {
        if (featOkTst && casFeat_confidenceScore == null)
      jcas.throwFeatMissing("confidenceScore", "edu.cmu.lti.csd.types.NGramToken");
    return ll_cas.ll_getIntValue(addr, casFeatCode_confidenceScore);
  }
  /** @generated */    
  public void setConfidenceScore(int addr, int v) {
        if (featOkTst && casFeat_confidenceScore == null)
      jcas.throwFeatMissing("confidenceScore", "edu.cmu.lti.csd.types.NGramToken");
    ll_cas.ll_setIntValue(addr, casFeatCode_confidenceScore, v);}
    
  
 
  /** @generated */
  final Feature casFeat_producer;
  /** @generated */
  final int     casFeatCode_producer;
  /** @generated */ 
  public String getProducer(int addr) {
        if (featOkTst && casFeat_producer == null)
      jcas.throwFeatMissing("producer", "edu.cmu.lti.csd.types.NGramToken");
    return ll_cas.ll_getStringValue(addr, casFeatCode_producer);
  }
  /** @generated */    
  public void setProducer(int addr, String v) {
        if (featOkTst && casFeat_producer == null)
      jcas.throwFeatMissing("producer", "edu.cmu.lti.csd.types.NGramToken");
    ll_cas.ll_setStringValue(addr, casFeatCode_producer, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public NGramToken_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_partOfSpeech = jcas.getRequiredFeatureDE(casType, "partOfSpeech", "uima.cas.String", featOkTst);
    casFeatCode_partOfSpeech  = (null == casFeat_partOfSpeech) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_partOfSpeech).getCode();

 
    casFeat_confidenceScore = jcas.getRequiredFeatureDE(casType, "confidenceScore", "uima.cas.Integer", featOkTst);
    casFeatCode_confidenceScore  = (null == casFeat_confidenceScore) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidenceScore).getCode();

 
    casFeat_producer = jcas.getRequiredFeatureDE(casType, "producer", "uima.cas.String", featOkTst);
    casFeatCode_producer  = (null == casFeat_producer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_producer).getCode();

  }
}



    