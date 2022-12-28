package stringTokenizer;

import java.util.StringTokenizer;

public class StringTokenDemo1 {
    public static void main(String[] args) {
        StringTokenizer stn=new StringTokenizer("Satya brata barik");
        while(stn.hasMoreTokens()){
            System.out.println(stn.nextToken());
        }
//        while(stn.hasMoreElements()){
//            System.out.println(stn.nextElement());//enumerete iterator
//
//        }
        System.out.println(stn.countTokens());

    }
}
