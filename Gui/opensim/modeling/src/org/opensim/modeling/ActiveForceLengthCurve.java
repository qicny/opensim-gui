/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ActiveForceLengthCurve extends Function {
  private long swigCPtr;

  public ActiveForceLengthCurve(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ActiveForceLengthCurve_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ActiveForceLengthCurve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ActiveForceLengthCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ActiveForceLengthCurve safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.ActiveForceLengthCurve_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ActiveForceLengthCurve(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.ActiveForceLengthCurve_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.ActiveForceLengthCurve_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.ActiveForceLengthCurve_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ActiveForceLengthCurve(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.ActiveForceLengthCurve_getConcreteClassName(swigCPtr, this);
  }

  public void setPropertyIndex_min_norm_active_fiber_length(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.ActiveForceLengthCurve_PropertyIndex_min_norm_active_fiber_length_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_min_norm_active_fiber_length() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.ActiveForceLengthCurve_PropertyIndex_min_norm_active_fiber_length_get(swigCPtr, this), true);
  }

  public void copyProperty_min_norm_active_fiber_length(ActiveForceLengthCurve source) {
    opensimModelJNI.ActiveForceLengthCurve_copyProperty_min_norm_active_fiber_length(swigCPtr, this, ActiveForceLengthCurve.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_min_norm_active_fiber_length() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ActiveForceLengthCurve_getProperty_min_norm_active_fiber_length(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_min_norm_active_fiber_length() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ActiveForceLengthCurve_updProperty_min_norm_active_fiber_length(swigCPtr, this), false);
  }

  public double get_min_norm_active_fiber_length(int i) {
    return opensimModelJNI.ActiveForceLengthCurve_get_min_norm_active_fiber_length__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_min_norm_active_fiber_length(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.ActiveForceLengthCurve_upd_min_norm_active_fiber_length__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_min_norm_active_fiber_length(int i, double value) {
    opensimModelJNI.ActiveForceLengthCurve_set_min_norm_active_fiber_length__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_min_norm_active_fiber_length(double value) {
    return opensimModelJNI.ActiveForceLengthCurve_append_min_norm_active_fiber_length(swigCPtr, this, value);
  }

  public void constructProperty_min_norm_active_fiber_length(double initValue) {
    opensimModelJNI.ActiveForceLengthCurve_constructProperty_min_norm_active_fiber_length(swigCPtr, this, initValue);
  }

  public double get_min_norm_active_fiber_length() {
    return opensimModelJNI.ActiveForceLengthCurve_get_min_norm_active_fiber_length__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_min_norm_active_fiber_length() {
    return new SWIGTYPE_p_double(opensimModelJNI.ActiveForceLengthCurve_upd_min_norm_active_fiber_length__SWIG_1(swigCPtr, this), false);
  }

  public void set_min_norm_active_fiber_length(double value) {
    opensimModelJNI.ActiveForceLengthCurve_set_min_norm_active_fiber_length__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_transition_norm_fiber_length(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.ActiveForceLengthCurve_PropertyIndex_transition_norm_fiber_length_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_transition_norm_fiber_length() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.ActiveForceLengthCurve_PropertyIndex_transition_norm_fiber_length_get(swigCPtr, this), true);
  }

  public void copyProperty_transition_norm_fiber_length(ActiveForceLengthCurve source) {
    opensimModelJNI.ActiveForceLengthCurve_copyProperty_transition_norm_fiber_length(swigCPtr, this, ActiveForceLengthCurve.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_transition_norm_fiber_length() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ActiveForceLengthCurve_getProperty_transition_norm_fiber_length(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_transition_norm_fiber_length() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ActiveForceLengthCurve_updProperty_transition_norm_fiber_length(swigCPtr, this), false);
  }

  public double get_transition_norm_fiber_length(int i) {
    return opensimModelJNI.ActiveForceLengthCurve_get_transition_norm_fiber_length__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_transition_norm_fiber_length(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.ActiveForceLengthCurve_upd_transition_norm_fiber_length__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_transition_norm_fiber_length(int i, double value) {
    opensimModelJNI.ActiveForceLengthCurve_set_transition_norm_fiber_length__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_transition_norm_fiber_length(double value) {
    return opensimModelJNI.ActiveForceLengthCurve_append_transition_norm_fiber_length(swigCPtr, this, value);
  }

  public void constructProperty_transition_norm_fiber_length(double initValue) {
    opensimModelJNI.ActiveForceLengthCurve_constructProperty_transition_norm_fiber_length(swigCPtr, this, initValue);
  }

  public double get_transition_norm_fiber_length() {
    return opensimModelJNI.ActiveForceLengthCurve_get_transition_norm_fiber_length__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_transition_norm_fiber_length() {
    return new SWIGTYPE_p_double(opensimModelJNI.ActiveForceLengthCurve_upd_transition_norm_fiber_length__SWIG_1(swigCPtr, this), false);
  }

  public void set_transition_norm_fiber_length(double value) {
    opensimModelJNI.ActiveForceLengthCurve_set_transition_norm_fiber_length__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_max_norm_active_fiber_length(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.ActiveForceLengthCurve_PropertyIndex_max_norm_active_fiber_length_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_max_norm_active_fiber_length() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.ActiveForceLengthCurve_PropertyIndex_max_norm_active_fiber_length_get(swigCPtr, this), true);
  }

  public void copyProperty_max_norm_active_fiber_length(ActiveForceLengthCurve source) {
    opensimModelJNI.ActiveForceLengthCurve_copyProperty_max_norm_active_fiber_length(swigCPtr, this, ActiveForceLengthCurve.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_max_norm_active_fiber_length() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ActiveForceLengthCurve_getProperty_max_norm_active_fiber_length(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_max_norm_active_fiber_length() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ActiveForceLengthCurve_updProperty_max_norm_active_fiber_length(swigCPtr, this), false);
  }

  public double get_max_norm_active_fiber_length(int i) {
    return opensimModelJNI.ActiveForceLengthCurve_get_max_norm_active_fiber_length__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_max_norm_active_fiber_length(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.ActiveForceLengthCurve_upd_max_norm_active_fiber_length__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_max_norm_active_fiber_length(int i, double value) {
    opensimModelJNI.ActiveForceLengthCurve_set_max_norm_active_fiber_length__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_max_norm_active_fiber_length(double value) {
    return opensimModelJNI.ActiveForceLengthCurve_append_max_norm_active_fiber_length(swigCPtr, this, value);
  }

  public void constructProperty_max_norm_active_fiber_length(double initValue) {
    opensimModelJNI.ActiveForceLengthCurve_constructProperty_max_norm_active_fiber_length(swigCPtr, this, initValue);
  }

  public double get_max_norm_active_fiber_length() {
    return opensimModelJNI.ActiveForceLengthCurve_get_max_norm_active_fiber_length__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_max_norm_active_fiber_length() {
    return new SWIGTYPE_p_double(opensimModelJNI.ActiveForceLengthCurve_upd_max_norm_active_fiber_length__SWIG_1(swigCPtr, this), false);
  }

  public void set_max_norm_active_fiber_length(double value) {
    opensimModelJNI.ActiveForceLengthCurve_set_max_norm_active_fiber_length__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_shallow_ascending_slope(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.ActiveForceLengthCurve_PropertyIndex_shallow_ascending_slope_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_shallow_ascending_slope() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.ActiveForceLengthCurve_PropertyIndex_shallow_ascending_slope_get(swigCPtr, this), true);
  }

  public void copyProperty_shallow_ascending_slope(ActiveForceLengthCurve source) {
    opensimModelJNI.ActiveForceLengthCurve_copyProperty_shallow_ascending_slope(swigCPtr, this, ActiveForceLengthCurve.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_shallow_ascending_slope() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ActiveForceLengthCurve_getProperty_shallow_ascending_slope(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_shallow_ascending_slope() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ActiveForceLengthCurve_updProperty_shallow_ascending_slope(swigCPtr, this), false);
  }

  public double get_shallow_ascending_slope(int i) {
    return opensimModelJNI.ActiveForceLengthCurve_get_shallow_ascending_slope__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_shallow_ascending_slope(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.ActiveForceLengthCurve_upd_shallow_ascending_slope__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_shallow_ascending_slope(int i, double value) {
    opensimModelJNI.ActiveForceLengthCurve_set_shallow_ascending_slope__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_shallow_ascending_slope(double value) {
    return opensimModelJNI.ActiveForceLengthCurve_append_shallow_ascending_slope(swigCPtr, this, value);
  }

  public void constructProperty_shallow_ascending_slope(double initValue) {
    opensimModelJNI.ActiveForceLengthCurve_constructProperty_shallow_ascending_slope(swigCPtr, this, initValue);
  }

  public double get_shallow_ascending_slope() {
    return opensimModelJNI.ActiveForceLengthCurve_get_shallow_ascending_slope__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_shallow_ascending_slope() {
    return new SWIGTYPE_p_double(opensimModelJNI.ActiveForceLengthCurve_upd_shallow_ascending_slope__SWIG_1(swigCPtr, this), false);
  }

  public void set_shallow_ascending_slope(double value) {
    opensimModelJNI.ActiveForceLengthCurve_set_shallow_ascending_slope__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_minimum_value(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.ActiveForceLengthCurve_PropertyIndex_minimum_value_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_minimum_value() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.ActiveForceLengthCurve_PropertyIndex_minimum_value_get(swigCPtr, this), true);
  }

  public void copyProperty_minimum_value(ActiveForceLengthCurve source) {
    opensimModelJNI.ActiveForceLengthCurve_copyProperty_minimum_value(swigCPtr, this, ActiveForceLengthCurve.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_minimum_value() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ActiveForceLengthCurve_getProperty_minimum_value(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_minimum_value() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ActiveForceLengthCurve_updProperty_minimum_value(swigCPtr, this), false);
  }

  public double get_minimum_value(int i) {
    return opensimModelJNI.ActiveForceLengthCurve_get_minimum_value__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_minimum_value(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.ActiveForceLengthCurve_upd_minimum_value__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_minimum_value(int i, double value) {
    opensimModelJNI.ActiveForceLengthCurve_set_minimum_value__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_minimum_value(double value) {
    return opensimModelJNI.ActiveForceLengthCurve_append_minimum_value(swigCPtr, this, value);
  }

  public void constructProperty_minimum_value(double initValue) {
    opensimModelJNI.ActiveForceLengthCurve_constructProperty_minimum_value(swigCPtr, this, initValue);
  }

  public double get_minimum_value() {
    return opensimModelJNI.ActiveForceLengthCurve_get_minimum_value__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_minimum_value() {
    return new SWIGTYPE_p_double(opensimModelJNI.ActiveForceLengthCurve_upd_minimum_value__SWIG_1(swigCPtr, this), false);
  }

  public void set_minimum_value(double value) {
    opensimModelJNI.ActiveForceLengthCurve_set_minimum_value__SWIG_1(swigCPtr, this, value);
  }

  public ActiveForceLengthCurve() {
    this(opensimModelJNI.new_ActiveForceLengthCurve__SWIG_0(), true);
  }

  public ActiveForceLengthCurve(double minActiveNormFiberLength, double transitionNormFiberLength, double maxActiveNormFiberLength, double shallowAscendingSlope, double minValue, String muscleName) {
    this(opensimModelJNI.new_ActiveForceLengthCurve__SWIG_1(minActiveNormFiberLength, transitionNormFiberLength, maxActiveNormFiberLength, shallowAscendingSlope, minValue, muscleName), true);
  }

  public double getMinActiveFiberLength() {
    return opensimModelJNI.ActiveForceLengthCurve_getMinActiveFiberLength(swigCPtr, this);
  }

  public double getTransitionFiberLength() {
    return opensimModelJNI.ActiveForceLengthCurve_getTransitionFiberLength(swigCPtr, this);
  }

  public double getMaxActiveFiberLength() {
    return opensimModelJNI.ActiveForceLengthCurve_getMaxActiveFiberLength(swigCPtr, this);
  }

  public double getShallowAscendingSlope() {
    return opensimModelJNI.ActiveForceLengthCurve_getShallowAscendingSlope(swigCPtr, this);
  }

  public double getMinValue() {
    return opensimModelJNI.ActiveForceLengthCurve_getMinValue(swigCPtr, this);
  }

  public void setActiveFiberLengths(double minActiveNormFiberLength, double transitionNormFiberLength, double maxActiveNormFiberLength, double shallowAscendingSlope) {
    opensimModelJNI.ActiveForceLengthCurve_setActiveFiberLengths(swigCPtr, this, minActiveNormFiberLength, transitionNormFiberLength, maxActiveNormFiberLength, shallowAscendingSlope);
  }

  public void setMinValue(double minValue) {
    opensimModelJNI.ActiveForceLengthCurve_setMinValue(swigCPtr, this, minValue);
  }

  public double calcValue(double normFiberLength) {
    return opensimModelJNI.ActiveForceLengthCurve_calcValue(swigCPtr, this, normFiberLength);
  }

  public double calcDerivative(double normFiberLength, int order) {
    return opensimModelJNI.ActiveForceLengthCurve_calcDerivative(swigCPtr, this, normFiberLength, order);
  }

  public SWIGTYPE_p_SimTK__VecT_2_double_1_t getCurveDomain() {
    return new SWIGTYPE_p_SimTK__VecT_2_double_1_t(opensimModelJNI.ActiveForceLengthCurve_getCurveDomain(swigCPtr, this), true);
  }

  public void printMuscleCurveToCSVFile(String path) {
    opensimModelJNI.ActiveForceLengthCurve_printMuscleCurveToCSVFile(swigCPtr, this, path);
  }

  public void ensureCurveUpToDate() {
    opensimModelJNI.ActiveForceLengthCurve_ensureCurveUpToDate(swigCPtr, this);
  }

}
