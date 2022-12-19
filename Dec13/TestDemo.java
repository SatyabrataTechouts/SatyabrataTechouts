package Dec13;
import java.util.Scanner;
import java.util.Iterator;

import java.util.LinkedList;

public class TestDemo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        LinkedList<Integer> ll = new LinkedList<Integer>();
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int i=0;
        for (;i<n;i++){
            System.out.println("Enter the object:");
            ll.add(sc.nextInt());
        }
        ll.offer(34);
        Iterator<Integer> itr=ll.iterator();
        while(itr.hasNext()){
            System.out.println("Output is :"+itr.next());
        }
        System.out.println(ll.peek());//it retrive the first element
       // ll.pollLast();//remove the first element of list
       // ll.pop();//First element will be remove
        ll.removeFirstOccurrence(34);
        System.out.println(ll);
        ll.set(3,45);

        System.out.println(ll.size());
        System.out.println(ll);

    }
}
