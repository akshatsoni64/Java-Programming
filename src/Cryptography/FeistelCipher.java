import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class FeistelCipher {
    public static void main(String[] args) throws IOException {

        FeistelCipher feistel = new FeistelCipher();
        ArrayList<Long> keys = new ArrayList();
        String keyString = "Messi10!";
        String tem = "";
        for (int o = 0; o < keyString.length(); o++) {
            tem += Integer.toBinaryString(keyString.charAt(o));
        }
        long key = Long.parseUnsignedLong(tem, 2);
        //  long key = 0x1512323a1712323al;
        String s;
        String str = "";
        BufferedReader br = null;
        BufferedWriter bwE;
        PrintWriter outE = null;
        BufferedWriter bwD;
        PrintWriter outD = null;

        try {
            File encFile = new File("files/encrypt.txt");
            File decFile = new File("files/decrypt.txt");
            if (encFile.exists()) {
                encFile.delete();
                encFile.createNewFile();
            }
            if (decFile.exists()) {
                decFile.delete();
                decFile.createNewFile();
            }
            br = new BufferedReader(new FileReader("files/message.txt"));
            bwE = new BufferedWriter(
                    new FileWriter("files/encrypt.txt", true));
            outE = new PrintWriter(bwE);
            bwD = new BufferedWriter(
                    new FileWriter("files/decrypt.txt", true));
            outD = new PrintWriter(bwD);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String word = "";
        int c = 0;

        do {
            for (int k = 0; k < 8; k++) {
                c = br.read();
                if (c != -1) {
                    word += (char) c;
                }
            }
            if (word.length() != 8) {
                word = String.format("%-8s", word);
            }
            for (int p = 0; p < 8; p++) {
                s = String.format("%8s", Integer.toBinaryString(word.charAt(p))).replace(' ', '0');
                str += s;
            }
            ArrayList<Integer> arr;
            ArrayList<Integer> arr2;
            long val = Long.parseUnsignedLong(str, 2);
            word = "";
            str = "";
            arr = feistel.encrypt(val, key, keys);
            arr2 = feistel.decrypt(key, arr, keys);
            feistel.changeToString(arr, outE);
            feistel.changeToString(arr2, outD);
        } while (c != -1);

        //testing for avalanche effect
        ArrayList<Integer> testArr;
        ArrayList<Integer> testArr2;
        testArr = feistel.encrypt(0x46730l, 0x951Dl, keys);
        System.out.println("using key 0x951Dl: " + String.format("%32s", Integer.toBinaryString(testArr.get(0))).replace(' ', '0') + "" + String.format("%32s", Integer.toBinaryString(testArr.get(1))).replace(' ', '0'));
        testArr = feistel.encrypt(0x46730l, 0x950Dl, keys);
        System.out.println("using key 0x950Dl: " + String.format("%32s", Integer.toBinaryString(testArr.get(0))).replace(' ', '0') + "" + String.format("%32s", Integer.toBinaryString(testArr.get(1))).replace(' ', '0'));

        testArr = feistel.encrypt(0x46730l, 0x123Al, keys);
        System.out.println("using key 0x123A: " + String.format("%32s", Integer.toBinaryString(testArr.get(0))).replace(' ', '0') + "" + String.format("%32s", Integer.toBinaryString(testArr.get(1))).replace(' ', '0'));
        testArr = feistel.encrypt(0x46730l, 0x133Al, keys);
        System.out.println("using key 0x133A: " + String.format("%32s", Integer.toBinaryString(testArr.get(0))).replace(' ', '0') + "" + String.format("%32s", Integer.toBinaryString(testArr.get(1))).replace(' ', '0'));

        testArr = feistel.encrypt(0x46730l, 0xFC28l, keys);
        System.out.println("using key 0xFC28l: " + String.format("%32s", Integer.toBinaryString(testArr.get(0))).replace(' ', '0') + "" + String.format("%32s", Integer.toBinaryString(testArr.get(1))).replace(' ', '0'));
        testArr = feistel.encrypt(0x46730l, 0xFC18l, keys);
        System.out.println("using key 0xFC18l: " + String.format("%32s", Integer.toBinaryString(testArr.get(0))).replace(' ', '0') + "" + String.format("%32s", Integer.toBinaryString(testArr.get(1))).replace(' ', '0'));

        testArr = feistel.encrypt(0x46730l, 0xB1DEl, keys);
        System.out.println("using key 0xBD1El: " + String.format("%32s", Integer.toBinaryString(testArr.get(0))).replace(' ', '0') + "" + String.format("%32s", Integer.toBinaryString(testArr.get(1))).replace(' ', '0'));
        testArr = feistel.encrypt(0x46730l, 0xBD2El, keys);
        System.out.println("using key 0xBD2El: " + String.format("%32s", Integer.toBinaryString(testArr.get(0))).replace(' ', '0') + "" + String.format("%32s", Integer.toBinaryString(testArr.get(1))).replace(' ', '0'));
    }

    int cipherFunction(long key, int rightText) {
        int leftKeyBits = (int) (key >> 32);
        int rightKeyBits = (int) (key & 0x00000000ffffffff);
        int sub = rightText ^ 10;
        int perm = Integer.rotateRight(sub, 2);
        int finalNum = perm ^ rightKeyBits;

        finalNum = (finalNum ^ leftKeyBits);
        String tempor = "";

        tempor = String.format("%32s", Integer.toBinaryString(finalNum)).replace(' ', '0');
        ArrayList<Character> chArr = new ArrayList<>();
        for (int i = 0; i < tempor.length(); i++) {
            chArr.add(tempor.charAt(i));
        }
        tempor = "";
        Collections.shuffle(chArr, new Random(5));
        for (int j = 0; j < chArr.size(); j++) {
            tempor += chArr.get(j);

        }

        finalNum = Integer.parseUnsignedInt(tempor, 2);

        return finalNum;
    }

    int leftXORright(int left, int right) {
        return (left ^ right);
    }

    ArrayList<Integer> splitNum(long num) {
        ArrayList<Integer> nums = new ArrayList<>();
        int leftNum = (int) (num >> 32);
        int rightNum = (int) (num & 0x00000000ffffffff);
        nums.add(leftNum);
        nums.add(rightNum);
        return nums;
    }

    ArrayList<Integer> round(long key, int leftNum, int rightNum) {
        ArrayList<Integer> nums = new ArrayList<>();
        int temp = cipherFunction(key, rightNum);
        int finalRight = leftXORright(temp, leftNum);
        nums.add(rightNum);
        nums.add(finalRight);
        return nums;
    }

    long generateKeys(long key) {
        long newKey = Long.rotateLeft(key, 7);
        newKey = newKey ^ 30;
        String tempor = "";
        // tempor= Integer.toBinaryString(finalNum);
        tempor = String.format("%64s", Long.toBinaryString(newKey)).replace(' ', '0');
        ArrayList<Character> chArr = new ArrayList<>();
        for (int i = 0; i < tempor.length(); i++) {
            chArr.add(tempor.charAt(i));
        }
        tempor = "";
        Collections.shuffle(chArr, new Random(3));
        for (int j = 0; j < chArr.size(); j++) {
            tempor += chArr.get(j);

        }

        newKey = Long.parseUnsignedLong(tempor, 2);

        return newKey;
    }

    ArrayList<Integer> encrypt(long text, long key, ArrayList<Long> keys) {
        ArrayList<Integer> array = splitNum(text);
        int left = array.get(0);
        int right = array.get(1);
        for (int i = 0; i < 8; i++) {
            key = generateKeys(key);
            array = round(key, left, right);
            left = array.get(0);
            right = array.get(1);
            keys.add(key);

        }

        return array;
    }

    ArrayList<Integer> decrypt(long key, ArrayList<Integer> array, ArrayList<Long> keys) {
        ArrayList<Integer> array2 = new ArrayList();
        int left = array.get(1);
        int right = array.get(0);
        array2.add(left);
        array2.add(right);
        for (int j = 7; j >= 0; j--) {
            array2 = round(keys.get(j), left, right);
            left = array2.get(0);
            right = array2.get(1);
            array2.clear();
        }
        array2.add(right);
        array2.add(left);
        return array2;
    }

    void changeToString(ArrayList<Integer> arr2, PrintWriter out) {
        String finalTxt = "";
        String binString = "";
        String txt = String.format("%32s", Integer.toBinaryString(arr2.get(0))).replace(' ', '0') + "" + String.format("%32s", Integer.toBinaryString(arr2.get(1))).replace(' ', '0');
        for (int m = 0; m <= txt.length() - 8; m += 8) {
            for (int n = 0; n < 8; n++) {
                binString += txt.charAt(n + m);
            }
            int i = Integer.parseUnsignedInt(binString, 2);
            char ch = (char) i;
            finalTxt += ch;
            binString = "";
        }
        out.print(finalTxt);
        out.flush();
    }
}



