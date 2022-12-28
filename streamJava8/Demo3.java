package streamJava8;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add(i);
        }
        Stream<Integer>s=list.stream();
        s.forEach(p->System.out.println(p));
    }
}
