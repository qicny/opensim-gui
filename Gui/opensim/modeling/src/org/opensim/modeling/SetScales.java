/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class SetScales extends OpenSimObject {
  private transient long swigCPtr;

  public SetScales(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.SetScales_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(SetScales obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_SetScales(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static SetScales safeDownCast(OpenSimObject obj) {
    long cPtr = opensimCommonJNI.SetScales_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new SetScales(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimCommonJNI.SetScales_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimCommonJNI.SetScales_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimCommonJNI.SetScales_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new SetScales(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimCommonJNI.SetScales_getConcreteClassName(swigCPtr, this);
  }

  public SetScales() {
    this(opensimCommonJNI.new_SetScales__SWIG_0(), true);
  }

  public SetScales(String aFileName, boolean aUpdateFromXMLNode) {
    this(opensimCommonJNI.new_SetScales__SWIG_1(aFileName, aUpdateFromXMLNode), true);
  }

  public SetScales(String aFileName) {
    this(opensimCommonJNI.new_SetScales__SWIG_2(aFileName), true);
  }

  public SetScales(SetScales aSet) {
    this(opensimCommonJNI.new_SetScales__SWIG_3(SetScales.getCPtr(aSet), aSet), true);
  }

  public void setupGroups() {
    opensimCommonJNI.SetScales_setupGroups(swigCPtr, this);
  }

  public void setMemoryOwner(boolean aTrueFalse) {
    opensimCommonJNI.SetScales_setMemoryOwner(swigCPtr, this, aTrueFalse);
  }

  public boolean setSize(int aSize) {
    return opensimCommonJNI.SetScales_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimCommonJNI.SetScales_getSize(swigCPtr, this);
  }

  public int getIndex(Scale aObject, int aStartIndex) {
    return opensimCommonJNI.SetScales_getIndex__SWIG_0(swigCPtr, this, Scale.getCPtr(aObject), aObject, aStartIndex);
  }

  public int getIndex(Scale aObject) {
    return opensimCommonJNI.SetScales_getIndex__SWIG_1(swigCPtr, this, Scale.getCPtr(aObject), aObject);
  }

  public int getIndex(String aName, int aStartIndex) {
    return opensimCommonJNI.SetScales_getIndex__SWIG_2(swigCPtr, this, aName, aStartIndex);
  }

  public int getIndex(String aName) {
    return opensimCommonJNI.SetScales_getIndex__SWIG_3(swigCPtr, this, aName);
  }

  public void getGroupNamesContaining(String aObjectName, ArrayStr rGroupNames) {
    opensimCommonJNI.SetScales_getGroupNamesContaining(swigCPtr, this, aObjectName, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public boolean adoptAndAppend(Scale aObject) {
    return opensimCommonJNI.SetScales_adoptAndAppend(swigCPtr, this, Scale.getCPtr(aObject), aObject);
  }

  public boolean cloneAndAppend(Scale aObject) {
    return opensimCommonJNI.SetScales_cloneAndAppend(swigCPtr, this, Scale.getCPtr(aObject), aObject);
  }

  public boolean insert(int aIndex, Scale aObject) {
    return opensimCommonJNI.SetScales_insert(swigCPtr, this, aIndex, Scale.getCPtr(aObject), aObject);
  }

  public boolean remove(int aIndex) {
    return opensimCommonJNI.SetScales_remove__SWIG_0(swigCPtr, this, aIndex);
  }

  public boolean remove(Scale aObject) {
    return opensimCommonJNI.SetScales_remove__SWIG_1(swigCPtr, this, Scale.getCPtr(aObject), aObject);
  }

  public void clearAndDestroy() {
    opensimCommonJNI.SetScales_clearAndDestroy(swigCPtr, this);
  }

  public boolean set(int aIndex, Scale aObject, boolean preserveGroups) {
    return opensimCommonJNI.SetScales_set__SWIG_0(swigCPtr, this, aIndex, Scale.getCPtr(aObject), aObject, preserveGroups);
  }

  public boolean set(int aIndex, Scale aObject) {
    return opensimCommonJNI.SetScales_set__SWIG_1(swigCPtr, this, aIndex, Scale.getCPtr(aObject), aObject);
  }

  public Scale get(int aIndex) {
    return new Scale(opensimCommonJNI.SetScales_get__SWIG_0(swigCPtr, this, aIndex), false);
  }

  public Scale get(String aName) {
    return new Scale(opensimCommonJNI.SetScales_get__SWIG_1(swigCPtr, this, aName), false);
  }

  public boolean contains(String aName) {
    return opensimCommonJNI.SetScales_contains(swigCPtr, this, aName);
  }

  public void getNames(ArrayStr rNames) {
    opensimCommonJNI.SetScales_getNames(swigCPtr, this, ArrayStr.getCPtr(rNames), rNames);
  }

  public int getNumGroups() {
    return opensimCommonJNI.SetScales_getNumGroups(swigCPtr, this);
  }

  public void addGroup(String aGroupName) {
    opensimCommonJNI.SetScales_addGroup(swigCPtr, this, aGroupName);
  }

  public void removeGroup(String aGroupName) {
    opensimCommonJNI.SetScales_removeGroup(swigCPtr, this, aGroupName);
  }

  public void renameGroup(String oldGroupName, String newGroupName) {
    opensimCommonJNI.SetScales_renameGroup(swigCPtr, this, oldGroupName, newGroupName);
  }

  public void addObjectToGroup(String aGroupName, String aObjectName) {
    opensimCommonJNI.SetScales_addObjectToGroup(swigCPtr, this, aGroupName, aObjectName);
  }

  public void getGroupNames(ArrayStr rGroupNames) {
    opensimCommonJNI.SetScales_getGroupNames(swigCPtr, this, ArrayStr.getCPtr(rGroupNames), rGroupNames);
  }

  public ObjectGroup getGroup(String aGroupName) {
    long cPtr = opensimCommonJNI.SetScales_getGroup__SWIG_0(swigCPtr, this, aGroupName);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

  public ObjectGroup getGroup(int aIndex) {
    long cPtr = opensimCommonJNI.SetScales_getGroup__SWIG_1(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new ObjectGroup(cPtr, false);
  }

}
