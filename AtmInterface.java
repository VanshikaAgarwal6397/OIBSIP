import java.util.Scanner;
class AtmI{
    int balance=1000;
    int withdraw;
    int deposit;
    int transfer;
        int Deposit(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter amount to deposit");
            int a=sc.nextInt();
            System.out.format("$%d amount is deposited in your account successfully",a);
            balance=balance+a;
            this.deposit=a;
            return balance;
        }
        int Withdraw(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter amount to be withdrawn");
            int d=sc.nextInt();
            if(balance>=d){
            System.out.format("$%d amount is withdrawn. PLease collect your amount",d);
            balance=balance-d;
            this.withdraw=d;
            }
            else{
                System.out.println("Insufficient Balance");
            }
            return balance;
        }
        int Transfer(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter amount to be transferred");
            int n=sc.nextInt();
            if(balance>=n){
            System.out.format("$%d amount is transferred successfully",n);
            balance=balance-n;
            this.transfer=n;}
            else{
                System.out.println("Insufficient balance for transfer");
            }
            return balance;
        }
        void TransactionHistory(){
            System.out.format("Your balance is %d\n",balance);
            System.out.format("Your withdrawn amount is %d\n",withdraw);
            System.out.format("Your deposit amount is %d\n",deposit);
            System.out.format("Transfer amount is %d",transfer);
        }
        void options(){
            System.out.println("\nEnter 1 for Deposit\nEnter 2 for withdraw\n" +
                    "Enter 3 for Transfer\nEnter 4 for Transaction History\nEnter 5 for Quit");
        }
        int takeuserID(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter user id");
            int k=sc.nextInt();
            return k;
        }
        int takeuserPin(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter user pin");
            int l=sc.nextInt();
            return l;
        }
}
public class atmInt {
    public static void main(String[] args) {

       int UserId=6397;
       int UserPin=6666;
      AtmI atm=new AtmI();
      Scanner sc=new Scanner(System.in);
        // atm.userid();

          System.out.println("Enter User Id");
          int b = sc.nextInt();
          System.out.println("Enter User Pin");
          int c = sc.nextInt();

           while(b!=UserId || c!=UserPin){
           System.out.println("Wrong details");
              b= atm.takeuserID();
              c= atm.takeuserPin();
             if(b==UserId && c==UserPin){
                 break;
             }
           }
      while(b==UserId && c==UserPin) {
          atm.options();
          int option=sc.nextInt();
       if(option==1){
           atm.Deposit();
       }
       else if(option==2){
           atm.Withdraw();
       }
       else if(option==3){
           atm.Transfer();
       }
       else if(option==4){
           atm.TransactionHistory();
       }
       else if(option==5){
           System.out.println("Thanks for visiting..");
           break;
       }
      }}}

