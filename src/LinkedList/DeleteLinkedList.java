package LinkedList;
public class DeleteLinkedList {
    public static Node<Integer> deleteLast(Node<Integer> head){
        if(head==null||head.next==null) return null;
        Node<Integer> temp = head;
        while(temp.next.next!=null)
            temp = temp.next;
             temp.next=temp.next.next;
    return head;
    }
    public static Node<Integer> deleteFirst(Node<Integer> head){
        if(head==null) return null;
          head=head.next;
         return head;
    }
    public static Node<Integer> deleteAtPosition(Node<Integer> head,int pos){
        if(head==null)return null;
        if(pos==0) return head.next;
        Node<Integer> temp=head;
        for(int i=0; i<pos-1&&temp.next.next!=null; i++)
            temp=temp.next;
        temp.next=temp.next.next;
        return head;
    }
}
