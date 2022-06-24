// reading a single byte of data fro file
// import java.io.FileInputStream;
// import java.io.IOException;


// public class FileHandling{
//     public static void main(String[] args)throws IOException{
//         FileInputStream inputStream = new FileInputStream("java.txt");
//         int data = inputStream.read();
//         System.out.println("File Data in Byte Form: " + data);
//         System.out.println("File Data in Readable Form: " + (char) data);
//         inputStream.close();
//     }
// }

//reading all the data from a file with loop
// import java.io.FileInputStream;
// import java.io.IOException;

// public class FileHandling{
//     public static void main(String[] args)throws IOException{
//         FileInputStream ipseam = new FileInputStream("java.txt");
//         int data = ipseam.read();
//         System.out.println("File Data: ");
//         while (data != -1){
//             System.out.print((char) data);
//             data = ipseam.read();
//         }
//         ipseam.close();
//     }
// }

//writing to a file
// import java.io.FileOutputStream;
// import java.io.IOException;

// public class FileHandling{
//     public static void main(String[] args)throws IOException{
//         String newCont = "I miss python";
//         FileOutputStream out = new FileOutputStream("java.txt", true);
//         byte[] array = newCont.getBytes();
//         out.write(array);
//         System.out.println("Data Written Successfully"); 
//         out.close();
//     }
// }