import java.util.*;
public class RemoveDupfromSortArr{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,66,66,7};
       HashSet<Integer>set=new HashSet<>();
       for(int num:arr){
        set.add(num);
       }
       int uniqarr[]=new int[set.size()];
       int idx=0;
       for(int num:set){
        uniqarr[idx++]=num;
       }
       System.out.println("Array after removing duplicate");
       for(int val:uniqarr){
        System.out.print(val+" ");
       }
    }
}