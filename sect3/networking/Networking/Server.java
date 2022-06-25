import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
    public static void main(String[] args){
        try{
            ServerSocket serSock = new ServerSocket(5000);
            System.out.println("Connecting to Client...");
            Socket sock = serSock.accept();
            System.out.println("Connection Successful");
            sock.close();
            serSock.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}