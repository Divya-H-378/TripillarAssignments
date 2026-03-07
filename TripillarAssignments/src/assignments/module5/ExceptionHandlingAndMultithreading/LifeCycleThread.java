package assignments.module5.ExceptionHandlingAndMultithreading;

class LifeCycleThread extends Thread {

    public void run() {
        System.out.println("Thread running");
    }

    public static void main(String[] args) {

        LifeCycleThread t = new LifeCycleThread();

        System.out.println("State: " + t.getState());

        t.start();

        System.out.println("State after start: " + t.getState());
    }
}
