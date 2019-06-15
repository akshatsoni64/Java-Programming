class Exception {
    public static void main(String[] args) {
        try {
            try {
                int[] a = {'1', '2', '3'};
                a[30] = 4;
            } catch (ArrayIndexOutOfBoundsException a1) {
                System.out.println("Index of Array is Out of Bound");
                System.out.println("Index : " + a1.getMessage());
            }
            int[] a = {'1', '2', '3'};
            int x, y = 0;
            x = 20 / y;
            a[30] = 4;
        } catch (ArrayIndexOutOfBoundsException a1) {
            System.out.println("Index of Array is Out of Bound");
            System.out.println("Index : " + a1.getMessage());
        } catch (ArithmeticException a1) {
            System.out.println("Divide by Zero Exception");
        }
    }
}