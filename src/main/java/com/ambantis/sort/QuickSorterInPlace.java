package com.ambantis.sort;

public class QuickSorterInPlace {

  public void qsort(int[] arr, int left, int right) {
    if (left < right) {
      int idxPivot = left + (right - left) / 2;
      idxPivot = partition(arr, left, right, idxPivot);
      qsort(arr, left, idxPivot-1);
      qsort(arr, idxPivot+1, right);
    }
  }

  private int partition(int[] arr, int left, int right, int idxPivot) {
    int pivotValue = arr[idxPivot];
    swap(arr, idxPivot, right);
    int idxStore = left;
    for (int i = left; i < right; i++)
      if (arr[i] <= pivotValue) {
        swap(arr, i, idxStore++);
      }
    swap(arr, right, idxStore);
    return idxStore;
  }

  private void swap(int[] arr, int from, int to) {
    int tmp = arr[from];
    arr[from] = arr[to];
    arr[to] = tmp;
  }

  public String printArray(int[] arr) {
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

}
