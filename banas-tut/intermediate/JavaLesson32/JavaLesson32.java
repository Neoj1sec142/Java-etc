import java.io.*;


public class JavaLesson32{
    public static void main(String[] args){
        Customer[] customers = getCustomers();
    }
    private static class Customer{
        public String firstName, lastName;
        public int custAge;
        public Customer(String firstName, String lastName, int custAge){
            this.firstName = firstName;
            this.lastName = lastName;
            this.custAge = custAge;
        }
    }
    private static Customer[] getCustomers() {
        Customer[] customers = new Customer[5];
        customers[0] = new Customer("John", "Smith", 21);
        customers[1] = new Customer("Sally", "Johnson", 22);
        customers[2] = new Customer("Joe", "Smoe", 24);
        customers[3] = new Customer("Mike", "Love", 21);
        customers[4] = new Customer("Slick", "Nick", 22);
    }
}