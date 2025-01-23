package DSA.Stack;

import java.util.ArrayList;

public class StackWithAL {

 static  class Stack{

       ArrayList<Integer> list = new ArrayList<>();

       public boolean isEmpty(){
           return list.size()==0;
       }

       public void push(Integer i){
           list.add(i);
       }

       public int pop(){ // the top element in Arraylist is the last element
           if(list.isEmpty()) return -1;
           return list.remove(list.size()-1);
       }

       public int peek(){
           if(list.isEmpty()) return -1;
           return list.get(list.size()-1);
       }

   }

    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);        stack.pop(); // 3

        int peek =stack.peek();
        System.out.println(peek); //3

    }
}
