public class FindPeakinArr {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,5,1};
        int start=0,end=arr.length;
        while(start<=end){
            int mid=(start+end)/2;
            if((mid==0||arr[mid]>arr[mid-1])&&(mid==arr.length-1||arr[mid]>arr[mid+1])){
                System.out.println("The peak element is "+arr[mid]);
                return;
            }
        if(mid>0 && arr[mid-1]>arr[mid]){
            end=mid-1;
        }else{
            start=mid+1;
        }
        }

    }
}
