package DSA.LinkedListPP;

import java.util.Objects;

public class Pallindrome extends LinkedListP {
    public static void main(String[] args) {
        Pallindrome pal=new Pallindrome();
        pal.addLast("1");pal.addLast("2");pal.addLast("1");
        pal.printList(); // 1-->2-->1-->null

       System.out.println("is Pallindrome--"+ pal.isPallindrome());
        pal.printList();
    }


    public boolean isPallindrome(){
        Node middle= findMiddle(head); // 1st half ka end
        Node secondHalfStart =findReverse(middle); // 2nd half ka start

        Node firstHalfStart=head;
        while(secondHalfStart.next!=null){
            if(!Objects.equals(firstHalfStart.data, secondHalfStart.data))
                return false;
            firstHalfStart=firstHalfStart.next;
            secondHalfStart=secondHalfStart.next;
        }
        return true;
    }

    public Node findMiddle(Node head){

        Node turtle=head;
        Node hare=head;
        if(hare!=null || hare.next!=null){
            turtle=turtle.next;
            hare=hare.next.next;
        }
        return turtle;
    }
    public Node findReverse(Node head){
        Node prev=null;
        Node curr=head;
        Node nex;
        while(curr!=null){
            nex=curr.next;
            curr.next=prev;

            //update
            prev=curr;
            curr=nex;
        }
         return prev;
    }
}
/*
* The output indicates that your list is correctly identified as a palindrome,
* but the last element 1 is missing when you print the list after the palindrome check.
*  This happens because the findReverse method modifies the list in place,
*  and when you reverse the second half, it affects the original list's structure.
1-->2-->1-->null
is Pallindrome--true
1-->2-->null

* */
