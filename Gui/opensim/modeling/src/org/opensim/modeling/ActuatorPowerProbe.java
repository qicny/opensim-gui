/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ActuatorPowerProbe extends Probe {
  private long swigCPtr;

  public ActuatorPowerProbe(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.ActuatorPowerProbe_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ActuatorPowerProbe obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_ActuatorPowerProbe(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ActuatorPowerProbe safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.ActuatorPowerProbe_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ActuatorPowerProbe(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.ActuatorPowerProbe_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.ActuatorPowerProbe_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.ActuatorPowerProbe_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ActuatorPowerProbe(cPtr, false);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.ActuatorPowerProbe_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_actuator_names(ActuatorPowerProbe source) {
    opensimModelJNI.ActuatorPowerProbe_copyProperty_actuator_names(swigCPtr, this, ActuatorPowerProbe.getCPtr(source), source);
  }

  public String get_actuator_names(int i) {
    return opensimModelJNI.ActuatorPowerProbe_get_actuator_names(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_actuator_names(int i) {
    return new SWIGTYPE_p_std__string(opensimModelJNI.ActuatorPowerProbe_upd_actuator_names(swigCPtr, this, i), false);
  }

  public void set_actuator_names(int i, String value) {
    opensimModelJNI.ActuatorPowerProbe_set_actuator_names(swigCPtr, this, i, value);
  }

  public int append_actuator_names(String value) {
    return opensimModelJNI.ActuatorPowerProbe_append_actuator_names(swigCPtr, this, value);
  }

  public void constructProperty_actuator_names() {
    opensimModelJNI.ActuatorPowerProbe_constructProperty_actuator_names(swigCPtr, this);
  }

  public void copyProperty_sum_powers_together(ActuatorPowerProbe source) {
    opensimModelJNI.ActuatorPowerProbe_copyProperty_sum_powers_together(swigCPtr, this, ActuatorPowerProbe.getCPtr(source), source);
  }

  public boolean get_sum_powers_together(int i) {
    return opensimModelJNI.ActuatorPowerProbe_get_sum_powers_together__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_sum_powers_together(int i) {
    return new SWIGTYPE_p_bool(opensimModelJNI.ActuatorPowerProbe_upd_sum_powers_together__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_sum_powers_together(int i, boolean value) {
    opensimModelJNI.ActuatorPowerProbe_set_sum_powers_together__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_sum_powers_together(boolean value) {
    return opensimModelJNI.ActuatorPowerProbe_append_sum_powers_together(swigCPtr, this, value);
  }

  public void constructProperty_sum_powers_together(boolean initValue) {
    opensimModelJNI.ActuatorPowerProbe_constructProperty_sum_powers_together(swigCPtr, this, initValue);
  }

  public boolean get_sum_powers_together() {
    return opensimModelJNI.ActuatorPowerProbe_get_sum_powers_together__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_sum_powers_together() {
    return new SWIGTYPE_p_bool(opensimModelJNI.ActuatorPowerProbe_upd_sum_powers_together__SWIG_1(swigCPtr, this), false);
  }

  public void set_sum_powers_together(boolean value) {
    opensimModelJNI.ActuatorPowerProbe_set_sum_powers_together__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_exponent(ActuatorPowerProbe source) {
    opensimModelJNI.ActuatorPowerProbe_copyProperty_exponent(swigCPtr, this, ActuatorPowerProbe.getCPtr(source), source);
  }

  public double get_exponent(int i) {
    return opensimModelJNI.ActuatorPowerProbe_get_exponent__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_exponent(int i) {
    return new SWIGTYPE_p_double(opensimModelJNI.ActuatorPowerProbe_upd_exponent__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_exponent(int i, double value) {
    opensimModelJNI.ActuatorPowerProbe_set_exponent__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_exponent(double value) {
    return opensimModelJNI.ActuatorPowerProbe_append_exponent(swigCPtr, this, value);
  }

  public void constructProperty_exponent(double initValue) {
    opensimModelJNI.ActuatorPowerProbe_constructProperty_exponent(swigCPtr, this, initValue);
  }

  public double get_exponent() {
    return opensimModelJNI.ActuatorPowerProbe_get_exponent__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_exponent() {
    return new SWIGTYPE_p_double(opensimModelJNI.ActuatorPowerProbe_upd_exponent__SWIG_1(swigCPtr, this), false);
  }

  public void set_exponent(double value) {
    opensimModelJNI.ActuatorPowerProbe_set_exponent__SWIG_1(swigCPtr, this, value);
  }

  public ActuatorPowerProbe() {
    this(opensimModelJNI.new_ActuatorPowerProbe__SWIG_0(), true);
  }

  public ActuatorPowerProbe(ArrayStr actuator_names, boolean sum_powers_together, double exponent) {
    this(opensimModelJNI.new_ActuatorPowerProbe__SWIG_1(ArrayStr.getCPtr(actuator_names), actuator_names, sum_powers_together, exponent), true);
  }

  public SWIGTYPE_p_OpenSim__PropertyT_std__string_t getActuatorNames() {
    return new SWIGTYPE_p_OpenSim__PropertyT_std__string_t(opensimModelJNI.ActuatorPowerProbe_getActuatorNames(swigCPtr, this), false);
  }

  public boolean getSumPowersTogether() {
    return opensimModelJNI.ActuatorPowerProbe_getSumPowersTogether(swigCPtr, this);
  }

  public double getExponent() {
    return opensimModelJNI.ActuatorPowerProbe_getExponent(swigCPtr, this);
  }

  public void setActuatorNames(ArrayStr actuatorNames) {
    opensimModelJNI.ActuatorPowerProbe_setActuatorNames(swigCPtr, this, ArrayStr.getCPtr(actuatorNames), actuatorNames);
  }

  public void setSumPowersTogether(boolean sum_powers_together) {
    opensimModelJNI.ActuatorPowerProbe_setSumPowersTogether(swigCPtr, this, sum_powers_together);
  }

  public void setExponent(double exponent) {
    opensimModelJNI.ActuatorPowerProbe_setExponent(swigCPtr, this, exponent);
  }

  public Vector computeProbeInputs(State state) {
    return new Vector(opensimModelJNI.ActuatorPowerProbe_computeProbeInputs(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public int getNumProbeInputs() {
    return opensimModelJNI.ActuatorPowerProbe_getNumProbeInputs(swigCPtr, this);
  }

  public ArrayStr getProbeOutputLabels() {
    return new ArrayStr(opensimModelJNI.ActuatorPowerProbe_getProbeOutputLabels(swigCPtr, this), true);
  }

  public void connectToModel(Model aModel) {
    opensimModelJNI.ActuatorPowerProbe_connectToModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

}
