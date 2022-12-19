package Dec13;

import Dec12.LinkList;

import java.util.LinkedList;

public class LinkList2 {
    public static void main(String[] args) {
        LinkedList<Float> ll=new LinkedList<Float>();
        ll.add(3.4F);
        ll.add(5.6F);
        ll.add(9.7F);
        LinkedList<Integer> ll1=new LinkedList<Integer>();
        ll1.add(34);
        ll1.add(56);
        ll1.add(678);
        ll.addFirst(3.4F);
        ll1.addLast(5);
        ll.clear();//remove all the element on the list
        System.out.println(ll);
        System.out.println(ll1);
        LinkedList<Integer> ll3=new LinkedList<Integer>();

        ll3=(LinkedList<Integer>) ll1.clone();
        System.out.println("ll3 is "+ll3);



    }
}
