package Practice;

class MyThread extends Thread{
    public void run(){
        System.out.println("My Thread");
    }
}
public class MyRunnable {
    public static void main(String args[]) {
        MyThread mt = new MyThread();
        mt.start();

        Thread t = new Thread(new TheRunnable());
        t.start();

        ThreadDemo td=new ThreadDemo();
        td.start();
    }
}

class TheRunnable implements Runnable{
    public void run(){
        System.out.println("My Runnable");
    }
}

class ThreadDemo extends Thread{
    public void start(){
        System.out.println("OverRiding Start Method \n Now calling Run Method");
        run();
    }

    public void run(){
        System.out.println("OverRiding Run Method");
    }
}
