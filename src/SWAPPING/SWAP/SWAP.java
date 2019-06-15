import java.util.Scanner;

class SWAP {
    int a, b;

    void swap(SWAP x) {
        int c;
        c = x.a;
        a = x.b;
        b = c;
    }

    void display() {
        System.out.println("A : " + a);
        System.out.println("B : " + b);
    }
}

class SWAPPING {
    public static void main(String[] args) {
        int x, y;
        Scanner s = new Scanner(System.in);
        SWAP s1 = new SWAP();
        SWAP s2 = new SWAP();
        System.out.println("Enter 2 Numbers : ");
        x = s.nextInt();
        y = s.nextInt();
        s1.a = x;
        s1.b = y;
        System.out.println("Before SWAP : ");
        s1.display();
        System.out.println("SWAPPING......");
        s2.swap(s1);
        System.out.println("After SWAP : ");
        s2.display();
    }
}