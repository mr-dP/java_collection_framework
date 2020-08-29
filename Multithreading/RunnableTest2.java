class RunnableTest2 implements Runnable {

  public void run() {
    int counter = 1;
    while(true) {
      System.out.println(counter + " Indiana");
      counter++;
    }
  }

  public static void main(String[] args) {

    RunnableTest2 r = new RunnableTest2();
    Thread t = new Thread(r);
    t.start();

    int counter = 1;
    while(true) {
      System.out.println(counter + " Jones");
      counter++;
    }

  }
}
