public class SearchInsertPosition {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int k=7;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==k){
                System.out.println("The target elemt is found at index "+mid);
                return;
            }else if(arr[mid]<k){
                start=start+1;
            }else{
                end=end-1;
            }
        }
        System.out.println("The element should be at index "+start);
    }
}
