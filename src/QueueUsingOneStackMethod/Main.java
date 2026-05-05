package QueueUsingOneStackMethod;



public class Main {
     static void main() {
         QueueUsingOneStack queue = new QueueUsingOneStack();
         queue.enqueue(1);
         queue.enqueue(2);
         System.out.println(queue.dequeue());
         System.out.println(queue.dequeue());
         queue.enqueue(3);
         queue.enqueue(4);
         queue.enqueue(5);
         System.out.println(queue.dequeue());
         System.out.println(queue.dequeue());
         queue.enqueue(6);
         System.out.println(queue.dequeue());
         System.out.println(queue.dequeue());
         System.out.println(queue.dequeue());
         queue.enqueue(7);
         queue.enqueue(8);
         System.out.println(queue.dequeue());
         System.out.println(queue.dequeue());




    }
}
