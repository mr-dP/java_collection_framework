class MyThread extends Thread {
  public void run() {
    int count = 1;
    while(true) {
      System.out.println(count++);
    }
  }
}

class ThreadDaemon {
  public static void main(String[] args) throws Exception {

    MyThread mt = new MyThread();
    // Daemon Threads are dependent Threads; if the main application terminates then Daemon Thread will also terminate
    mt.setDaemon(true);
    mt.start();

    // try {
    //   Thread.sleep(30);
    // } catch(InterruptedException ex) {
    //   System.out.println(ex);
    // }

    // JOIN
    // ----
    // it should wait for the other thread to complete

    // get the reference of the main thread or the current thread:-
    Thread mainThread = Thread.currentThread();
    mainThread.join();  //  it will join any other thread whichever is running; it will wait for all the threads to finish

  }

}
