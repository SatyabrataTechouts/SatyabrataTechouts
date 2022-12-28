package TechoutsTaskByAkashSir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Shop {
    public static void main(String[] args) {
        Product p1=new Product(123,"Book1",123);
        Product p2=new Product(124,"Book2",23.75f);
        Product p3=new Product(125,"Book3",13);
        Product p4=new Product(126,"Book4",1230);
        ArrayList<Product> arrayList=new ArrayList<>();
        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(p3);
        arrayList.add(p4);
        Comparator<Product> cmp=Comparator.comparing(Product::getProductPrice);
        Collections.sort(arrayList,cmp);
        for (Product product:arrayList){
            System.out.println(product.getProductId()+" "+product.getProductName()+" "+product.getProductPrice());
        }
    }
}
