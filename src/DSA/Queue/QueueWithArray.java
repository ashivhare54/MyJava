//package DSA.Queue;
//
//
//public class QueueWithArray {
//    static class DSA.Queue{
//        static int[] arr;
//       public static int size;
//        static public int rear=-1;
//
//        public DSA.Queue(int size){
//            this.size=size;
//            arr=new int[size];
//        }
//    }
//    public static boolean isEmpty(){
//        return rear==-1;
//    }
//    public static boolean isFull(){
//        return rear==size-1;
//    }
//
//    public static void add(Integer i){
//        if(isFull()) {
//            return;
//        }
//        rear++;
//        arr[rear]=i;
//    }
//
//    public static int pop(){
//        if(isEmpty()){
//            return -1;
//        }
//        int front=arr[0];
//        //shift elements one position back
//        for(int i=0;i<rear;i++){
//            arr[i]=arr[i+1];
//        }
//        rear--;
//        return front;
//    }
//
//    public static int peek(){
//        if(isEmpty()) return -1;
//        return arr[0];
//    }
//
//    public static void main(String[] args) {
//    DSA.Queue q=new DSA.Queue(3);
//
//    }
//}
package DSA.Queue;

public class QueueWithArray {
    static class Queue {
        int[] arr;
        int size;
        int rear = -1;

        public Queue(int size) {
            this.size = size;
            arr = new int[size];
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public boolean isFull() {
            return rear == size - 1;
        }

        public void add(int i) {
            if (isFull()) {
                System.out.println("DSA.Queue is full");
                return;
            }
            rear++;
            arr[rear] = i;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("DSA.Queue is empty");
                return -1;
            }
            int front = arr[0];
            // Shift elements one position back
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("DSA.Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("Peek: " + q.peek()); // Peek: 1

        System.out.println("Pop: " + q.pop());   // Pop: 1
        System.out.println("Peek after pop: " + q.peek()); // Peek after pop: 2

        q.add(4);
        System.out.println("Peek after adding 4: " + q.peek()); // Peek after adding 4: 2

        // Further pops
        System.out.println("Pop: " + q.pop());   // Pop: 2
        System.out.println("Pop: " + q.pop());   // Pop: 3
        System.out.println("Pop: " + q.pop());   // DSA.Queue is empty, returns -1
    }
}
