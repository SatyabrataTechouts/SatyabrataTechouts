package java8.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllMatch {
    public static void main(String[] args) {
            List<Integer> list= Arrays.asList(6,9,3,12);
            boolean m=list.stream().allMatch(n->n%3==0);
        System.out.println(m);

    }
}
