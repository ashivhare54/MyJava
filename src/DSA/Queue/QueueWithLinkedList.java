package DSA.Queue;

public class QueueWithLinkedList {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data; this.next=null;
        }
    }

   static class Queue{
         static Node head=null;
         static Node tail=null;

         public static boolean isEmpty(){
             return head==null && tail==null;
         }

         public  void add(Integer data){
             Node newNode= new Node(data);
             if(head==null &&tail==null){
                 head=tail=newNode;
             }else{
                 tail.next = newNode;
                 tail = newNode;
             }
         }

         public static int remove(){
             if(isEmpty()) return-1;
            // single node
             if(head==tail)
             {tail=null;}
             int front=head.data;
             head=head.next;
             return front;
         }

         public static int peek(){
             if(isEmpty()) return-1;
             return head.data;
         }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Peek: " + q.peek()); // Peek: 1
        System.out.println("Remove: " + q.remove()); // Remove: 1
        System.out.println("Peek after remove: " + q.peek()); // Peek after remove: 2

        q.remove(); // Remove: 2
        q.remove(); // Remove: 3
        System.out.println("Remove from empty queu");
    }

}
