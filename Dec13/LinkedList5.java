package Dec13;

import java.util.LinkedList;

public class LinkedList5 {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(45);
        ll.add(89);
        ll.add(90);
        ll.add(78);

        System.out.println(ll.getLast());
    }
}
