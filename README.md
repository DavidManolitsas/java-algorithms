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
gradle run --args="[type] [algorithm] [visualised] -f[file] -t[target]"
```

For more information see the examples below for both sort and search algorithms

### Sort Algorithm

```bash
gradle run --args="sort bubble true -f input/50-input.txt"
```

### Search Algorithm

```bash
gradle run --args="search linear false -f input/50-input.txt -t 23"
```

To find a valid target choose a value from a the relevant file in [input](input)

### References

For more information regarding the algorithms used in this project, see below:

* [Baeldung Bubble Sort](https://www.baeldung.com/java-bubble-sort)
* [Baeldung Insertion Sort](https://www.baeldung.com/java-insertion-sort)
* [Baeldung Selection Sort](https://www.baeldung.com/java-selection-sort)
* [Baeldung Merge Sort](https://www.baeldung.com/java-merge-sort)
* [Baeldung Quick Sort](https://www.baeldung.com/java-quicksort)
* [Baeldung Shell Sort](https://www.baeldung.com/java-shell-sort)
* [GeeksForGeeks Linear Search](https://www.geeksforgeeks.org/linear-search/)
* [Baeldung Binary Search](https://www.baeldung.com/java-binary-search)