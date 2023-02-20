package stack;

import java.util.EmptyStackException;


//create the Stack class
public class Stack {

    //create the instance variables
    private ListNode top;
    private int length;

    //create ListNode class
    private class ListNode {

        //create listnode variables
        private int data;
        private ListNode next;

        //create listnode constructor method
        public ListNode(int data){
            this.data = data;
        }
    }

    //create stack constructor method
    public Stack(){
        //initialize stack variables
        top = null;
        length = 0;
    }

    //create method to get the length of stack
    public int length(){
        return length;
    }

    //create a method to check if stack is empty
    public boolean isEmpty(){
        return length == 0;
    }

    //create the push method to add element to top of the stack
    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    //create method to remove top element from the stack
    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        int result = top.data;
        top = top.next;
        length --;
        return result;
    }

    //create method to display top element of stack
    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(15);
        stack.push(20);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}
