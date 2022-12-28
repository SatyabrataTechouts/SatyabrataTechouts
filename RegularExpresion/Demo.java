package RegularExpresion;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Pattern pattern=Pattern.compile("^[a-z0-9]+(?!.*(?:\\+{2,}|\\-{2,}|\\.{2,}))(?:[\\.+\\-]{0,1}[a-z0-9])*@gmail\\.com$");
        Matcher matcher=pattern.matcher(sc.nextLine());
        boolean find= matcher.find();
        if (find){
            System.out.println("matched");
        }
        else{
            System.out.println("not matched");
        }



    }
}
