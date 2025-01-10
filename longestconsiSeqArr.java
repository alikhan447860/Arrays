public class longestconsiSeqArr {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 0, 56};
        int longseq = 1; // Longest sequence length
        int currentseq;

        for (int i = 0; i < arr.length; i++) {
            currentseq = 1; // Start a new sequence for each number

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) { // Check if the number is greater
                    currentseq++;
                    i = j; // Move `i` forward to continue from the current position
                } else {
                    break; // Break the inner loop if the sequence is broken
                }
            }

            // Update the longest sequence if the current one is longer
            if (currentseq > longseq) {
                longseq = currentseq;
            }
        }

        System.out.println("The longest increasing sequence in the array is " + longseq);
    }
}
