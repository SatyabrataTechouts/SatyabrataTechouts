package streamJava8;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo7 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add(i);
        }
        Stream<Integer>s=list.stream();
     Integer arr[]=  list.stream().filter(i->i*i==4).toArray(Integer[]::new);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
