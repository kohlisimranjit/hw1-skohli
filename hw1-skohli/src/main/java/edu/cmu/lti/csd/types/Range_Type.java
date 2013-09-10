
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
 * Updated by JCasGen Tue Sep 10 02:10:13 EDT 2013
 * @generated */
public class Range_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Range_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Range_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Range(addr, Range_Type.this);
  			   Range_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Range(addr, Range_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Range.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.csd.types.Range");
 
  /** @generated */
  final Feature casFeat_start;
  /** @generated */
  final int     casFeatCode_start;
  /** @generated */ 
  public int getStart(int addr) {
        if (featOkTst && casFeat_start == null)
      jcas.throwFeatMissing("start", "edu.cmu.lti.csd.types.Range");
    return ll_cas.ll_getIntValue(addr, casFeatCode_start);
  }
  /** @generated */    
  public void setStart(int addr, int v) {
        if (featOkTst && casFeat_start == null)
      jcas.throwFeatMissing("start", "edu.cmu.lti.csd.types.Range");
    ll_cas.ll_setIntValue(addr, casFeatCode_start, v);}
    
  
 
  /** @generated */
  final Feature casFeat_end;
  /** @generated */
  final int     casFeatCode_end;
  /** @generated */ 
  public int getEnd(int addr) {
        if (featOkTst && casFeat_end == null)
      jcas.throwFeatMissing("end", "edu.cmu.lti.csd.types.Range");
    return ll_cas.ll_getIntValue(addr, casFeatCode_end);
  }
  /** @generated */    
  public void setEnd(int addr, int v) {
        if (featOkTst && casFeat_end == null)
      jcas.throwFeatMissing("end", "edu.cmu.lti.csd.types.Range");
    ll_cas.ll_setIntValue(addr, casFeatCode_end, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Range_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_start = jcas.getRequiredFeatureDE(casType, "start", "uima.cas.Integer", featOkTst);
    casFeatCode_start  = (null == casFeat_start) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_start).getCode();

 
    casFeat_end = jcas.getRequiredFeatureDE(casType, "end", "uima.cas.Integer", featOkTst);
    casFeatCode_end  = (null == casFeat_end) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_end).getCode();

  }
}



    