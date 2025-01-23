package DSA.Stack;

import static DSA.Stack.StackDS.Stack.*;

public class StackDS {
    // implementing stack data structure using LinkedList
    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Stack {
       public static Node head;

       public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
            }
            newNode.next = head;
            head = newNode;
       }

       public static int pop(){
           if(isEmpty()){
               return -1;
           }
           Node top=head;
           head=head.next;
           return top.data;
       }

       public static int peek(){
           if(isEmpty()){
               return -1;
           }
           return head.data;
       }

       public static boolean isEmpty() {
            return head == null;
       }
    }

    public static void main(String[] args) {
    Stack stack =new Stack();
    push(1);
    push(2);
    push(3);

    System.out.println(pop()); //3
    System.out.println(peek()); //2
    }
}