/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class McKibbenActuator extends PathActuator {
  private transient long swigCPtr;

  public McKibbenActuator(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.McKibbenActuator_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(McKibbenActuator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimActuatorsAnalysesToolsJNI.delete_McKibbenActuator(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static McKibbenActuator safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.McKibbenActuator_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new McKibbenActuator(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.McKibbenActuator_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.McKibbenActuator_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.McKibbenActuator_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new McKibbenActuator(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.McKibbenActuator_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_thread_length(McKibbenActuator source) {
    opensimActuatorsAnalysesToolsJNI.McKibbenActuator_copyProperty_thread_length(swigCPtr, this, McKibbenActuator.getCPtr(source), source);
  }

  public double get_thread_length(int i) {
    return opensimActuatorsAnalysesToolsJNI.McKibbenActuator_get_thread_length__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_thread_length(int i) {
    return new SWIGTYPE_p_double(opensimActuatorsAnalysesToolsJNI.McKibbenActuator_upd_thread_length__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_thread_length(int i, double value) {
    opensimActuatorsAnalysesToolsJNI.McKibbenActuator_set_thread_length__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_thread_length(double value) {
    return opensimActuatorsAnalysesToolsJNI.McKibbenActuator_append_thread_length(swigCPtr, this, value);
  }

  public void constructProperty_thread_length(double initValue) {
    opensimActuatorsAnalysesToolsJNI.McKibbenActuator_constructProperty_thread_length(swigCPtr, this, initValue);
  }

  public double get_thread_length() {
    return opensimActuatorsAnalysesToolsJNI.McKibbenActuator_get_thread_length__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_thread_length() {
    return new SWIGTYPE_p_double(opensimActuatorsAnalysesToolsJNI.McKibbenActuator_upd_thread_length__SWIG_1(swigCPtr, this), false);
  }

  public void set_thread_length(double value) {
    opensimActuatorsAnalysesToolsJNI.McKibbenActuator_set_thread_length__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_number_of_turns(McKibbenActuator source) {
    opensimActuatorsAnalysesToolsJNI.McKibbenActuator_copyProperty_number_of_turns(swigCPtr, this, McKibbenActuator.getCPtr(source), source);
  }

  public double get_number_of_turns(int i) {
    return opensimActuatorsAnalysesToolsJNI.McKibbenActuator_get_number_of_turns__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_number_of_turns(int i) {
    return new SWIGTYPE_p_double(opensimActuatorsAnalysesToolsJNI.McKibbenActuator_upd_number_of_turns__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_number_of_turns(int i, double value) {
    opensimActuatorsAnalysesToolsJNI.McKibbenActuator_set_number_of_turns__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_number_of_turns(double value) {
    return opensimActuatorsAnalysesToolsJNI.McKibbenActuator_append_number_of_turns(swigCPtr, this, value);
  }

  public void constructProperty_number_of_turns(double initValue) {
    opensimActuatorsAnalysesToolsJNI.McKibbenActuator_constructProperty_number_of_turns(swigCPtr, this, initValue);
  }

  public double get_number_of_turns() {
    return opensimActuatorsAnalysesToolsJNI.McKibbenActuator_get_number_of_turns__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_number_of_turns() {
    return new SWIGTYPE_p_double(opensimActuatorsAnalysesToolsJNI.McKibbenActuator_upd_number_of_turns__SWIG_1(swigCPtr, this), false);
  }

  public void set_number_of_turns(double value) {
    opensimActuatorsAnalysesToolsJNI.McKibbenActuator_set_number_of_turns__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_cord_length(McKibbenActuator source) {
    opensimActuatorsAnalysesToolsJNI.McKibbenActuator_copyProperty_cord_length(swigCPtr, this, McKibbenActuator.getCPtr(source), source);
  }

  public double get_cord_length(int i) {
    return opensimActuatorsAnalysesToolsJNI.McKibbenActuator_get_cord_length__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_cord_length(int i) {
    return new SWIGTYPE_p_double(opensimActuatorsAnalysesToolsJNI.McKibbenActuator_upd_cord_length__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_cord_length(int i, double value) {
    opensimActuatorsAnalysesToolsJNI.McKibbenActuator_set_cord_length__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_cord_length(double value) {
    return opensimActuatorsAnalysesToolsJNI.McKibbenActuator_append_cord_length(swigCPtr, this, value);
  }

  public void constructProperty_cord_length(double initValue) {
    opensimActuatorsAnalysesToolsJNI.McKibbenActuator_constructProperty_cord_length(swigCPtr, this, initValue);
  }

  public double get_cord_length() {
    return opensimActuatorsAnalysesToolsJNI.McKibbenActuator_get_cord_length__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_cord_length() {
    return new SWIGTYPE_p_double(opensimActuatorsAnalysesToolsJNI.McKibbenActuator_upd_cord_length__SWIG_1(swigCPtr, this), false);
  }

  public void set_cord_length(double value) {
    opensimActuatorsAnalysesToolsJNI.McKibbenActuator_set_cord_length__SWIG_1(swigCPtr, this, value);
  }

  public McKibbenActuator() {
    this(opensimActuatorsAnalysesToolsJNI.new_McKibbenActuator__SWIG_0(), true);
  }

  public McKibbenActuator(String name, double num_turns, double thread_length) {
    this(opensimActuatorsAnalysesToolsJNI.new_McKibbenActuator__SWIG_1(name, num_turns, thread_length), true);
  }

  public void setNumberOfTurns(double val) {
    opensimActuatorsAnalysesToolsJNI.McKibbenActuator_setNumberOfTurns(swigCPtr, this, val);
  }

  public double getNumberOfTurns() {
    return opensimActuatorsAnalysesToolsJNI.McKibbenActuator_getNumberOfTurns(swigCPtr, this);
  }

  public void setThreadLength(double val) {
    opensimActuatorsAnalysesToolsJNI.McKibbenActuator_setThreadLength(swigCPtr, this, val);
  }

  public double getThreadLength() {
    return opensimActuatorsAnalysesToolsJNI.McKibbenActuator_getThreadLength(swigCPtr, this);
  }

  public void setCordLength(double val) {
    opensimActuatorsAnalysesToolsJNI.McKibbenActuator_setCordLength(swigCPtr, this, val);
  }

  public double getCordLength() {
    return opensimActuatorsAnalysesToolsJNI.McKibbenActuator_getCordLength(swigCPtr, this);
  }

  public double computeActuation(State s) {
    return opensimActuatorsAnalysesToolsJNI.McKibbenActuator_computeActuation(swigCPtr, this, State.getCPtr(s), s);
  }

}