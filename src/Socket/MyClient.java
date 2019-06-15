package Socket;

import java.io.DataOutputStream;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);
            /*DataInputStream dis=new DataInputStream(s.getInputStream());
            String	str=(String)dis.readUTF();*/
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("New Message from client");
            System.out.println("Message Sent");
            //System.out.println(str);
            dout.flush();
            dout.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}