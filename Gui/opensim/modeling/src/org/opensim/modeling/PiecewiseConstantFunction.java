/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PiecewiseConstantFunction extends Function {
  private long swigCPtr;

  public PiecewiseConstantFunction(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.PiecewiseConstantFunction_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PiecewiseConstantFunction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_PiecewiseConstantFunction(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static PiecewiseConstantFunction safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.PiecewiseConstantFunction_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new PiecewiseConstantFunction(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.PiecewiseConstantFunction_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.PiecewiseConstantFunction_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.PiecewiseConstantFunction_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PiecewiseConstantFunction(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.PiecewiseConstantFunction_getConcreteClassName(swigCPtr, this);
  }

  public PiecewiseConstantFunction() {
    this(opensimModelJNI.new_PiecewiseConstantFunction__SWIG_0(), true);
  }

  public PiecewiseConstantFunction(int aN, SWIGTYPE_p_double aTimes, SWIGTYPE_p_double aValues, String aName) {
    this(opensimModelJNI.new_PiecewiseConstantFunction__SWIG_1(aN, SWIGTYPE_p_double.getCPtr(aTimes), SWIGTYPE_p_double.getCPtr(aValues), aName), true);
  }

  public PiecewiseConstantFunction(int aN, SWIGTYPE_p_double aTimes, SWIGTYPE_p_double aValues) {
    this(opensimModelJNI.new_PiecewiseConstantFunction__SWIG_2(aN, SWIGTYPE_p_double.getCPtr(aTimes), SWIGTYPE_p_double.getCPtr(aValues)), true);
  }

  public PiecewiseConstantFunction(PiecewiseConstantFunction aFunction) {
    this(opensimModelJNI.new_PiecewiseConstantFunction__SWIG_3(PiecewiseConstantFunction.getCPtr(aFunction), aFunction), true);
  }

  public void init(Function aFunction) {
    opensimModelJNI.PiecewiseConstantFunction_init(swigCPtr, this, Function.getCPtr(aFunction), aFunction);
  }

  public int getSize() {
    return opensimModelJNI.PiecewiseConstantFunction_getSize(swigCPtr, this);
  }

  public ArrayDouble getX() {
    return new ArrayDouble(opensimModelJNI.PiecewiseConstantFunction_getX__SWIG_0(swigCPtr, this), false);
  }

  public ArrayDouble getY() {
    return new ArrayDouble(opensimModelJNI.PiecewiseConstantFunction_getY__SWIG_0(swigCPtr, this), false);
  }

  public SWIGTYPE_p_double getXValues() {
    long cPtr = opensimModelJNI.PiecewiseConstantFunction_getXValues(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  public SWIGTYPE_p_double getYValues() {
    long cPtr = opensimModelJNI.PiecewiseConstantFunction_getYValues(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  public int getNumberOfPoints() {
    return opensimModelJNI.PiecewiseConstantFunction_getNumberOfPoints(swigCPtr, this);
  }

  public double getX(int aIndex) {
    return opensimModelJNI.PiecewiseConstantFunction_getX__SWIG_1(swigCPtr, this, aIndex);
  }

  public double getY(int aIndex) {
    return opensimModelJNI.PiecewiseConstantFunction_getY__SWIG_1(swigCPtr, this, aIndex);
  }

  public double getZ(int aIndex) {
    return opensimModelJNI.PiecewiseConstantFunction_getZ(swigCPtr, this, aIndex);
  }

  public void setX(int aIndex, double aValue) {
    opensimModelJNI.PiecewiseConstantFunction_setX(swigCPtr, this, aIndex, aValue);
  }

  public void setY(int aIndex, double aValue) {
    opensimModelJNI.PiecewiseConstantFunction_setY(swigCPtr, this, aIndex, aValue);
  }

  public boolean deletePoint(int aIndex) {
    return opensimModelJNI.PiecewiseConstantFunction_deletePoint(swigCPtr, this, aIndex);
  }

  public boolean deletePoints(ArrayInt indices) {
    return opensimModelJNI.PiecewiseConstantFunction_deletePoints(swigCPtr, this, ArrayInt.getCPtr(indices), indices);
  }

  public int addPoint(double aX, double aY) {
    return opensimModelJNI.PiecewiseConstantFunction_addPoint(swigCPtr, this, aX, aY);
  }

  public double evaluateTotalFirstDerivative(double aX, double aDxdt) {
    return opensimModelJNI.PiecewiseConstantFunction_evaluateTotalFirstDerivative(swigCPtr, this, aX, aDxdt);
  }

  public double evaluateTotalSecondDerivative(double aX, double aDxdt, double aD2xdt2) {
    return opensimModelJNI.PiecewiseConstantFunction_evaluateTotalSecondDerivative(swigCPtr, this, aX, aDxdt, aD2xdt2);
  }

  public double calcValue(Vector x) {
    return opensimModelJNI.PiecewiseConstantFunction_calcValue(swigCPtr, this, Vector.getCPtr(x), x);
  }

  public double calcDerivative(StdVecInt derivComponents, Vector x) {
    return opensimModelJNI.PiecewiseConstantFunction_calcDerivative(swigCPtr, this, StdVecInt.getCPtr(derivComponents), derivComponents, Vector.getCPtr(x), x);
  }

  public int getArgumentSize() {
    return opensimModelJNI.PiecewiseConstantFunction_getArgumentSize(swigCPtr, this);
  }

  public int getMaxDerivativeOrder() {
    return opensimModelJNI.PiecewiseConstantFunction_getMaxDerivativeOrder(swigCPtr, this);
  }

  public SWIGTYPE_p_SimTK__Function createSimTKFunction() {
    long cPtr = opensimModelJNI.PiecewiseConstantFunction_createSimTKFunction(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SimTK__Function(cPtr, false);
  }

}
