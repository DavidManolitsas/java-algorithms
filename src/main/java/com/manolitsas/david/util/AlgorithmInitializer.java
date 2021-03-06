package com.manolitsas.david.util;

import com.manolitsas.david.search.BinarySearch;
import com.manolitsas.david.search.LinearSearch;
import com.manolitsas.david.search.SearchAlgorithm;
import com.manolitsas.david.sort.BubbleSort;
import com.manolitsas.david.sort.InsertionSort;
import com.manolitsas.david.sort.MergeSort;
import com.manolitsas.david.sort.QuickSort;
import com.manolitsas.david.sort.SelectionSort;
import com.manolitsas.david.sort.ShellSort;
import com.manolitsas.david.sort.SortAlgorithm;
import com.manolitsas.david.util.runner.AlgorithmRunner;
import com.manolitsas.david.util.runner.SearchAlgorithmRunner;
import com.manolitsas.david.util.runner.SortAlgorithmRunner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.InvalidParameterException;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;

/** Initialise the algorithm and input values. */
@Slf4j
public class AlgorithmInitializer {

  /**
   * Intialise algorithm and input value.
   *
   * @param type the type of algorithm (search or sort)
   * @param algorithm the algorithm to be used
   * @param filePath path to input file
   * @param target the target value for search algorithms
   * @return an algorithm runner to execute the algorithm
   * @throws IOException thrown if input file is not found
   */
  public static AlgorithmRunner<?> initAlgorithm(
      String type, String algorithm, String filePath, int target)
      throws IOException, InvalidParameterException {
    int[] input = initInput(filePath);

    switch (type) {
      case "sort":
        return new SortAlgorithmRunner(initSortAlgorithm(algorithm), input);
      case "search":
        return new SearchAlgorithmRunner(initSearchAlgorithm(algorithm), input, target);
      default:
        log.error("Invalid algorithm type [type={}]", type);
        throw new InvalidParameterException();
    }
  }

  private static SortAlgorithm initSortAlgorithm(String algorithm)
      throws InvalidParameterException {

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
        log.error("Invalid algorithm [algorithm={}]", algorithm);
        throw new InvalidParameterException();
    }
  }

  private static SearchAlgorithm initSearchAlgorithm(String algorithm)
      throws InvalidParameterException {

    switch (algorithm) {
      case "linear":
        return new LinearSearch();
      case "binary":
        return new BinarySearch();
      default:
        log.error("Invalid algorithm [algorithm={}]", algorithm);
        throw new InvalidParameterException();
    }
  }

  private static int[] initInput(String filePath) throws IOException {

    try {
      List<Integer> inputValues =
          Files.readAllLines(Paths.get(filePath)).stream()
              .map(Integer::parseInt)
              .collect(Collectors.toList());

      int[] input = new int[inputValues.size()];
      for (int i = 0; i < input.length; i++) {
        input[i] = inputValues.get(i);
      }

      return input;
    } catch (IOException e) {
      log.error("No file found [file={}]", filePath);
      throw new IOException();
    }
  }
}
