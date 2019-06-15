//Write a java program to demonstrate abstract class and implement SHAPE class and calculate area of different shapes
abstract class SUPERABSTRACT {
    int a, b, c;

    abstract double area();
}

class TRIANGLE extends SUPERABSTRACT {
    int h, a;

    TRIANGLE(int x, int y) {
        h = x;
        a = y;
    }

    double area() {
        return (0.5 * h * a);
    }
}

class RECTANGLE extends SUPERABSTRACT {
    int l, b, h;

    RECTANGLE(int x, int y, int z) {
        l = x;
        b = y;
        h = z;
    }

    double area() {
        return (l * b * h);
    }
}

class SQUARE extends SUPERABSTRACT {
    int S;

    SQUARE(int x) {
        S = x;
    }

    double area() {
        return (S * S);
    }
}

class ABSTRACT {
    public static void main(String[] args) {
        TRIANGLE t1 = new TRIANGLE(2, 4);
        RECTANGLE r1 = new RECTANGLE(2, 3, 4);
        SQUARE s1 = new SQUARE(2);
        System.out.println("Area of Square : " + s1.area());
        System.out.println("Area of Rectangle : " + r1.area());
        System.out.println("Area of Triangle : " + t1.area());
    }
}