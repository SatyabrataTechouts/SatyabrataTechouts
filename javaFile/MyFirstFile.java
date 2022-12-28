package javaFile;

import java.io.*;
import java.util.Scanner;

public class MyFirstFile {
    public static void main(String[] args) throws IOException {
        File f1=new File("MyFirstFile.txt");
//       if (f1.createNewFile()){
//           System.out.println("File can created ");
//       }
//       else {
//           System.out.println("cant ");
//       }
       FileWriter f=new FileWriter("MyFirstFile.txt");
       f.write("My first file program \n");
       String str="i  am form odisha,bhubaneswar";
       f.write(str);

       //using buffer class

        //read by file

//        while(sc.hasNextLine()){
//            System.out.println(sc.nextLine());
//        }
      // sc.useDelimiter("\\t");

        String s="\nNow i am in hyderabad";
        f.write(s);

        f.close();
    BufferedReader br =new BufferedReader(new FileReader(f1));
    String st;

    while((st= br.readLine())!=null){
        System.out.println(st);
    }
    }
}
