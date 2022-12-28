package employeeTechouts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws EmployeeNotFound {
        Pajo emp1=new Pajo(12,"Satyabrata Barik","Bhadrak,odisha");
        Pajo emp2=new Pajo(13,"Tajudin","cuttack,odisha");
        Pajo emp3=new Pajo(14,"suman","kolkata");
        Pajo emp4=new Pajo(15,"padmanava ","Bhadrak,Odisha");

            Pajo empdata[] = {emp1,emp2,emp3,emp4};


        System.out.println("-----Welcome to Techouts Digital-----");
        System.out.println("Enter 1 to cheek the details and 2 to cancel ");
        Scanner sc=new Scanner(System.in);
        int sw=sc.nextInt();
        switch(sw){
            case 1:
                System.out.println("Enter emp number :");
                int n=sc.nextInt();
               try {
                   for (int i = 0; i < empdata.length; i++) {
                       empdata[i].cheek(n);
                   }
               }
               catch(EmployeeNotFound employeeNotFound){
                   System.out.println(employeeNotFound);
                }
               catch (Exception e){
                   System.out.println(e);
               }



        }

    }
}
