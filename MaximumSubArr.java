public class MaximumSubArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,-23,5,6,7,6};
        int maxSum=arr[0];
        int currentsum=arr[0];
        for(int i=0;i<arr.length;i++){
            currentsum=Math.max(arr[i], currentsum+arr[i]);
            maxSum=Math.max(maxSum, currentsum);
        }
        System.out.println("The maximum subarray sum is "+maxSum);
    }
}
