package Compareble;

public class Object implements Comparable<Object> {
    private int a;
    private int b;

    public Object(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }



    @Override
    public int compareTo(Object o) {
          if (b>o.b){
              return 1;
          }
          else if(b==o.b){
              return 0;
          }
          else {
              return -1;
          }
    }

    @Override
    public String toString() {
        return "Object{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
