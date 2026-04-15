package Stack;

public class StackUsingArray {
    int size;
    int a[];
    int top;

    public StackUsingArray(int size){
        this.size=size;
        a = new int[size];
        top=-1;
    }
    public boolean push(int val){
        if(isFull()) {
            System.out.println("Stack overflow");
            return false;
        }
        else{
            top++;
            a[top]=val;
            return true;
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return a[top];
    }
    public void printStack(){
        for(int i=0; i<= top; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }else{
            int temp = a[top];
            top--;
            return temp;
        }
    }
    public boolean isFull(){
        return top==size-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
}
