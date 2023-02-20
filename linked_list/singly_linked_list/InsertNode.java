package linked_list.singly_linked_list;

public class InsertNode {

    public static void main(String[] args) {
        //create a Linked List object
        SinglyLinkedList sll = new SinglyLinkedList();

        //call the insert first node method
        sll.insertFirst(23);
        sll.insertFirst(12);
        sll.insertFirst(34);

        //display the linked list
        sll.display();
    }
}