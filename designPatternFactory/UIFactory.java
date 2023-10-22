package designPatternFactory;

import designPatternFactory.Components.Button.Button;
import designPatternFactory.Components.DropDown.DropDown;
import designPatternFactory.Components.Menu.Menu;

public interface UIFactory
{
    Button createButton(); // query
    Menu createMenu();
    DropDown createDropDown();

}
