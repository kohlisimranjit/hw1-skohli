
/* First created by JCasGen Tue Sep 10 23:03:46 EDT 2013 */
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
 * Updated by JCasGen Tue Sep 10 23:40:33 EDT 2013
 * @generated */
public class MultigramTokenList_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (MultigramTokenList_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = MultigramTokenList_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new MultigramTokenList(addr, MultigramTokenList_Type.this);
  			   MultigramTokenList_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new MultigramTokenList(addr, MultigramTokenList_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = MultigramTokenList.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.csd.types.MultigramTokenList");
 
  /** @generated */
  final Feature casFeat_multigramTokens;
  /** @generated */
  final int     casFeatCode_multigramTokens;
  /** @generated */ 
  public int getMultigramTokens(int addr) {
        if (featOkTst && casFeat_multigramTokens == null)
      jcas.throwFeatMissing("multigramTokens", "edu.cmu.lti.csd.types.MultigramTokenList");
    return ll_cas.ll_getRefValue(addr, casFeatCode_multigramTokens);
  }
  /** @generated */    
  public void setMultigramTokens(int addr, int v) {
        if (featOkTst && casFeat_multigramTokens == null)
      jcas.throwFeatMissing("multigramTokens", "edu.cmu.lti.csd.types.MultigramTokenList");
    ll_cas.ll_setRefValue(addr, casFeatCode_multigramTokens, v);}
    
   /** @generated */
  public int getMultigramTokens(int addr, int i) {
        if (featOkTst && casFeat_multigramTokens == null)
      jcas.throwFeatMissing("multigramTokens", "edu.cmu.lti.csd.types.MultigramTokenList");
    if (lowLevelTypeChecks)
      return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_multigramTokens), i, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_multigramTokens), i);
  return ll_cas.ll_getRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_multigramTokens), i);
  }
   
  /** @generated */ 
  public void setMultigramTokens(int addr, int i, int v) {
        if (featOkTst && casFeat_multigramTokens == null)
      jcas.throwFeatMissing("multigramTokens", "edu.cmu.lti.csd.types.MultigramTokenList");
    if (lowLevelTypeChecks)
      ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_multigramTokens), i, v, true);
    jcas.checkArrayBounds(ll_cas.ll_getRefValue(addr, casFeatCode_multigramTokens), i);
    ll_cas.ll_setRefArrayValue(ll_cas.ll_getRefValue(addr, casFeatCode_multigramTokens), i, v);
  }
 
 
  /** @generated */
  final Feature casFeat_nGram;
  /** @generated */
  final int     casFeatCode_nGram;
  /** @generated */ 
  public int getNGram(int addr) {
        if (featOkTst && casFeat_nGram == null)
      jcas.throwFeatMissing("nGram", "edu.cmu.lti.csd.types.MultigramTokenList");
    return ll_cas.ll_getIntValue(addr, casFeatCode_nGram);
  }
  /** @generated */    
  public void setNGram(int addr, int v) {
        if (featOkTst && casFeat_nGram == null)
      jcas.throwFeatMissing("nGram", "edu.cmu.lti.csd.types.MultigramTokenList");
    ll_cas.ll_setIntValue(addr, casFeatCode_nGram, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public MultigramTokenList_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_multigramTokens = jcas.getRequiredFeatureDE(casType, "multigramTokens", "uima.cas.FSArray", featOkTst);
    casFeatCode_multigramTokens  = (null == casFeat_multigramTokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_multigramTokens).getCode();

 
    casFeat_nGram = jcas.getRequiredFeatureDE(casType, "nGram", "uima.cas.Integer", featOkTst);
    casFeatCode_nGram  = (null == casFeat_nGram) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_nGram).getCode();

  }
}



    