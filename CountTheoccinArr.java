public class CountTheoccinArr {
    public static void main(String[] args) {
        int arr[]={2, 2 , 3 , 3 , 3 , 3 , 4};
        int k=3,n=arr.length-1,count=0;
        for(int i=0;i<=n;i++){
            if(arr[i]==k){
                count++;
            }
        }
       System.out.println("The element is found "+count+" times in array");
    }
}
