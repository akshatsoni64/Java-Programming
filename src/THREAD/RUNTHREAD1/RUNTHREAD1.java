class MyRUNTHREAD1 implements Runnable {
    Thread t1;
    String s1 = null;

    MyRUNTHREAD1(String s) {
        s1 = s;
        t1 = new Thread(this);
        t1.start();
    }

    public void run() {
        System.out.println(s1);
    }
}

class RUNTHREAD1 {
    public static void main(String[] args) {
        MyRUNTHREAD1 mt1 = new MyRUNTHREAD1("Thread 1");
    }
}
