public class RiboProfilingAnalysis {
    public static void main(String[] args) {
        System.out.println("=== Ribosome Profiling: Sequence-Based Simulation ===");
        String mRNASequence = "ATGGCCATTGTAATGGGCCGCCTAA";
        RibosomeProfilingData data = new RibosomeProfilingData(mRNASequence);
        int[] positions = {0, 3, 6, 9};
        data.calculateRibosomeDensity(positions);
        data.visualizeRibosomeDensity();
        data.printSequence();
        data.printDensityArray();
    }
}

class RibosomeProfilingData {
    private final String mRNASequence;
    private final int[] densityArray;

    public RibosomeProfilingData(String sequence) {
        this.mRNASequence = sequence;
        this.densityArray = new int[sequence.length()];
    }

    public void calculateRibosomeDensity(int[] positions) {
        System.out.println("Calculating ribosome density...");
        for (int pos : positions) {
            if (pos >= 0 && pos < densityArray.length) {
                densityArray[pos]++;
                System.out.println("Ribosome added at position: " + pos);
            } else {
                System.out.println("Invalid ribosome position skipped: " + pos);
            }
        }
    }

    public void visualizeRibosomeDensity() {
        System.out.println("\n--- Ribosome Density Visualization ---");
        System.out.println("mRNA Sequence Length: " + mRNASequence.length());
        System.out.println("Ribosome Density by Position:\n");
        for (int i = 0; i < densityArray.length; i++) {
            if (densityArray[i] > 0) {
                System.out.printf("Position %2d (%s): %d ribosome(s)%n",
                        i, mRNASequence.charAt(i), densityArray[i]);
            }
        }
        System.out.println("--------------------------------------\n");
    }

    public void printSequence() {
        System.out.println("Original mRNA Sequence:");
        for (int i = 0; i < mRNASequence.length(); i++) {
            System.out.print(mRNASequence.charAt(i) + " ");
        }
        System.out.println("\n");
    }

    public void printDensityArray() {
        System.out.println("Density Array:");
        for (int i = 0; i < densityArray.length; i++) {
            System.out.print(densityArray[i] + " ");
        }
        System.out.println("\n");
    }
}
