

   
/* Apache UIMA v3 - First created by JCasGen Fri May 24 10:22:23 EDT 2019 */

package org.apache.uima.tutorial;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;

import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.impl.TypeSystemImpl;
import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;


import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri May 24 10:26:18 EDT 2019
 * XML source: C:/Users/ilall/eclipse-workspace/RoomNumberAnnotator/desc/RoomNumberAnnotatorDescriptor.xml
 * @generated */
public class RoomNumber extends Annotation {
 
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static String _TypeName = "org.apache.uima.tutorial.RoomNumber";
  
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(RoomNumber.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
 
  /* *******************
   *   Feature Offsets *
   * *******************/ 
   
  public final static String _FeatName_building = "building";


  /* Feature Adjusted Offsets */
  private final static CallSite _FC_building = TypeSystemImpl.createCallSite(RoomNumber.class, "building");
  private final static MethodHandle _FH_building = _FC_building.dynamicInvoker();

   
  /** Never called.  Disable default constructor
   * @generated */
  protected RoomNumber() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param casImpl the CAS this Feature Structure belongs to
   * @param type the type of this Feature Structure 
   */
  public RoomNumber(TypeImpl type, CASImpl casImpl) {
    super(type, casImpl);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public RoomNumber(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public RoomNumber(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: building

  /** getter for building - gets 
   * @generated
   * @return value of the feature 
   */
  public String getBuilding() { return _getStringValueNc(wrapGetIntCatchException(_FH_building));}
    
  /** setter for building - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setBuilding(String v) {
    _setStringValueNfc(wrapGetIntCatchException(_FH_building), v);
  }    
    
  }

    