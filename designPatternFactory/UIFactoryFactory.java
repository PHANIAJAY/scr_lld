package designPatternFactory;

public class UIFactoryFactory {
    public static UIFactory createUIFactory(String platform) {
        if (platform.equals("android")) {
            return new AndroidUIFactory();
        } else if (platform.equals("ios")) {
            return new IosUIFactory();
        }
        return null;
    }
}
