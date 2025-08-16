class Student {
    String name;         // instance variable (alag-alag object ke liye alag)
    int age;
    static String school = "ABC School";  // static variable (sab objects ke liye same)

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // static method
    static void changeSchool(String newSchool) {
        school = newSchool;  // static method can only access static data
    }

    void display() {
        System.out.println(name + " | " + age + " | " + school);
    }



    public static void main(String[] args) {
        Student s1 = new Student("Himanshi", 19);
        Student s2 = new Student("Riya", 20);

        s1.display();
        s2.display();

        // Change school using static method
        Student.changeSchool("XYZ School");

        s1.display();
        s2.display();
    }
}
