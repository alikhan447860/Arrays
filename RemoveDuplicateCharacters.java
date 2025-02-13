import java.util.*;
public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
      String s="aabcdefgg";
      LinkedHashSet<Character>lHashSet=new LinkedHashSet<>();
      for(char c:s.toCharArray()){
        lHashSet.add(c);
      }
      StringBuilder sb=new StringBuilder();
      for(Character c:lHashSet){
        sb.append(c);
      }
      System.out.println("String after removing Duplicate character: "+sb);
    }
}
