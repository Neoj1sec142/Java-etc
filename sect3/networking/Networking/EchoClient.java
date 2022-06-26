// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.io.PrintWriter;
// import java.net.Socket;
// import java.util.Scanner;

// public class EchoClient{
//     public static void main(String[] args){
//         try{
//             System.out.println("Connecting to server....");
//             Socket sock = new Socket("127.0.0.1", 5001);
//             System.out.println("Connected Successfully");
//             InputStreamReader inputStreamReader = new InputStreamReader(sock.getInputStream());
//             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//             PrintWriter printWriter = new PrintWriter(sock.getOutputStream(), true);
//             Scanner scan = new Scanner(System.in);
//             BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
//             String userInput;
//             System.out.println("Type message: ");
//             while((userInput = stdReader.readLine()) != null){
//                 printWriter.println(userInput);
//                 System.out.println("Server: " + bufferedReader.readLine());
//             }
//             sock.close();
//             scan.close();
//             bufferedReader.close();
//             printWriter.close();
//         }catch(IOException e){
//             System.out.println(e.getMessage());
//         }
//     }
// }
