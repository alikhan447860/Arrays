public class maxconsiOnes {
    public static void main(String[] args) {
        int arr[]={1,1,0,2,1,1,1,4};
        int maxcount=0,currentcount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                currentcount++;
                maxcount=Math.max(maxcount, currentcount);
            }else{
                currentcount=0;
            }
        }
        System.out.println("The maximum consicutive ones in array is "+maxcount+" times");
    }
}
