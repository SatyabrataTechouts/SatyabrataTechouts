package Enum_In_One_class;

public class Demo2 {
    enum weak{
        SUNDAY(10),
        MONDAY(20), TUESDAY(6),
        WEDNESDAY(8), THURSDAY(10),
        FRIDAY(7), SATURDAY(12);
        private int value;
        weak(int value){
            this.value=value;

        }
    }

    public static void main(String[] args) {
        for (weak d:weak.values()){
            System.out.println(d+" "+d.value);
        }
    }
}
