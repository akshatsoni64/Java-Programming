final class FINALCLASS {
    static int a = 12;

    FINALCLASS(int x) {
        a = x;
    }

    static void display() {
        System.out.println("A : " + a);
    }
}

class FC extends FINALCLASS {
    public static void main(String[] args) {
        display();
    }
}