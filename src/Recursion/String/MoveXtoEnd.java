package Recursion.String;

public class MoveXtoEnd {
    static int index=0;
    static String con="";
    static String y="";
    public static void main(String[] args) {
        String s="abxxcxd";
        move(s,'x',index);
        System.out.println(y+con+"--------");

    }
    public static void move(String s,char c,int index){
        if (index==s.length()) return;
        if(s.charAt(index)==c){
            con+=c;
        }
        else{
            y+=s.charAt(index);
        }
        move(s,c,++index);
    }
}
