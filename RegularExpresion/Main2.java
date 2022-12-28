package RegularExpresion;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Pattern pattern = Pattern.compile("@w3schools", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(sc.nextLine());
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}