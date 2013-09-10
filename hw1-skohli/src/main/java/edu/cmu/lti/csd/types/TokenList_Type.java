
/* First created by JCasGen Tue Sep 10 17:10:41 EDT 2013 */
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

//import uima.cas.ListBase_Type;

/** 
 * Updated by JCasGen Tue Sep 10 22:24:31 EDT 2013
 * @generated */
public class TokenList_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (TokenList_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = TokenList_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new TokenList(addr, TokenList_Type.this);
  			   TokenList_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new TokenList(addr, TokenList_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TokenList.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.csd.types.TokenList");



  /** @generated */
  final Feature casFeat_tokens;
  /** @generated */
  final int     casFeatCode_tokens;
  /** @generated */ 
  public int getTokens(int addr) {
        if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "edu.cmu.lti.csd.types.TokenList");
    return ll_cas.ll_getRefValue(addr, casFeatCode_tokens);
  }
  /** @generated */    
  public void setTokens(int addr, int v) {
        if (featOkTst && casFeat_tokens == null)
      jcas.throwFeatMissing("tokens", "edu.cmu.lti.csd.types.TokenList");
    ll_cas.ll_setRefValue(addr, casFeatCode_tokens, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public TokenList_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_tokens = jcas.getRequiredFeatureDE(casType, "tokens", "uima.cas.FSList", featOkTst);
    casFeatCode_tokens  = (null == casFeat_tokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_tokens).getCode();

  }
}



    