public class ContainDuplicate{
    public static void main(String[] args) {
        int arr[]={1,2,3,2,4,6,5,3,4};
        boolean isdup=false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                      isdup=true;
                   System.out.println("The array is contin duplicate and the element is "+arr[i]);
                }
            }
        }
        if(!isdup){
          System.out.println("no duplicate found");
        }
    }
}