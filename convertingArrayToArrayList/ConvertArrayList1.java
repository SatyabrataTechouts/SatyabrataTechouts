package convertingArrayToArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ConvertArrayList1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        //using scanner class

        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            System.out.printf("Enter   arr[%d] :",i);
            arr[i]= sc.nextInt();
        }

       ArrayList<Integer>arrayList=new ArrayList<>();
        for (int j=0;j<n;j++){
            arrayList.add(arr[j]);
        }
        System.out.println(arrayList);


    }
}
