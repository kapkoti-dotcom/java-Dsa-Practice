class Animal {
    void sound() {
        System.out.println("animal make a sound");
    }
}

    class dog extends Animal {
        void sound() {
            System.out.println("bhow bhow");
        }
    }

    class cat extends Animal {
        void sound() {
            System.out.println("meow");
        }
    }

public class Main {
    public static void main(String[] args) {
        Animal a = new dog();
        a.sound();
        Animal a1 = new cat();
        a1.sound();

    }

}
