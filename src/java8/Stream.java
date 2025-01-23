package java8;

import java.util.Arrays;
import java.util.List;

public class Stream {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(1,2,3,4,5);

       List<Integer> list= l.stream().filter((n)->n%2==0).map(n->n*2).toList();

        Function q=()->{return "hi guys";};
        String t= q.test();
        System.out.println(list+" "+t);
    }
}

@FunctionalInterface
 interface Function{
    String test();
}