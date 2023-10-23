package designPatternSingleton;

public class Client {
    public static void main(String[] args) {

//        DbConfigurationEarlyLoaded db=DbConfigurationEarlyLoaded.getInstance();
//        DbConfigurationEarlyLoaded db1=DbConfigurationEarlyLoaded.getInstance();
//        if(db==db1) {
//            System.out.println("Both objects printed are same");
//        }
//        else {
//            System.out.println("Both objects  printed are different");}
//        ==========Double checked singleton multithreaded=========
        DbConfigurationDoubleCheckedSingletonMultithreaded db=DbConfigurationDoubleCheckedSingletonMultithreaded.getInstance();
        DbConfigurationDoubleCheckedSingletonMultithreaded db1=DbConfigurationDoubleCheckedSingletonMultithreaded.getInstance();

        if(db==db1) {
            System.out.println("Both objects printed are same");
        }
        else {
            System.out.println("Both objects  printed are different");}
//        ========Multithreaded way of calling
//        DbConfigurationMultithreaded db= DbConfigurationMultithreaded.getDBInstance();
//                DbConfigurationMultithreaded db1=DbConfigurationMultithreaded.getDBInstance();
//                if(db==db1) {
//                    System.out.println("Both objects printed are same");
//                }
//                else {
//                  System.out.println("Both objects  printed are different");}
    }
}
