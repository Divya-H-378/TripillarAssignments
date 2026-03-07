package assignments.module5.ExceptionHandlingAndMultithreading;

import java.util.Scanner;

public class AgeExceptionExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above");
        }

        System.out.println("Eligible");
    }
}
