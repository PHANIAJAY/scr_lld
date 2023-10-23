package designPatternSingleton;

public class DbConfigurationDoubleCheckedSingletonMultithreaded {

    private static DbConfigurationDoubleCheckedSingletonMultithreaded instance_1=null;

    private DbConfigurationDoubleCheckedSingletonMultithreaded(){

    }

    public static synchronized DbConfigurationDoubleCheckedSingletonMultithreaded getInstance() {
        if (instance_1 == null) {
            synchronized (DbConfigurationDoubleCheckedSingletonMultithreaded.class) {
                if (instance_1 == null) {
                    instance_1 = new DbConfigurationDoubleCheckedSingletonMultithreaded();
                }
            }
        }
            return instance_1;

    }
}
