package com.manolitsas.david.util.runner;

import com.manolitsas.david.search.SearchAlgorithm;
import lombok.RequiredArgsConstructor;

/**
 * Runner to execute search algorithms.
 */
@RequiredArgsConstructor
public class SearchAlgorithmRunner extends AlgorithmRunner<Integer> {

  private final SearchAlgorithm algorithm;
  private final int[] input;
  private final int target;

  @Override
  public Integer run() {
    return algorithm.execute(input, target);
  }
}
