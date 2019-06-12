import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args)
    {
        int[]  a = {10,12,21,34,54,65,76,75,35,8,88,645,33};
        int[]  b = {23,232,333445,654,665,7,7876,98,789,0};
        ArrayList l=new ArrayList();

        l.add("A");
        l.add(Arrays.toString(a));
        l.add(null);
        System.out.println(l);
        l.remove(1);
        l.add(b);
        System.out.println(l);
    }
}
