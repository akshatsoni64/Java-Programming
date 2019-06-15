//Java Program to print Prime Numbers between 1 to 100
class Prime {
    public static void main(String[] args) {
        int a, i;
        int count = 0;
        System.out.println("Prime Numbers between 1 to 100");
        for (a = 1; a <= 100; a++) {
            count = 0;
            for (i = 2; i < a; i++) {
                if (a % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(a);
            }
        }
    }
}
