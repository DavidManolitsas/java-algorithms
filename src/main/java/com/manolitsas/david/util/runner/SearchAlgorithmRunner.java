package com.manolitsas.david.util.runner;

import com.manolitsas.david.search.BinarySearch;
import com.manolitsas.david.search.SearchAlgorithm;
import java.util.Arrays;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/** Runner to execute search algorithms. */
@Slf4j
@RequiredArgsConstructor
public class SearchAlgorithmRunner extends AlgorithmRunner<Integer> {

  private final SearchAlgorithm algorithm;
  private final int[] input;
  private final int target;

  @Override
  public Integer run() {
    // binary search only works on elements sorted in ascending order
    if (algorithm instanceof BinarySearch) {
      Arrays.sort(input);
      log.info("Input sorted prior to running binary search algorithm");
    }

    long startTime = System.nanoTime();
    var result = algorithm.execute(input, target);
    long endTime = System.nanoTime();

    // log search algorithm
    if (result == -1) {
      log.info("Did not find {}", target);
    } else {
      log.info("{} found", result);
    }

    var time = ((double) (endTime - startTime)) / Math.pow(10, 9);
    log.info("Time taken: {} seconds", String.format("%.6f", time));

    return result;
  }
}
