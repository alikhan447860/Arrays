public class FirstOccinArrBs {
    public static void main(String[] args) {
        int arr[] = {12, 32, 32, 32, 45, 51}; // Sorted array with duplicates
        int start = 0, end = arr.length - 1, k = 32;
        int firstOccurrence = -1; // To store the index of the first occurrence

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == k) {
                firstOccurrence = mid; // Update the index
                end = mid - 1; // Continue searching in the left part
            } else if (arr[mid] < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (firstOccurrence != -1) {
            System.out.println("The element first found at index " + firstOccurrence);
        } else {
            System.out.println("Element is not found in the array");
        }
    }
}
