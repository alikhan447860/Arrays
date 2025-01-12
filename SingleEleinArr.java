public class SingleEleinArr {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,5,5,6,6};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=arr[i]^ans;
        }
        System.out.println("The only single element in the array "+ans);
    }
}
