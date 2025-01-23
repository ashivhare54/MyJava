package DSA.LinkedListPP;

public class LinkedListP{ // scratch linkedlist implementation
    Node head;

public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
}

public void addLast(String data){
        Node newNode=new Node(data);
        Node currNode=head;
        if(head==null){
            head=newNode;
            return;
        }
        while (currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
}

public void printList(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }
        System.out.println("null");
}

public void deleteFirst(){
        head=head.next;
}

public void deleteLast(){
        Node secondlast=head;
        Node last=head.next;

        while(last.next!=null){
            last=last.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
}

public void reverse(){
    if (head==null || head.next==null){
        return;
    }

    Node prev=null;
    Node curr=head;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
    //update the value for next three pairs;
        prev=curr;
        curr=next;
    }
        this.head=prev;
}

public Node reverseRecursive(Node head){
    if(head==null || head.next==null){
        return head;
    }
    System.out.println("head "+head.data+" head.next "+head.next.data);
    Node newHead= reverseRecursive(head.next);
    System.out.println("head "+head.data+" head.next "+head.next.data);
    head.next.next=head;
    head.next=null;
    return newHead;
}

    public static void main(String[] args) {
        LinkedListP list=new LinkedListP();
        list.addFirst("2");
        list.addFirst("1");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        list.printList();          //is-->a-->list-->null
//        list.deleteFirst();        //a-->list-->null     //removed is
//        list.deleteLast();         //is-->a-->null       //removed list
//        list.reverse();            //list-->a-->is-->null
//        list.head=list.reverseRecursive(list.head);
        list.printList();
    }

}
