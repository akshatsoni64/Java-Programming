class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
            if (i % 2 == 1) {
                System.out.println();
                continue;
            }
            System.out.print(" ");
        }
    }
}