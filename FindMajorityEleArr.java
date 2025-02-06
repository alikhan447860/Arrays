public class FindMajorityEleArr {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 4, 1, 1};
        int candidate = 0, count = 0;
        
        // First pass: Find a candidate using cancellation technique
        for (int num : arr) {
            if (count == 0) {
                candidate = num;  // Pick a new candidate when count drops to 0
            }
            if (num == candidate) {
                count++;  // Increase count if the number equals the candidate
            } else {
                count--;  // Otherwise, decrease count
            }
        }
        
        // Second pass: Verify the candidate is indeed a majority element
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }
        
        // Check if candidate appears more than n/2 times
        if (count > arr.length / 2) {
            System.out.println("The majority element is " + candidate);
        } else {
            System.out.println("No majority element is found");
        }
    }
}
