import java.util.*;
public class FindUnioninArr {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={4,5,6,7,8,9};
        HashSet<Integer>Union=new HashSet<>();
        for(int num:arr1){
            Union.add(num);
        }
        for(int val:arr2){
            Union.add(val);
        }
        System.out.print("The union of two array is :"+Union);
    }
}