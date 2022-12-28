package javaLambda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        MyInterface m=new MyInterface() {
//            @Override
//            public void say() {
//                System.out.println("Hello EveryOne");
//            }
//        };
//        m.say();
        //using our interface by lambda
        MyInterface i=()->
            System.out.println("My first interface by lambda");

        i.say();
        MyInterface i2=()->
                System.out.println("2nd time using lambda");
        i2.say();
        Scanner sc=new Scanner(System.in);
        int u= sc.nextInt();
        int v= sc.nextInt();
        NewInter n=( a, b)->  a+b;
        System.out.println(n.sum(u,v));
        StringInterface sl=str -> str.length();
        System.out.println("length of str"+sl.Length("I am satya"));
    }
}
