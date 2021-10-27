package com.manolitsas.david.search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.manolitsas.david.util.TestHelper;
import org.junit.jupiter.api.Test;

public class LinearSearchTest {

  int[] input = TestHelper.INPUT;
  private final LinearSearch linearSearch = new LinearSearch();

  @Test
  public void execute_whenUnsorted_thenReturnFoundElement() {
    int expected = 445;
    int actual = linearSearch.execute(input, expected);

    assertEquals(expected, actual);
  }
}
