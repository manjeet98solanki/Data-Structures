package MyCircularQueue;

public class CircularQueue {
    int size;
    int[] arr;
    int front, rear;
    public CircularQueue(int size){
        this.size = size;
        arr = new int[size];
        front=rear=-1;
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("queue is full, Cannot add new element");
            return;
        }
        if(isEmpty()){
            front=0;
        }
        rear = (rear+1)%size;
        arr[rear] = data;
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("queue is empty,Cannot dequeue");
            return;
        }
        if(front==rear){
            front=rear=-1;
            return;
        }
        front=(front+1)%size;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("queue is empty,Cannot peek");
            return -1;
        }
        return arr[front];
    }
    public boolean isEmpty(){
        return front==-1;
    }
    public boolean isFull(){
        if(rear==size-1 && front==0) return true;
        return rear + 1 == front;
    }
    public void printQueue(){
        if(front<=rear){
            for(int i= front; i<=rear;i++){
                System.out.print(arr[i]+" ");
            }
        }else{
            for(int i = front; i<size; i++){
                System.out.print(arr[i]+" ");
            }
            for(int i=0; i<=rear; i++){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}
