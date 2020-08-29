class MyThread extends Thread {
  public void run() {
    int counter = 1;
    while(true) {
      System.out.println(counter + " spider");
      counter++;
    }
  }
}

class ThreadTest1 {
  public static void main(String[] args) {

    MyThread t = new MyThread();
    t.start();

    int counter = 1;
    while(true) {
      System.out.println(counter + " man");
      counter++;
    }

  }
}
