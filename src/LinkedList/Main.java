package LinkedList;

import static LinkedList.DeleteLinkedList.*;
import static LinkedList.InsertLinkedList.insert;
import static LinkedList.InsertLinkedList.insertAtPosition;
import static LinkedList.PrintLinkedList.printList;

class Main {
      void main() {
          Node<Integer> head = null;
          head = insert(head, 10);
          head = insert(head, 20);
          head = insert(head, 30);
          head = insert(head, 40);
          printList(head);
          head = insertAtPosition(head, 0, 5);
          printList(head);
          head = deleteLast(head);
          printList(head);
          head = deleteFirst(head);
          printList(head);
          head = deleteAtPosition(head, 2);
          printList(head);
     }
}

