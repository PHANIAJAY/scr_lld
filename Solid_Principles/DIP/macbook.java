package Solid_Principles.DIP;

public class macbook {
    private final wired_keyboard key;
    private final wired_mouse mouse;


    public macbook(){
       key=new wired_keyboard();
       mouse=new wired_mouse();
    }
}
