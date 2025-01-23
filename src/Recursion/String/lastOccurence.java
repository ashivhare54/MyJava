package Recursion.String;

public class lastOccurence {
    public static void main(String[] args) {
    String s="bbaacc";
    System.out.println(last('c',s));
    }


    public static int last(char c,String s){
        int lindex=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c)
                lindex=i;
        }
        return lindex;

    }



}
