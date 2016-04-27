/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Point extends ModelComponent {
  private transient long swigCPtr;

  public Point(long cPtr, boolean cMemoryOwn) {
    super(opensimModelSimulationJNI.Point_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Point obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelSimulationJNI.delete_Point(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Point safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelSimulationJNI.Point_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Point(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelSimulationJNI.Point_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelSimulationJNI.Point_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelSimulationJNI.Point_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Point(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelSimulationJNI.Point_getConcreteClassName(swigCPtr, this);
  }

  public void set_has_output_location(boolean value) {
    opensimModelSimulationJNI.Point__has_output_location_set(swigCPtr, this, value);
  }

  public boolean get_has_output_location() {
    return opensimModelSimulationJNI.Point__has_output_location_get(swigCPtr, this);
  }

  public void set_has_output_velocity(boolean value) {
    opensimModelSimulationJNI.Point__has_output_velocity_set(swigCPtr, this, value);
  }

  public boolean get_has_output_velocity() {
    return opensimModelSimulationJNI.Point__has_output_velocity_get(swigCPtr, this);
  }

  public void set_has_output_acceleration(boolean value) {
    opensimModelSimulationJNI.Point__has_output_acceleration_set(swigCPtr, this, value);
  }

  public boolean get_has_output_acceleration() {
    return opensimModelSimulationJNI.Point__has_output_acceleration_get(swigCPtr, this);
  }

  public Vec3 getLocationInGround(State state) {
    return new Vec3(opensimModelSimulationJNI.Point_getLocationInGround(swigCPtr, this, State.getCPtr(state), state), false);
  }

  public Vec3 getVelocityInGround(State state) {
    return new Vec3(opensimModelSimulationJNI.Point_getVelocityInGround(swigCPtr, this, State.getCPtr(state), state), false);
  }

  public Vec3 getAccelerationInGround(State state) {
    return new Vec3(opensimModelSimulationJNI.Point_getAccelerationInGround(swigCPtr, this, State.getCPtr(state), state), false);
  }

}
