class ThreadTest2 extends Thread {

  public void run() {
    int counter = 1;
    while(true) {
      System.out.println(counter + " Iron");
      counter++;
    }
  }

  public static void main(String[] args) {

    ThreadTest2 t = new ThreadTest2();
    t.start();

    int counter = 1;
    while(true) {
      System.out.println(counter + " Boy");
      counter++;
    }

  }
}
