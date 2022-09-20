import java.io.*;

public class JavaLesson33{
    static File randomDir;
    public static void main(String[] args){
        Customer[] customers = getCustomers();
        randomDir = new File("/Users/neo/Desktop/Java");
        randomDir.mkdir();
        DataOutputStream custOutput = createFile("/Users/neo/Desktop/Java/workspace.dat");
        for(Customer person : customers){
            createCustomers(person, custOutput);
        }
        try{
            custOutput.close();
        }catch(IOException e){
            System.out.println("I/o Error Occured! #1");
            System.exit(0);
        }
        getFileInfo();
    }
    private static class Customer{
        public String custName;
        public int custAge;
        public double custDebit;
        public boolean oweMoney;
        public char custSex;
        public Customer(String custName, int custAge, double custDebit, boolean oweMoney, char custSex){
            this.custName = custName;
            this.custAge = custAge;
            this.custDebit = custDebit;
            this.oweMoney = oweMoney;
            this.custSex = custSex;
        }
    }
    private static Customer[] getCustomers(){
        Customer[] customers = new Customer[5];
        customers[0] = new Customer("John Smith", 21, 1200.25, true, 'M');
        customers[1] = new Customer("Sally Johnson", 22, 200.50, true, 'M');
        customers[2] = new Customer("Joe Smoe", 24, 12.00, true, 'M');
        customers[3] = new Customer("Mike Love", 21, 102.10, true, 'M');
        customers[4] = new Customer("Slick Nick", 22, 120.00, true, 'M');
        return customers;
    }
    private static DataOutputStream createFile(String fileName){
        try{
            System.out.println("Hey 1");
            File listOfNames = new File(fileName);
            System.out.println("Hey 2");
            DataOutputStream infoToWrite = new DataOutputStream(
                new BufferedOutputStream( new FileOutputStream(listOfNames)));
                // System.out.println("Hey 3");
                return infoToWrite;
        }
        catch(IOException e){
            System.out.println("I/o Error Occured! #2");
            System.exit(0);
        }
        return null;
    }
    private static void createCustomers(Customer customer, DataOutputStream custOutput){
        try{
            custOutput.writeUTF(customer.custName);
            custOutput.writeInt(customer.custAge);
            custOutput.writeDouble(customer.custDebit);
            custOutput.writeBoolean(customer.oweMoney);
            custOutput.writeChar(customer.custSex);
            // Other Byte Formating options:
            // writeByte, writeFloat, writeLong, writeShort
        }catch(IOException e){
            System.out.println("I/o Error Occured! #3");
            System.exit(0);
        }
    }
    private static void getFileInfo(){
        System.out.println("Info Written to File");
        File listOfNames = new File("/Users/neo/Desktop/Java/workspace.dat");
        boolean eof = false;
        try{
            DataInputStream getInfo = new DataInputStream(
                new BufferedInputStream(
                    new FileInputStream(listOfNames)));
            while(!eof){
                String custName = getInfo.readUTF();
                int custAge = getInfo.readInt();
                double custDebit = getInfo.readDouble();
                boolean oweMoney = getInfo.readBoolean();
                char custSex = getInfo.readChar();
                System.out.println(custName);
                System.out.println(custAge);
                System.out.println(custDebit);
                System.out.println(oweMoney);
                System.out.println(custSex);
            }
        }catch(EOFException e){
            eof = true;
        }catch(FileNotFoundException e){
            System.out.println("File Not Found!");
            System.exit(0);
        }catch(IOException e){
            System.out.println("I/o Error Occured! #4");
            System.exit(0);
        }
    }
}