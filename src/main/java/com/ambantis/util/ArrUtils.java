package com.ambantis.util;

public class ArrUtils {

  public static int[] concatenate(int[] left, int middle, int[] right) {
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

  public static int[] shrink(int[] arr, int len) {
    int[] result = new int[len];
    for (int i = 0; i < len; i++)
      result[i] = arr[i];
    return result;
  }

  public static void swap(int[] arr, int from, int to) {
    int tmp = arr[from];
    arr[from] = arr[to];
    arr[to] = tmp;
  }

  public static String printArr(int[] arr) {
    if (arr.length < 2)
      return (arr.length == 0) ? "()" : "(" + arr[0] + ")";
    StringBuilder sb = new StringBuilder();
    sb.append("(");
    sb.append(arr[0]);
    for (int i = 1; i < arr.length; i++) {
      sb.append(",");
      sb.append(arr[i]);
    }
    sb.append(")");
    return sb.toString();
  }

  public static int[] randomArr(int n) {
    int len = (n > Integer.MAX_VALUE) ? Integer.MAX_VALUE : n;
    int[] result = new int[len];
    long next = 0;
    for (int i = 0; i < len; i++)
      result[i] = (int) (Integer.MAX_VALUE * Math.random());
    return result;
  }

  public static boolean isSorted(int[] arr) {
    for (int i = 1, len = arr.length; i < len; i++)
      if (arr[i-1] > arr[i])
        return false;
    return true;
  }

}
