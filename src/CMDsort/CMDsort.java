//Program to convert Sort command line arguements :
class CMDsort {
    public static void main(String[] args) {
        int[] a;
        int temp;
        int sum;
        a = new int[10];
        for (int i = 0; i < 10; i++) {
            Integer in = new Integer(args[i]);
            a[i] = in.intValue();
        }

        temp = a[0];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("\nSorted Array :");
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }
}