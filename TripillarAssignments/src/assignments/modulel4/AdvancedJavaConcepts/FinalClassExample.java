package assignments.modulel4.AdvancedJavaConcepts;

final class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

public class FinalClassExample {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.sound();
    }
}

