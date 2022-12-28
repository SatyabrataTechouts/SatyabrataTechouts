import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda2 {
    public static void main(String[] args) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(33);
        arrayList.add(3);
        arrayList.add(90);
        arrayList.add(75);
        Consumer<Integer>methos=(n)->{
            System.out.println(n);

        };
        arrayList.forEach(methos);
    }
}
