package StackUsingLinkedList;

public class Main {
     void main(){
        StackLinkedList stack = new StackLinkedList();
        stack.push(5);
        stack.push(8);
        stack.push(9);
        stack.push(7);
        stack.push(3);
        stack.push(2);
        System.out.println(stack.peek());
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
        System.out.println(stack.isEmpty());
    }

}
