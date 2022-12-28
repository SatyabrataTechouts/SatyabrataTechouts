package convertLinkListToArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertLinkListToArrayList {
    public static void main(String[] args) {
        LinkedList<Integer>linkedList=new LinkedList<>();
        linkedList.add(1378);
        linkedList.add(3400);
        linkedList.add(3340);
        linkedList.add(3884);
        ArrayList<Integer>arrayList=new ArrayList<>(linkedList);
        System.out.println("ArrayList is \n"+arrayList);
    }
}
