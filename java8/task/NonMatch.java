package java8.task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NonMatch {
    public static void main(String[] args) {
        Stream<String> stream
                = Stream.of("CSE", "C++", "Java", "DS");
        boolean x=stream.noneMatch( i->i.length()==4);
        System.out.println(x);
    }
}
