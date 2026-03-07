package assignments.module3.BasicMethodsandoop;

public class PositiveNegativeZero {
    static void check(int n){
        if(n>0)
            System.out.println("Positive");
        else if(n<0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
    public static void main(String[] args) {
        check(-5);
    }
}

