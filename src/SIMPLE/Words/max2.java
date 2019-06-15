import java.util.Scanner;

class max {
    public static void main(String[] args) {
        int n, i, j, temp;
        Scanner s1 = new Scanner(System.in);
        System.out.println("enter number");
        n = s1.nextInt();
        int[] a = new int[n];
        System.out.println("enter element");
        for (i = 0; i < n; i++) {
            a[i] = s1.nextInt();
        }
        temp = a[0];
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("largest two number=" + a[0] + "and" + a[1]);
    }
}