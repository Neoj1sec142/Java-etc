import javax.swing.JFileChooser;
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
            System.out.println("Is File: " + randomFile.isFile() + "\n");
            System.out.println("Is Hidden: " + randomFile.isHidden() + "\n");
            System.out.println("Last Modified: " + randomFile.lastModified() + "\n");
            System.out.println("Size: " + randomFile.length() + "\n");
            randomFile.renameTo(new File("/Users/neo/Desktop/Java/randomFile.txt"));
            new JavaLesson31();
        }else{
            System.out.println("File doesn't exist");
        }
        if(randomFile.delete()){
            System.out.println("File Already Deleted");
        }
            
        File[] filesInDir = randomDir.listFiles();
        for(File filename : filesInDir){
            System.out.println("Deleting: " + filename + "\n");
            filename.delete();
        }
        
        if(randomDir.delete()){
            System.out.println("Directory Deleted");
        }
        System.exit(0); // Makes porgram exit with no error status (if it gets this far without errors)
    }   
    public JavaLesson31(){
        JFileChooser fileChoose = new JFileChooser(randomDir);
        fileChoose.showOpenDialog(this);
    }
}