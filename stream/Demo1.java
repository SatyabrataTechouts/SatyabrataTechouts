package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{
    String name;
    int id;

    Product(String name,int id){
        this.name=name;
        this.id=id;
    }
}
public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Product>list=new ArrayList<>();
        list.add(new Product("Satya",123));
        list.add(new Product("Satya",120));
        list.add(new Product("Satya",128));
        list.add(new Product("Satya",103));
//        ArrayList<Integer> arrayList=new ArrayList<>();
//         for (Product p:list){
//             if (p.id>106){
//                 arrayList.add(p.id);
//                 System.out.println(arrayList);
//         }
   // }
        List<Integer> productStream = list.stream().filter(i -> i.id >120).map(p->p.id).collect(Collectors.toList());
        System.out.println(productStream);
    }
}
