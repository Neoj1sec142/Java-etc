import javax.swing.JFrame;
import java.io.*;
public class JavaLesson31 extends JFrame{
    static String filePath, parentDirectory;
    static File randomDir, randomFile, randomFile2;

    public static void main(String[] args){
        randomDir = new File("/Users/neo/Desktop/Java");
        randomDir.mkdir();
        randomFile = new File("/Users/neo/Desktop/Java/random.txt");
        randomFile2 = new File("/Users/neo/Desktop/Java/random2.txt");
        try{
            randomFile.createNewFile();
            randomFile2.createNewFile();
            filePath = randomFile.getCanonicalPath();
        }catch(IOException e){
            e.printStackTrace();
        }
        if(randomFile.exists()){
            System.out.println("File Exists");
            System.out.println("File Readable: " + randomFile.canRead());
            System.out.println("File Writable: " + randomFile.canWrite());
            System.out.println("File Location: " + filePath);
            System.out.println("File name: " + randomFile.getName());
            parentDirectory = randomFile2.getParent();
            System.out.println("Parent Dir: " + parentDirectory);
            System.out.println("Is Dir: " + randomFile.isDirectory());
            String[] fileInDir = randomDir.list();
            System.out.println("File in Directory: \n");
            for(String fileName : fileInDir){
                System.out.println(fileName + "\n");
            }
        }
    }
}