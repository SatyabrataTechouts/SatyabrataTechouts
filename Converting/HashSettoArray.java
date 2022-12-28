package Converting;

import java.util.HashSet;

public class HashSettoArray {
    public static void main(String[] args) {
        HashSet<String>hashSet=new HashSet<>();
        hashSet.add("Satya");
        hashSet.add("Padma");
        hashSet.add("taj");
        hashSet.add("Suman");
       String[] arr=new String[hashSet.size()];
       int i=0;
        for (String h:hashSet){
            arr[i++]=h;
        }
        for (int j=0;j< arr.length;j++){
            System.out.printf("Element of arr[%d] : %s\n",j,arr[j]);
        }
    }
}
