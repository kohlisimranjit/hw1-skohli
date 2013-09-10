
/* First created by JCasGen Tue Sep 10 22:31:16 EDT 2013 */
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
public class UnigramTokenList_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (UnigramTokenList_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = UnigramTokenList_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new UnigramTokenList(addr, UnigramTokenList_Type.this);
  			   UnigramTokenList_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new UnigramTokenList(addr, UnigramTokenList_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = UnigramTokenList.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.csd.types.UnigramTokenList");
 
  /** @generated */
  final Feature casFeat_unigramTokens;
  /** @generated */
  final int     casFeatCode_unigramTokens;
  /** @generated */ 
  public int getUnigramTokens(int addr) {
        if (featOkTst && casFeat_unigramTokens == null)
      jcas.throwFeatMissing("unigramTokens", "edu.cmu.lti.csd.types.UnigramTokenList");
    return ll_cas.ll_getRefValue(addr, casFeatCode_unigramTokens);
  }
  /** @generated */    
  public void setUnigramTokens(int addr, int v) {
        if (featOkTst && casFeat_unigramTokens == null)
      jcas.throwFeatMissing("unigramTokens", "edu.cmu.lti.csd.types.UnigramTokenList");
    ll_cas.ll_setRefValue(addr, casFeatCode_unigramTokens, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public UnigramTokenList_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_unigramTokens = jcas.getRequiredFeatureDE(casType, "unigramTokens", "uima.cas.FSList", featOkTst);
    casFeatCode_unigramTokens  = (null == casFeat_unigramTokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_unigramTokens).getCode();

  }
}



    