package treads;

public class Mythread2 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("Thread2 is running");
        }
    }
}
