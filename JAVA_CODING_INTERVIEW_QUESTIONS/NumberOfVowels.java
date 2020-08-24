import java.util.*;

class NumberOfVowels {
  public static void main(String[] args) {

    String city = "TAUMATAWHAKATANGIHANGAKOAUAUOTAMATEATURIPUKAKAPIKIMAUNGAHORONUKUPOKAIWHENUAKITANATAHU";

    char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    HashMap<Character, Integer> map = new HashMap<>();

    for(char ch : city.toCharArray()) {
      for(char sh : vowels) {
        if (ch == sh) {
          map.put(sh, map.get(sh) == null ? 1 : map.get(sh) + 1);
        }
      }
    }

    System.out.println(map);

  }
}
