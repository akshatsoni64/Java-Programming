//Program to add command line arguements :
class CLAadd {
    public static void main(String[] args) {
        int[] a;
        int sum = 0;
        a = new int[10];
        for (int i = 0; i < 10; i++) {
            Integer in = new Integer(args[i]);
            a[i] = in.intValue();
            sum = sum + a[i];
        }

        System.out.println("\nSum :" + sum);
    }
}