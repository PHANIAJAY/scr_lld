package designPatternAdapter;

public interface BankAPIAdapter {

    double getBalance(String accnum);
    boolean sendMoney(String fromAccount,
                      String toAccount,double amount);

}
