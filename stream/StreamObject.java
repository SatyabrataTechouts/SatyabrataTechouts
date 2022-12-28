package stream;

import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        Stream<Object> stream= Stream.empty();
        String names[]={"satya","DIpu","Sipu"};
        Stream<String >stream1=Stream.of(names);
        stream1.forEach(e->{
            System.out.println(e);
        });
    }
}
