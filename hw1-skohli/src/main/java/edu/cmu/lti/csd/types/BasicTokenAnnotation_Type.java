
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
import org.apache.uima.jcas.cas.AnnotationBase_Type;

/** Bare minimum artifacts which have to be a part of annotation for token.
 * Updated by JCasGen Wed Sep 11 21:15:32 EDT 2013
 * @generated */
public class BasicTokenAnnotation_Type extends AnnotationBase_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (BasicTokenAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = BasicTokenAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new BasicTokenAnnotation(addr, BasicTokenAnnotation_Type.this);
  			   BasicTokenAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new BasicTokenAnnotation(addr, BasicTokenAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = BasicTokenAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.csd.types.BasicTokenAnnotation");
 
  /** @generated */
  final Feature casFeat_range;
  /** @generated */
  final int     casFeatCode_range;
  /** @generated */ 
  public int getRange(int addr) {
        if (featOkTst && casFeat_range == null)
      jcas.throwFeatMissing("range", "edu.cmu.lti.csd.types.BasicTokenAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_range);
  }
  /** @generated */    
  public void setRange(int addr, int v) {
        if (featOkTst && casFeat_range == null)
      jcas.throwFeatMissing("range", "edu.cmu.lti.csd.types.BasicTokenAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_range, v);}
    
  
 
  /** @generated */
  final Feature casFeat_tokenValue;
  /** @generated */
  final int     casFeatCode_tokenValue;
  /** @generated */ 
  public String getTokenValue(int addr) {
        if (featOkTst && casFeat_tokenValue == null)
      jcas.throwFeatMissing("tokenValue", "edu.cmu.lti.csd.types.BasicTokenAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_tokenValue);
  }
  /** @generated */    
  public void setTokenValue(int addr, String v) {
        if (featOkTst && casFeat_tokenValue == null)
      jcas.throwFeatMissing("tokenValue", "edu.cmu.lti.csd.types.BasicTokenAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_tokenValue, v);}
    
  
 
  /** @generated */
  final Feature casFeat_producer;
  /** @generated */
  final int     casFeatCode_producer;
  /** @generated */ 
  public String getProducer(int addr) {
        if (featOkTst && casFeat_producer == null)
      jcas.throwFeatMissing("producer", "edu.cmu.lti.csd.types.BasicTokenAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_producer);
  }
  /** @generated */    
  public void setProducer(int addr, String v) {
        if (featOkTst && casFeat_producer == null)
      jcas.throwFeatMissing("producer", "edu.cmu.lti.csd.types.BasicTokenAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_producer, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public BasicTokenAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_range = jcas.getRequiredFeatureDE(casType, "range", "edu.cmu.lti.csd.types.Range", featOkTst);
    casFeatCode_range  = (null == casFeat_range) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_range).getCode();

 
    casFeat_tokenValue = jcas.getRequiredFeatureDE(casType, "tokenValue", "uima.cas.String", featOkTst);
    casFeatCode_tokenValue  = (null == casFeat_tokenValue) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokenValue).getCode();

 
    casFeat_producer = jcas.getRequiredFeatureDE(casType, "producer", "uima.cas.String", featOkTst);
    casFeatCode_producer  = (null == casFeat_producer) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_producer).getCode();

  }
}



    