//Write a java program to demonstrate single inheritance and implement BOX class
package INHERITANCE.INHERITANCE1;
class Box {
    int h, w, d;

    void getvalue(int x, int y, int z) {
        h = x;
        w = y;
        d = z;
    }
}

class Area extends Box {
    int area;

    Area(int x, int y, int z) {
        getvalue(x, y, z);
    }

    void calcarea() {
        area = h * w * d;
    }

    void display() {
        System.out.println("Height : " + h);
        System.out.println("Width : " + w);
        System.out.println("Depth : " + d);
        System.out.println("Area : " + area);
    }
}

class INHERITANCE1 {
    public static void main(String[] args) {
        Area a1 = new Area(2, 4, 6);
        a1.calcarea();
        a1.display();
    }
}