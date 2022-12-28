package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class College {
    public static void main(String[] args) {
        Student student=new Student(12,"S",23);
        Student student1=new Student(45,"Sn",20);

        ArrayList<Student> arrayList=new ArrayList<>();
        arrayList.add(student);
        arrayList.add(student1);
        Comparator<Student> cpr=Comparator.comparing(Student ::getS);
        Collections.sort(arrayList,cpr);
        for (Student arr:arrayList){
            System.out.println(arr.i+" "+arr.i1+" "+arr.s);
        }
    }
}
