package Queue;

public class LearnQueue {
    int size;
    int [] arr;
    int front , rear;
    public LearnQueue(int size){
        this.size=size;
        arr=new int[size];
        front=rear=-1;
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("queue is full,Cannot add new element");
            return;
        }
        if(isEmpty()){
            front=0;
        }
        rear++;
        arr[rear]=data;
    }
    public int dequeue(){
        if(isEmpty()){
                System.out.println("queue is empty,Cannot dequeue");
                return -1;
        }
        int temp = arr[front];
        if(front==rear){
            front=rear=-1;
            return temp;
        }
        front++;
        return temp;
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
        return rear==size-1;
    }
    public void printQueue(){
        if(isEmpty())return;
        for(int i = front; i<=rear; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
