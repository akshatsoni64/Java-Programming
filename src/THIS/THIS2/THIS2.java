class THIS2 {
    public static void main(String[] args) {
        THIS2 t2 = new THIS2();
        t2.display();
    }

    public void display() {
        System.out.println("HELLO");
        this.display1();
    }

    public void display1() {
        System.out.println("WELCOME");
    }
}