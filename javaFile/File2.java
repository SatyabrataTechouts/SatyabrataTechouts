package javaFile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File2 {
    public static void main(String[] args) throws IOException {
        File file=new File("File2.txt");
        FileWriter fileWriter=new FileWriter(file);
        fileWriter.write("Hii Whats up!");
        String str="Java I/O Tutorial\t" +
                "Java I/O (Input and Output) is used to process the input and produce the output.\n" +
                "\n" +
                "Java uses the concept of a stream to make I/O operation fast. The java.io package contains all the classes required for input and output operations.\n" +
                "\n" +
                "We can perform file handling in Java by Java I/O API.";
        fileWriter.write(str);
        fileWriter.close();
        FileReader f=new FileReader(file);
        int i;
        while((i=f.read())!=-1){
            System.out.println((char)i);
        }

    }
}
