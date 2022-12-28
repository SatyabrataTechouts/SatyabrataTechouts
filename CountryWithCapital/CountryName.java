package CountryWithCapital;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountryName {
    public static void main(String[] args) {
        HashMap<String,String>hashMap=new HashMap<>();
        hashMap.put("India","NewDelhi");
        hashMap.put("Pakistan","Islamabad");
        hashMap.put("Australia","Canberra");
        hashMap.put("America","Washington, D.C.");
        hashMap.put("England","London");
        for (Map.Entry<String,String> itr:hashMap.entrySet()){
            System.out.println("Country : "+itr.getKey()+"--->"+"Capital : "+itr.getValue());
        }
        System.out.println("-----------type2-----------");
        for (String name: hashMap.keySet()){
            System.out.println("Country : "+name);
        }
        for (String capital: hashMap.values()){
            System.out.println("Capital : "+capital);
        }
        System.out.println("--------Type3-------");
        Iterator<Map.Entry<String,String>> itr=hashMap.entrySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("----type4----");
        hashMap.forEach((k,v)->System.out.println(k+" "+v));
    }
}
