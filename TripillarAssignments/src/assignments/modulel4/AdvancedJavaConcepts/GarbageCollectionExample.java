package assignments.modulel4.AdvancedJavaConcepts;

public class GarbageCollectionExample {

    public void finalize() {
        System.out.println("Garbage collected");
    }

    public static void main(String[] args) {

        GarbageCollectionExample obj1 = new GarbageCollectionExample();
        GarbageCollectionExample obj2 = new GarbageCollectionExample();

        obj1 = null;
        obj2 = null;

        System.gc();
    }
}
