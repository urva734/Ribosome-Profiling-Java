# Ribosome Profiling Simulation in Java

A console-based Java program that simulates ribosome density mapping on an mRNA sequence. This is similar to how real Ribosome Profiling / Ribo-Seq works in bioinformatics.

## Author
Urva Sohail

## Features
- **User Input**: Enter any mRNA sequence A,T,C,G
- **Custom Positions**: Enter ribosome positions at runtime
- **Validation**: Handles invalid bases and out-of-range positions
- **Visualization**: Bar graph visualization of ribosome density using `*`
- **Density Array**: Prints final density array for data analysis

## How to Run

### Using NetBeans / IntelliJ
1. Create new Java Project
2. Add `RiboProfilingAnalysis.java` file
3. Press `F6` or `Run`

## Run
java RiboProfilingAnalysis

## Sample Input & Output
### Input
Enter mRNA Sequence: ATGGCCATTGTA
Enter ribosome positions separated by spaces: 0 3 6 9
### Output
=== Ribosome Profiling: Sequence-Based Simulation ===

### Calculating ribosome density
Ribosome added at position: 0
Ribosome added at position: 3
Ribosome added at position: 6
Ribosome added at position: 9
mRNA Sequence with positions:
 0:A  1:T  2:G 3:G  4:C  5:C 6:A 7:T 8:T 9:G 10:T 11:A 

### Ribosome Density Visualization 
Position  0 (A): 1 ribosome(s) *
Position 3 (G): 1 ribosome(s) *
Position  6 (A): 1 ribosome(s) *
Position  9 (G): 1 ribosome(s) *


### Final Density Array: [1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0]

## How It Works
The program creates a density array of size = mRNA lengthFor each ribosome position entered,
it increments that indexIt then prints which positions have ribosomes and visualizes it

## Future Improvements
- [ ] Read input from.fasta file
- [ ] Calculate codon-level density instead of base-level
- [ ] Export results to CSV for data analysis
