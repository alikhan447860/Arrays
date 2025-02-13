public class SearchInRotatedSortedArray{
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int k = 0; // Element to search
        int start = 0, end = arr.length - 1;
        int result = -1; // Default result if the element is not found
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == k) { // Element found
                result = mid;
                break;
            }
            if (arr[start] <= arr[mid]) { // Left part is sorted
                if (k >= arr[start] && k < arr[mid]) {
                    end = mid - 1; // Move to the left
                } else {
                    start = mid + 1; // Move to the right
                }
            } else { // Right part is sorted
                if (k > arr[mid] && k <= arr[end]) {
                    start = mid + 1; // Move to the right
                } else {
                    end = mid - 1; // Move to the left
                }
            }
        }
        System.out.println("Element " + k + " is at index: " + result);
    }
}
