import java.util.*;
public class FindUnioninArr {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6};
        int arr2[]={1,2,5,6,7,8,9,10};
        HashSet<Integer>union =new HashSet<>();
        for(int val:arr1){
            union.add(val);
        }
        for(int val:arr2){
            union.add(val);
        }
        System.out.print(union+" ");

    }
}
