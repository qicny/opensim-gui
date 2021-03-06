/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class TimeSeriesTableSpatialVec extends DataTableSpatialVec {
  private transient long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected TimeSeriesTableSpatialVec(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.TimeSeriesTableSpatialVec_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TimeSeriesTableSpatialVec obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        opensimCommonJNI.delete_TimeSeriesTableSpatialVec(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TimeSeriesTableSpatialVec() {
    this(opensimCommonJNI.new_TimeSeriesTableSpatialVec__SWIG_0(), true);
  }

  public TimeSeriesTableSpatialVec(TimeSeriesTableSpatialVec arg0) {
    this(opensimCommonJNI.new_TimeSeriesTableSpatialVec__SWIG_1(TimeSeriesTableSpatialVec.getCPtr(arg0), arg0), true);
  }

  public TimeSeriesTableSpatialVec(StdVectorDouble indVec, MatrixOfSpatialVec depData, StdVectorString labels) {
    this(opensimCommonJNI.new_TimeSeriesTableSpatialVec__SWIG_2(StdVectorDouble.getCPtr(indVec), indVec, MatrixOfSpatialVec.getCPtr(depData), depData, StdVectorString.getCPtr(labels), labels), true);
  }

  public TimeSeriesTableSpatialVec(DataTableSpatialVec datatable) {
    this(opensimCommonJNI.new_TimeSeriesTableSpatialVec__SWIG_3(DataTableSpatialVec.getCPtr(datatable), datatable), true);
  }

  public TimeSeriesTableSpatialVec(String filename) {
    this(opensimCommonJNI.new_TimeSeriesTableSpatialVec__SWIG_4(filename), true);
  }

  public TimeSeriesTableSpatialVec(String filename, String tablename) {
    this(opensimCommonJNI.new_TimeSeriesTableSpatialVec__SWIG_5(filename, tablename), true);
  }

  public SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__VecT_2_SimTK__Vec3_1_t_t getNearestRow(double time, boolean restrictToTimeRange) {
    return new SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__VecT_2_SimTK__Vec3_1_t_t(opensimCommonJNI.TimeSeriesTableSpatialVec_getNearestRow__SWIG_0(swigCPtr, this, time, restrictToTimeRange), true);
  }

  public SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__VecT_2_SimTK__Vec3_1_t_t getNearestRow(double time) {
    return new SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__VecT_2_SimTK__Vec3_1_t_t(opensimCommonJNI.TimeSeriesTableSpatialVec_getNearestRow__SWIG_1(swigCPtr, this, time), true);
  }

  public SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__VecT_2_SimTK__Vec3_1_t_t updNearestRow(double time, boolean restrictToTimeRange) {
    return new SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__VecT_2_SimTK__Vec3_1_t_t(opensimCommonJNI.TimeSeriesTableSpatialVec_updNearestRow__SWIG_0(swigCPtr, this, time, restrictToTimeRange), true);
  }

  public SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__VecT_2_SimTK__Vec3_1_t_t updNearestRow(double time) {
    return new SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__VecT_2_SimTK__Vec3_1_t_t(opensimCommonJNI.TimeSeriesTableSpatialVec_updNearestRow__SWIG_1(swigCPtr, this, time), true);
  }

  public SWIGTYPE_p_SimTK__RowVector_T_SimTK__VecT_2_SimTK__Vec3_1_t_t averageRow(double beginTime, double endTime) {
    return new SWIGTYPE_p_SimTK__RowVector_T_SimTK__VecT_2_SimTK__Vec3_1_t_t(opensimCommonJNI.TimeSeriesTableSpatialVec_averageRow(swigCPtr, this, beginTime, endTime), true);
  }

  public TimeSeriesTableSpatialVec clone() {
    long cPtr = opensimCommonJNI.TimeSeriesTableSpatialVec_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new TimeSeriesTableSpatialVec(cPtr, true);
  }

  public TimeSeriesTable flatten() {
    return new TimeSeriesTable(opensimCommonJNI.TimeSeriesTableSpatialVec_flatten__SWIG_0(swigCPtr, this), true);
  }

  public TimeSeriesTable flatten(StdVectorString suffixes) {
    return new TimeSeriesTable(opensimCommonJNI.TimeSeriesTableSpatialVec_flatten__SWIG_1(swigCPtr, this, StdVectorString.getCPtr(suffixes), suffixes), true);
  }

}
