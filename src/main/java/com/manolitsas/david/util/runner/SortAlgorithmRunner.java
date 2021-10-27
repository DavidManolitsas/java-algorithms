package com.manolitsas.david.util.runner;

import com.manolitsas.david.sort.SortAlgorithm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/** Runner to execute sort algorithms. */
@Slf4j
@RequiredArgsConstructor
public class SortAlgorithmRunner extends AlgorithmRunner<int[]> {

  private final SortAlgorithm algorithm;
  private final int[] input;

  @Override
  public int[] run() {

    long startTime = System.nanoTime();
    var result = algorithm.execute(input);
    long endTime = System.nanoTime();

    var time = ((double) (endTime - startTime)) / Math.pow(10, 9);
    log.info("Time taken: {} seconds", String.format("%.6f", time));

    return result;
  }
}
