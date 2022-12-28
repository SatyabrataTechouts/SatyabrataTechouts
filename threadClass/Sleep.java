package threadClass;

public class Sleep extends Thread {
    @Override
    public void run() {
     for (int i=0;i<6;i++){
         try{
            Thread.sleep(500);
         }
         catch (InterruptedException e){
            System.out.println(e);
         }
         System.out.println(i);
     }
    }

    public static void main(String[] args) {
        Sleep thread1=new Sleep();
        Sleep thread2=new Sleep();
        thread1.start();
        thread2.start();

    }
}
