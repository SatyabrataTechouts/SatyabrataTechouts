package HashTable;

import java.util.Hashtable;

public class HashTable1<I extends Number, S> {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        try {
            hashtable.put(1, "S");
            hashtable.put(6, "n");
            hashtable.put(3, "j");
            hashtable.putIfAbsent(200,"s");
            hashtable.put(null, "null");


        } catch (NullPointerException e) {
            System.out.println(e);
        }
        finally {
            System.out.println(hashtable);
        }
    }
    }
