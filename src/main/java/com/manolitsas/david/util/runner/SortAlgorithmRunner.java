package com.manolitsas.david.util.runner;

import com.manolitsas.david.sort.SortAlgorithm;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SortAlgorithmRunner extends AlgorithmRunner<int[]> {

    private final SortAlgorithm algorithm;
    private final int[] input;

    @Override
    public int[] run() {
        return algorithm.execute(input);
    }

}
