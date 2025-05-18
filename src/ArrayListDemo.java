import java.util.ArrayList;

public class ArrayListDemo{
    public static void main(String[] args) {
        ArrayList<String>fruits=new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("papaya");
        fruits.add("mango");
        System.out.println("fruits list:"+fruits);
        fruits.remove("apple");
        fruits.set(2,"orange");
        System.out.println("updated fruit list:"+fruits);
    }
}