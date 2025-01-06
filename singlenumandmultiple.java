import java.util.*;

public class singlenumandmultiple {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 5, 4, 5}; // Example array
        HashMap<Integer, Integer> countArr = new HashMap<>();
        List<Integer> uniqueNumbers = new ArrayList<>(); // To store all unique numbers

        // Count frequencies
        for (int num : arr) {
            countArr.put(num, countArr.getOrDefault(num, 0) + 1);
        }

        // Find all unique numbers (appear only once)
        for (int num : countArr.keySet()) {
            if (countArr.get(num) == 1) {
                uniqueNumbers.add(num);
            }
        }

        // Print the unique numbers
        System.out.println("The numbers that appear only once are: " + uniqueNumbers);

        // Print numbers that appear more than once
        System.out.println("The numbers that appear more than once:");
        for (int num : countArr.keySet()) {
            if (countArr.get(num) > 1) {
                System.out.println(num + " appears " + countArr.get(num) + " times");
            }
        }
    }
}
