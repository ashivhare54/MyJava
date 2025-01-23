import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

public class CountWords {
    public static void main(String[] args) {
       System.out.println( countWords("I love India"));
    }

    public static long countWords(String s){
return Arrays.stream(s.split(" ")).count();
    }
}
