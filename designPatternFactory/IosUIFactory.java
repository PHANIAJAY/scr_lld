package designPatternFactory;

import designPatternFactory.Components.Button.IosButton;
import designPatternFactory.Components.DropDown.IosDropDown;
import designPatternFactory.Components.Menu.IosMenu;

public class IosUIFactory implements UIFactory
{

    @Override
    public IosButton createButton() {
        return new IosButton();
    }

    @Override
    public IosMenu createMenu() {
        return new IosMenu();
    }

    @Override
    public  IosDropDown createDropDown() {
        return new IosDropDown();
    }
}
