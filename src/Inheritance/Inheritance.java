package Inheritance;

public class Inheritance {

    public void show(){
        System.out.println("hi I am parent");
    }
}
 class Child extends Inheritance{
     public void show(){
         System.out.println("hi I am child");
     }
}

class D{
    public static void main(String[] args) {
        Inheritance i=new Inheritance();
        i.show(); //hi I am parent
        Child c=new Child();
        c.show(); //hi I am child
        Inheritance ch=new Child();
        ch.show(); //hi I am child



    }
}
