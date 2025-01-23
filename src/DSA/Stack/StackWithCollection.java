package DSA.Stack;

import java.util.Stack;

public class StackWithCollection {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(11);s.push(22);s.push(23);

//        pushAtBottom(s, 44);
//        printStack(s);
        reverseStack(s);
        printStack(s);


    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty())
            return;
        int top=s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }

    public static void pushAtBottom(Stack<Integer> s, int i) {
        if (s.isEmpty()) {
            s.push(i);
            return;
        }
        int top=s.pop();
        pushAtBottom(s,i);
        s.push(top);
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.peek()+"--");
            s.pop();
        }
    }
}