
/* First created by JCasGen Tue Sep 10 17:05:53 EDT 2013 */
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
 * Updated by JCasGen Tue Sep 10 17:48:33 EDT 2013
 * @generated */
public class Token_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Token_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Token_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Token(addr, Token_Type.this);
  			   Token_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Token(addr, Token_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Token.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.csd.types.Token");
 
  /** @generated */
  final Feature casFeat_word;
  /** @generated */
  final int     casFeatCode_word;
  /** @generated */ 
  public String getWord(int addr) {
        if (featOkTst && casFeat_word == null)
      jcas.throwFeatMissing("word", "edu.cmu.lti.csd.types.Token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_word);
  }
  /** @generated */    
  public void setWord(int addr, String v) {
        if (featOkTst && casFeat_word == null)
      jcas.throwFeatMissing("word", "edu.cmu.lti.csd.types.Token");
    ll_cas.ll_setStringValue(addr, casFeatCode_word, v);}
    
  
 
  /** @generated */
  final Feature casFeat_partOfSpeech;
  /** @generated */
  final int     casFeatCode_partOfSpeech;
  /** @generated */ 
  public String getPartOfSpeech(int addr) {
        if (featOkTst && casFeat_partOfSpeech == null)
      jcas.throwFeatMissing("partOfSpeech", "edu.cmu.lti.csd.types.Token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_partOfSpeech);
  }
  /** @generated */    
  public void setPartOfSpeech(int addr, String v) {
        if (featOkTst && casFeat_partOfSpeech == null)
      jcas.throwFeatMissing("partOfSpeech", "edu.cmu.lti.csd.types.Token");
    ll_cas.ll_setStringValue(addr, casFeatCode_partOfSpeech, v);}
    
  
 
  /** @generated */
  final Feature casFeat_confidenceScore;
  /** @generated */
  final int     casFeatCode_confidenceScore;
  /** @generated */ 
  public int getConfidenceScore(int addr) {
        if (featOkTst && casFeat_confidenceScore == null)
      jcas.throwFeatMissing("confidenceScore", "edu.cmu.lti.csd.types.Token");
    return ll_cas.ll_getIntValue(addr, casFeatCode_confidenceScore);
  }
  /** @generated */    
  public void setConfidenceScore(int addr, int v) {
        if (featOkTst && casFeat_confidenceScore == null)
      jcas.throwFeatMissing("confidenceScore", "edu.cmu.lti.csd.types.Token");
    ll_cas.ll_setIntValue(addr, casFeatCode_confidenceScore, v);}
    
  
 
  /** @generated */
  final Feature casFeat_producer;
  /** @generated */
  final int     casFeatCode_producer;
  /** @generated */ 
  public String getProducer(int addr) {
        if (featOkTst && casFeat_producer == null)
      jcas.throwFeatMissing("producer", "edu.cmu.lti.csd.types.Token");
    return ll_cas.ll_getStringValue(addr, casFeatCode_producer);
  }
  /** @generated */    
  public void setProducer(int addr, String v) {
        if (featOkTst && casFeat_producer == null)
      jcas.throwFeatMissing("producer", "edu.cmu.lti.csd.types.Token");
    ll_cas.ll_setStringValue(addr, casFeatCode_producer, v);}
    
  
 
  /** @generated */
  final Feature casFeat_range;
  /** @generated */
  final int     casFeatCode_range;
  /** @generated */ 
  public int getRange(int addr) {
        if (featOkTst && casFeat_range == null)
      jcas.throwFeatMissing("range", "edu.cmu.lti.csd.types.Token");
    return ll_cas.ll_getRefValue(addr, casFeatCode_range);
  }
  /** @generated */    
  public void setRange(int addr, int v) {
        if (featOkTst && casFeat_range == null)
      jcas.throwFeatMissing("range", "edu.cmu.lti.csd.types.Token");
    ll_cas.ll_setRefValue(addr, casFeatCode_range, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Token_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_word = jcas.getRequiredFeatureDE(casType, "word", "uima.cas.String", featOkTst);
    casFeatCode_word  = (null == casFeat_word) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_word).getCode();

 
    casFeat_partOfSpeech = jcas.getRequiredFeatureDE(casType, "partOfSpeech", "uima.cas.String", featOkTst);
    casFeatCode_partOfSpeech  = (null == casFeat_partOfSpeech) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_partOfSpeech).getCode();

 
    casFeat_confidenceScore = jcas.getRequiredFeatureDE(casType, "confidenceScore", "uima.cas.Integer", featOkTst);
    casFeatCode_confidenceScore  = (null == casFeat_confidenceScore) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_confidenceScore).getCode();

 
    casFeat_producer = jcas.getRequiredFeatureDE(casType, "producer", "uima.cas.String", featOkTst);
    casFeatCode_producer  = (null == casFeat_producer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_producer).getCode();

 
    casFeat_range = jcas.getRequiredFeatureDE(casType, "range", "edu.cmu.lti.csd.types.Range", featOkTst);
    casFeatCode_range  = (null == casFeat_range) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_range).getCode();

  }
}



    