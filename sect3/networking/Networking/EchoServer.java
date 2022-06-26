// import java.io.IOException;
// import java.io.PrintWriter;
// import java.net.ServerSocket;
// import java.net.Socket;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;

// public class EchoServer{
//     public static void main(String[] args){
//         try{
//             ServerSocket serSock = new ServerSocket(5001);
//             System.out.println("Connecting to client.....");
//             Socket sock = serSock.accept();
//             System.out.println("Successfully connected");
//             InputStreamReader inputStreamReader = new InputStreamReader(sock.getInputStream());
//             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//             PrintWriter printWriter = new PrintWriter(sock.getOutputStream(), true);
//             String input;
//             while((input = bufferedReader.readLine()) != null){
//                 System.out.println("Client:" + input);
//                 printWriter.println(input);
//             }
//             printWriter.close();
//             bufferedReader.close();
//             sock.close();
//             serSock.close();
//         }catch(IOException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }