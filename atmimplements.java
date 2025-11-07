package ATM;
import java.util.*;
public class atmimplements implements atminterface {
    atm abj=new atm();
    Map<Double,String> mst=new HashMap<>();
    public void withdrawAmount(double withdrawAmt){
        if(withdrawAmt%100==0){
            if(withdrawAmt<abj.Getbalance()){
                 System.out.println("Withdrawal Amount:"+withdrawAmt);
                 abj.setbalance(abj.Getbalance()-withdrawAmt);
                 mst.put(withdrawAmt,"-->Withdrwan");
                 checkbalance();
            }
            else System.out.println("Insufficient Balance");
        }
        else System.out.println("Enter Amount in terms of 100$");
    }
    public void DepositAmount(double depositeAmt){
            abj.setbalance((abj).Getbalance()+depositeAmt);
            mst.put(depositeAmt,"-->Deposited");
            checkbalance();
    }
    public void checkbalance(){
         System.out.println("Balance:"+abj.Getbalance());
    }
    public void Ministatement(){
         Set<Double> k=mst.keySet();
         for(double i:k){
            System.out.println(i+" :"+mst.get(i));
         }
    }
}
