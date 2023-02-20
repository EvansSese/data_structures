package linked_list.singly_linked_list;

public class SinglyLinkedList {

    //create instance variable of HEAD
    private ListNode head;


    //create ListNode class
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    //method to insert first node in a singly linked list
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        //check if list is empty
        if (head == null){
            head = newNode;
            return;
        }

        //when list is not empty
        ListNode current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }


    //create a method to display the singly linked list
    public void display(){

        //create a temp list and assign head to it
        ListNode current = head;

        //loop through to display the data
        while(current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    //create method to print the length of a list
    public int length(){
        //check if list is empty
        if (head == null){
            return 0;
        }

        //initialize count to 0
        int count = 0;

        //create temp list of current and assighead to it
        ListNode current = head;

        //loop through and count the elements
        while(current != null){
            count ++;
            current = current.next;
        }
        //return the count
        return count;
    }

    public static void main(String[] args) {
        // initialize singly linked list
        SinglyLinkedList sll = new SinglyLinkedList();

        //create the nodes
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        //connect the nodes to form a chain
        sll.head.next = second; //10 --> 1
        second.next = third; // 10-->1-->8
        third.next = fourth; //10-->1-->8-->11-->null

        //print the linked list
        sll.display();
        System.out.println(sll.length());
    }
}