package Recursion.String;

public class RemoveDuplicates {
    static  boolean [] map=new boolean[26];

    public static void main(String[] args) {
        remove("aabbccdd",0,"");
    }
    public static void remove(String s,int index,String newS){
        if (index==s.length()) {
            System.out.println(newS);
            return;
        }
        char curr=s.charAt(index);
        if(map[curr-'a']){
            remove(s,index+1,newS);
        }else{
            newS+=curr;
            map[curr-'a']=true;
            remove(s,index+1,newS);
        }

    }
}
