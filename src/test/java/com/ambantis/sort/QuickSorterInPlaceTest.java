package com.ambantis.sort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class QuickSorterInPlaceTest {

  QuickSorterInPlace sorter;

  @Before
  public void init() {
    sorter = new QuickSorterInPlace();
  }

  @Test
  public void testQsort() {
    int[] unsorted = {3,7,8,5,2,1,9,5,4};
    int[] sorted = {1,2,3,4,5,5,7,8,9};
    sorter.qsort(unsorted, 0, unsorted.length-1);
    assertArrayEquals("Failure - {3,7,8,5,2,1,9,5,4} should be qsorted into {1,2,3,4,5,5,7,8,9} " +
        "but instead was " + sorter.printArray(unsorted), sorted, unsorted);
  }

}
