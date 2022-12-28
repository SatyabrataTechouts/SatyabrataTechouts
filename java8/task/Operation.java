package java8.task;

import java.util.ArrayList;

public class Operation {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(12);
        arrayList.add(35);
        arrayList.add(78);
        arrayList.add(66);
        arrayList.stream().peek(n->System.out.println("peek is"+n))
        .limit(4)
        .skip(3);
        //System.out.println(arrayList);
    }
}
