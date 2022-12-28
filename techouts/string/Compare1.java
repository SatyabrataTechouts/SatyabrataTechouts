package techouts.string;

import java.util.Scanner;

public class Compare1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String 1:");
        String s = sc.nextLine();
        System.out.println("Enter String2 :");
        String s2 = sc.nextLine();
        System.out.println(s==s2);

     String s3 = "Prashanth";
     String s1 = "Prashanth";
     String  s4=new String(s1);
        System.out.println(s3==s1);
        System.out.println(s3==s1);
        String s5=new String("Prashanth");
        System.out.println(s1==s5);
        System.out.println("impliment compare tool");
        System.out.println(s1.compareTo(s3));
        System.out.println(s4.compareTo(s5));
    }
}