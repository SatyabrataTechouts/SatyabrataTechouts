package stream;
import java.util.ArrayList;
import java.util.Arrays;
import  java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {

        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(23);
        arrayList.add(45);
        arrayList.add(9);
        arrayList.add(22);
        List<Integer>list=new ArrayList<>();
//        for (Integer i:arrayList)
//        {
//            if (i%2==0){
//                list.add(i);
//                System.out.println(list);
////            }
////        }
//       Stream<Integer> stream= arrayList.stream();
//        List<Integer> collect1 = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(collect1);
        List<Integer> collect = arrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
    }
}
//stream is a interface

