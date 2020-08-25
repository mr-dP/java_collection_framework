class SortingString {
  public static void main(String[] args) {

    String str = "crescent";

    char[] chr = str.toCharArray();

    char temp;

    for(int i = 0; i < chr.length; i++) {
      for(int j = 0; j < chr.length; j++) {
        if(chr[i] < chr[j]) {
          temp = chr[i];
          chr[i] = chr[j];
          chr[j] = temp;
        }
      }
    }

    System.out.println(chr);

  }
}
