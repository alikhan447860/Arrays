public class CeilinSortedArr {
    public static void main(String[] args) {
        int arr[]={4,5,7,3};
        int k=4,start=0,end=arr.length,ceil=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==k){
              ceil=arr[mid];
              break;
            }else if(arr[mid]>k){
                ceil=arr[mid];
                end=mid-1;
            }else{
                start=mid+1;
            }
                        
        }
        System.out.println("The ceil for the value : "+k+" is "+ceil);
    }
}
