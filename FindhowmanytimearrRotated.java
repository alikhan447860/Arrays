public class FindhowmanytimearrRotated {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2,3};
        int rotation=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                rotation=i+1;
                break;
            }
        }
        System.out.println("The array is rotated "+rotation+" times");
    }
}
