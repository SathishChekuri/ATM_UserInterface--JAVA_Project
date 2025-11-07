package ATM;
import java.util.*;
public class userInterface {
    public static void main(String []args){
        atmimplements ob=new atmimplements();
        Scanner sc=new Scanner(System.in);
        System.out.println("Create an Atm card by entering cardno And pin");
        String cardNo=sc.nextLine();
        String pin=sc.nextLine();
        System.out.println("Welcome to ATM!!!\nPleasEnter your card no:");
        String cardNo1=sc.nextLine();
        if(cardNo.equals(cardNo1)){
            String pin1=sc.nextLine();
            if(pin.equals(pin1)){
                    while(true){
                        System.out.println("Enter your Choice:\n1.Withdraw\n2.Deposit\n3.Balance\n4.Statement\n5.Exit");
                        int ch=sc.nextInt();
                        sc.nextLine();
                        switch(ch){
                            case 1: 
                                System.out.println("Enter Amount:");
                                double d=sc.nextDouble();
                                ob.withdrawAmount(d);
                                break;
                            case 2:
                                System.out.println("Enter Amount:");
                                double d1=sc.nextDouble();
                                //sc.nextLine();
                                ob.DepositAmount(d1);
                                System.out.println("Deposited Amt:"+d1);
                                break;
                            case 3:
                                ob.checkbalance();
                                break;
                            case 4:
                                ob.Ministatement();
                                break;
                            case 5:
                                System.out.println("Thanks for visiting ATM!!!");
                                return;
                            default:
                                System.out.println("Enter a valid Choice");
                                break;
                        }
                    }
                }
                else System.out.println("Enter correct pin !!!");
            }
        else System.out.println("Enter correct card no!!!");
    }
}
