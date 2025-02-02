import java.util.*;
public class RemoveDupfromSortArr{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,66,66,7};
        HashSet<Integer>set=new HashSet<>();
        for(int num:arr){
            set.add(num);
        }
        int uniquearr[]=new int[set.size()];
        int index=0;
        for(int num:set){
            uniquearr[index++]=num;
        }
        System.out.println("Array after removing duplicate elements");
        for(int num:uniquearr){
            System.out.print(num+" ");
        }
    }
}