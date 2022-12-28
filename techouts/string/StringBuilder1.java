package techouts.string;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("Hello");
        StringBuilder stringBuilder1=new StringBuilder("2");
        StringBuilder stringBuilder2=stringBuilder.append(stringBuilder1);
        System.out.println(stringBuilder2);
    }
}
