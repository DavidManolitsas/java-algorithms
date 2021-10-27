# Java Algorithms

This project demonstrates how to implement various sort and search algorithms using Java.
The algorithms used in this project include:

### Sort
* Bubble Sort
* Insertion Sort
* Selection Sort
* Merge Sort
* Quick Sort
* Shell Sort

### Search
* Linear Search
* Binary Search

## Format code

Format code using [google-java-format](https://github.com/sherter/google-java-format-gradle-plugin) plugin.

To format the code, run the following command:
```bash
./gradlew goJF
```

## Build

To build the project execute the following command:

```bash
./gradlew build
```

## Run

To run the project execute the following command:

```bash
gradle run --args="[type] [algorithm] -f[file] -t[target]"
```

For more informaiton see the examples below for both sort and search algorithms

### Sort Algorithm

```bash
gradle run --args="sort bubble -f input/50-input.txt"
```

### Search Algorithm

```bash
gradle run --args="search linear -f input/50-input.txt -t 23"
```

To find a valid target choose a value from a the relevant file in [input](input)