package java8.task;

import java.util.ArrayList;

public class Reduce {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(12);
        arrayList.add(56);
        arrayList.add(99);
        int sum=arrayList.stream().reduce(0,(a,b)-> a+b);
        System.out.println(sum);
    }
}
