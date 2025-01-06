public class LongestSubarrgivensum {
    public static void main(String[] args) {
        int arr[]={11,33,5,7,4,23};
        int tar=11;
        int sum=0,start=0,maxlength=0;
        for(int end=0;end<arr.length;end++){
            sum=sum+arr[end];
            while (sum>tar) {
                sum=sum-arr[start];
                start++;
            }
            if(sum==tar){
maxlength=Math.max(maxlength, end-start+1);
            }
        }
        System.out.println("The longest sub array with given sum is :"+maxlength);

    }
}
