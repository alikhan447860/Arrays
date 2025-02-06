public class MaximumSubArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,-23,5,6,7,6};
       int maxsum=arr[0],currentsum=arr[0];
       for(int i=1;i<arr.length;i++){
        currentsum=Math.max(arr[i], currentsum+arr[i]);
        maxsum=Math.max(maxsum, currentsum);
       }
        System.out.println("The maximum subarray sum is "+maxsum);
    }
}
