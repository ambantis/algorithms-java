package com.ambantis;

import static com.ambantis.util.ArrUtils.*;

import com.ambantis.sort.*;
import com.ambantis.util.Timer;

public class App {
  public static void main(String[] args) {
    int len = 4000000;
    int n = 100;
    int[] arr = {};
    int[] arr2 = {};
    Timer stopwatch = null;

    QuickSorterInPlace inPlace = new QuickSorterInPlace();
    QuickSorterSimple simple = new QuickSorterSimple();

    System.out.println("About to test the performance of simple vs in-place qsort");
    System.out.println("with arrays of size=" + len);

    System.out.println("beginning simple qsort tests");
    int simpleTotalTime = 0;
    for (int i = 0; i < n; i++) {
      arr = randomArr(len);
      stopwatch = new Timer();
      arr2 = simple.qsort(arr);
      simpleTotalTime += stopwatch.elapsedTime();
      if (!isSorted(arr2))
        throw new RuntimeException("Error: in iteration " + i + " simple qsort failed to sort array");
    }
    System.out.println("total time for simple sort for " + n + " iterations was " + simpleTotalTime);

    System.out.println("beginning in-place qsort tests");
    int inPlaceTotalTime = 0;
    for (int i = 0; i < n; i++) {
      arr = randomArr(len);
      stopwatch = new Timer();
      inPlace.qsort(arr);
      inPlaceTotalTime += stopwatch.elapsedTime();
      if (!isSorted(arr2))
        throw new RuntimeException("Error: in iteration " + i + " in-place qsort failed to sort array");
    }
    System.out.println("total time for in-place sort for " + n + " iterations was " + inPlaceTotalTime);
  }
}
