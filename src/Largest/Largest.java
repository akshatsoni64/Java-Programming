//Program to find Largest Number

import java.util.Scanner;

class Largest {
    public static void main(String[] args) {
        int[] a;
        int temp;
        a = new int[10];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter 10 Numbers :");
        for (int i = 0; i < 10; i++) {
            a[i] = s1.nextInt();
        }
        temp = a[0];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Largest Number :" + a[0]);
    }
}