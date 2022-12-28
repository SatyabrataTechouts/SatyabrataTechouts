package unmodifyCollection;

import javafx.print.Collation;
import java.util.*;

import java.util.ArrayList;

public class UnmodifyCollection1 {
    public static void main(String[] args) {
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("Satyabrata");
        arrayList.add("Tajudhin");
        arrayList.add("Padmanav");
        System.out.println("List of Employee is "+arrayList);
        try{
        arrayList = (ArrayList<String>) Collections.unmodifiableList(arrayList);
        }
       catch(Exception e){
           System.out.println("Only for read");
       }
    }

}
