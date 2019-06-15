/*Write a Java Program to perform Arithmeric Operation as per user's choice.
- '+' : Addition
- '-' : Subtraction
- '*' : Multiplication
- '/' : Division
- '%' : Modulo*/

import java.util.Scanner;

class Choice {
    public static void main(String[] args) {
        int s;
        int a, b;
        char c;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter A :");
        a = s1.nextInt();
        System.out.println("Enter B :");
        b = s1.nextInt();
        System.out.println("Enter your choice:");
        c = s1.next().charAt(0);
        switch (c) {
            case '+':
                s = a + b;
                System.out.println("Answer : " + s);
                break;

            case '-':
                s = a - b;
                System.out.println("Answer : " + s);
                break;

            case '*':
                s = a * b;
                System.out.println("Answer : " + s);
                break;

            case '/':
                s = a / b;
                System.out.println("Answer : " + s);
                break;

            case '%':
                s = a % b;
                System.out.println("Answer : " + s);
                break;

        }
    }
}