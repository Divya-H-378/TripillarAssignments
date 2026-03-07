package assignments.module5.ExceptionHandlingAndMultithreading;

class PrintNumbers {

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            for(int i=1;i<=5;i+=2)
                System.out.println("Thread1: " + i);
        });

        Thread t2 = new Thread(() -> {
            for(int i=2;i<=6;i+=2)
                System.out.println("Thread2: " + i);
        });

        t1.start();
        t2.start();
    }
}
