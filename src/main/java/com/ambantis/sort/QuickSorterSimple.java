package com.ambantis.sort;

public class QuickSorterSimple {

  public int[] qsort(int[] array) {
    throw new UnsupportedOperationException("Not Implemented");
  }

  public int[] concatenate(int[] left, int[] middle, int[] right) {
    throw new UnsupportedOperationException("Not Implemented");
  }

  public String printArray(int[] array) {
    if (array.length < 2)
      return (array.length == 0) ? "()" : "(" + array[0] + ")";
    StringBuilder sb = new StringBuilder();
    sb.append("(");
    sb.append(array[0]);
    for (int i = 0; i < array.length-1; i++) {
      sb.append(",");
      sb.append(array[i]);
    }
    sb.append(")");
    return sb.toString();
  }
}
