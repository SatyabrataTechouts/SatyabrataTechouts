package Dec13;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List6 {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<Integer>();
        li.add(34);
        li.add(90);
        li.add(33);
        ListIterator<Integer> li1=li.listIterator();
        while(li1.hasNext()){
            System.out.println(li1.next());
        }
        System.out.println("reverse order of List is ");
        while(li1.hasPrevious()){
            System.out.println(li1.previous());
        }
    }
}
