package assignments.module11.StackAndQueue;

class Queue {
    int[] arr = new int[5];
    int front = 0, rear = -1;

    void enqueue(int x) {
        if (rear == arr.length - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        arr[++rear] = x;
    }

    int dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return arr[front++];
    }

    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class QueueDemo {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();
        System.out.println("Dequeued: " + q.dequeue());
    }
}