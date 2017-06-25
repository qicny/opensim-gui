/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SetBodyScales extends OpenSimObject {
  private transient long swigCPtr;

  public SetBodyScales(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.SetBodyScales_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SetBodyScales obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_SetBodyScales(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SetBodyScales safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.SetBodyScales_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SetBodyScales(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.SetBodyScales_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.SetBodyScales_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.SetBodyScales_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SetBodyScales(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.SetBodyScales_getConcreteClassName(swigCPtr, this);
  }

  public SetBodyScales() {
    this(opensimSimulationJNI.new_SetBodyScales__SWIG_0(), true);
  }

  public SetBodyScales(String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimSimulationJNI.new_SetBodyScales__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  public SetBodyScales(String aFileName) {
    this(opensimSimulationJNI.new_SetBodyScales__SWIG_2(aFileName), true);
  }

  public SetBodyScales(SetBodyScales aSet) {
    this(opensimSimulationJNI.new_SetBodyScales__SWIG_3(SetBodyScales.getCPtr(aSet), aSet), true);
  }

  public void setupGroups() {
    opensimSimulationJNI.SetBodyScales_setupGroups(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimSimulationJNI.SetBodyScales_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean setSize(int aSize) {
    return opensimSimulationJNI.SetBodyScales_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimSimulationJNI.SetBodyScales_getSize(swigCPtr, this);
  }

  public int getIndex(BodyScale aObject, int aStartIndex) {
    return opensimSimulationJNI.SetBodyScales_getIndex__SWIG_0(swigCPtr, this, BodyScale.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(BodyScale aObject) {
    return opensimSimulationJNI.SetBodyScales_getIndex__SWIG_1(swigCPtr, this, BodyScale.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimSimulationJNI.SetBodyScales_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimSimulationJNI.SetBodyScales_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimSimulationJNI.SetBodyScales_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public boolean adoptAndAppend(BodyScale aObject) {
    return opensimSimulationJNI.SetBodyScales_adoptAndAppend(swigCPtr, this, BodyScale.getCPtr(aObject), aObject);
  }

  public boolean cloneAndAppend(BodyScale aObject) {
    return opensimSimulationJNI.SetBodyScales_cloneAndAppend(swigCPtr, this, BodyScale.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, BodyScale aObject) {
    return opensimSimulationJNI.SetBodyScales_insert(swigCPtr, this, aIndex, BodyScale.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimSimulationJNI.SetBodyScales_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(BodyScale aObject) {
    return opensimSimulationJNI.SetBodyScales_remove__SWIG_1(swigCPtr, this, BodyScale.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimSimulationJNI.SetBodyScales_clearAndDestroy(swigCPtr, this);
  }

  public boolean set(int aIndex, BodyScale aObject, boolean preserveGroups) {
    return opensimSimulationJNI.SetBodyScales_set__SWIG_0(swigCPtr, this, aIndex, BodyScale.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, BodyScale aObject) {
    return opensimSimulationJNI.SetBodyScales_set__SWIG_1(swigCPtr, this, aIndex, BodyScale.getCPtr(aObject), aObject);
  }

  public BodyScale get(int aIndex) {
    return new BodyScale(opensimSimulationJNI.SetBodyScales_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  public BodyScale get(String aName) {
    return new BodyScale(opensimSimulationJNI.SetBodyScales_get__SWIG_1(swigCPtr, this, aName), false);
  }

  public boolean contains(String aName) {
    return opensimSimulationJNI.SetBodyScales_contains(swigCPtr, this, aName);
  }

  public void getNames(ArrayStr rNames) {
    opensimSimulationJNI.SetBodyScales_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public int getNumGroups() {
    return opensimSimulationJNI.SetBodyScales_getNumGroups(swigCPtr, this);
  }

  public void addGroup(String aGroupName) {
    opensimSimulationJNI.SetBodyScales_addGroup(swigCPtr, this, aGroupName);
  }

  public void removeGroup(String aGroupName) {
    opensimSimulationJNI.SetBodyScales_removeGroup(swigCPtr, this, aGroupName);
  }

  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimSimulationJNI.SetBodyScales_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimSimulationJNI.SetBodyScales_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  public void getGroupNames(ArrayStr rGroupNames) {
    opensimSimulationJNI.SetBodyScales_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimSimulationJNI.SetBodyScales_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimSimulationJNI.SetBodyScales_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}
