package streamJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo6 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add(i);
        }
        Stream<Integer>s=list.stream();
       List<Integer> arr;
        arr = list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(arr);
    }
}
