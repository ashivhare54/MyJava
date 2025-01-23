package java8;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
       Predicate<String> checkLength= s-> s.length()>=90;
       System.out.println("result= "+checkLength.test("bhaskar"));
    }
}
