import java.util.Scanner;
public class bank {
    String name;
    String address;
    int accountNumber;
    double balance; 

static int baseaccountno=100000001;
    bank(String name, String address, double balance) {
        this.name = name;
        this.address = address;
        this.balance = balance;
        this.accountNumber = ++baseaccountno;
    }
 void display(){
    System.out.println("---------------------------");
   System.out.println("Name"+ name);
   System.out.println("Address"+address);
   System.out.println("account no"+ accountNumber);
   System.out.println("balance"+balance);
    System.out.println("---------------------------");

 }

 void deposit(double amount){
balance+=amount;
System.out.println("Balance Deposited");
 }

   void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void changeaddress(){
    address=new address;
    

    }



    
}

