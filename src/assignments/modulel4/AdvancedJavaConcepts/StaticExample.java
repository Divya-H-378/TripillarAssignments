package assignments.modulel4.AdvancedJavaConcepts;

class StaticExample {

    static int count = 0;

    static void display() {
        System.out.println("Static method called");
    }

    StaticExample() {
        count++;
    }

    public static void main(String[] args) {

        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();

        System.out.println("Count: " + count);

        display();
    }
}
