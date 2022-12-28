package stringBuffer;

public class StringApend {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("I am satya");
        System.out.println(str.capacity());
        str.append("welcome");
        System.out.println(str);
        str.insert(10," ");
        System.out.println("After insert: "+str);
        str.replace(0,10,"Welcome");
        System.out.println(str);
        str.replace(8,str.length(),"I am Satya");
        System.out.println(str);
        str.delete(1,3);//first including last excluding
        System.out.println(str);
        //str.reverse();
        System.out.println(str);
        System.out.println(str.capacity());
        str.ensureCapacity(545);
        str.append("Happy merry Christmas");
        System.out.println(str);
        System.out.println(str.capacity());
    }

}
