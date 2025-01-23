package Thread;

public class MyThread extends Thread{
    public void run(){
        System.out.println("thread is running");
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("thread running with runnable");
    }
}
class Test{
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
        t.run();

// pasasing runnable instance to Thread class
        MyRunnable r=new MyRunnable();
        Thread t2=new Thread(r);
        r.run();
// using java 8

        Thread t3 =new Thread(()->{System.out.println("my thread is running");} );
        t3.start();
    }
}
