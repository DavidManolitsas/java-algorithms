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
gradle run --args="sort bubble -i input/50-input.txt"
```

### Search Algorithm

To find a valid target choose a value from a the relevant file in [input](input)

```bash
gradle run --args="search linear -i input/50-input.txt -t 23"
```
