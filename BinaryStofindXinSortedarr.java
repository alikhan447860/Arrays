public class BinaryStofindXinSortedarr {
    public static void main(String[] args) {
        int arr[]={3, 4, 6, 7, 9, 12, 16, 17} ;
        int target=6;
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if(arr[mid]==target){
                System.out.println("THe target value is found at index  "+mid);
                return;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        System.out.println("The target value is not found in the array ");
    }
}
