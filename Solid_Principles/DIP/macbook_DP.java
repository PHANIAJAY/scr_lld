package Solid_Principles.DIP;

public class macbook_DP {
    private final wired_keyboard key;
    private final wired_mouse mouse;


    public macbook_DP(wired_keyboard key,wired_mouse mouse){
        this.mouse=mouse;
        this.key=key;
    }
}

//here u r directly depending on the interface instead of conccrete class