class SortingString {
  public static void main(String[] args) {

    String str = "durga";

    String str2 = "";

    int l = str.length() - 1;

    while(l >= 0) {
      str2 = str2 + str.charAt(l);
      l = l - 1;
    }

    System.out.println(str2);

  }

}
