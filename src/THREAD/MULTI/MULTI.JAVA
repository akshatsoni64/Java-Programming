class MyMULTI implements Runnable {
    Thread t;
    String s1;

    MyMULTI(String s) {
        s1 = s;

        t = new Thread(this);

        t.start();
    }

    synchronized public void run() {
        int i = 0;
        while (i < 3) {
            System.out.println("\n" + s1 + " : " + (i++));
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }
    }
}

class MULTI {
    public static void main(String[] args) {
        MyMULTI mt1 = new MyMULTI("Thread1");
        MyMULTI mt2 = new MyMULTI("Thread2");
    }
}