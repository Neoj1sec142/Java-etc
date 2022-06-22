import java.util.Scanner;

public class Bank{
    public static void main(String[] args){
        Scanner scann = new Scanner(System.in);
        System.out.println("Enter account name: ");
        String custName = scann.nextLine();
        System.out.println("Enter customer ID: ");
        String custId = scann.nextLine();
        Account acc = new Account(custName, custId);
        System.out.println("----------------------");
        System.out.println("Welcome " + acc.custName + "!");
        System.out.println("Your Id is: " + acc.custId);
        System.out.println("----------------------");
        System.out.println("Select any option to proceed");
        System.out.println();
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous Transaction");
        System.out.println("E. Interest");
        System.out.println("F. Exit");
        char option;
        boolean flag = true;
        while(flag){
            System.out.println("Enter your choice:");
            option = scann.next().charAt(0);
            switch(option){
                case 'A':
                    System.out.println("Account balance = $" + acc.balance);
                    break;
                case 'B':
                    System.out.println("Enter an ammount to deposit: ");
                    int depositAmount = scann.nextInt();
                    acc.deposit(depositAmount);
                    break;
                case 'C':
                    System.out.println("Enter amount to withdraw: ");
                    int withAmt = scann.nextInt();
                    acc.withdraw(withAmt);
                    break;
                case 'D':
                    acc.getPrevTrans();
                    break;
                case 'E':
                    System.out.println("Enter the years for which you wish to calculate interest: ");
                    int years = scann.nextInt();
                    acc.calculateInterest(years);
                    break;
                case 'F':
                    System.out.println("Thank you for banking with us!");
                    scann.close();
                    flag = false;
                    break;
                default: System.out.println("Err Invalid Option A, B, C, D, E, or F please");
            }
        }
    }
}