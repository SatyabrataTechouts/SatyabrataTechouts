package treads;

public class ThreadExample1 {
    public static void main(String[] args) {
        Mythread t1=new Mythread();
        Mythread2 t2=new Mythread2();
//        t1.start();
//        t2.start();
        t2.run();


    }
}
