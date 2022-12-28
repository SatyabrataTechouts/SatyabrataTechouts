package threadClass;

public class Thread2 {
    public static void main(String[] args) {
        ExThread et=new ExThread();
        Thread t1=new Thread(et);
        t1.start();
    }
}
