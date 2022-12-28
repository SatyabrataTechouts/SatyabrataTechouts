package techouts.string;

import java.util.Scanner;

public class Concatenation1 {
    public static void main(String[] args) {
//
//        here use concat() method to concatenation two String
        String str1,str2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  the String :");
        str1= sc.nextLine();
        System.out.println("Enter the String 2:");
        str2=sc.nextLine();
        System.out.println(str1.concat(str2));
        String s1="Sachin ";
        String s2="Tendulkar";
        String s3=s1.concat(s2);
        System.out.println(s3);

    }
}
