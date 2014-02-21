package com.ambantis.sort;

import static com.ambantis.util.ArrUtils.swap;

public class QuickSorterInPlace {

  public void qsort(int[] arr) {
    iter(arr, 0, arr.length-1);
  }

  public void iter(int[] arr, int left, int right) {
    if (left < right) {
      int idxPivot = left + (right - left) / 2;
      idxPivot = partition(arr, left, right, idxPivot);
      iter(arr, left, idxPivot-1);
      iter(arr, idxPivot+1, right);
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
}
