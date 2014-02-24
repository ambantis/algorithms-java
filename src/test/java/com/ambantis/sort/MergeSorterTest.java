package com.ambantis.sort;

import static com.ambantis.util.ArrUtils.*;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Ignore;
import org.junit.Test;

public class MergeSorterTest {

  @Test
  public void testMergeSortTopDown() {
    MergeSort sorter = new MergeSorterTopDown();
    int[] actual = {3,2,1,5};
    int[] expected = {1,2,3,5};
    sorter.mergesort(actual);
    assertArrayEquals("Failure - mergesort created " + printArr(actual), expected, actual);
  }

}
