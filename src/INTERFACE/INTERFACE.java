interface printable {
    void print();

    void display();
}

interface A6if extends printable {
    void calldisplay();
}

class A66 implements A6if {
    public void print() {
        System.out.println("Hello");
    }

    public void calldisplay() {
        display();
    }

    public void display() {
        System.out.println("This is example of interface");
    }
}

class INTERFACE {
    public static void main(String[] args) {
        A66 obj = new A66();
        obj.calldisplay();
        obj.print();
    }
}