// if 2 Threads are using same object, they should use one after another

class MyData {
    synchronized public void display(String str) {       //      option - 2: the method itself in synchronized; no thread can enter in this method if it is already in use
//        synchronized (this) {               //      option - 1: whatever is inside the synchronized block ony one thread is allowed inside at a time
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
//        }
    }
}

class MyThread1 extends Thread {
    MyData d;

    public MyThread1(MyData data) {
        d = data;
    }

    public void run() {
        d.display("The Return of the King");
    }
}

class MyThread2 extends Thread {
    MyData d;

    public MyThread2(MyData data) {
        d = data;
    }

    public void run() {
        d.display("The Two Towers");
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
