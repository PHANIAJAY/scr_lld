package designPatternFactory;

import designPatternFactory.Components.Button.Button;
import designPatternFactory.Components.DropDown.DropDown;
import designPatternFactory.Components.Menu.Menu;

public class client
{
    public static void main(String[] args)
    {
     Flutter F=new Flutter("android");
        UIFactory uiFactory=F.createUIFactory();
        Button button=uiFactory.createButton();
        Menu menu=uiFactory.createMenu();
        DropDown dropDown=uiFactory.createDropDown();
        button.sayHi();

      //  The factory design pattern is used when we have a superclass with multiple sub-classes and based on input, we need to return one of the sub-class.

    }
}
