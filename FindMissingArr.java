public class FindMissingArr {
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int size=arr.length+1;
        int totalsum=size*(size+1)/2;
        for(int val:arr){
            totalsum=totalsum-val;
        }
        System.out.println("The missing value is "+totalsum);
    }
}
