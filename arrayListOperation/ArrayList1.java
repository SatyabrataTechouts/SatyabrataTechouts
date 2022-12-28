package arrayListOperation;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(12);
        arrayList.add(23);
        arrayList.add(33);
        arrayList.add(25);
   ListIterator<Integer> itr= arrayList.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("enter index to add element: ");
        n=sc.nextInt();
        System.out.println("Enter the Element : ");
        int e=sc.nextInt();
        arrayList.add(n,e);
        System.out.println(arrayList);
        System.out.println("Sorting the arrayList in deceanding order is  ");
         Collections.sort(arrayList,Collections.reverseOrder());
        System.out.println(arrayList);
        System.out.println("Insert element using ListIterator");
        ListIterator<Integer> list= arrayList.listIterator();
        list.add(12);
        System.out.println(arrayList);
    }
}
