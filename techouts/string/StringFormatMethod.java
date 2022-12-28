package techouts.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import static com.sun.javafx.css.SizeUnits.S;

public class StringFormatMethod {
    public static void main(String[] args) {
        String s1=new String("Satya");
        String s2=new String("Brata");
        //using String.Format method to concat two string
        String s3=String.format("%s%s",s1,s2);
        System.out.println(s3.toString());
        //Use String.join method
        String s4=new String("Hello");
        String s5=new String("World");
        String s6=String.join("",s4,s5);
        System.out.println("String.join method is "+s6.toString());
        //implement String.joiner method
        StringJoiner s=new StringJoiner(",");
        s.add("WEL");
       s.add("come");
        System.out.println(s.toString());
        List<String> list= Arrays.asList("abc","pqr","vnm");
        String str=list.stream().collect(Collectors.joining(","));
        System.out.println(str.toString());

    }
}
