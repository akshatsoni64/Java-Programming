import java.util.Scanner;

class N2W {
    public static void convert(int x) {
        switch (x) {
            case 0:
                System.out.print(" Zero");
                break;

            case 1:
                System.out.print(" One");
                break;

            case 2:
                System.out.print(" Two");
                break;

            case 3:
                System.out.print(" Three");
                break;

            case 4:
                System.out.print(" Four");
                break;

            case 5:
                System.out.print(" Five");
                break;

            case 6:
                System.out.print(" Six");
                break;

            case 7:
                System.out.print(" Seven");
                break;

            case 8:
                System.out.print(" Eight");
                break;

            case 9:
                System.out.print(" Nine");
                break;
        }
    }

    public static void main(String[] args) {
        int n, n1, n2 = 0, r = 0;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter Number :");
        n = s1.nextInt();
        n1 = n;
        while (n > 0) {
            r = n % 10;
            n2 = (n2 * 10) + r;
            n = n / 10;
        }
        System.out.println("reverse : " + n2);
        while (n2 > 0) {
            r = n2 % 10;
            convert(r);
            n = (n * 10) + r;
            n2 = n2 / 10;
        }
    }
}