package streamJava8;

import java.util.stream.Stream;

public class Demo2 {
    public static void main(String[] args) {
        Stream<Integer>s=Stream.of(new Integer[]{1,2,3,4});
        s.forEach(p->System.out.println(p));
    }

}
