import java.lang.*;
import java.util.*;

//  PriorityQueue represents a Data Structure called HEAP
//  It is implemented using Array as a basic Data Structure

//  The elements are inserted and deleted based on the priority
//  depending on the value of an element the priority is decided
//    - if an element is small, then its pririty is high; else low

//  we cannot decide which element we want to delete. always highest priority element will be deleted


//  Heap is implemented using "Binary Tree" Data Structure
//  The height of a tree is "log n". So, the time taken for inserting and deleting an element in PriorityQueue is "log n"


class MyComparator implements Comparator<Integer> {
  public int compare(Integer o1, Integer o2) {
    if(o1 < o2)
      return 1;
    if(o1 > o2)
      return -1;
    else
      return 0;
  }
}

class PriorityQueueDemo {
  public static void main(String args[]) {

    PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComparator());

    pq.add(20);
    pq.add(10);
    pq.add(30);
    pq.add(5);
    pq.add(15);
    pq.add(3);

    System.out.println(pq.peek());    //    3

    pq.forEach(x -> System.out.print(x + " "));    //    3 10 5 20 15 30

    System.out.println();

    pq.poll();
    System.out.println("After Deletion");
    pq.forEach(x -> System.out.print(x + " "));    //    5 10 30 20 15

  }
}

//  You can use PriorityQueue for implementing Heap
//  when the smaller value is having higher priority means it is a "Min Heap"
//  if you want to change the order and make it as Max Heap so that the larger element having higher priority then you can define a "Comparator"
