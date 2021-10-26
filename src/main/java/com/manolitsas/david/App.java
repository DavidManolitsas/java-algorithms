package com.manolitsas.david;

import picocli.CommandLine;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.Command;

import java.util.concurrent.Callable;

@Command(name="java-algorithms", description="demonstrate various java algorithms")
public class App implements Callable<Integer> {

    @Parameters(index="0", description="Type of algorithm")
    private String type;

    @Parameters(index="1",  description="Algorithm to run")
    private String algorithm;


    @Override
    public Integer call() {
        System.out.println(type);
        System.out.println(algorithm);
        return 0;
    }


    public static void main(String[] args) {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }

}
