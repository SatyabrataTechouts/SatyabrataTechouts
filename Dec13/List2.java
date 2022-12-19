package Dec13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//convert to list to array
public class List2 {
    public static void main(String[] args) {
        List<String> li=new ArrayList<String>();
        li.add("s");
        li.add("r");
        li.add("p");
        li.add("t");
        //converting List to array
        String[] arr=li.toArray(new String[li.size()]);
        System.out.println("Printing Array"+ Arrays.toString(arr));
    }
}
