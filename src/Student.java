class Student {
    String name;
    int rollno;
    double marks;

    void displayInfo() {
        System.out.println("Name:" + name);
        System.out.println("ROLLno:" + rollno);
        System.out.println("Marks:" + marks);
    }


        public static void main(String[] args) {
            Student s1=new Student();
            s1.name="himanshi";
            s1.rollno=23;
            s1.marks=35.6;
            s1.displayInfo();

        }
    }
// 2 code
class car {
    String brand;
    String model;
    int price;

     car(String b, String m, int p) {
        brand = b;
        model = m;
        price = p;
    }
    void display(){
        System.out.println("brand:"+brand+",model:"+model+",price:"+price);
    }
}
public class Student {
    public static void main(String[] args) {
        car c=new car("mahindra", "sz",2034);
        c.display();
    }
}