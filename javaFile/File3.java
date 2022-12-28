package javaFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File3 {
    public static void main(String[] args) throws IOException {
        File file=new File("new file.txt");
        FileWriter f=new FileWriter("new file.txt");
        f.write("Welcome to techouts ");
        f.close();
        //read form scanner class
        Scanner sc=new Scanner(file);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }

    }
}
