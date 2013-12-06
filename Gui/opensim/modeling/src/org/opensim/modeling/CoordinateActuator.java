/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class CoordinateActuator extends Actuator {
  private long swigCPtr;

  public CoordinateActuator(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.CoordinateActuator_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(CoordinateActuator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_CoordinateActuator(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static CoordinateActuator safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.CoordinateActuator_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new CoordinateActuator(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.CoordinateActuator_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.CoordinateActuator_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.CoordinateActuator_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new CoordinateActuator(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.CoordinateActuator_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_coordinate(CoordinateActuator source) {
    opensimModelJNI.CoordinateActuator_copyProperty_coordinate(swigCPtr, this, CoordinateActuator.getCPtr(source), source);
  }

  public String get_coordinate(int i) {
    return opensimModelJNI.CoordinateActuator_get_coordinate__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_coordinate(int i) {
    return new SWIGTYPE_p_std__string(opensimModelJNI.CoordinateActuator_upd_coordinate__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_coordinate(int i, String value) {
    opensimModelJNI.CoordinateActuator_set_coordinate__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_coordinate(String value) {
    return opensimModelJNI.CoordinateActuator_append_coordinate(swigCPtr, this, value);
  }

  public void constructProperty_coordinate() {
    opensimModelJNI.CoordinateActuator_constructProperty_coordinate__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_coordinate(String initValue) {
    opensimModelJNI.CoordinateActuator_constructProperty_coordinate__SWIG_1(swigCPtr, this, initValue);
  }

  public String get_coordinate() {
    return opensimModelJNI.CoordinateActuator_get_coordinate__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_coordinate() {
    return new SWIGTYPE_p_std__string(opensimModelJNI.CoordinateActuator_upd_coordinate__SWIG_1(swigCPtr, this), false);
  }

  public void set_coordinate(String value) {
    opensimModelJNI.CoordinateActuator_set_coordinate__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_optimal_force(CoordinateActuator source) {
    opensimModelJNI.CoordinateActuator_copyProperty_optimal_force(swigCPtr, this, CoordinateActuator.getCPtr(source), source);
  }

  public double get_optimal_force(int i) {
    return opensimModelJNI.CoordinateActuator_get_optimal_force__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_optimal_force(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.CoordinateActuator_upd_optimal_force__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_optimal_force(int i, double value) {
    opensimModelJNI.CoordinateActuator_set_optimal_force__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_optimal_force(double value) {
    return opensimModelJNI.CoordinateActuator_append_optimal_force(swigCPtr, this, value);
  }

  public void constructProperty_optimal_force(double initValue) {
    opensimModelJNI.CoordinateActuator_constructProperty_optimal_force(swigCPtr, this, initValue);
  }

  public double get_optimal_force() {
    return opensimModelJNI.CoordinateActuator_get_optimal_force__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_optimal_force() {
    return new SWIGTYPE_p_double(opensimModelJNI.CoordinateActuator_upd_optimal_force__SWIG_1(swigCPtr, this), false);
  }

  public void set_optimal_force(double value) {
    opensimModelJNI.CoordinateActuator_set_optimal_force__SWIG_1(swigCPtr, this, value);
  }

  public CoordinateActuator(String coordinateName) {
    this(opensimModelJNI.new_CoordinateActuator__SWIG_0(coordinateName), true);
  }

  public CoordinateActuator() {
    this(opensimModelJNI.new_CoordinateActuator__SWIG_1(), true);
  }

  public void setOptimalForce(double optimalForce) {
    opensimModelJNI.CoordinateActuator_setOptimalForce(swigCPtr, this, optimalForce);
  }

  public double getOptimalForce() {
    return opensimModelJNI.CoordinateActuator_getOptimalForce(swigCPtr, this);
  }

  public static ForceSet CreateForceSetOfCoordinateActuatorsForModel(State s, Model aModel, double aOptimalForce, boolean aIncludeLockedAndConstrainedCoordinates) {
    long cPtr = opensimModelJNI.CoordinateActuator_CreateForceSetOfCoordinateActuatorsForModel__SWIG_0(State.getCPtr(s), s, Model.getCPtr(aModel), aModel, aOptimalForce, aIncludeLockedAndConstrainedCoordinates);
    return (cPtr == 0) ? null : new ForceSet(cPtr, false);
  }

  public static ForceSet CreateForceSetOfCoordinateActuatorsForModel(State s, Model aModel, double aOptimalForce) {
    long cPtr = opensimModelJNI.CoordinateActuator_CreateForceSetOfCoordinateActuatorsForModel__SWIG_1(State.getCPtr(s), s, Model.getCPtr(aModel), aModel, aOptimalForce);
    return (cPtr == 0) ? null : new ForceSet(cPtr, false);
  }

  public static ForceSet CreateForceSetOfCoordinateActuatorsForModel(State s, Model aModel) {
    long cPtr = opensimModelJNI.CoordinateActuator_CreateForceSetOfCoordinateActuatorsForModel__SWIG_2(State.getCPtr(s), s, Model.getCPtr(aModel), aModel);
    return (cPtr == 0) ? null : new ForceSet(cPtr, false);
  }

  public boolean isCoordinateValid() {
    return opensimModelJNI.CoordinateActuator_isCoordinateValid(swigCPtr, this);
  }

  public double getSpeed(State s) {
    return opensimModelJNI.CoordinateActuator_getSpeed(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setCoordinate(Coordinate aCoordinate) {
    opensimModelJNI.CoordinateActuator_setCoordinate(swigCPtr, this, Coordinate.getCPtr(aCoordinate), aCoordinate);
  }

  public Coordinate getCoordinate() {
    long cPtr = opensimModelJNI.CoordinateActuator_getCoordinate(swigCPtr, this);
    return (cPtr == 0) ? null : new Coordinate(cPtr, false);
  }

}
