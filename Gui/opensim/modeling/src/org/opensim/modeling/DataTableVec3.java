/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class DataTableVec3 extends AbstractDataTable {
  private transient long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected DataTableVec3(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.DataTableVec3_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DataTableVec3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        opensimCommonJNI.delete_DataTableVec3(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DataTableVec3() {
    this(opensimCommonJNI.new_DataTableVec3__SWIG_0(), true);
  }

  public DataTableVec3(DataTableVec3 arg0) {
    this(opensimCommonJNI.new_DataTableVec3__SWIG_1(DataTableVec3.getCPtr(arg0), arg0), true);
  }

  public DataTableVec3(String filename, String tablename) {
    this(opensimCommonJNI.new_DataTableVec3__SWIG_2(filename, tablename), true);
  }

  public DataTable flatten() {
    return new DataTable(opensimCommonJNI.DataTableVec3_flatten__SWIG_0(swigCPtr, this), true);
  }

  public DataTable flatten(StdVectorString suffixes) {
    return new DataTable(opensimCommonJNI.DataTableVec3_flatten__SWIG_1(swigCPtr, this, StdVectorString.getCPtr(suffixes), suffixes), true);
  }

  public long numComponentsPerElement() {
    return opensimCommonJNI.DataTableVec3_numComponentsPerElement(swigCPtr, this);
  }

  public void appendRow(double indRow, SWIGTYPE_p_std__initializer_listT_SimTK__VecT_3_double_1_t_t container) {
    opensimCommonJNI.DataTableVec3_appendRow__SWIG_1(swigCPtr, this, indRow, SWIGTYPE_p_std__initializer_listT_SimTK__VecT_3_double_1_t_t.getCPtr(container));
  }

  public void appendRow(double indRow, RowVectorOfVec3 depRow) {
    opensimCommonJNI.DataTableVec3_appendRow__SWIG_3(swigCPtr, this, indRow, RowVectorOfVec3.getCPtr(depRow), depRow);
  }

  public void appendRow(double indRow, RowVectorViewVec3 depRow) {
    opensimCommonJNI.DataTableVec3_appendRow__SWIG_4(swigCPtr, this, indRow, RowVectorViewVec3.getCPtr(depRow), depRow);
  }

  public RowVectorViewVec3 getRowAtIndex(long index) {
    return new RowVectorViewVec3(opensimCommonJNI.DataTableVec3_getRowAtIndex(swigCPtr, this, index), true);
  }

  public RowVectorViewVec3 getRow(double ind) {
    return new RowVectorViewVec3(opensimCommonJNI.DataTableVec3_getRow(swigCPtr, this, ind), true);
  }

  public RowVectorViewVec3 updRowAtIndex(long index) {
    return new RowVectorViewVec3(opensimCommonJNI.DataTableVec3_updRowAtIndex(swigCPtr, this, index), true);
  }

  public RowVectorViewVec3 updRow(double ind) {
    return new RowVectorViewVec3(opensimCommonJNI.DataTableVec3_updRow(swigCPtr, this, ind), true);
  }

  public void setRowAtIndex(long index, RowVectorViewVec3 depRow) {
    opensimCommonJNI.DataTableVec3_setRowAtIndex__SWIG_0(swigCPtr, this, index, RowVectorViewVec3.getCPtr(depRow), depRow);
  }

  public void setRowAtIndex(long index, RowVectorOfVec3 depRow) {
    opensimCommonJNI.DataTableVec3_setRowAtIndex__SWIG_1(swigCPtr, this, index, RowVectorOfVec3.getCPtr(depRow), depRow);
  }

  public void setRow(double ind, RowVectorViewVec3 depRow) {
    opensimCommonJNI.DataTableVec3_setRow__SWIG_0(swigCPtr, this, ind, RowVectorViewVec3.getCPtr(depRow), depRow);
  }

  public void setRow(double ind, RowVectorOfVec3 depRow) {
    opensimCommonJNI.DataTableVec3_setRow__SWIG_1(swigCPtr, this, ind, RowVectorOfVec3.getCPtr(depRow), depRow);
  }

  public void removeRowAtIndex(long index) {
    opensimCommonJNI.DataTableVec3_removeRowAtIndex(swigCPtr, this, index);
  }

  public void removeRow(double ind) {
    opensimCommonJNI.DataTableVec3_removeRow(swigCPtr, this, ind);
  }

  public StdVectorDouble getIndependentColumn() {
    return new StdVectorDouble(opensimCommonJNI.DataTableVec3_getIndependentColumn(swigCPtr, this), false);
  }

  public void appendColumn(String columnLabel, SWIGTYPE_p_std__initializer_listT_SimTK__VecT_3_double_1_t_t container) {
    opensimCommonJNI.DataTableVec3_appendColumn__SWIG_1(swigCPtr, this, columnLabel, SWIGTYPE_p_std__initializer_listT_SimTK__VecT_3_double_1_t_t.getCPtr(container));
  }

  public void appendColumn(String columnLabel, VectorOfVec3 depCol) {
    opensimCommonJNI.DataTableVec3_appendColumn__SWIG_3(swigCPtr, this, columnLabel, VectorOfVec3.getCPtr(depCol), depCol);
  }

  public void appendColumn(String columnLabel, VectorViewVec3 depCol) {
    opensimCommonJNI.DataTableVec3_appendColumn__SWIG_4(swigCPtr, this, columnLabel, VectorViewVec3.getCPtr(depCol), depCol);
  }

  public VectorViewVec3 getDependentColumnAtIndex(long index) {
    return new VectorViewVec3(opensimCommonJNI.DataTableVec3_getDependentColumnAtIndex(swigCPtr, this, index), true);
  }

  public VectorViewVec3 getDependentColumn(String columnLabel) {
    return new VectorViewVec3(opensimCommonJNI.DataTableVec3_getDependentColumn(swigCPtr, this, columnLabel), true);
  }

  public VectorViewVec3 updDependentColumnAtIndex(long index) {
    return new VectorViewVec3(opensimCommonJNI.DataTableVec3_updDependentColumnAtIndex(swigCPtr, this, index), true);
  }

  public VectorViewVec3 updDependentColumn(String columnLabel) {
    return new VectorViewVec3(opensimCommonJNI.DataTableVec3_updDependentColumn(swigCPtr, this, columnLabel), true);
  }

  public void setIndependentValueAtIndex(long rowIndex, double value) {
    opensimCommonJNI.DataTableVec3_setIndependentValueAtIndex(swigCPtr, this, rowIndex, value);
  }

  public MatrixViewVec3 getMatrix() {
    return new MatrixViewVec3(opensimCommonJNI.DataTableVec3_getMatrix(swigCPtr, this), false);
  }

  public MatrixViewVec3 getMatrixBlock(long rowStart, long columnStart, long numRows, long numColumns) {
    return new MatrixViewVec3(opensimCommonJNI.DataTableVec3_getMatrixBlock(swigCPtr, this, rowStart, columnStart, numRows, numColumns), true);
  }

  public MatrixViewVec3 updMatrix() {
    return new MatrixViewVec3(opensimCommonJNI.DataTableVec3_updMatrix(swigCPtr, this), false);
  }

  public MatrixViewVec3 updMatrixBlock(long rowStart, long columnStart, long numRows, long numColumns) {
    return new MatrixViewVec3(opensimCommonJNI.DataTableVec3_updMatrixBlock(swigCPtr, this, rowStart, columnStart, numRows, numColumns), true);
  }

  public String toString(StdVectorInt rows, StdVectorString columnLabels, boolean withMetaData, long splitSize, long maxWidth, long precision) {
    return opensimCommonJNI.DataTableVec3_toString__SWIG_0(swigCPtr, this, StdVectorInt.getCPtr(rows), rows, StdVectorString.getCPtr(columnLabels), columnLabels, withMetaData, splitSize, maxWidth, precision);
  }

  public String toString(StdVectorInt rows, StdVectorString columnLabels, boolean withMetaData, long splitSize, long maxWidth) {
    return opensimCommonJNI.DataTableVec3_toString__SWIG_1(swigCPtr, this, StdVectorInt.getCPtr(rows), rows, StdVectorString.getCPtr(columnLabels), columnLabels, withMetaData, splitSize, maxWidth);
  }

  public String toString(StdVectorInt rows, StdVectorString columnLabels, boolean withMetaData, long splitSize) {
    return opensimCommonJNI.DataTableVec3_toString__SWIG_2(swigCPtr, this, StdVectorInt.getCPtr(rows), rows, StdVectorString.getCPtr(columnLabels), columnLabels, withMetaData, splitSize);
  }

  public String toString(StdVectorInt rows, StdVectorString columnLabels, boolean withMetaData) {
    return opensimCommonJNI.DataTableVec3_toString__SWIG_3(swigCPtr, this, StdVectorInt.getCPtr(rows), rows, StdVectorString.getCPtr(columnLabels), columnLabels, withMetaData);
  }

  public String toString(StdVectorInt rows, StdVectorString columnLabels) {
    return opensimCommonJNI.DataTableVec3_toString__SWIG_4(swigCPtr, this, StdVectorInt.getCPtr(rows), rows, StdVectorString.getCPtr(columnLabels), columnLabels);
  }

  public String toString(StdVectorInt rows) {
    return opensimCommonJNI.DataTableVec3_toString__SWIG_5(swigCPtr, this, StdVectorInt.getCPtr(rows), rows);
  }

  public String toString() {
    return opensimCommonJNI.DataTableVec3_toString__SWIG_6(swigCPtr, this);
  }

  public DataTableVec3 clone() {
    long cPtr = opensimCommonJNI.DataTableVec3_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new DataTableVec3(cPtr, true);
  }

}
