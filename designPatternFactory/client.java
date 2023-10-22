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


    }
}
