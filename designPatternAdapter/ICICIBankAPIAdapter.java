package designPatternAdapter;

import designPatternAdapter.thirdParty.ICICIBank.ICICIBankAPI;

public class ICICIBankAPIAdapter implements BankAPIAdapter{

private ICICIBankAPI iciciBankAPI=new ICICIBankAPI();
    @Override
    public double getBalance(String accnum) {
        return 20;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
