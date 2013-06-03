/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ForceVelocityInverseCurve extends Function {
  private long swigCPtr;

  public ForceVelocityInverseCurve(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ForceVelocityInverseCurve_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ForceVelocityInverseCurve obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ForceVelocityInverseCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ForceVelocityInverseCurve safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.ForceVelocityInverseCurve_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ForceVelocityInverseCurve(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.ForceVelocityInverseCurve_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.ForceVelocityInverseCurve_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.ForceVelocityInverseCurve_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ForceVelocityInverseCurve(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.ForceVelocityInverseCurve_getConcreteClassName(swigCPtr, this);
  }

  public void setPropertyIndex_concentric_slope_at_vmax(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.ForceVelocityInverseCurve_PropertyIndex_concentric_slope_at_vmax_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_concentric_slope_at_vmax() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.ForceVelocityInverseCurve_PropertyIndex_concentric_slope_at_vmax_get(swigCPtr, this), true);
  }

  public void copyProperty_concentric_slope_at_vmax(ForceVelocityInverseCurve source) {
    opensimModelJNI.ForceVelocityInverseCurve_copyProperty_concentric_slope_at_vmax(swigCPtr, this, ForceVelocityInverseCurve.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_concentric_slope_at_vmax() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ForceVelocityInverseCurve_getProperty_concentric_slope_at_vmax(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_concentric_slope_at_vmax() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ForceVelocityInverseCurve_updProperty_concentric_slope_at_vmax(swigCPtr, this), false);
  }

  public double get_concentric_slope_at_vmax(int i) {
    return opensimModelJNI.ForceVelocityInverseCurve_get_concentric_slope_at_vmax__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_concentric_slope_at_vmax(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityInverseCurve_upd_concentric_slope_at_vmax__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_concentric_slope_at_vmax(int i, double value) {
    opensimModelJNI.ForceVelocityInverseCurve_set_concentric_slope_at_vmax__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_concentric_slope_at_vmax(double value) {
    return opensimModelJNI.ForceVelocityInverseCurve_append_concentric_slope_at_vmax(swigCPtr, this, value);
  }

  public void constructProperty_concentric_slope_at_vmax(double initValue) {
    opensimModelJNI.ForceVelocityInverseCurve_constructProperty_concentric_slope_at_vmax(swigCPtr, this, initValue);
  }

  public double get_concentric_slope_at_vmax() {
    return opensimModelJNI.ForceVelocityInverseCurve_get_concentric_slope_at_vmax__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_concentric_slope_at_vmax() {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityInverseCurve_upd_concentric_slope_at_vmax__SWIG_1(swigCPtr, this), false);
  }

  public void set_concentric_slope_at_vmax(double value) {
    opensimModelJNI.ForceVelocityInverseCurve_set_concentric_slope_at_vmax__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_concentric_slope_near_vmax(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.ForceVelocityInverseCurve_PropertyIndex_concentric_slope_near_vmax_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_concentric_slope_near_vmax() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.ForceVelocityInverseCurve_PropertyIndex_concentric_slope_near_vmax_get(swigCPtr, this), true);
  }

  public void copyProperty_concentric_slope_near_vmax(ForceVelocityInverseCurve source) {
    opensimModelJNI.ForceVelocityInverseCurve_copyProperty_concentric_slope_near_vmax(swigCPtr, this, ForceVelocityInverseCurve.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_concentric_slope_near_vmax() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ForceVelocityInverseCurve_getProperty_concentric_slope_near_vmax(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_concentric_slope_near_vmax() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ForceVelocityInverseCurve_updProperty_concentric_slope_near_vmax(swigCPtr, this), false);
  }

  public double get_concentric_slope_near_vmax(int i) {
    return opensimModelJNI.ForceVelocityInverseCurve_get_concentric_slope_near_vmax__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_concentric_slope_near_vmax(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityInverseCurve_upd_concentric_slope_near_vmax__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_concentric_slope_near_vmax(int i, double value) {
    opensimModelJNI.ForceVelocityInverseCurve_set_concentric_slope_near_vmax__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_concentric_slope_near_vmax(double value) {
    return opensimModelJNI.ForceVelocityInverseCurve_append_concentric_slope_near_vmax(swigCPtr, this, value);
  }

  public void constructProperty_concentric_slope_near_vmax(double initValue) {
    opensimModelJNI.ForceVelocityInverseCurve_constructProperty_concentric_slope_near_vmax(swigCPtr, this, initValue);
  }

  public double get_concentric_slope_near_vmax() {
    return opensimModelJNI.ForceVelocityInverseCurve_get_concentric_slope_near_vmax__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_concentric_slope_near_vmax() {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityInverseCurve_upd_concentric_slope_near_vmax__SWIG_1(swigCPtr, this), false);
  }

  public void set_concentric_slope_near_vmax(double value) {
    opensimModelJNI.ForceVelocityInverseCurve_set_concentric_slope_near_vmax__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_isometric_slope(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.ForceVelocityInverseCurve_PropertyIndex_isometric_slope_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_isometric_slope() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.ForceVelocityInverseCurve_PropertyIndex_isometric_slope_get(swigCPtr, this), true);
  }

  public void copyProperty_isometric_slope(ForceVelocityInverseCurve source) {
    opensimModelJNI.ForceVelocityInverseCurve_copyProperty_isometric_slope(swigCPtr, this, ForceVelocityInverseCurve.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_isometric_slope() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ForceVelocityInverseCurve_getProperty_isometric_slope(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_isometric_slope() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ForceVelocityInverseCurve_updProperty_isometric_slope(swigCPtr, this), false);
  }

  public double get_isometric_slope(int i) {
    return opensimModelJNI.ForceVelocityInverseCurve_get_isometric_slope__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_isometric_slope(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityInverseCurve_upd_isometric_slope__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_isometric_slope(int i, double value) {
    opensimModelJNI.ForceVelocityInverseCurve_set_isometric_slope__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_isometric_slope(double value) {
    return opensimModelJNI.ForceVelocityInverseCurve_append_isometric_slope(swigCPtr, this, value);
  }

  public void constructProperty_isometric_slope(double initValue) {
    opensimModelJNI.ForceVelocityInverseCurve_constructProperty_isometric_slope(swigCPtr, this, initValue);
  }

  public double get_isometric_slope() {
    return opensimModelJNI.ForceVelocityInverseCurve_get_isometric_slope__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_isometric_slope() {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityInverseCurve_upd_isometric_slope__SWIG_1(swigCPtr, this), false);
  }

  public void set_isometric_slope(double value) {
    opensimModelJNI.ForceVelocityInverseCurve_set_isometric_slope__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_eccentric_slope_at_vmax(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.ForceVelocityInverseCurve_PropertyIndex_eccentric_slope_at_vmax_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_eccentric_slope_at_vmax() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.ForceVelocityInverseCurve_PropertyIndex_eccentric_slope_at_vmax_get(swigCPtr, this), true);
  }

  public void copyProperty_eccentric_slope_at_vmax(ForceVelocityInverseCurve source) {
    opensimModelJNI.ForceVelocityInverseCurve_copyProperty_eccentric_slope_at_vmax(swigCPtr, this, ForceVelocityInverseCurve.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_eccentric_slope_at_vmax() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ForceVelocityInverseCurve_getProperty_eccentric_slope_at_vmax(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_eccentric_slope_at_vmax() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ForceVelocityInverseCurve_updProperty_eccentric_slope_at_vmax(swigCPtr, this), false);
  }

  public double get_eccentric_slope_at_vmax(int i) {
    return opensimModelJNI.ForceVelocityInverseCurve_get_eccentric_slope_at_vmax__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_eccentric_slope_at_vmax(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityInverseCurve_upd_eccentric_slope_at_vmax__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_eccentric_slope_at_vmax(int i, double value) {
    opensimModelJNI.ForceVelocityInverseCurve_set_eccentric_slope_at_vmax__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_eccentric_slope_at_vmax(double value) {
    return opensimModelJNI.ForceVelocityInverseCurve_append_eccentric_slope_at_vmax(swigCPtr, this, value);
  }

  public void constructProperty_eccentric_slope_at_vmax(double initValue) {
    opensimModelJNI.ForceVelocityInverseCurve_constructProperty_eccentric_slope_at_vmax(swigCPtr, this, initValue);
  }

  public double get_eccentric_slope_at_vmax() {
    return opensimModelJNI.ForceVelocityInverseCurve_get_eccentric_slope_at_vmax__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_eccentric_slope_at_vmax() {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityInverseCurve_upd_eccentric_slope_at_vmax__SWIG_1(swigCPtr, this), false);
  }

  public void set_eccentric_slope_at_vmax(double value) {
    opensimModelJNI.ForceVelocityInverseCurve_set_eccentric_slope_at_vmax__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_eccentric_slope_near_vmax(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.ForceVelocityInverseCurve_PropertyIndex_eccentric_slope_near_vmax_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_eccentric_slope_near_vmax() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.ForceVelocityInverseCurve_PropertyIndex_eccentric_slope_near_vmax_get(swigCPtr, this), true);
  }

  public void copyProperty_eccentric_slope_near_vmax(ForceVelocityInverseCurve source) {
    opensimModelJNI.ForceVelocityInverseCurve_copyProperty_eccentric_slope_near_vmax(swigCPtr, this, ForceVelocityInverseCurve.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_eccentric_slope_near_vmax() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ForceVelocityInverseCurve_getProperty_eccentric_slope_near_vmax(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_eccentric_slope_near_vmax() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ForceVelocityInverseCurve_updProperty_eccentric_slope_near_vmax(swigCPtr, this), false);
  }

  public double get_eccentric_slope_near_vmax(int i) {
    return opensimModelJNI.ForceVelocityInverseCurve_get_eccentric_slope_near_vmax__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_eccentric_slope_near_vmax(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityInverseCurve_upd_eccentric_slope_near_vmax__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_eccentric_slope_near_vmax(int i, double value) {
    opensimModelJNI.ForceVelocityInverseCurve_set_eccentric_slope_near_vmax__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_eccentric_slope_near_vmax(double value) {
    return opensimModelJNI.ForceVelocityInverseCurve_append_eccentric_slope_near_vmax(swigCPtr, this, value);
  }

  public void constructProperty_eccentric_slope_near_vmax(double initValue) {
    opensimModelJNI.ForceVelocityInverseCurve_constructProperty_eccentric_slope_near_vmax(swigCPtr, this, initValue);
  }

  public double get_eccentric_slope_near_vmax() {
    return opensimModelJNI.ForceVelocityInverseCurve_get_eccentric_slope_near_vmax__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_eccentric_slope_near_vmax() {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityInverseCurve_upd_eccentric_slope_near_vmax__SWIG_1(swigCPtr, this), false);
  }

  public void set_eccentric_slope_near_vmax(double value) {
    opensimModelJNI.ForceVelocityInverseCurve_set_eccentric_slope_near_vmax__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_max_eccentric_velocity_force_multiplier(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.ForceVelocityInverseCurve_PropertyIndex_max_eccentric_velocity_force_multiplier_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_max_eccentric_velocity_force_multiplier() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.ForceVelocityInverseCurve_PropertyIndex_max_eccentric_velocity_force_multiplier_get(swigCPtr, this), true);
  }

  public void copyProperty_max_eccentric_velocity_force_multiplier(ForceVelocityInverseCurve source) {
    opensimModelJNI.ForceVelocityInverseCurve_copyProperty_max_eccentric_velocity_force_multiplier(swigCPtr, this, ForceVelocityInverseCurve.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_max_eccentric_velocity_force_multiplier() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ForceVelocityInverseCurve_getProperty_max_eccentric_velocity_force_multiplier(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_max_eccentric_velocity_force_multiplier() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ForceVelocityInverseCurve_updProperty_max_eccentric_velocity_force_multiplier(swigCPtr, this), false);
  }

  public double get_max_eccentric_velocity_force_multiplier(int i) {
    return opensimModelJNI.ForceVelocityInverseCurve_get_max_eccentric_velocity_force_multiplier__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_max_eccentric_velocity_force_multiplier(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityInverseCurve_upd_max_eccentric_velocity_force_multiplier__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_max_eccentric_velocity_force_multiplier(int i, double value) {
    opensimModelJNI.ForceVelocityInverseCurve_set_max_eccentric_velocity_force_multiplier__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_max_eccentric_velocity_force_multiplier(double value) {
    return opensimModelJNI.ForceVelocityInverseCurve_append_max_eccentric_velocity_force_multiplier(swigCPtr, this, value);
  }

  public void constructProperty_max_eccentric_velocity_force_multiplier(double initValue) {
    opensimModelJNI.ForceVelocityInverseCurve_constructProperty_max_eccentric_velocity_force_multiplier(swigCPtr, this, initValue);
  }

  public double get_max_eccentric_velocity_force_multiplier() {
    return opensimModelJNI.ForceVelocityInverseCurve_get_max_eccentric_velocity_force_multiplier__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_max_eccentric_velocity_force_multiplier() {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityInverseCurve_upd_max_eccentric_velocity_force_multiplier__SWIG_1(swigCPtr, this), false);
  }

  public void set_max_eccentric_velocity_force_multiplier(double value) {
    opensimModelJNI.ForceVelocityInverseCurve_set_max_eccentric_velocity_force_multiplier__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_concentric_curviness(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.ForceVelocityInverseCurve_PropertyIndex_concentric_curviness_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_concentric_curviness() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.ForceVelocityInverseCurve_PropertyIndex_concentric_curviness_get(swigCPtr, this), true);
  }

  public void copyProperty_concentric_curviness(ForceVelocityInverseCurve source) {
    opensimModelJNI.ForceVelocityInverseCurve_copyProperty_concentric_curviness(swigCPtr, this, ForceVelocityInverseCurve.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_concentric_curviness() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ForceVelocityInverseCurve_getProperty_concentric_curviness(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_concentric_curviness() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ForceVelocityInverseCurve_updProperty_concentric_curviness(swigCPtr, this), false);
  }

  public double get_concentric_curviness(int i) {
    return opensimModelJNI.ForceVelocityInverseCurve_get_concentric_curviness__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_concentric_curviness(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityInverseCurve_upd_concentric_curviness__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_concentric_curviness(int i, double value) {
    opensimModelJNI.ForceVelocityInverseCurve_set_concentric_curviness__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_concentric_curviness(double value) {
    return opensimModelJNI.ForceVelocityInverseCurve_append_concentric_curviness(swigCPtr, this, value);
  }

  public void constructProperty_concentric_curviness(double initValue) {
    opensimModelJNI.ForceVelocityInverseCurve_constructProperty_concentric_curviness(swigCPtr, this, initValue);
  }

  public double get_concentric_curviness() {
    return opensimModelJNI.ForceVelocityInverseCurve_get_concentric_curviness__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_concentric_curviness() {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityInverseCurve_upd_concentric_curviness__SWIG_1(swigCPtr, this), false);
  }

  public void set_concentric_curviness(double value) {
    opensimModelJNI.ForceVelocityInverseCurve_set_concentric_curviness__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_eccentric_curviness(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.ForceVelocityInverseCurve_PropertyIndex_eccentric_curviness_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_eccentric_curviness() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.ForceVelocityInverseCurve_PropertyIndex_eccentric_curviness_get(swigCPtr, this), true);
  }

  public void copyProperty_eccentric_curviness(ForceVelocityInverseCurve source) {
    opensimModelJNI.ForceVelocityInverseCurve_copyProperty_eccentric_curviness(swigCPtr, this, ForceVelocityInverseCurve.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_eccentric_curviness() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ForceVelocityInverseCurve_getProperty_eccentric_curviness(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_eccentric_curviness() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.ForceVelocityInverseCurve_updProperty_eccentric_curviness(swigCPtr, this), false);
  }

  public double get_eccentric_curviness(int i) {
    return opensimModelJNI.ForceVelocityInverseCurve_get_eccentric_curviness__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_eccentric_curviness(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityInverseCurve_upd_eccentric_curviness__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_eccentric_curviness(int i, double value) {
    opensimModelJNI.ForceVelocityInverseCurve_set_eccentric_curviness__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_eccentric_curviness(double value) {
    return opensimModelJNI.ForceVelocityInverseCurve_append_eccentric_curviness(swigCPtr, this, value);
  }

  public void constructProperty_eccentric_curviness(double initValue) {
    opensimModelJNI.ForceVelocityInverseCurve_constructProperty_eccentric_curviness(swigCPtr, this, initValue);
  }

  public double get_eccentric_curviness() {
    return opensimModelJNI.ForceVelocityInverseCurve_get_eccentric_curviness__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_eccentric_curviness() {
    return new SWIGTYPE_p_double(opensimModelJNI.ForceVelocityInverseCurve_upd_eccentric_curviness__SWIG_1(swigCPtr, this), false);
  }

  public void set_eccentric_curviness(double value) {
    opensimModelJNI.ForceVelocityInverseCurve_set_eccentric_curviness__SWIG_1(swigCPtr, this, value);
  }

  public ForceVelocityInverseCurve() {
    this(opensimModelJNI.new_ForceVelocityInverseCurve__SWIG_0(), true);
  }

  public ForceVelocityInverseCurve(double concentricSlopeAtVmax, double concentricSlopeNearVmax, double isometricSlope, double eccentricSlopeAtVmax, double eccentricSlopeNearVmax, double maxEccentricVelocityForceMultiplier, double concentricCurviness, double eccentricCurviness, String muscleName) {
    this(opensimModelJNI.new_ForceVelocityInverseCurve__SWIG_1(concentricSlopeAtVmax, concentricSlopeNearVmax, isometricSlope, eccentricSlopeAtVmax, eccentricSlopeNearVmax, maxEccentricVelocityForceMultiplier, concentricCurviness, eccentricCurviness, muscleName), true);
  }

  public double getConcentricSlopeAtVmax() {
    return opensimModelJNI.ForceVelocityInverseCurve_getConcentricSlopeAtVmax(swigCPtr, this);
  }

  public double getConcentricSlopeNearVmax() {
    return opensimModelJNI.ForceVelocityInverseCurve_getConcentricSlopeNearVmax(swigCPtr, this);
  }

  public double getIsometricSlope() {
    return opensimModelJNI.ForceVelocityInverseCurve_getIsometricSlope(swigCPtr, this);
  }

  public double getEccentricSlopeAtVmax() {
    return opensimModelJNI.ForceVelocityInverseCurve_getEccentricSlopeAtVmax(swigCPtr, this);
  }

  public double getEccentricSlopeNearVmax() {
    return opensimModelJNI.ForceVelocityInverseCurve_getEccentricSlopeNearVmax(swigCPtr, this);
  }

  public double getMaxEccentricVelocityForceMultiplier() {
    return opensimModelJNI.ForceVelocityInverseCurve_getMaxEccentricVelocityForceMultiplier(swigCPtr, this);
  }

  public double getConcentricCurviness() {
    return opensimModelJNI.ForceVelocityInverseCurve_getConcentricCurviness(swigCPtr, this);
  }

  public double getEccentricCurviness() {
    return opensimModelJNI.ForceVelocityInverseCurve_getEccentricCurviness(swigCPtr, this);
  }

  public void setCurveShape(double aConcentricSlopeAtVmax, double aConcentricSlopeNearVmax, double aIsometricSlope, double aEccentricSlopeAtVmax, double aEccentricSlopeNearVmax, double aMaxForceMultiplier) {
    opensimModelJNI.ForceVelocityInverseCurve_setCurveShape(swigCPtr, this, aConcentricSlopeAtVmax, aConcentricSlopeNearVmax, aIsometricSlope, aEccentricSlopeAtVmax, aEccentricSlopeNearVmax, aMaxForceMultiplier);
  }

  public void setConcentricCurviness(double aConcentricCurviness) {
    opensimModelJNI.ForceVelocityInverseCurve_setConcentricCurviness(swigCPtr, this, aConcentricCurviness);
  }

  public void setEccentricCurviness(double aEccentricCurviness) {
    opensimModelJNI.ForceVelocityInverseCurve_setEccentricCurviness(swigCPtr, this, aEccentricCurviness);
  }

  public double calcValue(double aForceVelocityMultiplier) {
    return opensimModelJNI.ForceVelocityInverseCurve_calcValue(swigCPtr, this, aForceVelocityMultiplier);
  }

  public double calcDerivative(double aForceVelocityMultiplier, int order) {
    return opensimModelJNI.ForceVelocityInverseCurve_calcDerivative(swigCPtr, this, aForceVelocityMultiplier, order);
  }

  public SWIGTYPE_p_SimTK__VecT_2_double_1_t getCurveDomain() {
    return new SWIGTYPE_p_SimTK__VecT_2_double_1_t(opensimModelJNI.ForceVelocityInverseCurve_getCurveDomain(swigCPtr, this), true);
  }

  public void printMuscleCurveToCSVFile(String path) {
    opensimModelJNI.ForceVelocityInverseCurve_printMuscleCurveToCSVFile(swigCPtr, this, path);
  }

  public void ensureCurveUpToDate() {
    opensimModelJNI.ForceVelocityInverseCurve_ensureCurveUpToDate(swigCPtr, this);
  }

}
