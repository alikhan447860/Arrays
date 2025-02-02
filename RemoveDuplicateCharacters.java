import java.util.*;
public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String input="abbcdaef";
        LinkedHashSet<Character>set=new LinkedHashSet<>();
        for(char c:input.toCharArray()){
            set.add(c);
        }
        StringBuilder result=new StringBuilder();
        for(char c:set){
            result.append(c);
        }
        System.out.println("The unique string is :"+result);
    }
}
