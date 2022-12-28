package javaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MyFile2 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the file name");
        String name=sc.nextLine();
        FileOutputStream fo=new FileOutputStream(name,true);
        System.out.println("Enter the file context ");
        String str=sc.nextLine()+"\n";
        byte[] b=str.getBytes();
        fo.write(b);
        fo.close();
         File f=new File("satya");
         f.delete();

    }
}
