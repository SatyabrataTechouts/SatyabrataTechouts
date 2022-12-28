package java8.task;

import java.time.LocalDate;
import java.time.LocalTime;

interface  Local{
    void Time();

}
public class LocalDateAndTimeApi {
    public static void main(String[] args) {
        Local l=()->{
            LocalDate now=LocalDate.now();
            LocalTime t=LocalTime.now();
            System.out.println(now);
            System.out.println(t);
        };
        l.Time();
    }
}
