
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

/** An encapsulation for a list of basicTokens.
 * Updated by JCasGen Wed Sep 11 21:15:32 EDT 2013
 * @generated */
public class BasicTokenList_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (BasicTokenList_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = BasicTokenList_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new BasicTokenList(addr, BasicTokenList_Type.this);
  			   BasicTokenList_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new BasicTokenList(addr, BasicTokenList_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = BasicTokenList.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.csd.types.BasicTokenList");
 
  /** @generated */
  final Feature casFeat_basicTokens;
  /** @generated */
  final int     casFeatCode_basicTokens;
  /** @generated */ 
  public int getBasicTokens(int addr) {
        if (featOkTst && casFeat_basicTokens == null)
      jcas.throwFeatMissing("basicTokens", "edu.cmu.lti.csd.types.BasicTokenList");
    return ll_cas.ll_getRefValue(addr, casFeatCode_basicTokens);
  }
  /** @generated */    
  public void setBasicTokens(int addr, int v) {
        if (featOkTst && casFeat_basicTokens == null)
      jcas.throwFeatMissing("basicTokens", "edu.cmu.lti.csd.types.BasicTokenList");
    ll_cas.ll_setRefValue(addr, casFeatCode_basicTokens, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public BasicTokenList_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_basicTokens = jcas.getRequiredFeatureDE(casType, "basicTokens", "uima.cas.FSList", featOkTst);
    casFeatCode_basicTokens  = (null == casFeat_basicTokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_basicTokens).getCode();

  }
}



    