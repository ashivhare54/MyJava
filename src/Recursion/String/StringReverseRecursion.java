package Recursion.String;

public class StringReverseRecursion {
    public static void main(String[] args) {
        String x="abcd";
        reverse(x,x.length()-1);
    }

    public static void reverse(String x, int l){
        if(l==-1)return;
        System.out.print(x.charAt(l));
        reverse(x,l-1);

    }
}
