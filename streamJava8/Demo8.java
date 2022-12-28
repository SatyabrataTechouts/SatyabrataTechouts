package streamJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Demo8 {
    public static void main(String[] args) {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
        Optional<String> s=memberNames.stream().reduce((s1, s2) ->s1+"#"+s2 );
        s.ifPresent(System.out::println);
        String f=memberNames.stream().filter(P-> P.startsWith("A") ).findFirst().get();
        System.out.println(f);
    }
}
