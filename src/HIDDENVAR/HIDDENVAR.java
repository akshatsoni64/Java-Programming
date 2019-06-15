//Write a java program to access hidden variable using super keyword 
class A1 {
    static int x = 5;
}

class HIDDENVAR extends A1 {
    int x = 10;

    public static void main(String[] args) {
        HIDDENVAR hv1 = new HIDDENVAR();
        hv1.display();
    }

    void display() {
        System.out.println("Local X : " + x);
        System.out.println("Global X : " + A1.x);
    }
}