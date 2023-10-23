package designPatternSingleton;

public class DbConfigurationMultithreaded {

    private static DbConfigurationMultithreaded instance_1=null;
    private DbConfigurationMultithreaded(){}

    public static DbConfigurationMultithreaded getDBInstance() {
        if(instance_1==null) {
            synchronized (DbConfigurationMultithreaded.class) {
                if (instance_1 == null) {
                    instance_1 = new DbConfigurationMultithreaded();
                }
            }
        }
        return instance_1;
    }
}
