package java8;



import java.util.ArrayList;
import java.util.Collections;
 class Product{
    String name;
    int price;
    int pieces;
    public Product(String name,int price,int pieces){
        this.name=name;
        this.price=price;
        this.pieces=pieces;
    }
}
public class Example4 {
    public static void main(String[] args) {
        ArrayList<Product>arrayList=new ArrayList<Product>();
        arrayList.add(new Product("Pen",30,20));
        arrayList.add(new Product("Pencil",34,23));
        arrayList.add(new Product("Notebook",33,12));
        Collections.sort(arrayList,(p1,p2)->{ return p1.name.compareTo(p2.name);});
        for(Product p:arrayList){
            System.out.println(p.name+" "+p.price);
        }

    }
}
