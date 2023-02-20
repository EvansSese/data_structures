package linked_list.singly_linked_list;

public class InsertNode {

    public static void main(String[] args) {
        //create a Linked List object
        SinglyLinkedList sll = new SinglyLinkedList();

        //call the insert first node method
        sll.insertFirst(23);
        sll.insertFirst(12);
        sll.insertFirst(34);

        //call the insert last node method
        sll.insertLast(22);
        sll.insertLast(56);
        sll.insertLast(30);


        //call the insert anywhere method
        sll.insertAnywhere(7, 4);

        //display the linked list
        sll.display();
    }
}
