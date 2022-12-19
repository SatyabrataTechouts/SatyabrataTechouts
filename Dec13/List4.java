package Dec13;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List4 {
    public static void main(String[] args) {
        List<String> li=new ArrayList<String>();
        li.add("sa");
        li.add("th");
        li.add("jl");
        li.add("tn");
        ListIterator list=li.listIterator();
        System.out.println("return first index"+list.nextIndex());
        list.next();
        System.out.println("return second index "+list.nextIndex());
        list.next();
        System.out.println("return third index "+list.nextIndex());
    }
}
