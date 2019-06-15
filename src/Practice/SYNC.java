package Practice;

class Printing {
    synchronized void printnumber(int n) {
        System.out.println("Start");
        System.out.println("Thread Name : " + Thread.currentThread().getName());
        for (int j = n; j > 0; j--) {

            try {
                if (j == n / 2) {
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
            }
            System.out.println(" " + j);
        }
        System.out.println("End");
    }
}

class ThreadServe implements Runnable {
    int n;
    Printing pt;
    Thread th;

    ThreadServe(Printing p, int x) {
        n = x;
        pt = p;
        th = new Thread(this);
        th.start();
    }

    public void run() {
        pt.printnumber(n);
    }
}

class SYNC {
    public static void main(String[] args) {
        Printing p = new Printing();
        ThreadServe ts1 = new ThreadServe(p, 16);
        //ThreadServe ts2=new ThreadServe(p,8);
        ThreadServe ts3 = new ThreadServe(p, 8);
    }
}