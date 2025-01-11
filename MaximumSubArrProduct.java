public class MaximumSubArrProduct {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,0};
        int maxProduct=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int product=1;
            for(int j=i;j<arr.length;j++){
               product=product*arr[j];
               maxProduct=Math.max(maxProduct,product);
            }
        }
        System.out.println("The maximum sub array product is "+maxProduct);
    }
}
