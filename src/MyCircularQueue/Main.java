package MyCircularQueue;

public class Main {
    static void main(){
        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(30);
        circularQueue.enqueue(40);
        circularQueue.enqueue(50);
        circularQueue.enqueue(60);
        circularQueue.printQueue();
        circularQueue.dequeue();
        circularQueue.dequeue();
        circularQueue.dequeue();
        circularQueue.printQueue();
        circularQueue.enqueue(60);
        circularQueue.enqueue(70);
        circularQueue.enqueue(80);
        circularQueue.printQueue();
        System.out.println(circularQueue.peek());
    }
}
