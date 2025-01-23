package Exception;

public class Exceptions {
    static int a =24;

   public static void test() {
       try {
           a = a / 0;
       }
       finally{
           System.out.println("finally block");
       }
   }
    public static void main(String []args){
    test();
    }
}
