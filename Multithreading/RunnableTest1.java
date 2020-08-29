class MyRunnable implements Runnable {
  public void run() {
    int counter = 1;
    while(true) {
      System.out.println(counter + " James");
      counter++;
    }
  }
}

class RunnableTest1 {
  public static void main(String[] args) {

    MyRunnable r = new MyRunnable();
    Thread t = new Thread(r);
    t.start();

    int counter = 1;
    while(true) {
      System.out.println(counter + " Bond");
      counter++;
    }

  }
}
