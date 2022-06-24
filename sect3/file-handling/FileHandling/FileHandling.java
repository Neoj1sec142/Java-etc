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

//reading a character of a file using java
// import java.io.FileReader;
// import java.io.IOException;

// public class FileHandling{
//     public static void main(String[] args)throws IOException{
//         FileReader file = new FileReader("java.txt");
//         int data = file.read();
//         System.out.print("File data: " + (char) data);
//         file.close();
//     }
// }

// reading all characters of a file with loop
// import java.io.FileReader;
// import java.io.IOException;
// public class FileHandling{
//     public static void main(String[] args)throws IOException{
//         FileReader file = new FileReader("java.txt");
//         int data = file.read();
//         System.out.print("File Data: ");
//         while(data != -1){
//             System.out.print((char) data);
//             data = file.read();
//         }
//         file.close();
//     }
// }

// writing content to an existing file
// import java.io.FileWriter;
// import java.io.IOException;
// public class FileHandling{
//     public static void main(String[] args)throws IOException{
//         String data = "I miss python";
//         FileWriter file = new FileWriter("java.txt", true);
//         file.write(data);
//         System.out.print("Data Written Successfully");
//         file.close();
//     }
// }