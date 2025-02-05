import java.util.*;

public class singlenumandmultiple {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 5, 4, 5};
        HashMap<Integer,Integer>countEle=new HashMap<>();
        List<Integer>uniqEle=new ArrayList<>();
        for(int val:arr){
            countEle.put(val, countEle.getOrDefault(val,0)+1);
        }
        for(int num:countEle.keySet()){
            if(countEle.get(num)==1){
                uniqEle.add(num);
            }
        }
        System.out.println("The number that appears only one time is "+uniqEle);
        System.out.println("The number that appears more than one ");
        for(int num:countEle.keySet()){
            if(countEle.get(num)>1){
                System.out.println(num+" appears "+countEle.get(num)+"Times");
            }
        }
        
    }
}
