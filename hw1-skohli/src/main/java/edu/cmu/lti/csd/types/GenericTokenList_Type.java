
/* First created by JCasGen Tue Sep 10 02:07:48 EDT 2013 */
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

/** An encapsulation for a list of genericTokens.
 * Updated by JCasGen Wed Sep 11 14:10:23 EDT 2013
 * @generated */
public class GenericTokenList_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (GenericTokenList_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = GenericTokenList_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new GenericTokenList(addr, GenericTokenList_Type.this);
  			   GenericTokenList_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new GenericTokenList(addr, GenericTokenList_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = GenericTokenList.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.csd.types.GenericTokenList");
 
  /** @generated */
  final Feature casFeat_genericTokens;
  /** @generated */
  final int     casFeatCode_genericTokens;
  /** @generated */ 
  public int getGenericTokens(int addr) {
        if (featOkTst && casFeat_genericTokens == null)
      jcas.throwFeatMissing("genericTokens", "edu.cmu.lti.csd.types.GenericTokenList");
    return ll_cas.ll_getRefValue(addr, casFeatCode_genericTokens);
  }
  /** @generated */    
  public void setGenericTokens(int addr, int v) {
        if (featOkTst && casFeat_genericTokens == null)
      jcas.throwFeatMissing("genericTokens", "edu.cmu.lti.csd.types.GenericTokenList");
    ll_cas.ll_setRefValue(addr, casFeatCode_genericTokens, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public GenericTokenList_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_genericTokens = jcas.getRequiredFeatureDE(casType, "genericTokens", "uima.cas.FSList", featOkTst);
    casFeatCode_genericTokens  = (null == casFeat_genericTokens) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_genericTokens).getCode();

  }
}



    