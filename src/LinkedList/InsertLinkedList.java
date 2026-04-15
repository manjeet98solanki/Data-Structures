package LinkedList;
public class InsertLinkedList {
    public static Node<Integer> insert(Node<Integer> head, int val){
        Node<Integer> newNode = new Node<>(val);
        if(head==null) return newNode;
        Node<Integer> temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
           temp.next=newNode;
           newNode.next=null;
       return head;
    }
    public static Node<Integer> insertAtPosition(Node<Integer> head, int pos, int val) {

        Node<Integer> newNode = new Node<>(val);

        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }

        Node<Integer> temp = head;

        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return head;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }
}
