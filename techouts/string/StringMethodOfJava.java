package techouts.string;

public class StringMethodOfJava {
    public static void main(String[] args) {
        String s="Satyabrata Barik";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.startsWith("sa"));
        System.out.println(s.endsWith("k"));
        int a=60;
        String s1=String.valueOf(a);
        System.out.println(s1+78);
    }
}
