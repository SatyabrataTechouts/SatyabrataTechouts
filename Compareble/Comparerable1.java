package Compareble;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Comparerable1 {
    public static void main(String[] args) {

        Object object= new Object(12,56);
        Object  object1=new Object(15,23);
        Object object2=new Object(16,21);
        ArrayList<Object> arrayList=new ArrayList<>();
        arrayList.add(object);
        arrayList.add(object1);
        arrayList.add(object2);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
