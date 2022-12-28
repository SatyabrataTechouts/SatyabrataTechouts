package techouts.string;

import java.util.Scanner;

public class StringConcartination1 {
    public static void main(String[] args) {
        /*/*we have try to concart the string by "+" operator

         /*/
        String s1,s2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String 1 to concatination");
       s1=sc.nextLine();
        System.out.println("Enter the String two");
        s2= sc.nextLine();
        System.out.println("After concat is ");
        System.out.println(s1+" "+s2);
    }
}
