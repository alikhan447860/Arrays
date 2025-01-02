public class checkArrisSorted {
    public static void main(String[] args) {
        int arr[] = {3, 2, 5, 6, 4}; // Input array
        boolean isSorted = true;

        for (int i = 1; i < arr.length; i++) { // Start from the second element
            if (arr[i] < arr[i - 1]) { // Compare with the previous element
                isSorted = false;
                System.out.println("The array is not sorted");
                break;
            }
        }

        if (isSorted) {
            System.out.println("The array is sorted");
        }
    }
}
