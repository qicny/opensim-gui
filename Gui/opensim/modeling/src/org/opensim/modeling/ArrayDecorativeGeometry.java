/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ArrayDecorativeGeometry {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public ArrayDecorativeGeometry(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArrayDecorativeGeometry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ArrayDecorativeGeometry(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArrayDecorativeGeometry() {
    this(opensimModelJNI.new_ArrayDecorativeGeometry__SWIG_0(), true);
  }

  public ArrayDecorativeGeometry(long n) {
    this(opensimModelJNI.new_ArrayDecorativeGeometry__SWIG_1(n), true);
  }

  public ArrayDecorativeGeometry(long n, DecorativeGeometry initVal) {
    this(opensimModelJNI.new_ArrayDecorativeGeometry__SWIG_2(n, DecorativeGeometry.getCPtr(initVal), initVal), true);
  }

  public ArrayDecorativeGeometry(ArrayDecorativeGeometry src) {
    this(opensimModelJNI.new_ArrayDecorativeGeometry__SWIG_3(ArrayDecorativeGeometry.getCPtr(src), src), true);
  }

  public ArrayDecorativeGeometry(DecorativeGeometry first, DecorativeGeometry last1, DontCopy arg2) {
    this(opensimModelJNI.new_ArrayDecorativeGeometry__SWIG_4(DecorativeGeometry.getCPtr(first), first, DecorativeGeometry.getCPtr(last1), last1, DontCopy.getCPtr(arg2), arg2), true);
  }

  public ArrayDecorativeGeometry deallocate() {
    return new ArrayDecorativeGeometry(opensimModelJNI.ArrayDecorativeGeometry_deallocate(swigCPtr, this), false);
  }

  public void assign(long n, DecorativeGeometry fillValue) {
    opensimModelJNI.ArrayDecorativeGeometry_assign(swigCPtr, this, n, DecorativeGeometry.getCPtr(fillValue), fillValue);
  }

  public void fill(DecorativeGeometry fillValue) {
    opensimModelJNI.ArrayDecorativeGeometry_fill(swigCPtr, this, DecorativeGeometry.getCPtr(fillValue), fillValue);
  }

  public void swap(ArrayDecorativeGeometry other) {
    opensimModelJNI.ArrayDecorativeGeometry_swap(swigCPtr, this, ArrayDecorativeGeometry.getCPtr(other), other);
  }

  public ArrayDecorativeGeometry adoptData(DecorativeGeometry newData, long dataSize, long dataCapacity) {
    return new ArrayDecorativeGeometry(opensimModelJNI.ArrayDecorativeGeometry_adoptData__SWIG_0(swigCPtr, this, DecorativeGeometry.getCPtr(newData), newData, dataSize, dataCapacity), false);
  }

  public ArrayDecorativeGeometry adoptData(DecorativeGeometry newData, long dataSize) {
    return new ArrayDecorativeGeometry(opensimModelJNI.ArrayDecorativeGeometry_adoptData__SWIG_1(swigCPtr, this, DecorativeGeometry.getCPtr(newData), newData, dataSize), false);
  }

  public ArrayDecorativeGeometry shareData(DecorativeGeometry newData, long dataSize) {
    return new ArrayDecorativeGeometry(opensimModelJNI.ArrayDecorativeGeometry_shareData__SWIG_0(swigCPtr, this, DecorativeGeometry.getCPtr(newData), newData, dataSize), false);
  }

  public ArrayDecorativeGeometry shareData(DecorativeGeometry first, DecorativeGeometry last1) {
    return new ArrayDecorativeGeometry(opensimModelJNI.ArrayDecorativeGeometry_shareData__SWIG_1(swigCPtr, this, DecorativeGeometry.getCPtr(first), first, DecorativeGeometry.getCPtr(last1), last1), false);
  }

  public long size() {
    return opensimModelJNI.ArrayDecorativeGeometry_size(swigCPtr, this);
  }

  public long max_size() {
    return opensimModelJNI.ArrayDecorativeGeometry_max_size(swigCPtr, this);
  }

  public boolean empty() {
    return opensimModelJNI.ArrayDecorativeGeometry_empty(swigCPtr, this);
  }

  public long capacity() {
    return opensimModelJNI.ArrayDecorativeGeometry_capacity(swigCPtr, this);
  }

  public void resize(long n) {
    opensimModelJNI.ArrayDecorativeGeometry_resize__SWIG_0(swigCPtr, this, n);
  }

  public void resize(long n, DecorativeGeometry initVal) {
    opensimModelJNI.ArrayDecorativeGeometry_resize__SWIG_1(swigCPtr, this, n, DecorativeGeometry.getCPtr(initVal), initVal);
  }

  public void reserve(long n) {
    opensimModelJNI.ArrayDecorativeGeometry_reserve(swigCPtr, this, n);
  }

  public void shrink_to_fit() {
    opensimModelJNI.ArrayDecorativeGeometry_shrink_to_fit(swigCPtr, this);
  }

  public long allocated() {
    return opensimModelJNI.ArrayDecorativeGeometry_allocated(swigCPtr, this);
  }

  public boolean isOwner() {
    return opensimModelJNI.ArrayDecorativeGeometry_isOwner(swigCPtr, this);
  }

  public DecorativeGeometry cbegin() {
    long cPtr = opensimModelJNI.ArrayDecorativeGeometry_cbegin(swigCPtr, this);
    return (cPtr == 0) ? null : new DecorativeGeometry(cPtr, false);
  }

  public DecorativeGeometry begin() {
    long cPtr = opensimModelJNI.ArrayDecorativeGeometry_begin__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new DecorativeGeometry(cPtr, false);
  }

  public DecorativeGeometry cend() {
    long cPtr = opensimModelJNI.ArrayDecorativeGeometry_cend(swigCPtr, this);
    return (cPtr == 0) ? null : new DecorativeGeometry(cPtr, false);
  }

  public DecorativeGeometry end() {
    long cPtr = opensimModelJNI.ArrayDecorativeGeometry_end__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new DecorativeGeometry(cPtr, false);
  }

  public SWIGTYPE_p_std__reverse_iteratorT_SimTK__DecorativeGeometry_const_p_t crbegin() {
    return new SWIGTYPE_p_std__reverse_iteratorT_SimTK__DecorativeGeometry_const_p_t(opensimModelJNI.ArrayDecorativeGeometry_crbegin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__reverse_iteratorT_SimTK__DecorativeGeometry_const_p_t rbegin() {
    return new SWIGTYPE_p_std__reverse_iteratorT_SimTK__DecorativeGeometry_const_p_t(opensimModelJNI.ArrayDecorativeGeometry_rbegin__SWIG_0(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__reverse_iteratorT_SimTK__DecorativeGeometry_const_p_t crend() {
    return new SWIGTYPE_p_std__reverse_iteratorT_SimTK__DecorativeGeometry_const_p_t(opensimModelJNI.ArrayDecorativeGeometry_crend(swigCPtr, this), true);
  }

  public SWIGTYPE_p_std__reverse_iteratorT_SimTK__DecorativeGeometry_const_p_t rend() {
    return new SWIGTYPE_p_std__reverse_iteratorT_SimTK__DecorativeGeometry_const_p_t(opensimModelJNI.ArrayDecorativeGeometry_rend__SWIG_0(swigCPtr, this), true);
  }

  public DecorativeGeometry cdata() {
    long cPtr = opensimModelJNI.ArrayDecorativeGeometry_cdata(swigCPtr, this);
    return (cPtr == 0) ? null : new DecorativeGeometry(cPtr, false);
  }

  public DecorativeGeometry data() {
    long cPtr = opensimModelJNI.ArrayDecorativeGeometry_data__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new DecorativeGeometry(cPtr, false);
  }

  public DecorativeGeometry at(long i) {
    return new DecorativeGeometry(opensimModelJNI.ArrayDecorativeGeometry_at__SWIG_0(swigCPtr, this, i), false);
  }

  public DecorativeGeometry getElt(long i) {
    return new DecorativeGeometry(opensimModelJNI.ArrayDecorativeGeometry_getElt(swigCPtr, this, i), false);
  }

  public DecorativeGeometry updElt(long i) {
    return new DecorativeGeometry(opensimModelJNI.ArrayDecorativeGeometry_updElt(swigCPtr, this, i), false);
  }

  public DecorativeGeometry front() {
    return new DecorativeGeometry(opensimModelJNI.ArrayDecorativeGeometry_front__SWIG_0(swigCPtr, this), false);
  }

  public DecorativeGeometry back() {
    return new DecorativeGeometry(opensimModelJNI.ArrayDecorativeGeometry_back__SWIG_0(swigCPtr, this), false);
  }

  public void push_back(DecorativeGeometry value) {
    opensimModelJNI.ArrayDecorativeGeometry_push_back__SWIG_0(swigCPtr, this, DecorativeGeometry.getCPtr(value), value);
  }

  public void push_back() {
    opensimModelJNI.ArrayDecorativeGeometry_push_back__SWIG_1(swigCPtr, this);
  }

  public DecorativeGeometry raw_push_back() {
    long cPtr = opensimModelJNI.ArrayDecorativeGeometry_raw_push_back(swigCPtr, this);
    return (cPtr == 0) ? null : new DecorativeGeometry(cPtr, false);
  }

  public void pop_back() {
    opensimModelJNI.ArrayDecorativeGeometry_pop_back(swigCPtr, this);
  }

  public DecorativeGeometry erase(DecorativeGeometry first, DecorativeGeometry last1) {
    long cPtr = opensimModelJNI.ArrayDecorativeGeometry_erase__SWIG_0(swigCPtr, this, DecorativeGeometry.getCPtr(first), first, DecorativeGeometry.getCPtr(last1), last1);
    return (cPtr == 0) ? null : new DecorativeGeometry(cPtr, false);
  }

  public DecorativeGeometry erase(DecorativeGeometry p) {
    long cPtr = opensimModelJNI.ArrayDecorativeGeometry_erase__SWIG_1(swigCPtr, this, DecorativeGeometry.getCPtr(p), p);
    return (cPtr == 0) ? null : new DecorativeGeometry(cPtr, false);
  }

  public DecorativeGeometry eraseFast(DecorativeGeometry p) {
    long cPtr = opensimModelJNI.ArrayDecorativeGeometry_eraseFast(swigCPtr, this, DecorativeGeometry.getCPtr(p), p);
    return (cPtr == 0) ? null : new DecorativeGeometry(cPtr, false);
  }

  public void clear() {
    opensimModelJNI.ArrayDecorativeGeometry_clear(swigCPtr, this);
  }

  public DecorativeGeometry insert(DecorativeGeometry p, long n, DecorativeGeometry value) {
    long cPtr = opensimModelJNI.ArrayDecorativeGeometry_insert__SWIG_0(swigCPtr, this, DecorativeGeometry.getCPtr(p), p, n, DecorativeGeometry.getCPtr(value), value);
    return (cPtr == 0) ? null : new DecorativeGeometry(cPtr, false);
  }

  public DecorativeGeometry insert(DecorativeGeometry p, DecorativeGeometry value) {
    long cPtr = opensimModelJNI.ArrayDecorativeGeometry_insert__SWIG_1(swigCPtr, this, DecorativeGeometry.getCPtr(p), p, DecorativeGeometry.getCPtr(value), value);
    return (cPtr == 0) ? null : new DecorativeGeometry(cPtr, false);
  }

}
