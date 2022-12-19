package Dec14;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
class Book{
    String BookName;
    int id;
    int price;
    Book(String BookName,int id,int price){
        this.BookName=BookName;
        this.id=id;
        this.price=price;
    }

}
public class Libreary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Book> li=new LinkedList<Book>();
        System.out.println("Enter the Book name ,id,price: ");
        Book b1=new Book("Mahabharat",123, 780);
        System.out.println("Enter the Book name ,id,price: ");
        Book b2=new Book("Ramayana",124,789);
        System.out.println("Enter the Book name ,id,price: ");
        Book b3=new Book("Stories",125, 50);
        li.add(b1);
        li.add(b2);
        li.add(b3);
        for (Book bk:li){
            System.out.println(bk.id+" "+bk.BookName+" "+ bk.price);
        }

    }
}
