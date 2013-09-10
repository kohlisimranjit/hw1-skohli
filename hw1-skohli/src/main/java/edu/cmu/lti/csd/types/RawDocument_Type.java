
/* First created by JCasGen Tue Sep 10 23:28:38 EDT 2013 */
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
 * Updated by JCasGen Tue Sep 10 23:28:38 EDT 2013
 * @generated */
public class RawDocument_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (RawDocument_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = RawDocument_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new RawDocument(addr, RawDocument_Type.this);
  			   RawDocument_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new RawDocument(addr, RawDocument_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = RawDocument.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.lti.csd.types.RawDocument");
 
  /** @generated */
  final Feature casFeat_lines;
  /** @generated */
  final int     casFeatCode_lines;
  /** @generated */ 
  public int getLines(int addr) {
        if (featOkTst && casFeat_lines == null)
      jcas.throwFeatMissing("lines", "edu.cmu.lti.csd.types.RawDocument");
    return ll_cas.ll_getRefValue(addr, casFeatCode_lines);
  }
  /** @generated */    
  public void setLines(int addr, int v) {
        if (featOkTst && casFeat_lines == null)
      jcas.throwFeatMissing("lines", "edu.cmu.lti.csd.types.RawDocument");
    ll_cas.ll_setRefValue(addr, casFeatCode_lines, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public RawDocument_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_lines = jcas.getRequiredFeatureDE(casType, "lines", "uima.cas.StringList", featOkTst);
    casFeatCode_lines  = (null == casFeat_lines) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_lines).getCode();

  }
}



    