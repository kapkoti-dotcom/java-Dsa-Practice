public class Main {
    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("Google");
       sb.insert(0,"Hello ");
       sb.delete(sb.length()-2,sb.length());
       sb.reverse();
        System.out.println(sb.toString());
    }
}
