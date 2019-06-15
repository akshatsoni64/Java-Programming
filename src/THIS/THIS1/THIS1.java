class THIS1 {
    int a = 10;

    public static void main(String[] args) {
        THIS1 t1 = new THIS1();
        t1.display();
        System.out.println(t1);
    }

    public void display() {
        System.out.println(this.a);
    }
}