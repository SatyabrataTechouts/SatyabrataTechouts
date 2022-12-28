package java8;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        Drawable d=(Name)->{return "Hello"+name;};
        System.out.println(d.name(name));
    }
}
