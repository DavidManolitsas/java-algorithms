package com.manolitsas.david.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.manolitsas.david.util.TestHelper;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

  int[] input = TestHelper.INPUT;
  private final BubbleSort bubbleSort = new BubbleSort();

  @Test
  public void execute_whenUnsorted_thenReturnSortedArray() {
    int[] expected = {6, 11, 23, 25, 31, 65, 88, 204, 445, 7332};

    int[] actual = bubbleSort.execute(input);

    assertArrayEquals(expected, actual);
  }
}
