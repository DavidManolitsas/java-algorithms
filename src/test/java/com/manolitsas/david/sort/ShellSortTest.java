package com.manolitsas.david.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.manolitsas.david.util.TestHelper;
import org.junit.jupiter.api.Test;

public class ShellSortTest {

  int[] input = TestHelper.INPUT;
  private final ShellSort shellSort = new ShellSort();

  @Test
  public void execute_whenUnsorted_thenReturnSortedArray() {

    int[] expected = {6, 11, 23, 25, 31, 65, 88, 204, 445, 7332};
    int[] actual = shellSort.execute(input);

    assertArrayEquals(expected, actual);
  }
}
