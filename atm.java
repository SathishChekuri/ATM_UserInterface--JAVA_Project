package ATM;

public class atm {
    private double balance;
    private double withdrawalAmount;
    private double DepositedAmount;
    
    public double GetDepositedAmount(){
        return DepositedAmount;
    }
    public double GetwithdrawalAmount(){
        return withdrawalAmount;
    }
    public double Getbalance(){
        return balance;
    }
    public void SetDepositedAmount(double DepositedAmount){
        this.DepositedAmount=DepositedAmount;
    }
    public void SetwithdrawalAmount(double withdrawalAmount){
        this.withdrawalAmount=withdrawalAmount;
    }
    public void setbalance(double balance){
        this.balance=balance;
    }
}
