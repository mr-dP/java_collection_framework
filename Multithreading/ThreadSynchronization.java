// if 2 Threads are using same object, they should use one after another

class MyData {
    synchronized public void display(String str) throws Exception {       //      option - 2: the method itself in synchronized; no thread can enter in this method if it is already in use
//        synchronized (this) {               //      option - 1: whatever is inside the synchronized block ony one thread is allowed inside at a time
//        this piece of code is Critical Section:- A piece of code which may be executed simultaneously by multiple threads/programs
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(1000);    //  the other thread cannot enter in because we have used Synchronized
            } catch (Exception ex) {
                System.out.println(ex);
            }
//        }
        }
    }
}

class MyThread1 extends Thread {
    MyData d;

    public MyThread1(MyData data) {
        d = data;
    }

    public void run() {
        try {
            d.display("The Return of the King");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyThread2 extends Thread {
    MyData d;

    public MyThread2(MyData data) {
        d = data;
    }

    public void run() {
        try {
            d.display("The Two Towers");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class ThreadSynchronization {
    public static void main(String[] args) {
        MyData d = new MyData();
        MyThread1 mt1 = new MyThread1(d);
        MyThread2 mt2 = new MyThread2(d);
        mt1.start();
        mt2.start();
    }
}
