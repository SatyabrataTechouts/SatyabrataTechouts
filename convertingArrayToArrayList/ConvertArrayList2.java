package convertingArrayToArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ConvertArrayList2 {
    public static void main(String[] args) {
        String[] arr = {"Satya", "padma", "suman", "Tajudin"};

        List<String> al = new ArrayList<String>();

        Collections.addAll(al, arr);

        System.out.println(al);
    }
}
