import java.lang.*;
import java.util.*;

class ArrayDequeDemo {
  public static void main(String[] args) {

    // ArrayDeque => Double ended Queue; elements can be inserted or deleted from either end

    ArrayDeque<Integer> dq = new ArrayDeque<>();

    // inserting from the last
    dq.offerLast(11);
    dq.offerLast(21);
    dq.offerLast(31);
    dq.offerLast(41);

    dq.forEach(x -> System.out.print(x + " "));    //    11 21 31 41
    System.out.println();

    // deleting from the last
    dq.pollLast();

    dq.forEach(x -> System.out.print(x + " "));    //    11 21 31
    System.out.println();

    // LIFO => Stack [Last In First Out]


    // deleting from the first
    dq.pollFirst();

    dq.forEach(x -> System.out.print(x + " "));    //    21 31
    System.out.println();

    // Queue => Inserting from Last, deleting from first



    dq.offerFirst(94);
    dq.offerFirst(84);
    dq.offerFirst(74);
    dq.offerFirst(64);


    dq.forEach(x -> System.out.print(x + " "));    //    64 74 84 94 11 21 31 41


  }
}
