import java.util.*;
public class singlenumandmultiple {
    public static void main(String[] args) {
        int arr[]={1,1,2,3,5,4,5};
        int unique=0;
        HashMap<Integer,Integer>countArr=new HashMap<>();
        for(int num:arr){
            unique ^=num;// find unique number
            countArr.put(num, countArr.getOrDefault(num,0)+1);// count frequencies
        }
        System.out.println("The number that appears only one "+unique);
        System.out.println("The numbers that appeats more than one ");

    }
}
