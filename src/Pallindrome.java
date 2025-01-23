import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Pallindrome {
    public static void main(String[] args) {
       System.out.println( Pallindrome("1213"));
    }

    public static boolean Pallindrome(String num){
        String s= String.valueOf(num);
         return IntStream.range(0,s.length()/2) // taken the indices of half the number
                .allMatch(i->s.charAt(i)==s.charAt(s.length()-1-i));
    }
}
