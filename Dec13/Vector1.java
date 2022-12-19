package Dec13;

import java.util.Scanner;
import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Vector<Integer> v=new Vector<Integer>();
        System.out.println("Enter to Store the element");
        int n=sc.nextInt();


        for (int i=1;i<=n;i++){
            System.out.println("Enter the element:");
            v.add(sc.nextInt());
        }
        System.out.println(v);
        System.out.println(v.get(3));
    }
}
