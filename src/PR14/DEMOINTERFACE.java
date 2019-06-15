//Write a java program to implement BOX class and calculate area and use multiple inheritance

import java.util.Scanner;

interface P1 {
    int a = 10;

    void display1();
}

interface P2 {
    int b = 20;

    void display2();
}

interface P12 extends P1, P2 {
}

class DEMOINTERFACE implements P12 {
    int a, b;

    DEMOINTERFACE(int x, int y) {
        a = x;
        b = y;
    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Two Numbers :");
        a = s.nextInt();
        b = s.nextInt();
        DEMOINTERFACE di1 = new DEMOINTERFACE(a, b);
        di1.display1();
        di1.display2();
    }

    public void display1() {
        System.out.println("A : " + a);
    }

    public void display2() {
        System.out.println("B : " + b);
    }
}