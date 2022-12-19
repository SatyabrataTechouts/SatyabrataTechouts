package Dec13;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList7 {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(78);
        ll.add(780);
        ll.add(93);
        System.out.println("List is \n"+ll);
        ll.offer(900);
        System.out.println("After use offer method ");
        System.out.println(ll);
       ;
        System.out.println( ll.indexOf(780));//indexof is use to get the index of linkedlist
         ll.pollLast();
         ll.push(56);
         //ll.remove();
        ll.push(89);//push at first the element
        System.out.println(ll);
        System.out.println(ll.indexOf(56));
        Iterator itr=ll.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
