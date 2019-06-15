//Java Program to print N Prime Numbers 

import java.util.Scanner;

class Prime2 {
    public static void main(String[] args) {
        int a, i, n;
        int pc = 0;
        int count = 0;
        int c = 1;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Limit :");
        n = s1.nextInt();
        System.out.println(n + " Prime Numbers");
        for (a = 1; a <= n; a++) {
            count = 0;
            for (i = 2; i < n / 2; i++) {
                if (a % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                pc++;
                if (pc <= n) {
                    System.out.println(c + " : " + a);
                    c++;
                } else {
                    return;
                }
            }
        }
    }
}