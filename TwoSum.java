public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,7,33,9,11};
        int target=16;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Indices is "+i+" and  "+j);
                    found =true;
                }
            }
        }
        if(!found){
            System.out.println("no two sum is equal to target ");
        }
    }
}
