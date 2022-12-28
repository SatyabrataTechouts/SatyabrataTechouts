package Dec14;

import java.util.HashSet;
import java.util.Iterator;

 class HashSet9 {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<String>();
        hs.add("s");
        hs.add("s");
        hs.add("p");
        hs.add("q");
        System.out.println(hs);
        HashSet<String> hs1=(HashSet<String>) hs.clone();
        System.out.println("clone hashSet is "+hs1);
        Iterator itr= hs1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());


        }
        hs.removeIf(str->str.contains("s"));
        System.out.println(hs);

        System.out.println(hs.isEmpty());
        HashSet<String> hs2=new HashSet<String>();
        hs2.add("satya");
        hs2.add("123");
        hs2.add("789");
        hs2.add("s");
        hs2.addAll(hs1);
        System.out.println(hs2);
        System.out.println(hs2.size());
    }
}
