package Practice;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferDemo {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("java.txt"));
            bw.write(65);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
