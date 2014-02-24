package com.ambantis.sort;

import static com.ambantis.util.ArrUtils.printArr;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class QuickSorterTest {

  @Test
  public void testquickSortInPlace() {
    QuickSort sorter = new QuickSorterInPlace();
    int[] actual = {3,7,8,5,2,1,9,5,4};
    int[] expected = {1,2,3,4,5,5,7,8,9};
    sorter.quicksort(actual);
    assertArrayEquals("Failure - {3,7,8,5,2,1,9,5,4} should be qsorted into {1,2,3,4,5,5,7,8,9} " +
        "but instead was " + printArr(actual), expected, actual);
  }

  @Test
  public void testQuickSortSimple() {
    QuickSort sorter = new QuickSorterSimple();
    int[] actual = {3,7,8,6,2,1,9,5,4};
    int[] sorted = {1,2,3,4,5,6,7,8,9};
    sorter.quicksort(actual);
    assertArrayEquals("Failure - {3,7,8,5,2,1,9,5,4} should be qsorted into {1,2,3,4,5,6,7,8,9} " +
        "but isntead was " + printArr(actual), sorted, actual);
  }
}
