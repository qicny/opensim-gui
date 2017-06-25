/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PathWrapSet extends SetPathWrap {
  private transient long swigCPtr;

  public PathWrapSet(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.PathWrapSet_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PathWrapSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_PathWrapSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static PathWrapSet safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.PathWrapSet_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new PathWrapSet(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.PathWrapSet_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.PathWrapSet_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.PathWrapSet_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PathWrapSet(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.PathWrapSet_getConcreteClassName(swigCPtr, this);
  }

  public PathWrapSet() {
    this(opensimSimulationJNI.new_PathWrapSet__SWIG_0(), true);
  }

  public PathWrapSet(PathWrapSet aPathWrapSet) {
    this(opensimSimulationJNI.new_PathWrapSet__SWIG_1(PathWrapSet.getCPtr(aPathWrapSet), aPathWrapSet), true);
  }

}
