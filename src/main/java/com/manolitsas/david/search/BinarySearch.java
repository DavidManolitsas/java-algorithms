package com.manolitsas.david.search;

import java.util.Arrays;


public class BinarySearch extends SearchAlgorithm {

    @Override
    public int execute(int[] input, int target) {
        int first = 0;
        int last = input.length - 1;

        // binary search only works on elements sorted in ascending order
        Arrays.sort(input);

        return binarySearch(input, first, last, target);
    }

    private int binarySearch(int[] input, int first, int last, int target) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (input[mid] < target) {
                first = mid + 1;
            } else if (input[mid] == target) {
                return input[mid];
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }

        return -1;
    }

}
