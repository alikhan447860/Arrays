public class MoveZero {
    public static void main(String[] args) {
        int arr[]={1,0,2,0,4,9};
        int j=0;
        int arr2[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr2[j]=arr[i];
                j++;
            }
        }
        while (j<arr.length) {
            arr2[j]=0;
            j++;
        }
        for(int val:arr2){
            System.out.print(val+" ");
        }
    }
}
