public class FindPeakinArr {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 5, 1};
        int start = 0, end = arr.length - 1;  // Corrected end index

        while (start <= end) {
            int mid = (start + end) / 2;
            // Corrected condition: Check both neighbors properly
            if ((mid == 0 || arr[mid] >= arr[mid - 1]) &&
                (mid == arr.length - 1 || arr[mid] >= arr[mid + 1])) {
                System.out.println("The peak element is: " + arr[mid]);
                break;  // Exit loop once the peak is found
            }
            // If left neighbor is greater, move left
            else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                end = mid - 1;
            }
            // Otherwise, move right
            else {
                start = mid + 1;
            }
        }
    }
}
