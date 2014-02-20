package com.ambantis.sort;

public class QuickSorterSimple {

  public int[] qsort(int[] array) {
    if (array.length < 2)
      return array;

    int idxLeft = 0;
    int idxRight = 0;
    int idxMiddle = (array.length / 2); // set the midpoint

    int[] left = new int[array.length];
    int pivot = array[idxMiddle];
    int[] right = new int[array.length];

    // scan elements to the left of the pivot
    for (int i = 0; i < idxMiddle; i++)
      if (array[i] <= pivot)
        left[idxLeft++] = array[i];
      else
        right[idxRight++] = array[i];

    // scan elements to the right of the pivot
    for (int i = idxMiddle+1; i < array.length; i++)
      if (array[i] <= pivot)
        left[idxLeft++] = array[i];
      else
        right[idxRight++] = array[i];

    // shrink left & right before doing concatenation
    left = shrink(left, idxLeft);
    right = shrink(right, idxRight);

    return concatenate(qsort(left),pivot,qsort(right));
  }

  public int midpoint(int[] array) {
    int midpoint = array.length / 2;
    long leftValue = array[0];
    long midValue = array[midpoint];
    long rightValue = array[array.length-1];
    return (int) (leftValue + midValue + rightValue) / 3;
  }

  public int[] concatenate(int[] left, int middle, int[] right) {
    int len = left.length + 1 + right.length;
    int[] result = new int[len];
    int idx = 0;
    for (int i = 0; i < left.length; i++)
      result[idx++] = left[i];
    result[idx++] = middle;
    for (int i = 0; i < right.length; i++)
      result[idx++] = right[i];
    return result;
  }

  public int[] shrink(int[] array, int len) {
    int[] result = new int[len];
    for (int i = 0; i < len; i++)
      result[i] = array[i];
    return result;
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
