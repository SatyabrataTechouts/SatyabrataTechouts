package unmodifyCollection;

import java.util.Collections;
import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> item=new HashSet<>();
        item.add("Pen");
        item.add("pencil");
        item.add("Marker");
        System.out.println("Unmodified item is "+item);
        try {
            item = (HashSet<String>) Collections.unmodifiableSet(item);

            /*we cant modified this set .only to visit */
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
