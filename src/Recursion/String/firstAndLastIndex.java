package Recursion.String;

public class firstAndLastIndex {
    static int first=-1,last=-1;

    public static void main(String[] args) {
        firstAndLastIndex('b',"aabaabcb");
        firstAndLastIndexRecursion('b',0,"aabaabcb");
        System.out.println(first+"--"+last);

    }

    public static void firstAndLastIndexRecursion(char c,int index,String s){
       if (index==s.length()) return;
        if(s.charAt(index)==c){
            if(first==-1) first=index;
            else last=index;
        }
    firstAndLastIndexRecursion(c,++index,s);
    }


    public static void firstAndLastIndex(char c,String s){
        int firstIndex=-1;int lastIndex=-1;
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                if(firstIndex==-1) {System.out.println("First index of "+c+" is "+(firstIndex=i));}
                lastIndex=i;
            }
        }System.out.println("last index of "+c+" is "+(lastIndex));

    }
}
