package designPatternSingleton;

public class DbConfigurationEarlyLoaded {

    private static DbConfigurationEarlyLoaded instance_1=new DbConfigurationEarlyLoaded();

    private DbConfigurationEarlyLoaded(){}

    public static DbConfigurationEarlyLoaded getInstance() {
        return instance_1;
    }
}
