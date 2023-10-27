package designPatternAdapter;

public class Client {
    public static void main(String[] args) throws Exception{
        PhonePe P=new PhonePe(new ICICIBankAPIAdapter());
        System.out.println(P.didSomthing());
    }
}
