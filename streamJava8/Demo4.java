package streamJava8;

import java.util.Random;
import java.util.stream.Stream;

public class Demo4 {
    public static void main(String[] args) {
        Stream<Integer>random=Stream.generate(()->(new Random()).nextInt(20));
        random.limit(10).forEach(System.out::println);
    }
}
