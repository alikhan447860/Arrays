public class RotateleftArr{
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,6,7};
        int k=2;
        int n=arr.length;
        k=k%n;
        int rotated[]=new int[n];
        int index=0;
        for(int i=k;i<n;i++){
            rotated[index++]=arr[i];
        }
        for(int i=0;i<k;i++){
            rotated[index++]=arr[i];
        }
        System.out.print("Left side rotated Array is :");

        for(int num:rotated){
            System.out.print(num+" ");
        }
    }
}