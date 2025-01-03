public class maxconsiOnes {
    public static void main(String[] args) {
        int arr[]={1,1,0,2,1,1,1,4};
        int currentcount=0;
        int maxcount=0;
        for(int val:arr){
            if(val==1){
                currentcount++;
                maxcount=Math.max(currentcount, maxcount);
            }else{
                currentcount=0;
            }
        }
        System.out.println("The maximum consicutive ones in array is "+maxcount);
    }
}
