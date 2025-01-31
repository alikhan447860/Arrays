public class SecondLargestinArr {
    public static void main(String[] args) {
        int arr[]={2,3,5,1,9,6};
        int max=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            second=max;
            max=arr[i];
        }else if(arr[i]>second && arr[i]!=max){
            second=arr[i];
        }
       }
       if(second==Integer.MIN_VALUE){
        System.out.println("No second element found in the array");
       }else{
        System.out.println("The Second largest element is "+second);
       }
    }
}
