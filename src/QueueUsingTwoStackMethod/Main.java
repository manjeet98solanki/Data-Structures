package QueueUsingTwoStackMethod;

public class Main {
    static void main() {
        QueueUsingTwoStack queue = new QueueUsingTwoStack();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue.dequeue());
        queue.enqueue(5);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
