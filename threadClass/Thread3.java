package threadClass;

public class Thread3 implements Runnable{
    @Override
    public void run() {
        System.out.println("Running");
    }

    public static void main(String[] args) {
        Thread3 t=new Thread3();
        Thread t1=new Thread(t,"My thread");
        t1.start();
        String str=t1.getName();
        System.out.println(str);
    }
}
