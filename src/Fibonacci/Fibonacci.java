import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, c = 0;
        int n;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = S.nextInt();
        System.out.println("Fibonaci Series");
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < n; i++) {
            c = a + b;
            if (c < n) {
                a = b;
                b = c;
                System.out.println(c);
            }
        }
    }
}