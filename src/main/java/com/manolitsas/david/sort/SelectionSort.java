package com.manolitsas.david.sort;

/**
 * Selection sort.
 */
public class SelectionSort extends SortAlgorithm {

  @Override
  public int[] execute(int[] input) {
    int n = input.length;

    for (int i = 0; i < n - 1; i++) {

      // Find the minimum element in the unsorted array
      int minIndex = i;

      for (int j = i + 1; j < n; j++) {
        if (input[j] < input[minIndex]) {
          minIndex = j;
        }
      }

      int temp = input[minIndex];
      input[minIndex] = input[i];
      input[i] = temp;
    }

    return input;
  }
}
