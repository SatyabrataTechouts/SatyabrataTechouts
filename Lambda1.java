import java.lang.reflect.Array;
import java.util.ArrayList;

public class Lambda1 {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(12);
        arrayList.add(23);
        arrayList.add(56);
        arrayList.add(90);
    arrayList.forEach((n)->{
        System.out.println(n);
    });
 
    }
}
