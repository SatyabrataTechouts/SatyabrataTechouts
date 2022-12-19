package Dec14;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSet1{
    public static void main(String[] args) {
        LinkedHashSet<String>ls=new LinkedHashSet<String>();
        ls.add("Satya");
        ls.add("Dipun");
        ls.add("Techouts");
        System.out.println("Size of linkedList is "+ls.size());
        System.out.println(ls.remove("Satya"));
        System.out.println(ls);


    }
}
