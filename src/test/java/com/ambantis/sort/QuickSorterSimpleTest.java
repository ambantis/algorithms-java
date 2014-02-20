package com.ambantis.sort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class QuickSorterSimpleTest {

  QuickSorterSimple sorter;

  @Before
  public void init() {
    sorter = new QuickSorterSimple();
  }

  @Test
  public void testConcatenate() {
    int[] left = {1,2,3,4};
    int[] middle = {5};
    int[] right = {6,7,8,9};
    int[] sorted = {1,2,3,4,5,6,7,8,9};
    int[] actual = sorter.concatenate(left, middle, right);
    assertArrayEquals("Failure - {1,2,3,4}+{5}+{6,7,8,9} should concatenate to {1,2,3,4,5,6,7,8,9} " +
        "but instead was " + sorter.printArray(actual), sorted, actual);
  }

  @Test
  public void testQsort() {
    int[] unsorted = {3,7,8,5,2,1,9,5,4};
    int[] sorted = {1,2,3,4,5,6,7,8,9};
    int[] actual = sorter.qsort(unsorted);
    assertArrayEquals("Failure - {3,7,8,5,2,1,9,5,4} should be qsorted into {1,2,3,4,5,6,7,8,9} " +
        "but isntead was " + sorter.printArray(actual), sorted, actual);
  }

}
