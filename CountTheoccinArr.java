public class CountTheoccinArr {
    public static void main(String[] args) {
        int arr[]={2, 2 , 3 , 3 , 3 , 3 , 4};
        int k=3,count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                count++;
            }
        }
       System.out.println("The element is found "+count+" times in array");
    }
}
