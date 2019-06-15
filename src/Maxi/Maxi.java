import java.util.Scanner;

class Maxi {
    public static void main(String[] args) {
        int a, b, c;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter A :");
        a = s1.nextInt();
        System.out.println("Enter B :");
        b = s1.nextInt();
        System.out.println("Enter C  :");
        c = s1.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " is max");
        } else if (b > a && b > c) {
            System.out.println(b + " is max");
        } else {
            System.out.println(c + " is max");
        }
    }
}