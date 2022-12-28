package java8.task;



import Comparator.Student;

import java.util.ArrayList;
import java.util.List;


public class ForEach {
    public static void main(String[] args) {
        List<String>list=new ArrayList<String>();
        list.add("satya");
        list.add("padma");
        list.add("taj");

        list.forEach(n->System.out.println(n));
    }
}
