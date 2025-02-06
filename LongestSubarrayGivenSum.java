public class LongestSubarrayGivenSum {
    public static void main(String[] args) {
        int arr[] = {11, 33, 5, 7, 4, 23};
        int target = 11;
        int currSum = 0, start = 0, maxLength = 0;
        for (int end = 0; end < arr.length; end++) {
            currSum =currSum+ arr[end];  // Expand window by adding new element
            while (currSum > target) {  // Shrink window if sum exceeds target
                currSum =currSum- arr[start];
                start++;
            }
            if (currSum == target) {  // Update maxLength if target sum found
                maxLength = Math.max(maxLength, end - start + 1);
            }
        }
        System.out.println("The longest subarray with the given sum is: " + maxLength);
    }
}
