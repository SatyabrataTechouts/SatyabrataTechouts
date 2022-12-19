package Dec13;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(667);
        ll.add(89);
        ll.add(90);
        System.out.println(ll.contains(90));
        Iterator itr=ll.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        ;
        System.out.println("first element "+ll.element());
    }
}
