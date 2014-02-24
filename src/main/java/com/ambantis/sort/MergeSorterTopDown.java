package com.ambantis.sort;

import static com.ambantis.util.ArrUtils.*;

public class MergeSorterTopDown implements MergeSort {

  public void mergesort(int[] data) {
    int[] tmp = new int[data.length];
    iter(data, 0, data.length-1, tmp);
  }

  private void iter(int[] data, int begin, int end, int[] tmp) {
    if (begin < end) {
      int middle = begin + (end - begin) / 2;
      iter(data, begin, middle, tmp);
      iter(data, middle+1, end, tmp);
      merge(data, begin, middle, end, tmp);
    }
  }

  private void merge(int[] data, int begin, int middle, int end, int[] tmp) {
    int leftIdx = begin;    // beginning element of the left sublist
    int leftEnd = middle+1; // one past last element of left sublist

    int rightIdx = middle+1; // beginning element of the right sublist
    int rightEnd = end+1;    // one past last element of right sublist

    int i = begin; // index for the merging of the two sublists

    // there are elements in both sorted sublists, so choose smaller of the two
    while(leftIdx < leftEnd && rightIdx < rightEnd) {
      if (data[leftIdx] <= data[rightIdx])
        tmp[i++] = data[leftIdx++];
      else
        tmp[i++] = data[rightIdx++];
    }

    // one of the other sublist is exhausted, so just most remaining elements
    while (leftIdx < leftEnd)
      tmp[i++] = data[leftIdx++];
    while (rightIdx < rightEnd)
      tmp[i++] = data[rightIdx++];

    for (i = begin; i < rightEnd; i++)
      data[i] = tmp[i];
  }
}
