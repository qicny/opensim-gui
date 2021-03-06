/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ArrayPointForceDirection {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArrayPointForceDirection(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArrayPointForceDirection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_ArrayPointForceDirection(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArrayPointForceDirection(PointForceDirection aDefaultValue, int aSize, int aCapacity) {
    this(opensimSimulationJNI.new_ArrayPointForceDirection__SWIG_0(PointForceDirection.getCPtr(aDefaultValue), aDefaultValue, aSize, aCapacity), true);
  }

  public ArrayPointForceDirection(PointForceDirection aDefaultValue, int aSize) {
    this(opensimSimulationJNI.new_ArrayPointForceDirection__SWIG_1(PointForceDirection.getCPtr(aDefaultValue), aDefaultValue, aSize), true);
  }

  public ArrayPointForceDirection(PointForceDirection aDefaultValue) {
    this(opensimSimulationJNI.new_ArrayPointForceDirection__SWIG_2(PointForceDirection.getCPtr(aDefaultValue), aDefaultValue), true);
  }

  public ArrayPointForceDirection() {
    this(opensimSimulationJNI.new_ArrayPointForceDirection__SWIG_3(), true);
  }

  public ArrayPointForceDirection(ArrayPointForceDirection aArray) {
    this(opensimSimulationJNI.new_ArrayPointForceDirection__SWIG_4(ArrayPointForceDirection.getCPtr(aArray), aArray), true);
  }

  public boolean arrayEquals(ArrayPointForceDirection aArray) {
    return opensimSimulationJNI.ArrayPointForceDirection_arrayEquals(swigCPtr, this, ArrayPointForceDirection.getCPtr(aArray), aArray);
  }

  public void trim() {
    opensimSimulationJNI.ArrayPointForceDirection_trim(swigCPtr, this);
  }

  public boolean setSize(int aSize) {
    return opensimSimulationJNI.ArrayPointForceDirection_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimSimulationJNI.ArrayPointForceDirection_getSize(swigCPtr, this);
  }

  public int size() {
    return opensimSimulationJNI.ArrayPointForceDirection_size(swigCPtr, this);
  }

  public int append(PointForceDirection aValue) {
    return opensimSimulationJNI.ArrayPointForceDirection_append__SWIG_0(swigCPtr, this, PointForceDirection.getCPtr(aValue), aValue);
  }

  public int append(ArrayPointForceDirection aArray) {
    return opensimSimulationJNI.ArrayPointForceDirection_append__SWIG_1(swigCPtr, this, ArrayPointForceDirection.getCPtr(aArray), aArray);
  }

  public int insert(int aIndex, PointForceDirection aValue) {
    return opensimSimulationJNI.ArrayPointForceDirection_insert(swigCPtr, this, aIndex, PointForceDirection.getCPtr(aValue), aValue);
  }

  public int remove(int aIndex) {
    return opensimSimulationJNI.ArrayPointForceDirection_remove(swigCPtr, this, aIndex);
  }

  public void set(int aIndex, PointForceDirection aValue) {
    opensimSimulationJNI.ArrayPointForceDirection_set(swigCPtr, this, aIndex, PointForceDirection.getCPtr(aValue), aValue);
  }

  public PointForceDirection get(int aIndex) {
    long cPtr = opensimSimulationJNI.ArrayPointForceDirection_get(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new PointForceDirection(cPtr, false);
  }

  public PointForceDirection getitem(int index) {
    long cPtr = opensimSimulationJNI.ArrayPointForceDirection_getitem(swigCPtr, this, index);
    return (cPtr == 0) ? null : new PointForceDirection(cPtr, false);
  }

  public void setitem(int index, PointForceDirection val) {
    opensimSimulationJNI.ArrayPointForceDirection_setitem(swigCPtr, this, index, PointForceDirection.getCPtr(val), val);
  }

  public PointForceDirection getLast() {
    long cPtr = opensimSimulationJNI.ArrayPointForceDirection_getLast(swigCPtr, this);
    return (cPtr == 0) ? null : new PointForceDirection(cPtr, false);
  }

  public int findIndex(PointForceDirection aValue) {
    return opensimSimulationJNI.ArrayPointForceDirection_findIndex(swigCPtr, this, PointForceDirection.getCPtr(aValue), aValue);
  }

  public int rfindIndex(PointForceDirection aValue) {
    return opensimSimulationJNI.ArrayPointForceDirection_rfindIndex(swigCPtr, this, PointForceDirection.getCPtr(aValue), aValue);
  }

  public int searchBinary(PointForceDirection aValue, boolean aFindFirst, int aLo, int aHi) {
    return opensimSimulationJNI.ArrayPointForceDirection_searchBinary__SWIG_0(swigCPtr, this, PointForceDirection.getCPtr(aValue), aValue, aFindFirst, aLo, aHi);
  }

  public int searchBinary(PointForceDirection aValue, boolean aFindFirst, int aLo) {
    return opensimSimulationJNI.ArrayPointForceDirection_searchBinary__SWIG_1(swigCPtr, this, PointForceDirection.getCPtr(aValue), aValue, aFindFirst, aLo);
  }

  public int searchBinary(PointForceDirection aValue, boolean aFindFirst) {
    return opensimSimulationJNI.ArrayPointForceDirection_searchBinary__SWIG_2(swigCPtr, this, PointForceDirection.getCPtr(aValue), aValue, aFindFirst);
  }

  public int searchBinary(PointForceDirection aValue) {
    return opensimSimulationJNI.ArrayPointForceDirection_searchBinary__SWIG_3(swigCPtr, this, PointForceDirection.getCPtr(aValue), aValue);
  }

}
