// import java.io.IOException;
// import java.net.Socket;
// basic tcp handshake
// public class Client{
//     public static void main(String[] args){
//         try{
//             System.out.println("Connecting to server....");
//             Socket sock = new Socket("127.0.0.1", 5001);
//             System.out.println("Connected Successfully");
//             sock.close();
//         }catch(IOException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.io.PrintWriter;
// import java.net.Socket;

// public class Client{
//     public static void main(String[] args){
//         try{
//             System.out.println("Connecting to client....");
//             Socket sock = new Socket("127.0.0.1", 5001);
//             System.out.println("Connected Successfully");
//             InputStreamReader inStRd = new InputStreamReader(sock.getInputStream());
//             BufferedReader read = new BufferedReader(inStRd);
//             PrintWriter wrt = new PrintWriter(sock.getOutputStream(), true);
//             BufferedReader stdRead = new BufferedReader(new InputStreamReader(System.in));
//             System.out.println("Please enter your two values: ");
//             int userInput = stdRead.read();
            
//             int userInput2 = stdRead.read();
//             wrt.print(userInput);
//             wrt.print(userInput2);
//             System.out.println("Server: " + read.readLine());
//             sock.close();
//             read.close();
//             wrt.close();
//         }catch(IOException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }