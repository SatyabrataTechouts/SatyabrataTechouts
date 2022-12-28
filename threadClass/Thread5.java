package threadClass;

public class Thread5 extends Thread {
    public void run(){
        for (int i=0;i<5;i++){
            try{
                sleep(500);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        Thread5 t1=new Thread5();
        Thread5 t2=new Thread5();
      //  t1.start();
       // t2.start();
        t1.run();
        t2.run();
    }
}
