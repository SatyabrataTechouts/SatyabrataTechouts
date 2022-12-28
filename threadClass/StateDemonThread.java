package threadClass;

public class StateDemonThread extends Thread {
    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()){
            System.out.println("Demonostrate thread work");
        }
        else{
            System.out.println("Normally running .. ");
        }
    }

    public static void main(String[] args) {
        StateDemonThread t1=new StateDemonThread();
        StateDemonThread t2=new StateDemonThread();
        t1.setDaemon(true);
        t1.start();
         t2.start();
    }
}
