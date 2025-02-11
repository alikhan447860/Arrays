public class FloorinSortArr {
    public static void main(String[] args) {
        int arr[]={2,3,5,8};
        int k=6;
        int floor=-1;
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==k){
                floor=arr[mid];
                return;
            }else if(arr[mid]<k){
                floor=arr[mid];
                start=mid+1;
            }else{
            end=mid-1;
            }
        }
        System.out.println("The floor for value: "+k+" is "+floor);
    }
}
