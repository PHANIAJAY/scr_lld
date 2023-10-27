package designPatternAdapter;

public class PhonePe {
    private BankAPIAdapter bankAPI;
    public PhonePe(BankAPIAdapter bankAPI){
        this.bankAPI=bankAPI;
    }
    double didSomthing() throws InterruptedException{
        double currentBalance=bankAPI.getBalance("accountNumber");
        return currentBalance*2;
    }
}
