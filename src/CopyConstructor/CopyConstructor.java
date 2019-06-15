import java.util.Scanner;

class CopyConstructor {
    int a, b;

    CopyConstructor() {
        System.out.println("This is default constructor");
        System.out.println("Blank Object Created");
    }

    CopyConstructor(int x, int y) {
        System.out.println("This is parameterised constructor");
        a = x;
        b = y;
    }

    CopyConstructor(CopyConstructor x) {
        System.out.println("This is copy constructor");
        a = x.a;
        b = x.b;
    }
}

class CC {
    public static void main(String[] args) {
        int p, q;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter 2 Numbers : ");
        p = s1.nextInt();
        q = s1.nextInt();

        CopyConstructor cc1 = new CopyConstructor();
        CopyConstructor cc2 = new CopyConstructor(p, q);
        CopyConstructor cc3 = new CopyConstructor(cc2);
        System.out.println(cc3.a);
        System.out.println(cc3.b);
    }
}