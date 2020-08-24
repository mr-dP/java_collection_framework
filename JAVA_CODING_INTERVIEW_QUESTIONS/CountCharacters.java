import java.util.*;

class CountCharacters {
  public static void main(String[] args) {

    String str = "AEABBABBBCCCCECCDEAD";

    HashMap<Character, Integer> d = new HashMap<>();

    for(char i : str.toCharArray()) {
      if(d.get(i) == null) {
        d.put(i, 1);
      }
      else {
        d.put(i, d.get(i) + 1);
      }
    }

    System.out.println(d);

  }
}
