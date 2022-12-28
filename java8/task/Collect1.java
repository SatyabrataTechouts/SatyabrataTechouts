package java8.task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collect1 {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(12);
        arrayList.add(56);
        arrayList.add(99);
        List<Integer> collect = arrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("even Integer is "+collect);
    }
}
