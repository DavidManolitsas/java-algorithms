package com.manolitsas.david.sort;

/** Merge sort. */
public class MergeSort extends SortAlgorithm {

  @Override
  public int[] execute(int[] input) {
    return sort(input, 0, input.length - 1);
  }

  private int[] sort(int[] input, int left, int right) {
    if (left < right) {
      int mid = left + (right - left) / 2;

      sort(input, left, mid);
      sort(input, mid + 1, right);

      merge(input, left, mid, right);
    }

    return input;
  }

  private void merge(int[] input, int left, int mid, int right) {
    int n1 = mid - left + 1;
    int n2 = right - mid;

    int[] tempLeft = new int[n1];
    int[] tempRight = new int[n2];

    for (int i = 0; i < n1; ++i) {
      tempLeft[i] = input[left + i];
    }

    for (int j = 0; j < n2; ++j) {
      tempRight[j] = input[mid + 1 + j];
    }

    int i = 0, j = 0;
    int k = left;

    while (i < n1 && j < n2) {
      if (tempLeft[i] <= tempRight[j]) {
        input[k] = tempLeft[i];
        i++;
      } else {
        input[k] = tempRight[j];
        j++;
      }
      k++;
    }

    while (i < n1) {
      input[k] = tempLeft[i];
      i++;
      k++;
    }

    while (j < n2) {
      input[k] = tempRight[j];
      j++;
      k++;
    }
  }
}
