package Stack;

public class Main {
    static void main(){
       StackUsingArray stack = new StackUsingArray(5);
       stack.push(4);
       stack.push(9);
       stack.push(3);
       stack.push(8);
       stack.printStack();
       stack.pop();
       stack.printStack();
       int peek = stack.peek();
       System.out.println(peek);

    }
}
