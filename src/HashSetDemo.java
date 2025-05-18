

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> fruits= new HashSet<>();
        fruits.add("apple");
        fruits.add("orange");

        fruits.add("banana");
        System.out.println("HASHSET CONTAINS:" + fruits);
        if (fruits.contains("mango")) {
            System.out.println("Mango is present in set!");
        }else{
            System.out.println(" No mango is not presnt in set .Add Mango in set");
        }
        fruits.add("mango");
        System.out.println("UPDATED LIST:"+fruits);
        System.out.println("Now mango is present in set!!");

    }
}