package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;
import java.util.*;
class Teacher{
    String name;
    int id;
    int sallery;

    public Teacher(String name,int id,int sallery){
        this.name=name;
        this.id=id;
        this.sallery=sallery;

    }
}
public class ExampleToFilteredData {
    public static void main(String[] args) {
        ArrayList<Teacher> arrayList=new ArrayList<Teacher>();
        arrayList.add(new Teacher("Satya",123,56000));
        arrayList.add(new Teacher("Pabitra",124,6000));
        arrayList.add(new Teacher("Liza",166,26000));
        arrayList.add(new Teacher("Papali",121,96000));
        Collections.sort(arrayList,(p1,p2)->{return p1.name.compareTo(p2.name);});
        for (Teacher t:arrayList){
            System.out.println(t.id+" "+t.name+" "+t.sallery);
        }
        Stream<Product> filtered_data;
       // filtered_data = arrayList.stream().filter(p ->p.sallery > 20000);
      ///  filtered_data.forEach(p -> System.out.println(p.id+" "+ p.sallery+" "+p.id));
    }
}
