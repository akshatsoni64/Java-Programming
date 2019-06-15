class StaticMain {
    static {
        StaticMain sm1 = new StaticMain();
        sm1.main(new String[2]);
    }

    public void main(String[] args) {
        System.out.println("Hello World");
    }
}