class THIS4 {
    int a;
    String name;

    public static void main(String[] args) {
        THIS4 t4 = new THIS4();
        t4.display(20, "COMP");
    }

    public void display(int x, String s) {
        this.a = x;
        this.name = s;
        System.out.println(this.a);
        System.out.println(this.name);
    }
}