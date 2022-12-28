package java81;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(12);
        list.add(456);
        list.add(55);
        list.add(99);
        list.stream().forEach(System.out::println);//using method reference
    }
}
