package LinkedList;
public class  PrintLinkedList {
    public static void printList(Node<Integer> head){
        if(head==null)
            System.out.println("Null");
        Node<Integer> temp=head;
        while (temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
