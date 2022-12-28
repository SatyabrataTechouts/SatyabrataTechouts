package java8.task;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,4,5,6,7,8);
        if (list.stream().anyMatch(n->n==4))
        {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
