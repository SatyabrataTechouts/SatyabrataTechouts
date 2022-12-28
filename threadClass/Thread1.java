package threadClass;

public class Thread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Running ......");
    }
    public static void main(String[] args) {

        Thread1 t2=new Thread1();
        Thread t1=new Thread(t2);
        t1.start();

    }


}
