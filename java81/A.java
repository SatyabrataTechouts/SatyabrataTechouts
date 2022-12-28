package java81;

import java.time.LocalDate;

public class A {
    public static void creating() {
        System.out.println("Hello Every one");
        LocalDate now=LocalDate.now();
        System.out.println(now);
    }
    public static void threadTask()  {
        for (int i=0;i<5;i++){
            System.out.println(i);
            try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }

        }
    }
    void printNumber(){
        for (int i=0;i<6;i++){
            System.out.println(i);
        }
    }
}
