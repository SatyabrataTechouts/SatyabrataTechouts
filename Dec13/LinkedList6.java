package Dec13;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList6 {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("s");
        ll.add("r");
        ll.add("y");
        ll.add("u");
       ;
        System.out.println( ll.indexOf("y"));
        ListIterator lit=ll.listIterator(1);
        while(lit.hasNext()){
            System.out.println(lit.next());
        }
    }
}
