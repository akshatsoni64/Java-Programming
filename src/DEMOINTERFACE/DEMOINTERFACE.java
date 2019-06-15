//Write a java program to implement BOX class and calculate area and use multiple inheritance

import java.util.Scanner;

interface BOXAR {
    int h = 0, w = 0, d = 0;

    void calcarea();
}

interface AREA {
    double area = 0;

    void display();
}

interface BOXAREA extends BOXAR, AREA {
}

class DEMOINTERF implements BOXAR {
    int h, w, d;
    double area;

    DEMOINTERF(int x, int y, int z) {
        h = x;
        w = y;
        d = z;
    }

    public static void main(String[] args) {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Height:");
        a = s.nextInt();
        System.out.print("Enter Width:");
        b = s.nextInt();
        System.out.print("Enter Depth:");
        c = s.nextInt();
        DEMOINTERF di1 = new DEMOINTERF(a, b, c);
        di1.calcarea();
        di1.display();
    }

    public void calcarea() {
        area = h * w * d;
    }

    public void display() {
        System.out.println("Area of Box : " + area);
    }
}