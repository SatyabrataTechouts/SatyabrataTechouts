package Enum_In_One_class;

import java.util.Scanner;

enum Weeks{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
        }
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Weeks wk=Weeks.SATURDAY;
        switch (wk){
            case SUNDAY:
                System.out.println("Sunday is holiday");
                break;
            case MONDAY:
                System.out.println("Working day");
                break;
            case TUESDAY:
                System.out.println("Working day ");
                break;

            case WEDNESDAY:
                System.out.println("Working ...");
                break;
            case THURSDAY:
                System.out.println("Working ");
            case FRIDAY:
                System.out.println("Working ");
            case SATURDAY:{
                System.out.println("Holiday");
            }
        }
    }
}
