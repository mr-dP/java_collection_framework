class MyThread extends Thread {
  public void run() {
    int i = 0;
    while(true) {
      System.out.println(i++ + " My Thread");
    }
  }
}

class ThreadYield {
  public static void main(String[] args) {

    MyThread mt = new MyThread();
    mt.start();

    int i = 0;
    while(true) {
      System.out.println(i++ + " Main Thread");
      Thread.yield();   //  it will allow other Threads for execution the again the "main" mat continue and then again it will yield. So, more time will be give to other Threads if they are Starving
      // in this case, MyThread will be getting more CPU time for execution
    }

  }
}
