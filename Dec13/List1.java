package Dec13;

import java.util.ArrayList;
import java.util.List;
//convert Array to List
public class List1 {
    public static void main(String[] args) {
        String[] arr={"satya","lipun","dipun","sipun"};
         List<String> li=new ArrayList<String>();
         for (String str:arr){
             li.add(str);
         }
        System.out.println(li);
    }
}
