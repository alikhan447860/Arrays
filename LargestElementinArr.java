public class LargestElementinArr {
 public static void main(String[] args) {
    int arr[]={1,2,5,6,7,3};
    int largest=arr[0];
    for(int i=0;i<arr.length;i++){
       if(arr[i]>largest){
        largest=arr[i];
       }
    }
    System.out.println("The largest element in array is "+largest);
 }
}
