package Dec14;


import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> ts = new TreeSet<String>();
        System.out.println("Enter how much you want to enter:");

        int n = sc.nextInt();
        System.out.println("Enter the object:");
        for (int i = 0; i < n; i++) {

            ts.add(sc.nextLine());
        }
        System.out.println(ts);
        System.out.println(ts.ceiling("satya"));
        Comparator com=ts.comparator();
        System.out.println(com);
    }
}
