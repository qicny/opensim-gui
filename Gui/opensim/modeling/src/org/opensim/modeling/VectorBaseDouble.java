/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class VectorBaseDouble extends MatrixBaseDouble {
  private transient long swigCPtr;

  protected VectorBaseDouble(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.VectorBaseDouble_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(VectorBaseDouble obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_VectorBaseDouble(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public VectorBaseDouble(int m) {
    this(opensimSimbodyJNI.new_VectorBaseDouble__SWIG_0(m), true);
  }

  public VectorBaseDouble() {
    this(opensimSimbodyJNI.new_VectorBaseDouble__SWIG_1(), true);
  }

  public VectorBaseDouble(VectorBaseDouble source) {
    this(opensimSimbodyJNI.new_VectorBaseDouble__SWIG_2(VectorBaseDouble.getCPtr(source), source), true);
  }

  public int size() {
    return opensimSimbodyJNI.VectorBaseDouble_size(swigCPtr, this);
  }

  public int nrow() {
    return opensimSimbodyJNI.VectorBaseDouble_nrow(swigCPtr, this);
  }

  public int ncol() {
    return opensimSimbodyJNI.VectorBaseDouble_ncol(swigCPtr, this);
  }

  public VectorBaseDouble resize(int m) {
    return new VectorBaseDouble(opensimSimbodyJNI.VectorBaseDouble_resize(swigCPtr, this, m), false);
  }

  public VectorBaseDouble resizeKeep(int m) {
    return new VectorBaseDouble(opensimSimbodyJNI.VectorBaseDouble_resizeKeep(swigCPtr, this, m), false);
  }

  public void clear() {
    opensimSimbodyJNI.VectorBaseDouble_clear(swigCPtr, this);
  }

  public double sum() {
    return opensimSimbodyJNI.VectorBaseDouble_sum(swigCPtr, this);
  }

  public double get(long i) {
    return opensimSimbodyJNI.VectorBaseDouble_get(swigCPtr, this, i);
  }

  public double set(long i, double value) {
    return opensimSimbodyJNI.VectorBaseDouble_set(swigCPtr, this, i, value);
  }

  public double __getitem__(long i) {
    return opensimSimbodyJNI.VectorBaseDouble___getitem__(swigCPtr, this, i);
  }

  public void __setitem__(long i, double value) {
    opensimSimbodyJNI.VectorBaseDouble___setitem__(swigCPtr, this, i, value);
  }

}
