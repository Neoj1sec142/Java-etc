public class Account{
    String custName;
    String custId;
    int balance = 0;
    int prevTrans = 0;
    Account(String custName, String custId){
        this.custName = custName;
        this.custId = custId;
    }
    void deposit(int amt){
        if(amt > 0){
            balance = balance + amt;
            prevTrans = amt;
            System.out.println("Deposited Successfully");
            System.out.println("New Balance: " + balance);
        }else{
            System.out.println("Please enter a number greater than zero");
        }
    }
    void withdraw(int amt){
        if(amt < balance){
            if(amt > 0){
                balance = balance - amt;
                prevTrans = -amt;
                System.out.println("Withdrawl Successful");
                System.out.println("New Balance: " + balance);
            }else{
                System.out.println("Please enter amount greater than 0");
            }
        }else{
            System.out.println("Insufficient funds, Cannot Withdraw");
        }
    }
    void getPrevTrans(){
        if(prevTrans > 0){
            System.out.println("Deposited: " + prevTrans);
        }else if(prevTrans < 0){
            System.out.println("Withdrawn: " + prevTrans);
        }else{
            System.out.println("No transactions available yet");
        }
    }
    void calculateInterest(int years){
        double interestrate = .0185;
        double newBalance = (balance * interestrate * years) + balance;
        System.out.println("the current interest rate is: " + (100 * interestrate) + "%");
        System.out.println("After " + years + " years, your balance will be: " + newBalance);
    }
}