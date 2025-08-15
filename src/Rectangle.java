

public class Rectangle {
    int length;
    int width;
    Rectangle(int length,int width){
        this.length=length;
        this.width=width;

    }
    void display(){
        System.out.println("length:"+length);
        System.out.println("width:"+width);
    }

    public static void main(String[] args) {
        Rectangle r=new Rectangle(10,50);
        r.display();

    }
}