
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

/** 
 * Updated by JCasGen Tue Sep 10 02:07:48 EDT 2013
 * @generated */
public class GenericTokenAnnotation_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (GenericTokenAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = GenericTokenAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new GenericTokenAnnotation(addr, GenericTokenAnnotation_Type.this);
  			   GenericTokenAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new GenericTokenAnnotation(addr, GenericTokenAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = GenericTokenAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.csd.types.GenericTokenAnnotation");
 
  /** @generated */
  final Feature casFeat_range;
  /** @generated */
  final int     casFeatCode_range;
  /** @generated */ 
  public int getRange(int addr) {
        if (featOkTst && casFeat_range == null)
      jcas.throwFeatMissing("range", "edu.cmu.lti.csd.types.GenericTokenAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_range);
  }
  /** @generated */    
  public void setRange(int addr, int v) {
        if (featOkTst && casFeat_range == null)
      jcas.throwFeatMissing("range", "edu.cmu.lti.csd.types.GenericTokenAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_range, v);}
    
  
 
  /** @generated */
  final Feature casFeat_stringSet;
  /** @generated */
  final int     casFeatCode_stringSet;
  /** @generated */ 
  public String getStringSet(int addr) {
        if (featOkTst && casFeat_stringSet == null)
      jcas.throwFeatMissing("stringSet", "edu.cmu.lti.csd.types.GenericTokenAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_stringSet);
  }
  /** @generated */    
  public void setStringSet(int addr, String v) {
        if (featOkTst && casFeat_stringSet == null)
      jcas.throwFeatMissing("stringSet", "edu.cmu.lti.csd.types.GenericTokenAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_stringSet, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public GenericTokenAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_range = jcas.getRequiredFeatureDE(casType, "range", "edu.cmu.lti.csd.types.Range", featOkTst);
    casFeatCode_range  = (null == casFeat_range) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_range).getCode();

 
    casFeat_stringSet = jcas.getRequiredFeatureDE(casType, "stringSet", "uima.cas.String", featOkTst);
    casFeatCode_stringSet  = (null == casFeat_stringSet) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_stringSet).getCode();

  }
}



    