package assignments.modulel4.AdvancedJavaConcepts;

public class StringImmutable {
    public static void main(String[] args) {

        String str = "Hello";
        str.concat(" World");

        System.out.println(str); // Output: Hello

        str = str.concat(" World");
        System.out.println(str); // Output: Hello World
    }
}