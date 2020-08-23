import java.lang.*;
import java.util.*;

class LinkedListDemo {
  public static void main(String[] args) {

    // JAVA uses Doubly-linked list

    LinkedList<Integer> ll1 = new LinkedList<>();    //    we cannot mention the initial size because the nodes will be created only when elements are inserted and they are deleted once the elements are removed

    LinkedList<Integer> ll2 = new LinkedList<>(List.of(26, 36, 46, 56));

    ll1.add(10);
    ll1.add(80);
    ll1.add(2, 40);
    ll1.add(70);
    ll1.add(90);
    ll1.addAll(ll2);
    ll1.addAll(4, ll2);

    ll1.addFirst(11);
    ll1.addLast(99);

    System.out.println(ll1);    //    [11, 10, 80, 40, 70, 26, 36, 46, 56, 90, 26, 36, 46, 56, 99]

    System.out.println(ll1.peek());    //    11

    ll1.forEach(x -> show(x));    //    11 10 40 26 36 46 26 36 46

  }

  static void show(int n) {
    if(n < 50) {
      System.out.print(n + " ");
    }
  }

}
