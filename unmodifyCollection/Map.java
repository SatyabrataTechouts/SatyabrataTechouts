package unmodifyCollection;

import java.util.Collections;
import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap=new HashMap<>();
       hashMap.put(1,"Apple");
       hashMap.put(2,"Orange");
       hashMap.put(3,"Banana");
        System.out.println(hashMap);
        try{
            hashMap= (HashMap<Integer, String>) Collections.unmodifiableMap(hashMap);
        }
        catch (Exception e){
            System.out.println("You cant modified");
        }
    }
}
