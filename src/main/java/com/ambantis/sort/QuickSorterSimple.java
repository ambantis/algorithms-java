package com.ambantis.sort;

import static com.ambantis.util.ArrUtils.concatenate;
import static com.ambantis.util.ArrUtils.shrink;
import static com.ambantis.util.ArrUtils.swap;

public class QuickSorterSimple implements QuickSort {

  public void quicksort(int[] data) {
    int[] tmp = iter(data);
    for (int i = 0; i < data.length; i++)
      data[i] = tmp[i];
  }

  public int[] iter(int[] array) {
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

    return concatenate(iter(left),pivot,iter(right));
  }
}
