/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ModelComponentSetBodies extends SetBodies {
  private transient long swigCPtr;

  public ModelComponentSetBodies(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ModelComponentSetBodies_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ModelComponentSetBodies obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_ModelComponentSetBodies(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ModelComponentSetBodies safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ModelComponentSetBodies_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ModelComponentSetBodies(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ModelComponentSetBodies_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ModelComponentSetBodies_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ModelComponentSetBodies_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ModelComponentSetBodies(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ModelComponentSetBodies_getConcreteClassName(swigCPtr, this);
  }

  public ModelComponentSetBodies() {
    this(opensimSimulationJNI.new_ModelComponentSetBodies__SWIG_0(), true);
  }

  public ModelComponentSetBodies(Model model) {
    this(opensimSimulationJNI.new_ModelComponentSetBodies__SWIG_1(Model.getCPtr(model), model), true);
  }

  public ModelComponentSetBodies(Model model, String fileName, boolean aUpdateFromXMLNode) {
    this(opensimSimulationJNI.new_ModelComponentSetBodies__SWIG_2(Model.getCPtr(model), model, fileName, aUpdateFromXMLNode), true);
  }

  public ModelComponentSetBodies(Model model, String fileName) {
    this(opensimSimulationJNI.new_ModelComponentSetBodies__SWIG_3(Model.getCPtr(model), model, fileName), true);
  }

  public ModelComponentSetBodies(ModelComponentSetBodies source) {
    this(opensimSimulationJNI.new_ModelComponentSetBodies__SWIG_4(ModelComponentSetBodies.getCPtr(source), source), true);
  }

  public boolean hasModel() {
    return opensimSimulationJNI.ModelComponentSetBodies_hasModel(swigCPtr, this);
  }

  public Model getModel() {
    return new Model(opensimSimulationJNI.ModelComponentSetBodies_getModel(swigCPtr, this), false);
  }

  public Model updModel() {
    return new Model(opensimSimulationJNI.ModelComponentSetBodies_updModel(swigCPtr, this), false);
  }

  public void setModel(Model model) {
    opensimSimulationJNI.ModelComponentSetBodies_setModel(swigCPtr, this, Model.getCPtr(model), model);
  }

  public boolean insert(int aIndex, Body aObject) {
    return opensimSimulationJNI.ModelComponentSetBodies_insert(swigCPtr, this, aIndex, Body.getCPtr(aObject), aObject);
  }

  public boolean set(int aIndex, Body aObject, boolean preserveGroups) {
    return opensimSimulationJNI.ModelComponentSetBodies_set__SWIG_0(swigCPtr, this, aIndex, Body.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Body aObject) {
    return opensimSimulationJNI.ModelComponentSetBodies_set__SWIG_1(swigCPtr, this, aIndex, Body.getCPtr(aObject), aObject);
  }

  public void invokeConnectToModel(Model model) {
    opensimSimulationJNI.ModelComponentSetBodies_invokeConnectToModel(swigCPtr, this, Model.getCPtr(model), model);
  }

  public void invokeInitStateFromProperties(State state) {
    opensimSimulationJNI.ModelComponentSetBodies_invokeInitStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public void invokeSetPropertiesFromState(State state) {
    opensimSimulationJNI.ModelComponentSetBodies_invokeSetPropertiesFromState(swigCPtr, this, State.getCPtr(state), state);
  }

  public void invokeGenerateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimSimulationJNI.ModelComponentSetBodies_invokeGenerateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

}
