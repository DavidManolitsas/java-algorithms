package com.manolitsas.david.sort;

/** Quick sort. */
public class QuickSort extends SortAlgorithm {

  @Override
  public int[] execute(int[] input) {
    return quickSort(input, 0, input.length - 1);
  }

  private int[] quickSort(int[] input, int low, int high) {

    if (low < high) {
      int partitionIndex = partition(input, low, high);

      quickSort(input, low, partitionIndex - 1);
      quickSort(input, partitionIndex + 1, high);
    }
    return input;
  }

  private int partition(int[] input, int low, int high) {

    int pivot = input[high];
    int i = (low - 1);

    for (int j = low; j <= high - 1; j++) {

      if (input[j] < pivot) {
        i++;

        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
      }
    }

    int temp = input[i + 1];
    input[i + 1] = input[high];
    input[high] = temp;

    return (i + 1);
  }
}
