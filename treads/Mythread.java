package treads;

public class Mythread extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("My thread is running");
        }
    }
}
