package com.ambantis.sort;

import static com.ambantis.util.ArrUtils.printArr;
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
    sorter.qsort(unsorted);
    assertArrayEquals("Failure - {3,7,8,5,2,1,9,5,4} should be qsorted into {1,2,3,4,5,5,7,8,9} " +
        "but instead was " + printArr(unsorted), sorted, unsorted);
  }

}
