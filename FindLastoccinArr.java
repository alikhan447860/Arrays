public class FindLastoccinArr {
    public static void main(String[] args) {
        int arr[] = {12, 32, 32, 32, 45, 51}; // Sorted array with duplicates
        int start = 0, end = arr.length - 1, k = 32;
        int lastOccurrence = -1; // To store the index of the last occurrence

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == k) {
                lastOccurrence = mid; // Update the index
                start = mid + 1; // Continue searching in the right part
            } else if (arr[mid] < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (lastOccurrence != -1) {
            System.out.println("The element last found at index " + lastOccurrence);
        } else {
            System.out.println("Element is not found in the array");
        }
    }
}
