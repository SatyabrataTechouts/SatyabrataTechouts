package RegularExpresion;
import  java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        String re="SATYA ";
        String tex="satya";
       Pattern ptr=Pattern.compile(re,Pattern.CASE_INSENSITIVE);
        Matcher mt=ptr.matcher(tex);
        boolean result=mt.matches();
        System.out.println(result);

    }
}
