package com.manolitsas.david;

import com.manolitsas.david.util.AlgorithmInitializer;
import com.manolitsas.david.util.runner.AlgorithmRunner;
import lombok.extern.slf4j.Slf4j;
import picocli.CommandLine;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.io.IOException;
import java.util.concurrent.Callable;

@Slf4j
@Command(name = "java-algorithms", description = "demonstrate various java algorithms")
public class App implements Callable<Integer> {

    @Option(names = {"-f", "--file-path"}, description = "Input file path")
    private String inputFilePath;

    @Option(names = {"-t", "--target"}, description = "Search algorithm target")
    private int target;

    @Parameters(index = "0", description = "Type of algorithm")
    private String type;

    @Parameters(index = "1", description = "Algorithm to run")
    private String algorithm;


    @Override
    public Integer call() throws IOException {

        AlgorithmRunner<?> runner = AlgorithmInitializer.initAlgorithm(type, algorithm, inputFilePath, target);

        log.info("Running {} {} on {}", algorithm, type, inputFilePath);
        long startTime = System.nanoTime();
        var result = runner.run();
        long endTime = System.nanoTime();

        // log results
        var time = ((double) (endTime - startTime)) / Math.pow(10, 9);
        log.info("{}", result);
        log.info("Time taken: {} seconds", String.format("%.6f", time));
        return 0;
    }


    public static void main(String[] args) {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }

}
