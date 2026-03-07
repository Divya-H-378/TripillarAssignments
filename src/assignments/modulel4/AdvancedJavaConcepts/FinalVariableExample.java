package assignments.modulel4.AdvancedJavaConcepts;

public class FinalVariableExample {
    public static void main(String[] args) {

        final int number = 10;

        System.out.println("Value: " + number);

        // number = 20;  // This will give error
    }
}
