/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class TwoFrameLinkerConstraint extends Constraint {
  private transient long swigCPtr;

  public TwoFrameLinkerConstraint(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.TwoFrameLinkerConstraint_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(TwoFrameLinkerConstraint obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_TwoFrameLinkerConstraint(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static TwoFrameLinkerConstraint safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.TwoFrameLinkerConstraint_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new TwoFrameLinkerConstraint(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.TwoFrameLinkerConstraint_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.TwoFrameLinkerConstraint_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.TwoFrameLinkerConstraint_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new TwoFrameLinkerConstraint(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.TwoFrameLinkerConstraint_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_frames(TwoFrameLinkerConstraint source) {
    opensimSimulationJNI.TwoFrameLinkerConstraint_copyProperty_frames(swigCPtr, this, TwoFrameLinkerConstraint.getCPtr(source), source);
  }

  public PhysicalFrame get_frames(int i) {
    return new PhysicalFrame(opensimSimulationJNI.TwoFrameLinkerConstraint_get_frames(swigCPtr, this, i), false);
  }

  public PhysicalFrame upd_frames(int i) {
    return new PhysicalFrame(opensimSimulationJNI.TwoFrameLinkerConstraint_upd_frames(swigCPtr, this, i), false);
  }

  public void set_frames(int i, PhysicalFrame value) {
    opensimSimulationJNI.TwoFrameLinkerConstraint_set_frames(swigCPtr, this, i, PhysicalFrame.getCPtr(value), value);
  }

  public int append_frames(PhysicalFrame value) {
    return opensimSimulationJNI.TwoFrameLinkerConstraint_append_frames(swigCPtr, this, PhysicalFrame.getCPtr(value), value);
  }

  public void constructProperty_frames() {
    opensimSimulationJNI.TwoFrameLinkerConstraint_constructProperty_frames(swigCPtr, this);
  }

  public void setPropertyIndex_socket_frame1_connectee_name(SWIGTYPE_p_PropertyIndex value) {
    opensimSimulationJNI.TwoFrameLinkerConstraint_PropertyIndex_socket_frame1_connectee_name_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_socket_frame1_connectee_name() {
    return new SWIGTYPE_p_PropertyIndex(opensimSimulationJNI.TwoFrameLinkerConstraint_PropertyIndex_socket_frame1_connectee_name_get(swigCPtr, this), true);
  }

  public void connectSocket_frame1(OpenSimObject object) {
    opensimSimulationJNI.TwoFrameLinkerConstraint_connectSocket_frame1(swigCPtr, this, OpenSimObject.getCPtr(object), object);
  }

  public void setPropertyIndex_socket_frame2_connectee_name(SWIGTYPE_p_PropertyIndex value) {
    opensimSimulationJNI.TwoFrameLinkerConstraint_PropertyIndex_socket_frame2_connectee_name_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_socket_frame2_connectee_name() {
    return new SWIGTYPE_p_PropertyIndex(opensimSimulationJNI.TwoFrameLinkerConstraint_PropertyIndex_socket_frame2_connectee_name_get(swigCPtr, this), true);
  }

  public void connectSocket_frame2(OpenSimObject object) {
    opensimSimulationJNI.TwoFrameLinkerConstraint_connectSocket_frame2(swigCPtr, this, OpenSimObject.getCPtr(object), object);
  }

  public PhysicalFrame getFrame1() {
    return new PhysicalFrame(opensimSimulationJNI.TwoFrameLinkerConstraint_getFrame1(swigCPtr, this), false);
  }

  public PhysicalFrame getFrame2() {
    return new PhysicalFrame(opensimSimulationJNI.TwoFrameLinkerConstraint_getFrame2(swigCPtr, this), false);
  }

  public Transform computeRelativeOffset(State s) {
    return new Transform(opensimSimulationJNI.TwoFrameLinkerConstraint_computeRelativeOffset(swigCPtr, this, State.getCPtr(s), s), true);
  }

  public SpatialVec computeRelativeVelocity(State s) {
    return new SpatialVec(opensimSimulationJNI.TwoFrameLinkerConstraint_computeRelativeVelocity(swigCPtr, this, State.getCPtr(s), s), true);
  }

  public Vec6 computeDeflection(State s) {
    return new Vec6(opensimSimulationJNI.TwoFrameLinkerConstraint_computeDeflection(swigCPtr, this, State.getCPtr(s), s), true);
  }

  public Vec6 computeDeflectionRate(State s) {
    return new Vec6(opensimSimulationJNI.TwoFrameLinkerConstraint_computeDeflectionRate(swigCPtr, this, State.getCPtr(s), s), true);
  }

}
