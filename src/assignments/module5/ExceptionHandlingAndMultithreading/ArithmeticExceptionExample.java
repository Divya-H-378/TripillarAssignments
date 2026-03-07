package assignments.module5.ExceptionHandlingAndMultithreading;

public class ArithmeticExceptionExample {

    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int c = a / b;
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero not allowed");
        }
    }
}
