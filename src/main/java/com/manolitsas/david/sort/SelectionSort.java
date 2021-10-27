package com.manolitsas.david.sort;

public class SelectionSort extends SortAlgorithm {

    @Override
    public int[] execute(int[] input) {
        int n = input.length;

        for (int i = 0; i < n-1; i++) {

            // Find the minimum element in the unsorted array
            int min_index = i;

            for (int j = i+1; j < n; j++)
                if (input[j] < input[min_index]) {
                    min_index = j;
                }

            int temp = input[min_index];
            input[min_index] = input[i];
            input[i] = temp;
        }

        return input;
    }

}
