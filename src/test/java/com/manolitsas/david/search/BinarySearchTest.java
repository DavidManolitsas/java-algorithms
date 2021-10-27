package com.manolitsas.david.search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.manolitsas.david.util.TestHelper;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

  int[] input = TestHelper.INPUT;
  private final BinarySearch binarySearch = new BinarySearch();

  @Test
  public void execute_whenUnsorted_thenReturnFoundElement() {
    int expected = 445;
    // sort array before executing binary search
    Arrays.sort(input);
    int actual = binarySearch.execute(input, expected);

    assertEquals(expected, actual);
  }
}
