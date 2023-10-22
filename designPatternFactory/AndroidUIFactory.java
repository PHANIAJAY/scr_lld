package designPatternFactory;
import designPatternFactory.Components.Button.AndroidButton;
import designPatternFactory.Components.DropDown.AndroidDropDown;
import designPatternFactory.Components.Menu.AndroidMenu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropDown createDropDown() {
        return new AndroidDropDown();
    }
}
