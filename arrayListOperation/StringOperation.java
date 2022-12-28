package arrayListOperation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringOperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("Asiff");
        arrayList.add("Sajan");
        arrayList.add("Rohit");
        arrayList.add("Altab");
        System.out.println("Before sorting "+arrayList);
        Collections.sort(arrayList);
        System.out.println("After sorting");
        System.out.println(arrayList);
        arrayList.set(2,"Jagan");
        System.out.println("After replace at index 2 \n"+arrayList);
        System.out.println("Enter name to search");
         String s=sc.nextLine();
        System.out.println(s);
        if (arrayList.contains(s)){
            System.out.println("found at index "+arrayList.indexOf(s));
        }
        else {
            System.out.println("not found ");
        }
        System.out.println("After removing index 2");
        arrayList.remove(2);
        System.out.println(arrayList);
        for (int i=0;i<arrayList.size();i++){
            for (int j=i+1;j<arrayList.size();j++){
                if (arrayList.get(i).equals(arrayList.get(j))){
                    arrayList.remove(j);
                }
            }
            System.out.println(arrayList);
        }
    }
}
