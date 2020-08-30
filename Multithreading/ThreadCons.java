class MyRun implements Runnable {
  public void run() {}
}

class MyThread extends Thread {

  public MyThread(String name) {
    super(name);
    // we can call the constructor of a class Thread inside our exetended classes of our thread
    // setPriority(Thread.MAX_PRIORITY);
    // setPriority(Thread.MIN_PRIORITY);
    setPriority(Thread.MIN_PRIORITY + 3);
  }

  public void run() {
    int count = 1;

    while(true) {
      System.out.println(count++);
      try {
        // "sleep" will make a Thread delay for a while
        Thread.sleep(1000000);  //  this is causing "InterruptedException"; whenevre it is going to sleep it may be interrupted by some other Thread
      } catch(InterruptedException e) {
        System.out.println(e);
      }
    }

  }
}

class ThreadCons {

  public static void main(String[] args) {

    // Thread t = new Thread();  //    Constructor - 1
    // Thread t = new Thread("My Thread");  //    Constrcutor - 2
    // Thread t = new Thread(new MyRun(), "My Runnable Thread");  //  Constructor - 3

    MyThread mt = new MyThread("My Thread #1");

    System.out.println("ID => " + mt.getId());
    System.out.println("Name => " + mt.getName());
    System.out.println("Priority => " + mt.getPriority());
    System.out.println("State => " + mt.getState());
    System.out.println("Alive => " + mt.isAlive());
    mt.start();
    System.out.println("State => " + mt.getState());
    System.out.println("Alive => " + mt.isAlive());

    mt.interrupt();  //  this should cause an Exception
    // "interrupt" will interrupt any sleeping Thread and wake it up to continue its execution


  }

}
