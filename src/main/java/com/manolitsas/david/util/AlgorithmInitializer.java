package com.manolitsas.david.util;

import com.manolitsas.david.search.BinarySearch;
import com.manolitsas.david.search.LinearSearch;
import com.manolitsas.david.search.SearchAlgorithm;
import com.manolitsas.david.sort.*;
import com.manolitsas.david.util.runner.AlgorithmRunner;
import com.manolitsas.david.util.runner.SearchAlgorithmRunner;
import com.manolitsas.david.util.runner.SortAlgorithmRunner;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.InvalidParameterException;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class AlgorithmInitializer {

    public static AlgorithmRunner<?> initAlgorithm(String type, String algorithm, String filePath, int target) throws IOException {
        try {
            int[] input = initInput(filePath);

            switch (type) {
                case "sort":
                    return new SortAlgorithmRunner(initSortAlgorithm(algorithm), input);
                case "search":
                    return new SearchAlgorithmRunner(initSearchAlgorithm(algorithm), input, target);
                default:
                    System.err.println("Invalid algorithm type");
                    throw new InvalidParameterException();
            }
        } catch (IOException e) {
            throw new IOException();
        }
    }


    private static SortAlgorithm initSortAlgorithm(String algorithm) {

        switch (algorithm) {
            case "bubble":
                return new BubbleSort();
            case "insertion":
                return new InsertionSort();
            case "selection":
                return new SelectionSort();
            case "merge":
                return new MergeSort();
            case "quick":
                return new QuickSort();
            case "shell":
                return new ShellSort();
            default:
                System.err.println("Invalid algorithm");
                return null;
        }

    }


    private static SearchAlgorithm initSearchAlgorithm(String algorithm) {

        switch (algorithm) {
            case "linear":
                return new LinearSearch();
            case "binary":
                return new BinarySearch();
            default:
                System.err.println("Invalid algorithm");
                return null;
        }

    }


    private static int[] initInput(String filePath) throws IOException {

        try {
            List<Integer> inputValues = Files.readAllLines(Paths.get(filePath)).stream().map(Integer::parseInt)
                    .collect(Collectors.toList());

            int[] input = new int[inputValues.size()];
            for (int i = 0; i < input.length; i++) {
                input[i] = inputValues.get(i);
            }

            return input;
        } catch (IOException e) {
            throw new IOException();
        }
    }

}
