package streamJava8;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo5 {
    public static void main(String[] args) {
        IntStream stream="Satyabrata_ ".chars();
        Stream<String> stream1=Stream.of("@#$5".split("%%8"));
        stream1.forEach(P->System.out.println(P));
    }
}
