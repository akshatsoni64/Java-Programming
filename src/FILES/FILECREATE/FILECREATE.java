package FILES.FILECREATE;
import java.io.File;

class FILECREATE {
    public static void main(String[] args) {
        File f = null;
        boolean bool = false;

        f = new File("C://JAVA/FILES/FILECREATE/FILE/file1.txt");

        try {
            bool = f.createNewFile();
        } catch (Exception e) {
        }
        if (bool == false) {
            f.delete();
            System.out.println("File Creation Failed!");
            System.out.println("Retrying......");
            try {
                bool = f.createNewFile();
            } catch (Exception e) {
            }
        }
        System.out.println("File Created : " + bool);
    }
}