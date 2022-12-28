package Converting;

import Dec15.HashMap1;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class IterateTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String>treeMap=new TreeMap<>();
        treeMap.put(1,"Techouts");
        treeMap.put(2,"Amazone");
        treeMap.put(3,"Google");
        treeMap.put(4,"Deloite");

        for (Map.Entry<Integer,String> m:treeMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("sort the HashMap by value :");
      //  Collections.sort(tr);

    }
}
