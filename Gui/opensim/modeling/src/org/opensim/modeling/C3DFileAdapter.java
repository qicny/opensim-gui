/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class C3DFileAdapter extends FileAdapter {
  private transient long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected C3DFileAdapter(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.C3DFileAdapter_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(C3DFileAdapter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        opensimCommonJNI.delete_C3DFileAdapter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public C3DFileAdapter() {
    this(opensimCommonJNI.new_C3DFileAdapter__SWIG_0(), true);
  }

  public C3DFileAdapter(C3DFileAdapter arg0) {
    this(opensimCommonJNI.new_C3DFileAdapter__SWIG_1(C3DFileAdapter.getCPtr(arg0), arg0), true);
  }

  public DataAdapter clone() {
    long cPtr = opensimCommonJNI.C3DFileAdapter_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new C3DFileAdapter(cPtr, true);
  }

  public static StdMapStringTimeSeriesTableVec3 read(String fileName) {
    return new StdMapStringTimeSeriesTableVec3(opensimCommonJNI.C3DFileAdapter_read(fileName), true);
  }

  public static void write(StdMapStringTimeSeriesTableVec3 markerTable, String fileName) {
    opensimCommonJNI.C3DFileAdapter_write(StdMapStringTimeSeriesTableVec3.getCPtr(markerTable), markerTable, fileName);
  }

  public static String get_markers() {
    return opensimCommonJNI.C3DFileAdapter__markers_get();
  }

  public static String get_forces() {
    return opensimCommonJNI.C3DFileAdapter__forces_get();
  }

}
