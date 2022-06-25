import java.io.IOException;
import java.net.Socket;

public class Client{
    public static void main(String[] args){
        try{
            System.out.println("Connecting to server....");
            Socket sock = new Socket("127.0.0.1", 5000);
            System.out.println("Connected Successfully");
            sock.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}