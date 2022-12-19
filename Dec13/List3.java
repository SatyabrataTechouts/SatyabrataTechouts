package Dec13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class List3 {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<Integer>();
        li.add(67);
        li.add(56);
        li.add(563);
        li.add(90);
        li.set(1,55);
        Collections.sort(li);
        System.out.println(li);
    }
}
