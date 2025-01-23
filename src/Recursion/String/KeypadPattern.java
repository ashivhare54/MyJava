package Recursion.String;

public class KeypadPattern {
    static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args) {
    keypad("2",0,"");
    }
    public static void keypad(String s,int index,String combination){
        if(index==s.length()){
            System.out.println(combination);
            return;}

        char curr=s.charAt(index);
        String mapping=keypad[curr-'0'];

        for(int i=0;i<mapping.length();i++){
            keypad(s,index+1,combination+mapping.charAt(i));
        }
    }
}
