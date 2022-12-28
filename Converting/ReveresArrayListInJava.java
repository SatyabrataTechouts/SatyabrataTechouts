package Converting;

import java.util.ArrayList;
import java.util.Collections;

public class ReveresArrayListInJava {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(12);
        arrayList.add(55);
        arrayList.add(90);
        arrayList.add(23);
        System.out.println("Before reveres : \n"+arrayList);
        Collections.reverse(arrayList);
        System.out.println("After reveres: \n"+arrayList);

    }
}
