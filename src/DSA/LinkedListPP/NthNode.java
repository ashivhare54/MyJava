package DSA.LinkedListPP;


public class NthNode extends LinkedListP {
//     Node head;
    public static void main(String[] args) {
        NthNode list=new NthNode();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        list.printList();
        list.nthNode(list.head,2);
        list.printList();

    }

public void nthNode(Node head,int nth){
 // size of the linkedlist
    int size=0;
    Node curr=head;
    while(curr!=null){
     curr=curr.next;
     ++size;
    }
    System.out.println(size);

 //find nth node to delete, we will find previous node and point it to prev.next.next node
    int searchIndex=size-nth;
     Node prev=head; int i=0;
    while(i!=searchIndex){
        prev=prev.next;
        i++;
    }
    prev.next=prev.next.next;

}

}
