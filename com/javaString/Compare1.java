package com.javaString;

import java.util.Scanner;
import java.util.logging.Logger;

public class Compare1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String name");
        String s1=sc.nextLine();
        System.out.println("Enter STring 2");
        String s2=sc.nextLine();
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
