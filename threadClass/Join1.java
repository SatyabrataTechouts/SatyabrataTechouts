package threadClass;

public class Join1 extends  Thread{
    @Override
    public void run() {
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
        Join1 t1=new Join1();
        Join1 t2=new Join1();
        t2.setPriority(1);
        t1.start();
        try {
            t1.join(1500);
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();
        try {
            t2.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println(t1.getName());
        t1.setName("Satya");
        System.out.println(t1.getName());
        System.out.println(t1.getId());

        System.out.println(t1.getPriority());
    }
}
