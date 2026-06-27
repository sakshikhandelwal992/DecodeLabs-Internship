import java.util.Scanner;
//BankAccount class 
class BankAccount{
    private double balance;  // Encapsulation

    public BankAccount(double initialBalance){   // Constructor for BankAccount class 
        this.balance = initialBalance;
    }
//DEPOSIT FUNCTION
    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Invalid Amount Sakshi! Deposit Amount should be Greater than 0");
            return;
        }
        balance += amount;   // if it is a valid amount
        System.out.printf(" ₹%.2f Deposited Successfully sakshi .%n", amount);
        System.out.println();
    }
//WITHDRAWN FUNCTION 
    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("Invalid Amount Sakshi! Withdrawn Amount should be Greater than 0");
            return;
        }
        if(amount > balance){
            System.out.println("Insufficient Balance sakshi");
            return;
        }
        balance -= amount;
        System.out.printf("₹%.2f WithDrawn Successfully sakshi .%n", amount);
        System.out.println();
    } 
// CHECKING BALANCE
    public Double getBalance(){
        return balance;
    }    
}

//ATM CLASS 
class ATM{
    private BankAccount account; // every ATM object will be connected to one BankAccount object
    private Scanner sc;  // sc is object because it will ask amount , deposit..and many more

    public ATM(BankAccount account){    // constructor
        this.account = account;
        sc = new Scanner(System.in);  // for taking input
    }
    public void start(){
        int choice;  // what we want to do->deposit/withdraw etc..

    do{
        System.out.println("************ATM MENU **************");
        System.out.println("1. DEPOSIT MONEY");
        System.out.println("2. WITHDRAW MONEY");
        System.out.println("3. CHECK BALANCE");
        System.out.println("4. EXIT");
        System.out.println("*************************************");

        choice = getChoice();
        switch(choice){
            case 1:
                double depositAmount = getAmount("Enter amount to deposit :");
                account.deposit(depositAmount);
                break;

            case 2:
                double withdrawAmount = getAmount("Enter amount to Withdraw :");
                account.withdraw(withdrawAmount);  
                break;
                
            case 3:
                System.out.printf("Current Balance is %.2f%n", account.getBalance());
                break;
                
            case 4:
                System.out.println("Thank yoy for using The ATM!"); 
                break;
                
            default:
                System.out.println("Invalid choice! Enter choice in B/t 1-4");    
        }

    }while(choice!=4);
    sc.close();  // free to buffer memory

    }
    //to take choice function
    private int getChoice(){
        while(true){
            try{
                System.out.println("Enter your choice");
                return Integer.parseInt(sc.nextLine());  // to avoid beffer problem
            }catch(NumberFormatException e){  //ex.-"abc" , -987
                System.out.println("Invalid input! please Enter An Integer.");
            }
        }
    }
    //to take amount function
    private double getAmount(String message){
        while(true){
            try{
                System.out.println(message);
                double amount = Double.parseDouble(sc.nextLine());

                if(amount <=0){
                    System.out.println("Inavlid! Amount must be greater than 0");
                    continue;
                }
                return amount;
            }catch(NumberFormatException e){
                System.out.println("Invalid input! Enter a valid Amount.");
            }
        }
    }
}

public class ATM_Interface{
    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000.00);
        ATM atm = new ATM(account);

        atm.start();
    }
}