package Dec14;

import java.util.ArrayList;
import java.util.LinkedList;

public class Combination {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(40);
        al.add(55);
        al.add(90);
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(89);
        ll.add(12);
        al.addAll(ll);
        System.out.println(al);
        ll.addAll(al);
        System.out.println(ll);
    }
}
