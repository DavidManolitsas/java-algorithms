package com.manolitsas.david;

import com.manolitsas.david.util.AlgorithmInitializer;
import com.manolitsas.david.util.runner.AlgorithmRunner;
import java.io.IOException;
import java.util.concurrent.Callable;
import lombok.extern.slf4j.Slf4j;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

/** Main class. */
@Slf4j
@Command(name = "java-algorithms", description = "demonstrate various java algorithms")
public class App implements Callable<Integer> {

  @Option(
      names = {"-f", "--file-path"},
      description = "Input file path")
  private String inputFilePath;

  @Option(
      names = {"-t", "--target"},
      description = "Search algorithm target")
  private int target;

  @Parameters(index = "0", description = "Type of algorithm")
  private String type;

  @Parameters(index = "1", description = "Algorithm to run")
  private String algorithm;

  @Parameters(index = "2", description = "Log results")
  private boolean isVisualised;

  @Override
  public Integer call() throws IOException {

    AlgorithmRunner<?> runner =
        AlgorithmInitializer.initAlgorithm(type, algorithm, inputFilePath, target);

    log.info("Starting {} {} on '{}'", algorithm, type, inputFilePath);
    var result = runner.run();

    // log sorted results
    if (isVisualised && result instanceof int[]) {
      log.info("{}", result);
    }

    return 0;
  }

  public static void main(String[] args) {
    int exitCode = new CommandLine(new App()).execute(args);
    System.exit(exitCode);
  }
}
