/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SpringGeneralizedForce extends Force {
  private long swigCPtr;

  public SpringGeneralizedForce(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.SpringGeneralizedForce_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SpringGeneralizedForce obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_SpringGeneralizedForce(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SpringGeneralizedForce safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.SpringGeneralizedForce_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SpringGeneralizedForce(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.SpringGeneralizedForce_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.SpringGeneralizedForce_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.SpringGeneralizedForce_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SpringGeneralizedForce(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.SpringGeneralizedForce_getConcreteClassName(swigCPtr, this);
  }

  public void setPropertyIndex_coordinate(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.SpringGeneralizedForce_PropertyIndex_coordinate_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_coordinate() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.SpringGeneralizedForce_PropertyIndex_coordinate_get(swigCPtr, this), true);
  }

  public void copyProperty_coordinate(SpringGeneralizedForce source) {
    opensimModelJNI.SpringGeneralizedForce_copyProperty_coordinate(swigCPtr, this, SpringGeneralizedForce.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_std__string_t getProperty_coordinate() {
    return new SWIGTYPE_p_OpenSim__PropertyT_std__string_t(opensimModelJNI.SpringGeneralizedForce_getProperty_coordinate(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_std__string_t updProperty_coordinate() {
    return new SWIGTYPE_p_OpenSim__PropertyT_std__string_t(opensimModelJNI.SpringGeneralizedForce_updProperty_coordinate(swigCPtr, this), false);
  }

  public String get_coordinate(int i) {
    return opensimModelJNI.SpringGeneralizedForce_get_coordinate__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_coordinate(int i) {
    return new SWIGTYPE_p_std__string(opensimModelJNI.SpringGeneralizedForce_upd_coordinate__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_coordinate(int i, String value) {
    opensimModelJNI.SpringGeneralizedForce_set_coordinate__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_coordinate(String value) {
    return opensimModelJNI.SpringGeneralizedForce_append_coordinate(swigCPtr, this, value);
  }

  public void constructProperty_coordinate() {
    opensimModelJNI.SpringGeneralizedForce_constructProperty_coordinate__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_coordinate(String initValue) {
    opensimModelJNI.SpringGeneralizedForce_constructProperty_coordinate__SWIG_1(swigCPtr, this, initValue);
  }

  public String get_coordinate() {
    return opensimModelJNI.SpringGeneralizedForce_get_coordinate__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_coordinate() {
    return new SWIGTYPE_p_std__string(opensimModelJNI.SpringGeneralizedForce_upd_coordinate__SWIG_1(swigCPtr, this), false);
  }

  public void set_coordinate(String value) {
    opensimModelJNI.SpringGeneralizedForce_set_coordinate__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_stiffness(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.SpringGeneralizedForce_PropertyIndex_stiffness_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_stiffness() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.SpringGeneralizedForce_PropertyIndex_stiffness_get(swigCPtr, this), true);
  }

  public void copyProperty_stiffness(SpringGeneralizedForce source) {
    opensimModelJNI.SpringGeneralizedForce_copyProperty_stiffness(swigCPtr, this, SpringGeneralizedForce.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_stiffness() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.SpringGeneralizedForce_getProperty_stiffness(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_stiffness() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.SpringGeneralizedForce_updProperty_stiffness(swigCPtr, this), false);
  }

  public double get_stiffness(int i) {
    return opensimModelJNI.SpringGeneralizedForce_get_stiffness__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_stiffness(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.SpringGeneralizedForce_upd_stiffness__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_stiffness(int i, double value) {
    opensimModelJNI.SpringGeneralizedForce_set_stiffness__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_stiffness(double value) {
    return opensimModelJNI.SpringGeneralizedForce_append_stiffness(swigCPtr, this, value);
  }

  public void constructProperty_stiffness(double initValue) {
    opensimModelJNI.SpringGeneralizedForce_constructProperty_stiffness(swigCPtr, this, initValue);
  }

  public double get_stiffness() {
    return opensimModelJNI.SpringGeneralizedForce_get_stiffness__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_stiffness() {
    return new SWIGTYPE_p_double(opensimModelJNI.SpringGeneralizedForce_upd_stiffness__SWIG_1(swigCPtr, this), false);
  }

  public void set_stiffness(double value) {
    opensimModelJNI.SpringGeneralizedForce_set_stiffness__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_rest_length(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.SpringGeneralizedForce_PropertyIndex_rest_length_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_rest_length() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.SpringGeneralizedForce_PropertyIndex_rest_length_get(swigCPtr, this), true);
  }

  public void copyProperty_rest_length(SpringGeneralizedForce source) {
    opensimModelJNI.SpringGeneralizedForce_copyProperty_rest_length(swigCPtr, this, SpringGeneralizedForce.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_rest_length() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.SpringGeneralizedForce_getProperty_rest_length(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_rest_length() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.SpringGeneralizedForce_updProperty_rest_length(swigCPtr, this), false);
  }

  public double get_rest_length(int i) {
    return opensimModelJNI.SpringGeneralizedForce_get_rest_length__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_rest_length(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.SpringGeneralizedForce_upd_rest_length__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_rest_length(int i, double value) {
    opensimModelJNI.SpringGeneralizedForce_set_rest_length__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_rest_length(double value) {
    return opensimModelJNI.SpringGeneralizedForce_append_rest_length(swigCPtr, this, value);
  }

  public void constructProperty_rest_length(double initValue) {
    opensimModelJNI.SpringGeneralizedForce_constructProperty_rest_length(swigCPtr, this, initValue);
  }

  public double get_rest_length() {
    return opensimModelJNI.SpringGeneralizedForce_get_rest_length__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_rest_length() {
    return new SWIGTYPE_p_double(opensimModelJNI.SpringGeneralizedForce_upd_rest_length__SWIG_1(swigCPtr, this), false);
  }

  public void set_rest_length(double value) {
    opensimModelJNI.SpringGeneralizedForce_set_rest_length__SWIG_1(swigCPtr, this, value);
  }

  public void setPropertyIndex_viscosity(SWIGTYPE_p_PropertyIndex value) {
    opensimModelJNI.SpringGeneralizedForce_PropertyIndex_viscosity_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_viscosity() {
    return new SWIGTYPE_p_PropertyIndex(opensimModelJNI.SpringGeneralizedForce_PropertyIndex_viscosity_get(swigCPtr, this), true);
  }

  public void copyProperty_viscosity(SpringGeneralizedForce source) {
    opensimModelJNI.SpringGeneralizedForce_copyProperty_viscosity(swigCPtr, this, SpringGeneralizedForce.getCPtr(source), source);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t getProperty_viscosity() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.SpringGeneralizedForce_getProperty_viscosity(swigCPtr, this), false);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_double_t updProperty_viscosity() {
    return new SWIGTYPE_p_OpenSim__PropertyT_double_t(opensimModelJNI.SpringGeneralizedForce_updProperty_viscosity(swigCPtr, this), false);
  }

  public double get_viscosity(int i) {
    return opensimModelJNI.SpringGeneralizedForce_get_viscosity__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_viscosity(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.SpringGeneralizedForce_upd_viscosity__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_viscosity(int i, double value) {
    opensimModelJNI.SpringGeneralizedForce_set_viscosity__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_viscosity(double value) {
    return opensimModelJNI.SpringGeneralizedForce_append_viscosity(swigCPtr, this, value);
  }

  public void constructProperty_viscosity(double initValue) {
    opensimModelJNI.SpringGeneralizedForce_constructProperty_viscosity(swigCPtr, this, initValue);
  }

  public double get_viscosity() {
    return opensimModelJNI.SpringGeneralizedForce_get_viscosity__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_viscosity() {
    return new SWIGTYPE_p_double(opensimModelJNI.SpringGeneralizedForce_upd_viscosity__SWIG_1(swigCPtr, this), false);
  }

  public void set_viscosity(double value) {
    opensimModelJNI.SpringGeneralizedForce_set_viscosity__SWIG_1(swigCPtr, this, value);
  }

  public SpringGeneralizedForce(String coordinateName) {
    this(opensimModelJNI.new_SpringGeneralizedForce__SWIG_0(coordinateName), true);
  }

  public SpringGeneralizedForce() {
    this(opensimModelJNI.new_SpringGeneralizedForce__SWIG_1(), true);
  }

  public void setStiffness(double aStiffness) {
    opensimModelJNI.SpringGeneralizedForce_setStiffness(swigCPtr, this, aStiffness);
  }

  public double getStiffness() {
    return opensimModelJNI.SpringGeneralizedForce_getStiffness(swigCPtr, this);
  }

  public void setRestLength(double aRestLength) {
    opensimModelJNI.SpringGeneralizedForce_setRestLength(swigCPtr, this, aRestLength);
  }

  public double getRestLength() {
    return opensimModelJNI.SpringGeneralizedForce_getRestLength(swigCPtr, this);
  }

  public void setViscosity(double aViscosity) {
    opensimModelJNI.SpringGeneralizedForce_setViscosity(swigCPtr, this, aViscosity);
  }

  public double getViscosity() {
    return opensimModelJNI.SpringGeneralizedForce_getViscosity(swigCPtr, this);
  }

  public ArrayStr getRecordLabels() {
    return new ArrayStr(opensimModelJNI.SpringGeneralizedForce_getRecordLabels(swigCPtr, this), true);
  }

  public ArrayDouble getRecordValues(SWIGTYPE_p_SimTK__State state) {
    return new ArrayDouble(opensimModelJNI.SpringGeneralizedForce_getRecordValues(swigCPtr, this, SWIGTYPE_p_SimTK__State.getCPtr(state)), true);
  }

}