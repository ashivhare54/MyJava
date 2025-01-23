package DSA.LinkedListPP;

public class findLoop extends LinkedListP {
    public static void main(String[] args) {
        findLoop list=new findLoop();
        list.addLast("1");list.addLast("2");list.addLast("3");list.addLast("4");
        list.printList();
        list.head.next.next.next.next = list.head.next; // Creates a loop: 4 -> 2

      System.out.println(list.hasLoop());


    }

    public boolean hasLoop(){
        if(head==null) return false;

        Node turtle=head;
        Node hare=head;

        while(hare!=null && hare.next!=null){
            turtle=turtle.next;
            hare=hare.next.next;
            if(turtle==hare){
                return true;
            }
        }
        return false;
    }
}
