package Recursion;

public class Recursion {
    static int sum=0;
    static int factorial=1;
    public static void main(String[] args) {
        int n=5; int l=10;
//        printNo(n);
//        printSum(n,l);
//        System.out.println(sum(n,l));
//        printfactorial(n);
//       System.out.println(factorial(n));
//        fibonacci(0,1,20);
//        fibonacci2(0,1,7); // l= nth term
        printXtoNtimes(5,3);
    }

    public static void printXtoNtimes(int x,int n){
       if(n==0) return;
       System.out.print(x+" ");
       printXtoNtimes( x*x,n-1);
    }


    //-----------------------------------------------------------------
    public static void fibonacci2(int a,int b,int l){
        if(l==0) return;
       System.out.print(a+" ");
       fibonacci2(b,a+b,l-1);
    }
//-----------------------------------------------------------------
    public static int fibonacci(int a,int b,int l){
        int c;
        if ((a+b)>=l)
            return a+b;
       System.out.print("-"+ (c=a+b));
        a=b;b=c;
     return  fibonacci(a,b,l);

    }

    //-----------------------------------------------
    public static int factorial(int n){
        if (n==0) return 1;
        return n* factorial(n-1);
    }
    //-----------------------------------------------
    public static void printfactorial(int n){
        if(n==0){
            System.out.print(factorial);
            return;
        }
        factorial*=n;
        printfactorial(n-1);
    }
//-----------------------------------------------
    public static int sum(int n,int l){
        if (n==l) return sum+n;
        sum+=n;
       return sum(++n,l);
    }
    //-----------------------------------------------
    public static void printSum(int n,int l){
        if(n==l){
            System.out.println(sum);
            return;
        }
        sum=sum+n;
        printSum(++n,l);
    }
//-----------------------------------------------
    public static void printNo(int n){
        if(n<0)
            return;
        System.out.println(n);
        printNo(n-1);
    }
}
