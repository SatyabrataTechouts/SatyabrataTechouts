package java81;

public class Main {
    public static void main(String[] args) {

        Inter i=A::creating;
        i.creating();
        Runnable runnable=A::threadTask;
        Thread d=new Thread(runnable);
        d.start();
        Thread d2=new Thread(runnable);
        d2.start();
        A a=new A();
        Runnable i6=a::printNumber;
        Thread d4=new Thread(i6);
        d4.start();
    }
}
