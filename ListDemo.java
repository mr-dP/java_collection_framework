import java.lang.*;
import java.util.*;

class ListDemo {
  public static void main(String[] args) {

    ArrayList<Integer> al1 = new ArrayList<Integer>(20);    //    it can accomodate minimum 20 elements

    ArrayList<Integer> al2 = new ArrayList<>(List.of(14, 24, 34, 44, 54));

    al1.add(10);
    al1.add(0, 20);
    al1.addAll(al2);
    al1.addAll(4, al2);
    al1.add(4, 44);

    System.out.println(al1);    //    [20, 10, 14, 24, 44, 14, 24, 34, 44, 54, 34, 44, 54]

    System.out.println(al1.contains(20));    //    true
    System.out.println(al1.contains(94));    //    false

    System.out.println(al1.get(2));    //    14

    System.out.println(al1.indexOf(44));    //   4
    System.out.println(al1.lastIndexOf(44));    //    11

    al2.set(2, 88);
    System.out.println(al2);    //    [14, 24, 88, 44, 54]


    for(int i = 0; i < al1.size(); i++) {
      System.out.print(al1.get(i) + " ");
    }    //    20 10 14 24 44 14 24 34 44 54 34 44 54

    System.out.println();

    for(Integer x : al1) {
      System.out.print(x + " ");
    }    //    20 10 14 24 44 14 24 34 44 54 34 44 54

    System.out.println();

    Iterator<Integer> itr = al1.iterator();
    //  Iterator is like a reference on all the elements
    //  It is holding the reference on first element now

    while(itr.hasNext()) {
      System.out.print(itr.next() + " ");
    }    //    20 10 14 24 44 14 24 34 44 54 34 44 54

    System.out.println();

    ListIterator<Integer> litr = al1.listIterator();


    while(litr.hasNext()) {
      System.out.print(litr.next() + " ");
    }    //    20 10 14 24 44 14 24 34 44 54 34 44 54

    System.out.println();

    // Iterator allow only forward direction
    // ListIterator allows bidirectional movement

    for(ListIterator<Integer> ir = al1.listIterator(); ir.hasNext(); ) {    //    no need of updation
      System.out.print(ir.next() + " ");
    }    //    20 10 14 24 44 14 24 34 44 54 34 44 54

    System.out.println();

    al2.forEach( x -> System.out.print(x + " ") );    //    14 24 88 44 54

    System.out.println();

    al2.forEach(System.out::print);    //    :: = Scope resolution

    System.out.println();

    al1.forEach(x -> show(x));    //    44 44 54 44 54

  }

  static void show(int n) {
    if(n > 35)
      System.out.print(n + " ");
  }

}
