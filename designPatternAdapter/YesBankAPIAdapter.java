package designPatternAdapter;

import designPatternAdapter.thirdParty.yesBank.YesBankAPI;

public class YesBankAPIAdapter implements BankAPIAdapter{
    private YesBankAPI yesBankAPI=new YesBankAPI();
    @Override
    public double getBalance(String accnum) {
        return 40;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
