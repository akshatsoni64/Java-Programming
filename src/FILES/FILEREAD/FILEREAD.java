package FILES.FILEREAD;
import java.io.FileInputStream;

class FILEREAD {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("C://JAVA/FILES/FILECREATE/FILE/file1.txt");
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
            System.out.println("\nReading Complete");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}