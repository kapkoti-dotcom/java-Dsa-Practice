public class Main {
    String title;
    String author;
    int price;

    Main(String t) {
        title = t;
        author = "unklnown";
        price = 0;
    }

    Main(String t, String a) {
        title = t;
        author = a;
        price = 0;
    }

    Main(String t, String a, int p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("title:" + title + ",author:" + author + ",price:" + price);
    }


    public static void main(String[] args) {
        Main m = new Main("My destiny");
        Main m1=new Main("My destiny","honey");
        Main m2=new Main("My destiny","honey",250);
        m.display();
        m1.display();
        m2.display();
    }
}

