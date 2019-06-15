//Write a java program to demonstrate multilevel inheritance and implement BOX class
package INHERITANCE.INHERITANCE2;
class Box {
    int h, w, d;

    void getvalue(int x, int y, int z) {
        h = x;
        w = y;
        d = z;
    }
}

class CalcArea extends Box {
    int area;

    void calcarea() {
        area = h * w * d;
    }
}

class Area extends CalcArea {
    Area(int x, int y, int z) {
        getvalue(x, y, z);
    }

    void display() {
        System.out.println("Area : " + area);
    }
}

class INHERITANCE2 {
    public static void main(String[] args) {
        Area a1 = new Area(2, 4, 6);
        a1.calcarea();
        a1.display();
    }
}