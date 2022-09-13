// import java.io.IOException;
// import java.net.ServerSocket;
// import java.net.Socket;
// basic tcp handshake
// public class Server{
//     public static void main(String[] args){
//         try{
//             ServerSocket serSock = new ServerSocket(5001);
//             System.out.println("Connecting to Client...");
//             Socket sock = serSock.accept();
//             System.out.println("Connection Successful");
//             sock.close();
//             serSock.close();
//         }catch(IOException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }

// import java.io.IOException;
// import java.io.PrintWriter;
// import java.net.ServerSocket;
// import java.net.Socket;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// //having a server that will accept the clients name and greet them
// public class Server{
//     public static void main(String[] args){
//         try{
//             ServerSocket serSock = new ServerSocket(5001);
//             System.out.println("Connecting to client....");
//             Socket sock = serSock.accept();
//             System.out.println("Successfully Connected");
//             InputStreamReader inStRd = new InputStreamReader(sock.getInputStream());
//             BufferedReader read = new BufferedReader(inStRd);
//             PrintWriter wrt = new PrintWriter(sock.getOutputStream(), true);
//             String input = read.readLine();
//             System.out.println("Client: " + input);
//             wrt.println("HEllo " + input);
//             wrt.close();
//             read.close();
//             sock.close();
//             serSock.close();
//         }catch(IOException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }


// import java.io.IOException;
// import java.io.PrintWriter;
// import java.net.ServerSocket;
// import java.net.Socket;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// //having a server that will accept the clients input and add challange ?????
// public class Server{
//     public static void main(String[] args){
//         try{
//             ServerSocket serSock = new ServerSocket(5001);
//             System.out.println("Connecting to client....");
//             Socket sock = serSock.accept();
//             System.out.println("Successfully Connected");
//             InputStreamReader inStRd = new InputStreamReader(sock.getInputStream());
//             BufferedReader read = new BufferedReader(inStRd);
//             PrintWriter wrt = new PrintWriter(sock.getOutputStream(), true);
//             int input, input2;
//             input = read.read();
//             input2 = read.read();
//             System.out.println("Addition is: " + (input + input2));
//             wrt.println("Addition is " + input);
//             wrt.close();
//             read.close();
//             sock.close();
//             serSock.close();
//         }catch(IOException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }