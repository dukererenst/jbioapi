/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.24
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.qrivy.bioapi;

public class BioAPI_BIR_BIOMETRIC_DATA_FORMAT {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected BioAPI_BIR_BIOMETRIC_DATA_FORMAT(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BioAPI_BIR_BIOMETRIC_DATA_FORMAT obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      BioAPIJNI.delete_BioAPI_BIR_BIOMETRIC_DATA_FORMAT(swigCPtr);
    }
    swigCPtr = 0;
  }

  public void setFormatOwner(int FormatOwner) {
    BioAPIJNI.set_BioAPI_BIR_BIOMETRIC_DATA_FORMAT_FormatOwner(swigCPtr, FormatOwner);
  }

  public int getFormatOwner() {
    return BioAPIJNI.get_BioAPI_BIR_BIOMETRIC_DATA_FORMAT_FormatOwner(swigCPtr);
  }

  public void setFormatID(int FormatID) {
    BioAPIJNI.set_BioAPI_BIR_BIOMETRIC_DATA_FORMAT_FormatID(swigCPtr, FormatID);
  }

  public int getFormatID() {
    return BioAPIJNI.get_BioAPI_BIR_BIOMETRIC_DATA_FORMAT_FormatID(swigCPtr);
  }

  public BioAPI_BIR_BIOMETRIC_DATA_FORMAT() {
    this(BioAPIJNI.new_BioAPI_BIR_BIOMETRIC_DATA_FORMAT(), true);
  }

}