package StackUsingLinkedList;

public class StackLinkedList {
    Node top;
    boolean isEmpty(){
        return top==null;
    }
       void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;

    }

    int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        int data = top.data;
        top=top.next;
        return data;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return top.data;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next= null;
        }
    }
}
