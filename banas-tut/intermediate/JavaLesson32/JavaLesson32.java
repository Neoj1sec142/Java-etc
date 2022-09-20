import java.io.*;


public class JavaLesson32{
    public static void main(String[] args){
        Customer[] customers = getCustomers();
        PrintWriter cusOutput = createFile("/Users/neo/Desktop/customers.txt");
        for(Customer person : customers){
            createCustomers(person, cusOutput);
        }
        cusOutput.close();
        getFileInfo();
    }
    private static class Customer{
        public String firstName, lastName;
        public int custAge;
        public Customer(String firstName, String lastName, int custAge){
            this.firstName = firstName;
            this.lastName = lastName;
            this.custAge = custAge;
        };
    }
    private static Customer[] getCustomers() {
        Customer[] customers = new Customer[5];
        customers[0] = new Customer("John", "Smith", 21);
        customers[1] = new Customer("Sally", "Johnson", 22);
        customers[2] = new Customer("Joe", "Smoe", 24);
        customers[3] = new Customer("Mike", "Love", 21);
        customers[4] = new Customer("Slick", "Nick", 22);
        return customers;
    }
    private static PrintWriter createFile(String fileName){
        try{
            File listofNames = new File(fileName);
            PrintWriter infoToWrite = new PrintWriter(
                new BufferedWriter(
                    new FileWriter(listofNames)));
                return infoToWrite;
        }catch(IOException e){
            System.out.println("An I/o Error Occured!");
            System.exit(0);
        }
        return null;
    }
    private static void createCustomers(Customer customer, PrintWriter cusOutput){
        String custInfo = customer.firstName + " " + customer.lastName + " ";
        custInfo += Integer.toString(customer.custAge);

        cusOutput.println(custInfo);

    }
    private static void getFileInfo(){
        System.out.println("INfo written to file: \n");
        File listOfNames = new File("/Users/neo/Desktop/customers.txt");
        try{
            BufferedReader getInfo = new BufferedReader(
                new FileReader(listOfNames)
            );
            String custInfo = getInfo.readLine();
            while(custInfo != null){
                // System.out.println(custInfo);
                String[] indivCustData = custInfo.split(" ");
                int custAge = Integer.parseInt(indivCustData[2]);
                System.out.print("Customer: " + indivCustData[0] + " is " + custAge + "\n");
                custInfo = getInfo.readLine();
            }
        }catch(FileNotFoundException e){
            System.out.println("Couldn't Find File!");
            System.exit(0);
        }catch(IOException e){
            System.out.println("An I/o Error Occured!");
            System.exit(0);
        }
    }
}