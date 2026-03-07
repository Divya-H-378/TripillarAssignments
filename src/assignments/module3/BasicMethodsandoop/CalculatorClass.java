package assignments.module3.BasicMethodsandoop;

class Calculator {
    int add(int a,int b){
        return a+b;
    }
    int subtract(int a,int b){
        return a-b;
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(5,3));
        System.out.println(c.subtract(5,3));
    }
}

