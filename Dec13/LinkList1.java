package Dec13;

import java.util.LinkedList;

public class LinkList1 {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("Satya");
        ll.add("Lipun");
        ll.add("Pawan");
        ll.add("Dipun");
        ll.addFirst("444");//only use  in LinkedList
        System.out.println(ll);
        ll.add(2,"99");
        LinkedList<String> ll1=new LinkedList<String>();
        ll1.add("44");
        ll1.add("67");
        ll1.add("567");
        ll1.add("89");
        ll.addAll(2,ll1);
        System.out.println(ll);
    }
}
