package streamJava8;

import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {
        Stream<Integer> s=Stream.of(1,2,3,4,5,5,6,7);
        s.forEach(p->System.out.println(p));

    }
}
