package streamJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UseingFlatMap {
    public static void main(String[] args) {
        List<Integer> arrayList1= Arrays.asList(11,23,34,46,45,56);
        List<Integer> arrayList2= Arrays.asList(13,54,35,41,47,56);
        List<Integer> arrayList3= Arrays.asList(13,26,33,43,45,56);
        List<Integer> arrayList4= Arrays.asList(13,25,36,47,45,56);
        List<List<Integer>>arr=Arrays.asList(arrayList1,arrayList2,arrayList3,arrayList4);
        System.out.println(arr);
       // arr.forEach(n->System.out.println(n));
        List<Integer>flat=arr.stream().flatMap(x->x.stream()).collect(Collectors.toList());
     //   flat.forEach(p->System.out.println(p));

        System.out.println(flat);
        List l=flat.stream().peek(System.out::println).collect(Collectors.toList());
        //System.out.println(l);
    }
}
