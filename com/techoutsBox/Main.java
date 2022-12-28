package com.techoutsBox;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter length,breath,height");
        double h,l,b;
         l=sc.nextDouble();
          b=sc.nextDouble();
          h=sc.nextDouble();
        Box3D box3D=new Box3D(l,b,h);
        box3D.setLength(l);
        box3D.setBreath(b);
        box3D.setHeight(h);

        System.out.println("Area is "+box3D.area());
        System.out.println("Volume is "+box3D.volume());
    }
}
