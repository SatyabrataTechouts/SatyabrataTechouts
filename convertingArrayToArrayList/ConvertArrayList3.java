package convertingArrayToArrayList;

import java.util.ArrayList;

public class ConvertArrayList3 {
    public static void main(String[] args) {
        String[] arr = {"Satya", "padma", "suman", "Tajudin"};
        ArrayList<String>arrayList=new ArrayList<>();
        for (String str:arr){
            arrayList.add(str);
        }
        System.out.println(arrayList);
    }
}
