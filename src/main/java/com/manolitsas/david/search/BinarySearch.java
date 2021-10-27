package com.manolitsas.david.search;

/** Binary search algorithm. */
public class BinarySearch extends SearchAlgorithm {

  @Override
  public int execute(int[] input, int target) {
    int first = 0;
    int last = input.length - 1;

    return binarySearch(input, first, last, target);
  }

  private int binarySearch(int[] input, int left, int right, int target) {
    int mid = (left + right) / 2;
    while (left <= right) {
      if (input[mid] < target) {
        left = mid + 1;
      } else if (input[mid] == target) {
        return input[mid];
      } else {
        right = mid - 1;
      }
      mid = (left + right) / 2;
    }

    return -1;
  }
}
