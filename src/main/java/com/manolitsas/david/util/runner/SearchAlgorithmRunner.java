package com.manolitsas.david.util;

import com.manolitsas.david.search.SearchAlgorithm;

public class SearchAlgorithmRunner {

    private final SearchAlgorithm algorithm;
    private final int[] input;
    private final int target;

    public SearchAlgorithmRunner(SearchAlgorithm algorithm, int[] input, int target) {
        this.algorithm = algorithm;
        this.input = input;
        this.target = target;
    }


    public int run() {
        return algorithm.execute(input, target);
    }



}
