package com.manolitsas.david.search;

/** Linear search. */
public class LinearSearch extends SearchAlgorithm {

  @Override
  public int execute(int[] input, int target) {

    for (int i : input) {
      if (i == target) {
        return i;
      }
    }

    return -1;
  }
}
